// Generated from /Users/yangyongli/Spring/avon/src/main/java/com/avon/hr/accounting/Accounting.g4 by ANTLR 4.7
package com.avon.hr.accounting;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AccountingParser}.
 */
public interface AccountingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AccountingParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AccountingParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AccountingParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AccountingParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AccountingParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AccountingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AccountingParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AccountingParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AccountingParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelseStatement(AccountingParser.IfelseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelseStatement(AccountingParser.IfelseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AccountingParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AccountingParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void enterIfBranch(AccountingParser.IfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void exitIfBranch(AccountingParser.IfBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#elseIfBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBranch(AccountingParser.ElseIfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#elseIfBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBranch(AccountingParser.ElseIfBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(AccountingParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(AccountingParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AccountingParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AccountingParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(AccountingParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(AccountingParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(AccountingParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(AccountingParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(AccountingParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(AccountingParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AccountingParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AccountingParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpression(AccountingParser.JudgeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpression(AccountingParser.JudgeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignVariable}
	 * labeled alternative in {@link AccountingParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariable(AccountingParser.AssignVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignVariable}
	 * labeled alternative in {@link AccountingParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariable(AccountingParser.AssignVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNumber}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNumber(AccountingParser.BooleanNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNumber}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNumber(AccountingParser.BooleanNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSinglePlusOrMinus(AccountingParser.SinglePlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSinglePlusOrMinus(AccountingParser.SinglePlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(AccountingParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(AccountingParser.PlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleTimesOrDiv(AccountingParser.SingleTimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleTimesOrDiv(AccountingParser.SingleTimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimesOrDiv(AccountingParser.TimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimesOrDiv(AccountingParser.TimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(AccountingParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(AccountingParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomVariable}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomVariable(AccountingParser.AtomVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomVariable}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomVariable(AccountingParser.AtomVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterParen(AccountingParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitParen(AccountingParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFunction}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomFunction(AccountingParser.AtomFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFunction}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomFunction(AccountingParser.AtomFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerFunctionExpression}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterOuterFunctionExpression(AccountingParser.OuterFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerFunctionExpression}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitOuterFunctionExpression(AccountingParser.OuterFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#funcExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpression(AccountingParser.FuncExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#funcExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpression(AccountingParser.FuncExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#innerFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterInnerFunctionName(AccountingParser.InnerFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#innerFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitInnerFunctionName(AccountingParser.InnerFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#outerFunction}.
	 * @param ctx the parse tree
	 */
	void enterOuterFunction(AccountingParser.OuterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#outerFunction}.
	 * @param ctx the parse tree
	 */
	void exitOuterFunction(AccountingParser.OuterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterExpression}
	 * labeled alternative in {@link AccountingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterExpression(AccountingParser.ParameterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterExpression}
	 * labeled alternative in {@link AccountingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterExpression(AccountingParser.ParameterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterString}
	 * labeled alternative in {@link AccountingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterString(AccountingParser.ParameterStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterString}
	 * labeled alternative in {@link AccountingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterString(AccountingParser.ParameterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AccountingParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AccountingParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AccountingParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AccountingParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AccountingParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AccountingParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AccountingParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AccountingParser.IdentifierContext ctx);
}