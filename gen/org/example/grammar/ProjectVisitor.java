// Generated from C:/Users/LeonN/IdeaProjects/newtry/src/main/java/org/example/grammar\Project.g4 by ANTLR 4.12.0
package org.example.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ProjectParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ProjectParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ProjectParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ProjectParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ProjectParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ProjectParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ProjectParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProjectParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#logic_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_or(ProjectParser.Logic_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#logic_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_and(ProjectParser.Logic_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(ProjectParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ProjectParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ProjectParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ProjectParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ProjectParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ProjectParser.PrimaryContext ctx);
}