package com.company;

import com.scope.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class FirstCheckListener extends CheckListener{

    SymbolTable CurrentST = new SymbolTable("goal", null, null);


    @Override
    public void enterMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx) {
        String ID = ctx.ID().getText();
        //System.out.println(ID);
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
            System.out.print("Line " + pos.getLine() + " :  Method \"");
            System.out.println(ID + "\" is already defined in the Class \"" + CurrentST.name + "\".");
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
        return "null";
    }

    public int TypeEquals(TerminalNode ID, MinijavaParser.ExpressionContext expr, SymbolTable CurrentST) {
        String Ltype = getType(CurrentST, ID.getText());
        //ID is not defined.

        if (Ltype.equals("null")) {
            return 0;
        }

        if (Ltype.equals("int") && expr instanceof MinijavaParser.IntLitExpressionContext) {
            return 1;
        }
        if (Ltype.equals("boolean") && expr instanceof MinijavaParser.BooleanLitExpressionContext) {
            return 1;
        }

        String Rtype = null;
        if (expr instanceof MinijavaParser.IdentifierExpressionContext) {
            Rtype = getType(CurrentST, expr.getText());
        }

        if (Rtype != null && Rtype.equals("null")) {
            return 2;
        }

        //System.out.print(Ltype + " " + Rtype + " \n" );

        if (Rtype != null && !Ltype.equals(Rtype)) {
            return -1;
        }
        return -2;
    }

    @Override
    public void enterAssignStatement(MinijavaParser.AssignStatementContext ctx) {
        int result = TypeEquals(ctx.ID(), ctx.expression(), CurrentST);

        //System.out.println("see " + ctx.expression().getClass());

        //System.out.print("werwr  "  + expr);
        //System.out.print(ID + " \n" );

        Token pos = ctx.ID().getSymbol();
        if (result == 0 || result == -1 || result == 2 || result == -2) {
            System.out.print("Line " + pos.getLine() + ", type matches error: \"");
            if (result == 0) {
                System.out.println(ctx.ID().getText() + "\" is not defined.");
            }
            else
            if (result == 2) {
                System.out.println(ctx.expression().getText() + "\" is not defined.");
            }
            else {
                System.out.println(ctx.ID().getText() + "\" does not match \"" + ctx.expression().getText() + "\".");
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
        //System.out.println(VarST.type);
        //CurrentST = ClassST;
    }



    @Override
    public void enterReturnStatement(MinijavaParser.ReturnStatementContext ctx) {
        String ID = ctx.expression().getText();
        String Rtype = getType(CurrentST, ID);
        String Ltype = CurrentST.type;
        //ID is not defined.
        Token pos = ctx.start;


        if (Rtype.equals("null")) {
            if (Ltype.equals("int") && !(ctx.expression() instanceof MinijavaParser.IntLitExpressionContext)) {
                System.out.print("Line " + pos.getLine() + ", return type error: \"");
                System.out.println(ID + "\" is not int.");
            } else if (Ltype.equals("boolean") && !(ctx.expression() instanceof MinijavaParser.BooleanLitExpressionContext)) {
                System.out.print("Line " + pos.getLine() + ", return type error: \"");
                System.out.println(ID + "\" is not boolean.");
            }
        }
        else
        if (!Ltype.equals(Rtype)) {
            System.out.print("Line " + pos.getLine() + ", return type error: \"");
            System.out.println(ID + "\" is not " + Ltype + ".");
        }
    }


    @Override
    public void enterPrintStatement(MinijavaParser.PrintStatementContext ctx) {
        String ID = ctx.expression().getText();
        String Rtype = getType(CurrentST, ID);
        //ID is not defined.
        Token pos = ctx.start;


        if (Rtype.equals("null")) {
            if (!(ctx.expression() instanceof MinijavaParser.IntLitExpressionContext)) {
                System.out.print("Line " + pos.getLine() + ", Output type error: \"");
                System.out.println(ID + "\" is not int.");
            }
        }
        else
        if (!Rtype.equals("int")) {
            System.out.print("Line " + pos.getLine() + ", Output type error: \"");
            System.out.println(ID + "\" is not int.");
        }
    }

}
