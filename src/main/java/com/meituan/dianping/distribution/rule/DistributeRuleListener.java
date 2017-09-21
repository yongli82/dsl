// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/meituan/dianping/distribute/rule/DistributeRule.g4 by ANTLR 4.7
package com.meituan.dianping.distribution.rule;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DistributeRuleParser}.
 */
public interface DistributeRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DistributeRuleParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DistributeRuleParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistributeRuleParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DistributeRuleParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistributeRuleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DistributeRuleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistributeRuleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DistributeRuleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSinglePlusOrMinus(DistributeRuleParser.SinglePlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSinglePlusOrMinus(DistributeRuleParser.SinglePlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(DistributeRuleParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(DistributeRuleParser.PlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleTimesOrDiv(DistributeRuleParser.SingleTimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleTimesOrDiv(DistributeRuleParser.SingleTimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimesOrDiv(DistributeRuleParser.TimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimesOrDiv(DistributeRuleParser.TimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(DistributeRuleParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(DistributeRuleParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomToken(DistributeRuleParser.AtomTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomToken(DistributeRuleParser.AtomTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenToken(DistributeRuleParser.ParenTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenToken(DistributeRuleParser.ParenTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistributeRuleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DistributeRuleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistributeRuleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DistributeRuleParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistributeRuleParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(DistributeRuleParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistributeRuleParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(DistributeRuleParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistributeRuleParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(DistributeRuleParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistributeRuleParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(DistributeRuleParser.LabelContext ctx);
}