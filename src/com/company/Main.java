package com.company;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        InputStream is = new FileInputStream("example/test.txt"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        MinijavaLexer lexer = new MinijavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinijavaParser parser = new MinijavaParser(tokens);
        ParseTree tree = parser.goal();

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

    /*    System.out.println("Visitor:");
        EvalVisitor evalByVisitor = new EvalVisitor();
        evalByVisitor.visit(tree);
        System.out.println();*/

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MinijavaBaseListener evalByListener = new MinijavaBaseListener();
        walker.walk(evalByListener, tree);
    }
}
