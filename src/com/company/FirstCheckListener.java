package com.company;

import com.scope.SymbolTable;
import org.antlr.v4.runtime.*;

public class FirstCheckListener extends CheckListener{

    SymbolTable CurrentST = new SymbolTable("goal", null, null);


    @Override
    public void enterMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        System.out.println(ID);
        if (CurrentST.defined(ID)) {
            System.out.println(ID);
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST, "class");
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;
    }


    @Override
    public void exitMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx) {
        CurrentST = CurrentST.father;
    }

    @Override
    public void enterClassDeclaration(MinijavaParser.ClassDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
       // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  Class ");
            System.out.println(ID + " is already defined.");
        }

        SymbolTable ClassST = new SymbolTable(ID, CurrentST, "Class");
        CurrentST.add(ClassST);
        STs.put(ctx, ClassST);
        CurrentST = ClassST;
    }

    @Override
    public void exitClassDeclaration(MinijavaParser.ClassDeclarationContext ctx) {
        CurrentST = CurrentST.father;
    }



    @Override
    public void enterMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
        // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  Method ");
            System.out.println(ID + " is already defined in the Class " + CurrentST.name + ".");
        }

        SymbolTable MethodST = new SymbolTable(ID, CurrentST, ctx.type().getText());
        CurrentST.add(MethodST);
        STs.put(ctx, MethodST);
        CurrentST = MethodST;
    }

    @Override
    public void exitMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx) {
        CurrentST = CurrentST.father;
    }

    public String getType(SymbolTable ST, String name) {
        while (ST != null) {
            if (ST.defined(name)) return ST.children.get(name).type;
            ST = ST.father;
        }
        return null;
    }

    @Override
    public void enterAssignStatement(MinijavaParser.AssignStatementContext ctx) {
        String ID = ctx.ID().getText();
        String expr = ctx.expression().getText();
        //ctx.expression().
        System.out.print("werwr  "  + expr);
        System.out.print(ID + " \n" );

        String Ltype = getType(CurrentST, ID);
        String Rtype = getType(CurrentST, expr);

        //System.out.print(Ltype + " " + Rtype + " \n" );

        Token pos = ctx.ID().getSymbol();
        if (Ltype == null) {
            System.out.print("Line " + pos.getLine() + " :  \"");
            System.out.println(ID + "\" is not defined.");
        }
        else {
            if (!Ltype.equals(Rtype)) {
                System.out.print("Line " + pos.getLine() + " :  \"");
                System.out.println(ID + "\" is not matched \"" + expr + "\".");
            }
        }

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
            System.out.println(ID + " is already defined in the Class" + CurrentST.name + ".");
        }

        SymbolTable VarST = new SymbolTable(ID, CurrentST, ctx.type().getText());
        CurrentST.add(VarST);
        STs.put(ctx, VarST);
        //CurrentST = ClassST;
    }

    @Override
    public void enterVarDeclaration(MinijavaParser.VarDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ctx);
        // System.out.println(CurrentST.children.containsKey("MyClass"));
        if (CurrentST.defined(ID)) {
            Token pos = ctx.ID().getSymbol();
            System.out.print("Line " + pos.getLine() + " :  variable ");
            System.out.println("\"" + ID + "\" is already defined in the method \"" + CurrentST.name + "\".");
        }

        SymbolTable VarST = new SymbolTable(ID, CurrentST, ctx.type().getText());
        CurrentST.add(VarST);
        STs.put(ctx, VarST);
        //CurrentST = ClassST;
    }

}
