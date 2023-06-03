import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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
        translated = translated + "entity "+ctx.tableName().getText()+" { \n";
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
        for (int i = 0; i < ctx.foreignKeyDefiniton().size(); i++) {
            translated = translated + "{method} " +ctx.foreignKeyDefiniton(i).columnName(0).getText() +" "+
                    columntypes.get(ctx.foreignKeyDefiniton(i).tableName().getText()+":"+ctx.foreignKeyDefiniton(i).columnName(1).getText())+ " <<FK>> \n";
        }
        translated= translated + "} \n \n";
        for (int i = 0; i < ctx.foreignKeyDefiniton().size(); i++) {
            translated = translated + ctx.tableName().getText() + " }o..|| "+ ctx.foreignKeyDefiniton(i).tableName().getText() +" \n";
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
