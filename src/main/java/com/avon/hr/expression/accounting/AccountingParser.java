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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, EQUAL=15, LPAREN=16, 
		RPAREN=17, PLUS=18, MINUS=19, TIMES=20, DIV=21, POINT=22, LETTER=23, DIGIT=24, 
		COMMA=25, ABSTRACT=26, ASSERT=27, BOOLEAN=28, BREAK=29, BYTE=30, CASE=31, 
		CATCH=32, CHAR=33, CLASS=34, CONST=35, CONTINUE=36, DEFAULT=37, DO=38, 
		DOUBLE=39, ELSE=40, ENUM=41, EXTENDS=42, FINAL=43, FINALLY=44, FLOAT=45, 
		FOR=46, IF=47, GOTO=48, IMPLEMENTS=49, IMPORT=50, INSTANCEOF=51, INT=52, 
		INTERFACE=53, LONG=54, NATIVE=55, NEW=56, PACKAGE=57, PRIVATE=58, PROTECTED=59, 
		PUBLIC=60, RETURN=61, SHORT=62, STATIC=63, STRICTFP=64, SUPER=65, SWITCH=66, 
		SYNCHRONIZED=67, THIS=68, THROW=69, THROWS=70, TRANSIENT=71, TRY=72, VOID=73, 
		VOLATILE=74, WHILE=75, Identifier=76, AT=77, ELLIPSIS=78, WS=79, COMMENT=80, 
		LINE_COMMENT=81, NEWLINE=82, SEMICOLON=83;
	public static final int
		RULE_start = 0, RULE_methodBody = 1, RULE_block = 2, RULE_blockStatement = 3, 
		RULE_statement = 4, RULE_forControl = 5, RULE_forInit = 6, RULE_forUpdate = 7, 
		RULE_expressionList = 8, RULE_judgeExpression = 9, RULE_assign = 10, RULE_expression = 11, 
		RULE_multiplyingExpression = 12, RULE_atomExpression = 13, RULE_funcExpression = 14, 
		RULE_funcname = 15, RULE_outerFunction = 16, RULE_number = 17, RULE_identifier = 18;
	public static final String[] ruleNames = {
		"start", "methodBody", "block", "blockStatement", "statement", "forControl", 
		"forInit", "forUpdate", "expressionList", "judgeExpression", "assign", 
		"expression", "multiplyingExpression", "atomExpression", "funcExpression", 
		"funcname", "outerFunction", "number", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'else {'", "'=='", "'>'", "'>='", "'<'", "'<='", 
		"'<>'", "'!='", "'SUM'", "'AVERAGE'", "'MAX'", "'MIN'", "'='", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", "'abstract'", 
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
		null, null, null, "EQUAL", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "POINT", "LETTER", "DIGIT", "COMMA", "ABSTRACT", "ASSERT", "BOOLEAN", 
		"BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", 
		"FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", 
		"INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
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
			setState(38);
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
			setState(40);
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
		public List<TerminalNode> NEWLINE() { return getTokens(AccountingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AccountingParser.NEWLINE, i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Identifier - 76)) | (1L << (NEWLINE - 76)) | (1L << (SEMICOLON - 76)))) != 0)) {
				{
				setState(45);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case LPAREN:
				case MINUS:
				case LETTER:
				case DIGIT:
				case BREAK:
				case CONTINUE:
				case FOR:
				case IF:
				case RETURN:
				case Identifier:
					{
					setState(42);
					blockStatement();
					}
					break;
				case SEMICOLON:
					{
					setState(43);
					match(SEMICOLON);
					}
					break;
				case NEWLINE:
					{
					setState(44);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
			setState(86);
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
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(75);
					expression(0);
					}
					break;
				}
				}
				break;
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(BREAK);
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(79);
					identifier();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(CONTINUE);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(83);
					identifier();
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
			setState(89);
			_la = _input.LA(1);
			if (_la==LETTER || _la==Identifier) {
				{
				setState(88);
				forInit();
				}
			}

			setState(91);
			match(SEMICOLON);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || _la==Identifier) {
				{
				setState(92);
				expression(0);
				}
			}

			setState(95);
			match(SEMICOLON);
			setState(97);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || _la==Identifier) {
				{
				setState(96);
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
			setState(99);
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
			setState(101);
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
			setState(103);
			expression(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				expression(0);
				}
				}
				setState(110);
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
			setState(111);
			((JudgeExpressionContext)_localctx).left = expression(0);
			setState(112);
			((JudgeExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				((JudgeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(113);
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
		try {
			_localctx = new AssignVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			identifier();
			setState(116);
			match(EQUAL);
			setState(117);
			expression(0);
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

			setState(120);
			multiplyingExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
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
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					((PlusOrMinusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusOrMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(124);
					((PlusOrMinusContext)_localctx).right = multiplyingExpression(0);
					}
					} 
				}
				setState(129);
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

			setState(131);
			atomExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
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
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					((TimesOrDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
						((TimesOrDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(135);
					((TimesOrDivContext)_localctx).right = atomExpression();
					}
					} 
				}
				setState(140);
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
		enterRule(_localctx, 26, RULE_atomExpression);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				number();
				}
				break;
			case 2:
				_localctx = new AtomVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				identifier();
				}
				break;
			case 3:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(LPAREN);
				setState(144);
				expression(0);
				setState(145);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new AtomFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				funcExpression();
				}
				break;
			case 5:
				_localctx = new OuterFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
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
		enterRule(_localctx, 28, RULE_funcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			funcname();
			setState(152);
			match(LPAREN);
			setState(153);
			expression(0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				expression(0);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		enterRule(_localctx, 30, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 32, RULE_outerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			identifier();
			setState(166);
			match(LPAREN);
			setState(167);
			expression(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				expression(0);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(177);
				match(MINUS);
				}
			}

			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(185);
				match(POINT);
				setState(187); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(186);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(189); 
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
		enterRule(_localctx, 36, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3U\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6E\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\5\6S\n\6\3"+
		"\6\3\6\5\6W\n\6\5\6Y\n\6\3\7\5\7\\\n\7\3\7\3\7\5\7`\n\7\3\7\3\7\5\7d\n"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00ad\n\22\f\22\16\22\u00b0\13\22"+
		"\3\22\3\22\3\23\5\23\u00b5\n\23\3\23\6\23\u00b8\n\23\r\23\16\23\u00b9"+
		"\3\23\3\23\6\23\u00be\n\23\r\23\16\23\u00bf\5\23\u00c2\n\23\3\24\3\24"+
		"\3\24\2\4\30\32\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2"+
		"\6\f\3\2\24\25\3\2\26\27\3\2\r\20\4\2\31\31NN\u00cf\2(\3\2\2\2\4*\3\2"+
		"\2\2\6\61\3\2\2\2\b\67\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16e\3\2\2\2\20g\3"+
		"\2\2\2\22i\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30y\3\2\2\2\32\u0084\3\2\2"+
		"\2\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00b4"+
		"\3\2\2\2&\u00c3\3\2\2\2()\5\4\3\2)\3\3\2\2\2*+\5\6\4\2+\5\3\2\2\2,\60"+
		"\5\b\5\2-\60\7U\2\2.\60\7T\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\61\3\2\2\2\648\5\26\f\2"+
		"\658\5\n\6\2\668\5\30\r\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\t"+
		"\3\2\2\29:\7\61\2\2:;\7\22\2\2;<\5\24\13\2<=\7\23\2\2=>\7\3\2\2>?\5\6"+
		"\4\2?D\7\4\2\2@A\7\5\2\2AB\5\6\4\2BC\7\4\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2"+
		"\2\2EY\3\2\2\2FG\7\60\2\2GH\7\22\2\2HI\5\f\7\2IJ\7\23\2\2JK\5\n\6\2KY"+
		"\3\2\2\2LN\7?\2\2MO\5\30\r\2NM\3\2\2\2NO\3\2\2\2OY\3\2\2\2PR\7\37\2\2"+
		"QS\5&\24\2RQ\3\2\2\2RS\3\2\2\2SY\3\2\2\2TV\7&\2\2UW\5&\24\2VU\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2X9\3\2\2\2XF\3\2\2\2XL\3\2\2\2XP\3\2\2\2XT\3\2\2\2"+
		"Y\13\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7U\2\2^`\5"+
		"\30\r\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7U\2\2bd\5\20\t\2cb\3\2\2\2cd"+
		"\3\2\2\2d\r\3\2\2\2ef\5\26\f\2f\17\3\2\2\2gh\5\22\n\2h\21\3\2\2\2in\5"+
		"\30\r\2jk\7\33\2\2km\5\30\r\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\23\3\2\2\2pn\3\2\2\2qr\5\30\r\2rs\t\2\2\2st\5\30\r\2t\25\3\2\2\2uv\5"+
		"&\24\2vw\7\21\2\2wx\5\30\r\2x\27\3\2\2\2yz\b\r\1\2z{\5\32\16\2{\u0081"+
		"\3\2\2\2|}\f\4\2\2}~\t\3\2\2~\u0080\5\32\16\2\177|\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\b\16\1\2\u0085\u0086\5\34\17\2\u0086\u008c"+
		"\3\2\2\2\u0087\u0088\f\4\2\2\u0088\u0089\t\4\2\2\u0089\u008b\5\34\17\2"+
		"\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\33\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0098\5$\23\2\u0090"+
		"\u0098\5&\24\2\u0091\u0092\7\22\2\2\u0092\u0093\5\30\r\2\u0093\u0094\7"+
		"\23\2\2\u0094\u0098\3\2\2\2\u0095\u0098\5\36\20\2\u0096\u0098\5\"\22\2"+
		"\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a\5 \21\2\u009a"+
		"\u009b\7\22\2\2\u009b\u00a0\5\30\r\2\u009c\u009d\7\33\2\2\u009d\u009f"+
		"\5\30\r\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7\23\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6!\3\2\2\2\u00a7\u00a8"+
		"\5&\24\2\u00a8\u00a9\7\22\2\2\u00a9\u00ae\5\30\r\2\u00aa\u00ab\7\33\2"+
		"\2\u00ab\u00ad\5\30\r\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7\23\2\2\u00b2#\3\2\2\2\u00b3\u00b5\7\25\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7\32\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00c1\3\2\2\2\u00bb\u00bd\7\30\2\2\u00bc\u00be\7\32\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"%\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\'\3\2\2\2\27/\61\67DNRVX[_cn\u0081"+
		"\u008c\u0097\u00a0\u00ae\u00b4\u00b9\u00bf\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}