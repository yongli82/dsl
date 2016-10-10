package com.yang.dsl.singleline;// Generated from /Users/yangyongli/Projects/antlr/src/main/java/Expression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ExpressionParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePlusOrMinus(ExpressionParser.SinglePlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(ExpressionParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link ExpressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTimesOrDiv(ExpressionParser.SingleTimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link ExpressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDiv(ExpressionParser.TimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(ExpressionParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomVariable}
	 * labeled alternative in {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVariable(ExpressionParser.AtomVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ExpressionParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFunction}
	 * labeled alternative in {@link ExpressionParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFunction(ExpressionParser.AtomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#funcExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpression(ExpressionParser.FuncExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(ExpressionParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpressionParser.VariableContext ctx);
}