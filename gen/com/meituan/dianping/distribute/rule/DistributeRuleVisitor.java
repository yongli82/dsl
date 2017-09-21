// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/meituan/dianping/distribute/rule/DistributeRule.g4 by ANTLR 4.7
package com.meituan.dianping.distribute.rule;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DistributeRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DistributeRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DistributeRuleParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DistributeRuleParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistributeRuleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DistributeRuleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePlusOrMinus(DistributeRuleParser.SinglePlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link DistributeRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(DistributeRuleParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTimesOrDiv(DistributeRuleParser.SingleTimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link DistributeRuleParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDiv(DistributeRuleParser.TimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(DistributeRuleParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomToken(DistributeRuleParser.AtomTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenToken}
	 * labeled alternative in {@link DistributeRuleParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenToken(DistributeRuleParser.ParenTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistributeRuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DistributeRuleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistributeRuleParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(DistributeRuleParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistributeRuleParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(DistributeRuleParser.LabelContext ctx);
}