// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/avon/hr/expression/accounting/Accounting.g4 by ANTLR 4.5.3
package com.avon.hr.expression.accounting;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AccountingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LPAREN=17, 
		RPAREN=18, PLUS=19, MINUS=20, TIMES=21, DIV=22, POINT=23, LETTER=24, DIGIT=25, 
		COMMA=26, NEWLINE=27, ABSTRACT=28, ASSERT=29, BOOLEAN=30, BREAK=31, BYTE=32, 
		CASE=33, CATCH=34, CHAR=35, CLASS=36, CONST=37, CONTINUE=38, DEFAULT=39, 
		DO=40, DOUBLE=41, ELSE=42, ENUM=43, EXTENDS=44, FINAL=45, FINALLY=46, 
		FLOAT=47, FOR=48, IF=49, GOTO=50, IMPLEMENTS=51, IMPORT=52, INSTANCEOF=53, 
		INT=54, INTERFACE=55, LONG=56, NATIVE=57, NEW=58, PACKAGE=59, PRIVATE=60, 
		PROTECTED=61, PUBLIC=62, RETURN=63, SHORT=64, STATIC=65, STRICTFP=66, 
		SUPER=67, SWITCH=68, SYNCHRONIZED=69, THIS=70, THROW=71, THROWS=72, TRANSIENT=73, 
		TRY=74, VOID=75, VOLATILE=76, WHILE=77, AT=78, ELLIPSIS=79, WS=80, COMMENT=81, 
		LINE_COMMENT=82;
	public static final int
		RULE_start = 0, RULE_methodBody = 1, RULE_block = 2, RULE_blockStatement = 3, 
		RULE_statement = 4, RULE_forControl = 5, RULE_forInit = 6, RULE_forUpdate = 7, 
		RULE_expressionList = 8, RULE_parExpression = 9, RULE_judgeExpression = 10, 
		RULE_assign = 11, RULE_expression = 12, RULE_multiplyingExpression = 13, 
		RULE_atomExpression = 14, RULE_funcExpression = 15, RULE_funcname = 16, 
		RULE_outerFunction = 17, RULE_number = 18, RULE_identifier = 19;
	public static final String[] ruleNames = {
		"start", "methodBody", "block", "blockStatement", "statement", "forControl", 
		"forInit", "forUpdate", "expressionList", "parExpression", "judgeExpression", 
		"assign", "expression", "multiplyingExpression", "atomExpression", "funcExpression", 
		"funcname", "outerFunction", "number", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'else {'", "';'", "'=='", "'>'", "'>='", "'<'", "'<='", 
		"'<>'", "'!='", "'='", "'SUM'", "'AVERAGE'", "'MAX'", "'MIN'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", null, "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "POINT", "LETTER", "DIGIT", "COMMA", "NEWLINE", "ABSTRACT", "ASSERT", 
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Accounting.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AccountingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN))) != 0)) {
				{
				{
				setState(44);
				blockStatement();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockStatement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfelseStatementContext extends StatementContext {
		public BlockContext yesblock;
		public BlockContext noblock;
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfelseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitIfelseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(89);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfelseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(IF);
				setState(56);
				match(LPAREN);
				setState(57);
				judgeExpression();
				setState(58);
				match(RPAREN);
				setState(59);
				match(T__0);
				setState(60);
				((IfelseStatementContext)_localctx).yesblock = block();
				setState(61);
				match(T__1);
				setState(66);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(62);
					match(T__2);
					setState(63);
					((IfelseStatementContext)_localctx).noblock = block();
					setState(64);
					match(T__1);
					}
				}

				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(FOR);
				setState(69);
				match(LPAREN);
				setState(70);
				forControl();
				setState(71);
				match(RPAREN);
				setState(72);
				statement();
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(RETURN);
				setState(76);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
					{
					setState(75);
					expression(0);
					}
				}

				setState(78);
				match(T__3);
				}
				break;
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(BREAK);
				setState(81);
				_la = _input.LA(1);
				if (_la==LETTER) {
					{
					setState(80);
					identifier();
					}
				}

				setState(83);
				match(T__3);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(CONTINUE);
				setState(86);
				_la = _input.LA(1);
				if (_la==LETTER) {
					{
					setState(85);
					identifier();
					}
				}

				setState(88);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if (_la==LETTER) {
				{
				setState(91);
				forInit();
				}
			}

			setState(94);
			match(T__3);
			setState(96);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				setState(95);
				expression(0);
				}
			}

			setState(98);
			match(T__3);
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				setState(99);
				forUpdate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expression(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				expression(0);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LPAREN);
			setState(115);
			expression(0);
			setState(116);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JudgeExpressionContext extends ParserRuleContext {
		public boolean result;
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public JudgeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitJudgeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionContext judgeExpression() throws RecognitionException {
		JudgeExpressionContext _localctx = new JudgeExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_judgeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((JudgeExpressionContext)_localctx).left = expression(0);
			setState(119);
			((JudgeExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
				((JudgeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(120);
			((JudgeExpressionContext)_localctx).right = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignVariableContext extends AssignContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AccountingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AccountingParser.NEWLINE, i);
		}
		public AssignVariableContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			int _alt;
			_localctx = new AssignVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			identifier();
			setState(123);
			match(T__11);
			setState(124);
			expression(0);
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SinglePlusOrMinusContext extends ExpressionContext {
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public SinglePlusOrMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitSinglePlusOrMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusOrMinusContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public MultiplyingExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AccountingParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AccountingParser.MINUS, 0); }
		public PlusOrMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitPlusOrMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SinglePlusOrMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(131);
			multiplyingExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusOrMinusContext(new ExpressionContext(_parentctx, _parentState));
					((PlusOrMinusContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					((PlusOrMinusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusOrMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(135);
					((PlusOrMinusContext)_localctx).right = multiplyingExpression(0);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
	 
		public MultiplyingExpressionContext() { }
		public void copyFrom(MultiplyingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleTimesOrDivContext extends MultiplyingExpressionContext {
		public AtomExpressionContext atomExpression() {
			return getRuleContext(AtomExpressionContext.class,0);
		}
		public SingleTimesOrDivContext(MultiplyingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitSingleTimesOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesOrDivContext extends MultiplyingExpressionContext {
		public MultiplyingExpressionContext left;
		public Token op;
		public AtomExpressionContext right;
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public AtomExpressionContext atomExpression() {
			return getRuleContext(AtomExpressionContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(AccountingParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(AccountingParser.DIV, 0); }
		public TimesOrDivContext(MultiplyingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitTimesOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		return multiplyingExpression(0);
	}

	private MultiplyingExpressionContext multiplyingExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, _parentState);
		MultiplyingExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_multiplyingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTimesOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(142);
			atomExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TimesOrDivContext(new MultiplyingExpressionContext(_parentctx, _parentState));
					((TimesOrDivContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyingExpression);
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					((TimesOrDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
						((TimesOrDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(146);
					((TimesOrDivContext)_localctx).right = atomExpression();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomExpressionContext extends ParserRuleContext {
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
	 
		public AtomExpressionContext() { }
		public void copyFrom(AtomExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OuterFunctionExpressionContext extends AtomExpressionContext {
		public OuterFunctionContext outerFunction() {
			return getRuleContext(OuterFunctionContext.class,0);
		}
		public OuterFunctionExpressionContext(AtomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitOuterFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends AtomExpressionContext {
		public TerminalNode LPAREN() { return getToken(AccountingParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AccountingParser.RPAREN, 0); }
		public ParenContext(AtomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomVariableContext extends AtomExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AtomVariableContext(AtomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAtomVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomNumberContext extends AtomExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AtomNumberContext(AtomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomFunctionContext extends AtomExpressionContext {
		public FuncExpressionContext funcExpression() {
			return getRuleContext(FuncExpressionContext.class,0);
		}
		public AtomFunctionContext(AtomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAtomFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomExpression);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				number();
				}
				break;
			case 2:
				_localctx = new AtomVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				identifier();
				}
				break;
			case 3:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(LPAREN);
				setState(155);
				expression(0);
				setState(156);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new AtomFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				funcExpression();
				}
				break;
			case 5:
				_localctx = new OuterFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				outerFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncExpressionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AccountingParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AccountingParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AccountingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AccountingParser.COMMA, i);
		}
		public FuncExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitFuncExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExpressionContext funcExpression() throws RecognitionException {
		FuncExpressionContext _localctx = new FuncExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			funcname();
			setState(163);
			match(LPAREN);
			setState(164);
			expression(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				expression(0);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncnameContext extends ParserRuleContext {
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OuterFunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AccountingParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AccountingParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AccountingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AccountingParser.COMMA, i);
		}
		public OuterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitOuterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterFunctionContext outerFunction() throws RecognitionException {
		OuterFunctionContext _localctx = new OuterFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_outerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			identifier();
			setState(177);
			match(LPAREN);
			setState(178);
			expression(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				expression(0);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(AccountingParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(AccountingParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AccountingParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(AccountingParser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(188);
				match(MINUS);
				}
			}

			setState(192); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(191);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(196);
				match(POINT);
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(197);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AccountingParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AccountingParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AccountingParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AccountingParser.DIGIT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LETTER);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 13:
			return multiplyingExpression_sempred((MultiplyingExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplyingExpression_sempred(MultiplyingExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\7\4\60\n\4\f\4\16\4"+
		"\63\13\4\3\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6E\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\5\6"+
		"T\n\6\3\6\3\6\3\6\5\6Y\n\6\3\6\5\6\\\n\6\3\7\5\7_\n\7\3\7\3\7\5\7c\n\7"+
		"\3\7\3\7\5\7g\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\np\n\n\f\n\16\ns\13\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u0081\n\r\r\r"+
		"\16\r\u0082\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00b8\n\23\f\23\16\23\u00bb\13"+
		"\23\3\23\3\23\3\24\5\24\u00c0\n\24\3\24\6\24\u00c3\n\24\r\24\16\24\u00c4"+
		"\3\24\3\24\6\24\u00c9\n\24\r\24\16\24\u00ca\5\24\u00cd\n\24\3\25\3\25"+
		"\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25\3\25\2\4\32\34\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\7\r\4\2\6\6\35\35\3\2\25\26"+
		"\3\2\27\30\3\2\17\22\3\2\32\33\u00de\2*\3\2\2\2\4,\3\2\2\2\6\61\3\2\2"+
		"\2\b\67\3\2\2\2\n[\3\2\2\2\f^\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22l\3\2"+
		"\2\2\24t\3\2\2\2\26x\3\2\2\2\30|\3\2\2\2\32\u0084\3\2\2\2\34\u008f\3\2"+
		"\2\2\36\u00a2\3\2\2\2 \u00a4\3\2\2\2\"\u00b0\3\2\2\2$\u00b2\3\2\2\2&\u00bf"+
		"\3\2\2\2(\u00ce\3\2\2\2*+\5\4\3\2+\3\3\2\2\2,-\5\6\4\2-\5\3\2\2\2.\60"+
		"\5\b\5\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2"+
		"\2\63\61\3\2\2\2\648\5\30\r\2\658\5\n\6\2\668\5\32\16\2\67\64\3\2\2\2"+
		"\67\65\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29:\7\63\2\2:;\7\23\2\2;<\5\26\f"+
		"\2<=\7\24\2\2=>\7\3\2\2>?\5\6\4\2?D\7\4\2\2@A\7\5\2\2AB\5\6\4\2BC\7\4"+
		"\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2E\\\3\2\2\2FG\7\62\2\2GH\7\23\2\2HI"+
		"\5\f\7\2IJ\7\24\2\2JK\5\n\6\2K\\\3\2\2\2LN\7A\2\2MO\5\32\16\2NM\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2P\\\7\6\2\2QS\7!\2\2RT\5(\25\2SR\3\2\2\2ST\3\2\2"+
		"\2TU\3\2\2\2U\\\7\6\2\2VX\7(\2\2WY\5(\25\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2"+
		"\2Z\\\7\6\2\2[9\3\2\2\2[F\3\2\2\2[L\3\2\2\2[Q\3\2\2\2[V\3\2\2\2\\\13\3"+
		"\2\2\2]_\5\16\b\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\6\2\2ac\5\32\16\2"+
		"ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\6\2\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2"+
		"\2g\r\3\2\2\2hi\5\30\r\2i\17\3\2\2\2jk\5\22\n\2k\21\3\2\2\2lq\5\32\16"+
		"\2mn\7\34\2\2np\5\32\16\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23"+
		"\3\2\2\2sq\3\2\2\2tu\7\23\2\2uv\5\32\16\2vw\7\24\2\2w\25\3\2\2\2xy\5\32"+
		"\16\2yz\t\2\2\2z{\5\32\16\2{\27\3\2\2\2|}\5(\25\2}~\7\16\2\2~\u0080\5"+
		"\32\16\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\b\16\1"+
		"\2\u0085\u0086\5\34\17\2\u0086\u008c\3\2\2\2\u0087\u0088\f\4\2\2\u0088"+
		"\u0089\t\4\2\2\u0089\u008b\5\34\17\2\u008a\u0087\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\b\17\1\2\u0090\u0091\5\36\20\2\u0091\u0097"+
		"\3\2\2\2\u0092\u0093\f\4\2\2\u0093\u0094\t\5\2\2\u0094\u0096\5\36\20\2"+
		"\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a3\5&\24\2\u009b"+
		"\u00a3\5(\25\2\u009c\u009d\7\23\2\2\u009d\u009e\5\32\16\2\u009e\u009f"+
		"\7\24\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a3\5 \21\2\u00a1\u00a3\5$\23\2"+
		"\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\5\"\22\2\u00a5"+
		"\u00a6\7\23\2\2\u00a6\u00ab\5\32\16\2\u00a7\u00a8\7\34\2\2\u00a8\u00aa"+
		"\5\32\16\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\7\24\2\2\u00af!\3\2\2\2\u00b0\u00b1\t\6\2\2\u00b1#\3\2\2\2\u00b2\u00b3"+
		"\5(\25\2\u00b3\u00b4\7\23\2\2\u00b4\u00b9\5\32\16\2\u00b5\u00b6\7\34\2"+
		"\2\u00b6\u00b8\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\24\2\2\u00bd%\3\2\2\2\u00be\u00c0\7\26\2\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\7\33\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c8\7\31\2\2\u00c7\u00c9\7\33\2\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\'\3\2\2\2\u00ce\u00d2\7\32\2\2\u00cf\u00d1\t\7\2\2\u00d0\u00cf\3\2\2"+
		"\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\30\61\67DNSX[^bfq\u0082\u008c\u0097\u00a2"+
		"\u00ab\u00b9\u00bf\u00c4\u00ca\u00cc\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}