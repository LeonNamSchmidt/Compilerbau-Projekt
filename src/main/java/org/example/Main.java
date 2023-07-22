package org.example;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        /*File file = new File(
                "C:\\Users\\LeonN\\IdeaProjects\\newtry\\test\\sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String expression = null;
        while (br.readLine() != null) {
            expression = expression + br.readLine();
        }
        System.out.println(expression);
        */
       String expression = "var global = 100;\n" +
                "var i = 0;\n" +
                "i = i + 1;\n" +
                "if (i == 1){\n" +
                "\tprint \"Basic assignment: ok\";\n" +
                "}\n" +
                "\n" +
                "i = 0;\n" +
                "while (i < 10){\n" +
                "\ti = i + 1;\n" +
                "}\n" +
                "if (i == 10){\n" +
                "\tprint \"Basic looping: ok\";\n" +
                "}\n" +
                "\n" +
                "\n" +
                "{\n" +
                "\tvar i = 0;\n" +
                "\tif (i == 0){\n" +
                "\t\tprint \"Shadowing: ok\";\n" +
                "\t}\n" +
                "\tif (global == 100){\n" +
                "\t\tprint \"Outer scope: ok\";\n" +
                "\t}\n" +
                "}\n" +
                "if (i == 10){\n" +
                "\tprint \"Nested scope: ok\";\n" +
                "}\n" +
                "\n" +
                "\n" +
                "var log1 = false and false;\n" +
                "var log2 = false and true;\n" +
                "var log3 = true and false;\n" +
                "var log4 = true and true;\n" +
                "\n" +
                "if (!log1 and !log2 and !log3 and log4){\n" +
                " \tprint \"Logic and: ok\";\n" +
                "}\n" +
                "\n" +
                "log1 = false or false;\n" +
                "log2 = false or true;\n" +
                "log3 = true or false;\n" +
                "log4 = true or true;\n" +
                "\n" +
                "if (!log1 and log2 and log3 and log4){\n" +
                " \tprint \"Logic or: ok\";\n";

                ProjectLexer lexer = new ProjectLexer(CharStreams.fromString(expression));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjectParser parser = new ProjectParser(tokens);
        ParseTree tree = parser.program();
        MyListener stalker = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(stalker, tree);
        //use  treewalker and listener?
        System.out.println("Parse tree: " + tree.toStringTree(parser));
    }
}






// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Press Alt+Eingabe with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.

// Press Umschalt+F10 or click the green arrow button in the gutter to run the code.

// Press Umschalt+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Strg+F8.