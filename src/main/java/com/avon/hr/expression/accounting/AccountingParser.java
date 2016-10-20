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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, EQUAL=16, LPAREN=17, 
		RPAREN=18, PLUS=19, MINUS=20, TIMES=21, DIV=22, POINT=23, LETTER=24, DIGIT=25, 
		COMMA=26, ABSTRACT=27, ASSERT=28, BOOLEAN=29, BREAK=30, BYTE=31, CASE=32, 
		CATCH=33, CHAR=34, CLASS=35, CONST=36, CONTINUE=37, DEFAULT=38, DO=39, 
		DOUBLE=40, ELSE=41, ENUM=42, EXTENDS=43, FINAL=44, FINALLY=45, FLOAT=46, 
		FOR=47, IF=48, GOTO=49, IMPLEMENTS=50, IMPORT=51, INSTANCEOF=52, INT=53, 
		INTERFACE=54, LONG=55, NATIVE=56, NEW=57, PACKAGE=58, PRIVATE=59, PROTECTED=60, 
		PUBLIC=61, RETURN=62, SHORT=63, STATIC=64, STRICTFP=65, SUPER=66, SWITCH=67, 
		SYNCHRONIZED=68, THIS=69, THROW=70, THROWS=71, TRANSIENT=72, TRY=73, VOID=74, 
		VOLATILE=75, WHILE=76, Identifier=77, AT=78, ELLIPSIS=79, WS=80, COMMENT=81, 
		LINE_COMMENT=82, NEWLINE=83, SEMICOLON=84;
	public static final int
		RULE_start = 0, RULE_methodBody = 1, RULE_block = 2, RULE_blockStatement = 3, 
		RULE_statement = 4, RULE_forControl = 5, RULE_forInit = 6, RULE_forUpdate = 7, 
		RULE_expressionList = 8, RULE_judgeExpression = 9, RULE_assign = 10, RULE_expression = 11, 
		RULE_multiplyingExpression = 12, RULE_atomExpression = 13, RULE_funcExpression = 14, 
		RULE_innerFunctionName = 15, RULE_outerFunction = 16, RULE_parameter = 17, 
		RULE_string = 18, RULE_number = 19, RULE_identifier = 20;
	public static final String[] ruleNames = {
		"start", "methodBody", "block", "blockStatement", "statement", "forControl", 
		"forInit", "forUpdate", "expressionList", "judgeExpression", "assign", 
		"expression", "multiplyingExpression", "atomExpression", "funcExpression", 
		"innerFunctionName", "outerFunction", "parameter", "string", "number", 
		"identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'else {'", "'=='", "'>'", "'>='", "'<'", "'<='", 
		"'<>'", "'!='", "'SUM'", "'AVERAGE'", "'MAX'", "'MIN'", "'\"'", "'='", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", null, "'@'", "'...'", null, 
		null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "EQUAL", "LPAREN", "RPAREN", "PLUS", "MINUS", 
		"TIMES", "DIV", "POINT", "LETTER", "DIGIT", "COMMA", "ABSTRACT", "ASSERT", 
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT", "NEWLINE", "SEMICOLON"
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
			setState(42);
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
			setState(44);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN))) != 0) || _la==Identifier) {
				{
				{
				setState(46);
				blockStatement();
				}
				}
				setState(51);
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
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				assign();
				setState(54);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(53);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				statement();
				setState(58);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(57);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				expression(0);
				setState(62);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(61);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

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
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
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
			setState(113);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfelseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(IF);
				setState(67);
				match(LPAREN);
				setState(68);
				judgeExpression();
				setState(69);
				match(RPAREN);
				setState(70);
				match(T__0);
				setState(71);
				((IfelseStatementContext)_localctx).yesblock = block();
				setState(72);
				match(T__1);
				setState(77);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(73);
					match(T__2);
					setState(74);
					((IfelseStatementContext)_localctx).noblock = block();
					setState(75);
					match(T__1);
					}
				}

				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(79);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(FOR);
				setState(83);
				match(LPAREN);
				setState(84);
				forControl();
				setState(85);
				match(RPAREN);
				setState(86);
				match(T__0);
				setState(87);
				block();
				setState(88);
				match(T__1);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(89);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(RETURN);
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(93);
					expression(0);
					}
					break;
				}
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(BREAK);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(100);
					identifier();
					}
					break;
				}
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(103);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(CONTINUE);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(107);
					identifier();
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(110);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
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
		public List<TerminalNode> SEMICOLON() { return getTokens(AccountingParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AccountingParser.SEMICOLON, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
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
			setState(116);
			_la = _input.LA(1);
			if (_la==LETTER || _la==Identifier) {
				{
				setState(115);
				forInit();
				}
			}

			setState(118);
			match(SEMICOLON);
			setState(120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || _la==Identifier) {
				{
				setState(119);
				judgeExpression();
				}
			}

			setState(122);
			match(SEMICOLON);
			setState(124);
			_la = _input.LA(1);
			if (_la==LETTER || _la==Identifier) {
				{
				setState(123);
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
			setState(126);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
			setState(128);
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
			setState(130);
			expression(0);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				expression(0);
				}
				}
				setState(137);
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
		enterRule(_localctx, 18, RULE_judgeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((JudgeExpressionContext)_localctx).left = expression(0);
			setState(139);
			((JudgeExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				((JudgeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(140);
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
		public TerminalNode EQUAL() { return getToken(AccountingParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
		public AssignVariableContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		int _la;
		try {
			_localctx = new AssignVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			identifier();
			setState(143);
			match(EQUAL);
			setState(144);
			expression(0);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SinglePlusOrMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(149);
			multiplyingExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusOrMinusContext(new ExpressionContext(_parentctx, _parentState));
					((PlusOrMinusContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(151);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(152);
					((PlusOrMinusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusOrMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(153);
					((PlusOrMinusContext)_localctx).right = multiplyingExpression(0);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_multiplyingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTimesOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(160);
			atomExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TimesOrDivContext(new MultiplyingExpressionContext(_parentctx, _parentState));
					((TimesOrDivContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyingExpression);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					((TimesOrDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
						((TimesOrDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(164);
					((TimesOrDivContext)_localctx).right = atomExpression();
					}
					} 
				}
				setState(169);
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
		enterRule(_localctx, 26, RULE_atomExpression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				number();
				}
				break;
			case 2:
				_localctx = new AtomVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				identifier();
				}
				break;
			case 3:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(LPAREN);
				setState(173);
				expression(0);
				setState(174);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new AtomFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				funcExpression();
				}
				break;
			case 5:
				_localctx = new OuterFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
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
		public InnerFunctionNameContext innerFunctionName() {
			return getRuleContext(InnerFunctionNameContext.class,0);
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
		enterRule(_localctx, 28, RULE_funcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			innerFunctionName();
			setState(181);
			match(LPAREN);
			setState(182);
			expression(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				expression(0);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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

	public static class InnerFunctionNameContext extends ParserRuleContext {
		public InnerFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitInnerFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerFunctionNameContext innerFunctionName() throws RecognitionException {
		InnerFunctionNameContext _localctx = new InnerFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_innerFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		enterRule(_localctx, 32, RULE_outerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			identifier();
			setState(195);
			match(LPAREN);
			setState(196);
			parameter();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				parameter();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterExpressionContext extends ParameterContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterExpressionContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterStringContext extends ParameterContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ParameterStringContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitParameterString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case LPAREN:
			case MINUS:
			case LETTER:
			case DIGIT:
			case Identifier:
				_localctx = new ParameterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				expression(0);
				}
				break;
			case T__14:
				_localctx = new ParameterStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				string();
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

	public static class StringContext extends ParserRuleContext {
		public String value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__14);
			setState(211);
			identifier();
			setState(212);
			match(T__14);
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
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(214);
				match(MINUS);
				}
			}

			setState(218); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(217);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(222);
				match(POINT);
				setState(224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public TerminalNode Identifier() { return getToken(AccountingParser.Identifier, 0); }
		public TerminalNode LETTER() { return getToken(AccountingParser.LETTER, 0); }
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
		enterRule(_localctx, 40, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==Identifier) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u00eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\7\4\62\n"+
		"\4\f\4\16\4\65\13\4\3\5\3\5\5\59\n\5\3\5\3\5\5\5=\n\5\3\5\3\5\5\5A\n\5"+
		"\5\5C\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\5\6"+
		"S\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\5\6a\n\6\3\6\5"+
		"\6d\n\6\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\6\3\6\5\6o\n\6\3\6\5\6r\n\6\5"+
		"\6t\n\6\3\7\5\7w\n\7\3\7\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009d\n\r\f"+
		"\r\16\r\u00a0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16"+
		"\16\16\u00ab\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00ca\n\22\f\22\16"+
		"\22\u00cd\13\22\3\22\3\22\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\5\25\u00da\n\25\3\25\6\25\u00dd\n\25\r\25\16\25\u00de\3\25\3\25"+
		"\6\25\u00e3\n\25\r\25\16\25\u00e4\5\25\u00e7\n\25\3\26\3\26\3\26\2\4\30"+
		"\32\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\b\3\2UV\3\2\6\f"+
		"\3\2\25\26\3\2\27\30\3\2\r\20\4\2\32\32OO\u00fa\2,\3\2\2\2\4.\3\2\2\2"+
		"\6\63\3\2\2\2\bB\3\2\2\2\ns\3\2\2\2\fv\3\2\2\2\16\u0080\3\2\2\2\20\u0082"+
		"\3\2\2\2\22\u0084\3\2\2\2\24\u008c\3\2\2\2\26\u0090\3\2\2\2\30\u0096\3"+
		"\2\2\2\32\u00a1\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00c2\3\2\2"+
		"\2\"\u00c4\3\2\2\2$\u00d2\3\2\2\2&\u00d4\3\2\2\2(\u00d9\3\2\2\2*\u00e8"+
		"\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\5\6\4\2/\5\3\2\2\2\60\62\5\b\5\2\61\60"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65\63"+
		"\3\2\2\2\668\5\26\f\2\679\t\2\2\28\67\3\2\2\289\3\2\2\29C\3\2\2\2:<\5"+
		"\n\6\2;=\t\2\2\2<;\3\2\2\2<=\3\2\2\2=C\3\2\2\2>@\5\30\r\2?A\t\2\2\2@?"+
		"\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\66\3\2\2\2B:\3\2\2\2B>\3\2\2\2C\t\3\2\2"+
		"\2DE\7\62\2\2EF\7\23\2\2FG\5\24\13\2GH\7\24\2\2HI\7\3\2\2IJ\5\6\4\2JO"+
		"\7\4\2\2KL\7\5\2\2LM\5\6\4\2MN\7\4\2\2NP\3\2\2\2OK\3\2\2\2OP\3\2\2\2P"+
		"R\3\2\2\2QS\t\2\2\2RQ\3\2\2\2RS\3\2\2\2St\3\2\2\2TU\7\61\2\2UV\7\23\2"+
		"\2VW\5\f\7\2WX\7\24\2\2XY\7\3\2\2YZ\5\6\4\2Z\\\7\4\2\2[]\t\2\2\2\\[\3"+
		"\2\2\2\\]\3\2\2\2]t\3\2\2\2^`\7@\2\2_a\5\30\r\2`_\3\2\2\2`a\3\2\2\2ac"+
		"\3\2\2\2bd\t\2\2\2cb\3\2\2\2cd\3\2\2\2dt\3\2\2\2eg\7 \2\2fh\5*\26\2gf"+
		"\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\t\2\2\2ji\3\2\2\2jk\3\2\2\2kt\3\2\2\2l"+
		"n\7\'\2\2mo\5*\26\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\t\2\2\2qp\3\2\2\2"+
		"qr\3\2\2\2rt\3\2\2\2sD\3\2\2\2sT\3\2\2\2s^\3\2\2\2se\3\2\2\2sl\3\2\2\2"+
		"t\13\3\2\2\2uw\5\16\b\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7V\2\2y{\5\24"+
		"\13\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7V\2\2}\177\5\20\t\2~}\3\2\2\2~"+
		"\177\3\2\2\2\177\r\3\2\2\2\u0080\u0081\5\26\f\2\u0081\17\3\2\2\2\u0082"+
		"\u0083\5\26\f\2\u0083\21\3\2\2\2\u0084\u0089\5\30\r\2\u0085\u0086\7\34"+
		"\2\2\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23\3\2\2\2\u008b\u0089\3\2\2"+
		"\2\u008c\u008d\5\30\r\2\u008d\u008e\t\3\2\2\u008e\u008f\5\30\r\2\u008f"+
		"\25\3\2\2\2\u0090\u0091\5*\26\2\u0091\u0092\7\22\2\2\u0092\u0094\5\30"+
		"\r\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\27\3\2\2\2\u0096\u0097\b\r\1\2\u0097\u0098\5\32\16\2\u0098\u009e\3\2"+
		"\2\2\u0099\u009a\f\4\2\2\u009a\u009b\t\4\2\2\u009b\u009d\5\32\16\2\u009c"+
		"\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\31\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\16\1\2\u00a2\u00a3"+
		"\5\34\17\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\t\5\2\2"+
		"\u00a6\u00a8\5\34\17\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00b5\5(\25\2\u00ad\u00b5\5*\26\2\u00ae\u00af\7\23\2\2\u00af\u00b0\5"+
		"\30\r\2\u00b0\u00b1\7\24\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b5\5\36\20\2"+
		"\u00b3\u00b5\5\"\22\2\u00b4\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\35\3\2\2\2\u00b6"+
		"\u00b7\5 \21\2\u00b7\u00b8\7\23\2\2\u00b8\u00bd\5\30\r\2\u00b9\u00ba\7"+
		"\34\2\2\u00ba\u00bc\5\30\r\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c1\7\24\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3!"+
		"\3\2\2\2\u00c4\u00c5\5*\26\2\u00c5\u00c6\7\23\2\2\u00c6\u00cb\5$\23\2"+
		"\u00c7\u00c8\7\34\2\2\u00c8\u00ca\5$\23\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\24\2\2\u00cf#\3\2\2\2\u00d0\u00d3\5\30\r"+
		"\2\u00d1\u00d3\5&\24\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3%"+
		"\3\2\2\2\u00d4\u00d5\7\21\2\2\u00d5\u00d6\5*\26\2\u00d6\u00d7\7\21\2\2"+
		"\u00d7\'\3\2\2\2\u00d8\u00da\7\26\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\7\33\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e6"+
		"\3\2\2\2\u00e0\u00e2\7\31\2\2\u00e1\u00e3\7\33\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7)\3\2\2\2\u00e8"+
		"\u00e9\t\7\2\2\u00e9+\3\2\2\2 \638<@BOR\\`cgjnqsvz~\u0089\u0094\u009e"+
		"\u00a9\u00b4\u00bd\u00cb\u00d2\u00d9\u00de\u00e4\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}