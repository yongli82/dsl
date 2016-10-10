package com.yang.dsl;// Generated from /Users/yangyongli/Projects/antlr/src/main/java/Expression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(ExpressionParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(ExpressionParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(ExpressionParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(ExpressionParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#funcExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpression(ExpressionParser.FuncExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#funcExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpression(ExpressionParser.FuncExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(ExpressionParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(ExpressionParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpressionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExpressionParser.VariableContext ctx);
}