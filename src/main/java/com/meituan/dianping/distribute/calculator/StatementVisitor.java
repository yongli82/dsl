// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/meituan/dianping/distribute/rule/Statement.g4 by ANTLR 4.7
package com.meituan.dianping.distribute.calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StatementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StatementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePlusOrMinus(StatementParser.SinglePlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(StatementParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTimesOrDiv(StatementParser.SingleTimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDiv(StatementParser.TimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(StatementParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomToken(StatementParser.AtomTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenToken(StatementParser.ParenTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(StatementParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StatementParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(StatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(StatementParser.IdentifierContext ctx);
}