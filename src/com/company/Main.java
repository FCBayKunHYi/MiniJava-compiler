package com.company;


import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        InputStream is = new FileInputStream("input/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(is);
        MinijavaLexer lexer = new MinijavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinijavaParser parser = new MinijavaParser(tokens);
        ParseTree tree = parser.goal();


        Vocabulary Voca = lexer.getVocabulary();
        //System.out.println(Voca.getDisplayName(1));

        //List<Token> TokensList = tokens.getTokens();

        FileWriter fw;

        fw = new FileWriter("lexer.txt");

        for (Token obj : tokens.getTokens()) {
     /*       System.out.print(" number ");
            int ind = obj.getType();
            System.out.print(ind);
            System.out.print("   ");*/
            fw.write(obj.getText());
            fw.write(" --> Type : ");
            fw.write(Voca.getDisplayName(obj.getType()));
            fw.write("      ////   ");
            fw.write(obj.toString() + '\n');
/*
            System.out.print(obj.getText());
            System.out.print(" --> Type : ");
            System.out.print(Voca.getDisplayName(obj.getType()));
            System.out.print("      ////   ");
            System.out.println(obj);
*/
        }

        fw.close();

        fw = new FileWriter("parser.txt");

        fw.write("LISP:\n");
        fw.write(tree.toStringTree(parser) + '\n');
/*
        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();
*/
        fw.close();


    /*    System.out.println("Visitor:");
        EvalVisitor evalByVisitor = new EvalVisitor();
        evalByVisitor.visit(tree);
        System.out.println();*/

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MinijavaBaseListener evalByListener = new MinijavaBaseListener();
        walker.walk(new FirstCheckListener(), tree);

        Trees.inspect(tree, parser);

        //int aaa = "df";

    }
}
