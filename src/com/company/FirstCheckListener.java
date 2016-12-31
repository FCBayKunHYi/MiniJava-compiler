package com.company;

import com.scope.SymbolTable;
import org.antlr.v4.runtime.*;

public class FirstCheckListener extends CheckListener{

    SymbolTable CurrentST = new SymbolTable("goal", null);


    @Override
    public void enterMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        System.out.println(ID);
        if (CurrentST.defined(ID)) {
            System.out.println(ID);
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST);
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;
    }


    @Override
    public void exitMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx) {
        CurrentST = CurrentST.parent;
    }

    @Override
    public void enterClassDeclaration(MinijavaParser.ClassDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
       // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  Class ");
            System.out.println(ID + " has been defined.");
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST);
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;
    }

    @Override
    public void exitClassDeclaration(MinijavaParser.ClassDeclarationContext ctx) {
        CurrentST = CurrentST.parent;
    }



    @Override
    public void enterMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
        // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  Method ");
            System.out.println(ID + " has been defined in the Class " + CurrentST.name + ".");
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST);
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;
    }

    @Override
    public void exitMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx) {
        CurrentST = CurrentST.parent;
    }

    @Override
    public void enterAssignStatement(MinijavaParser.AssignStatementContext ctx) {
        String ID = ctx.ID().getText();
        System.out.print("werwr  "  + ctx.expression().getText());
        System.out.print(ID + " " );
        /*
        //System.out.println(ctx);
        // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  Class ");
            System.out.println(ID + " is defined.");
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST);
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;*/
    }

    @Override
    public void enterFieldDeclaration(MinijavaParser.FieldDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
        // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  variable ");
            System.out.println(ID + " has been defined in the Class" + CurrentST.name + ".");
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST);
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        //CurrentST = ClassST;
    }



}
