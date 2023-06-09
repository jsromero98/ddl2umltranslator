import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico a partir de la entrada (archivo  o consola)
            ddl2umltranslgrammarLexer lexer;
            if (args.length>0)
                lexer = new ddl2umltranslgrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new ddl2umltranslgrammarLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto del analizador sintáctico a partir del buffer de tokens
            ddl2umltranslgrammarParser parser = new ddl2umltranslgrammarParser(tokens);
            ParseTree tree = parser.inicio(); // Iniciar el analisis sintáctico en la regla inicial: r
            //System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new ddl2umltrad(), tree);

        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }

}
