// Generated from Project.g4 by ANTLR 4.13.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ProjectParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ProjectParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProjectParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProjectParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ProjectParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ProjectParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ProjectParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ProjectParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(ProjectParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(ProjectParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ProjectParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ProjectParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProjectParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProjectParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProjectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProjectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void enterLogic_or(ProjectParser.Logic_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void exitLogic_or(ProjectParser.Logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void enterLogic_and(ProjectParser.Logic_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void exitLogic_and(ProjectParser.Logic_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(ProjectParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(ProjectParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ProjectParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ProjectParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ProjectParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ProjectParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ProjectParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ProjectParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ProjectParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ProjectParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ProjectParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ProjectParser.PrimaryContext ctx);
}