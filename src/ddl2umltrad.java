import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ddl2umltrad extends ddl2umltranslgrammarBaseListener{
    String translatedoutput = "@startuml \n !theme crt-amber \n";
    HashMap <String,String> columntypes = new HashMap<String, String>();
    int tablecount = 0;
    int viewcount = 0;

    @Override
    public void exitInicio(ddl2umltranslgrammarParser.InicioContext ctx) {
        translatedoutput = translatedoutput + "\n";
        translatedoutput = translatedoutput + "\n package info { \n";
        translatedoutput = translatedoutput + "entity tables{ \n {field} count:" + tablecount + "\n}\n";
        translatedoutput = translatedoutput + "entity views{ \n {field} count:" + viewcount + "\n}\n";
        translatedoutput = translatedoutput + "}\n";
        translatedoutput = translatedoutput + "\n @enduml";
        //System.out.println(translatedoutput);

        try {
            File outdiag = new File("./output/outputdiagram.puml");
            if (outdiag.createNewFile()) {
                System.out.println("File created: " + outdiag.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter("./output/outputdiagram.puml");
            myWriter.write(translatedoutput);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        super.exitInicio(ctx);
    }

    @Override
    public void enterCreateTableStatement(ddl2umltranslgrammarParser.CreateTableStatementContext ctx) {
        String translated = "";
        String warnings = "\n warnings: \n";
        List<String> columnsList = new ArrayList<String>();
        Set<String> columnsSet = new HashSet<String>();
        for (int i = 0; i < ctx.columnDefinition().size(); i++) {
            columnsList.add(ctx.columnDefinition(i).columnName().getText());
            columnsSet.add(ctx.columnDefinition(i).columnName().getText());
            if(ctx.columnDefinition(i).columnName().getText().substring(ctx.columnDefinition(i).columnName().getText().length()-1).equals("s")){
                warnings = warnings + "Posible non atomic values stored on column "+ ctx.columnDefinition(i).columnName().getText() + " \n";
            }
        }
        if (columnsList.size() != columnsSet.size()){
            warnings = warnings + "Possible presence of repeated columns \n";
        }
        translated = translated + "entity "+ctx.tableName().getText()+" { \n";
        boolean primkey = false;
        for (int i = 0; i < ctx.columnDefinition().size(); i++) {
            translated = translated + "{field}";
            if (ctx.columnDefinition(i).constraint().isEmpty()){
                translated = translated + ctx.columnDefinition(i).columnName().getText() + " " + ctx.columnDefinition(i).datatype().getText();
                columntypes.put(ctx.tableName().getText()+":"+ctx.columnDefinition(i).columnName().getText(),ctx.columnDefinition(i).datatype().getText());
            } else {
                boolean nameadded = false;
                for (int j = 0; j < ctx.columnDefinition(i).constraint().size(); j++) {
                    if (ctx.columnDefinition(i).constraint(j).NOT() != null && ctx.columnDefinition(i).constraint(j).NULL() != null){
                        translated = translated + "* ";
                    }
                    if (ctx.columnDefinition(i).constraint(j).PRIMARY() != null) {
                        translated = translated + "* ";
                        primkey = true;
                    }
                    if (!nameadded) {
                        translated = translated + ctx.columnDefinition(i).columnName().getText() + " " + ctx.columnDefinition(i).datatype().getText();
                        columntypes.put(ctx.tableName().getText()+":"+ctx.columnDefinition(i).columnName().getText(),ctx.columnDefinition(i).datatype().getText());
                        nameadded = true;
                    }
                    if (ctx.columnDefinition(i).constraint(j).PRIMARY() != null){
                        translated = translated + " << PK >> << unique >>";
                    }
                    if (ctx.columnDefinition(i).constraint(j).UNIQUE() != null){
                        translated = translated + " << unique >> ";
                    }
                    if (ctx.columnDefinition(i).constraint(j).DEFAULT() != null){
                        translated = translated + " << default >> ";
                    }
                    if (ctx.columnDefinition(i).constraint(j).CT() != null){
                        translated = translated + " << current_timestamp >> ";
                    }
                }
            }
            translated = translated + " \n";
        }
        if (!primkey){
            warnings = warnings + "No primary key defined. \n";
        }
        for (int i = 0; i < ctx.foreignKeyDefiniton().size(); i++) {
            if(columntypes.get(ctx.foreignKeyDefiniton(i).tableName().getText()+":"+ctx.foreignKeyDefiniton(i).columnName(1).getText()) == null){
                warnings = warnings + "Foreign key "+ctx.foreignKeyDefiniton(i).columnName(0).getText()+" not defined in other tables. \n";
            }else{
                translated = translated + "{method} " +ctx.foreignKeyDefiniton(i).columnName(0).getText() +" "+
                        columntypes.get(ctx.foreignKeyDefiniton(i).tableName().getText()+":"+ctx.foreignKeyDefiniton(i).columnName(1).getText())+ " <<FK>> \n";
            }
            if (!columnsSet.contains(ctx.foreignKeyDefiniton(i).columnName(0).getText())){
                warnings = warnings + "Foreign key "+ctx.foreignKeyDefiniton(i).columnName(0).getText()+" not in defined columns. \n";
            }
        }
        translated = translated + warnings;
        translated= translated + "} \n \n";
        for (int i = 0; i < ctx.foreignKeyDefiniton().size(); i++) {
            if(columntypes.get(ctx.foreignKeyDefiniton(i).tableName().getText()+":"+ctx.foreignKeyDefiniton(i).columnName(1).getText()) != null){
                translated = translated + ctx.tableName().getText() + " }o..|| "+ ctx.foreignKeyDefiniton(i).tableName().getText() +" \n";
            }
        }
        translated= translated + " \n";
        translatedoutput = translatedoutput + translated;
        tablecount ++;
        super.enterCreateTableStatement(ctx);
    }

    @Override
    public void enterCreateViewStatement(ddl2umltranslgrammarParser.CreateViewStatementContext ctx) {
        String translated = "";
        translated = translated + "entity "+ctx.tableName().getText()+" << view >> { \n";
        for (int i = 0; i < ctx.sqlStatement().columnName().size(); i++) {
            translated = translated + "{field} " + ctx.sqlStatement().columnName(i).getText() + " " +
                    columntypes.get(ctx.sqlStatement().tableName().getText()+":"+ctx.sqlStatement().columnName(i).getText()) + " \n";
        }
        translated = translated + "{method} "+ ctx.sqlStatement().exprand().getText() +" \n";
        translated= translated + "} \n \n";
        translated = translated + " " + ctx.tableName().getText() +" --|> "+ctx.sqlStatement().tableName().getText()+" \n";
        translatedoutput = translatedoutput + translated;
        viewcount ++;
        super.enterCreateViewStatement(ctx);
    }
}
