// Generated from Minijava.g4 by ANTLR 4.6
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinijavaParser}.
 */
public interface MinijavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MinijavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MinijavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainClassDeclaration(MinijavaParser.MainClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MinijavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MinijavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void enterMainClassBody(MinijavaParser.MainClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void exitMainClassBody(MinijavaParser.MainClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(MinijavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(MinijavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(MinijavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(MinijavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MinijavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MinijavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MinijavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MinijavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MinijavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MinijavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MinijavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(MinijavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(MinijavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MinijavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MinijavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MinijavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MinijavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MinijavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MinijavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MinijavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MinijavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(MinijavaParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(MinijavaParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(MinijavaParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(MinijavaParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MinijavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MinijavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MinijavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MinijavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MinijavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MinijavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatement(MinijavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatement(MinijavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MinijavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MinijavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecurStatement(MinijavaParser.RecurStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecurStatement(MinijavaParser.RecurStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpression(MinijavaParser.IntLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpression(MinijavaParser.IntLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLitExpression(MinijavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLitExpression(MinijavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MinijavaParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MinijavaParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(MinijavaParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(MinijavaParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MinijavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MinijavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(MinijavaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(MinijavaParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(MinijavaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(MinijavaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MinijavaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MinijavaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(MinijavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(MinijavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(MinijavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(MinijavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(MinijavaParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(MinijavaParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(MinijavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(MinijavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpression(MinijavaParser.NegExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpression(MinijavaParser.NegExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(MinijavaParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(MinijavaParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(MinijavaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(MinijavaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(MinijavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(MinijavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(MinijavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link MinijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(MinijavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgumentList(MinijavaParser.MethodArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgumentList(MinijavaParser.MethodArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(MinijavaParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(MinijavaParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MinijavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MinijavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MinijavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MinijavaParser.IntTypeContext ctx);
}