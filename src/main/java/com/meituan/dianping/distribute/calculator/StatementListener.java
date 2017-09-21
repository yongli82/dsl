// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/meituan/dianping/distribute/rule/Statement.g4 by ANTLR 4.7
package com.meituan.dianping.distribute.calculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StatementParser}.
 */
public interface StatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StatementParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StatementParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSinglePlusOrMinus(StatementParser.SinglePlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSinglePlusOrMinus(StatementParser.SinglePlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(StatementParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link StatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(StatementParser.PlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleTimesOrDiv(StatementParser.SingleTimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleTimesOrDiv(StatementParser.SingleTimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimesOrDiv(StatementParser.TimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link StatementParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimesOrDiv(StatementParser.TimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(StatementParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(StatementParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomToken(StatementParser.AtomTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomToken(StatementParser.AtomTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenToken(StatementParser.ParenTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenToken(StatementParser.ParenTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterParen(StatementParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link StatementParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitParen(StatementParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StatementParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StatementParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(StatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(StatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(StatementParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(StatementParser.LabelContext ctx);
}