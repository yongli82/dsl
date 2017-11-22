// Generated from /Users/yangyongli/Spring/avon/src/main/java/com/avon/hr/accounting/Accounting.g4 by ANTLR 4.7
package com.avon.hr.accounting;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AccountingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		VOLATILE=75, WHILE=76, TRUE=77, FALSE=78, AND=79, OR=80, Identifier=81, 
		AT=82, ELLIPSIS=83, WS=84, COMMENT=85, LINE_COMMENT=86, NEWLINE=87, SEMICOLON=88;
	public static final int
		RULE_start = 0, RULE_methodBody = 1, RULE_block = 2, RULE_blockStatement = 3, 
		RULE_statement = 4, RULE_ifBranch = 5, RULE_elseIfBranch = 6, RULE_elseBranch = 7, 
		RULE_returnStatement = 8, RULE_forControl = 9, RULE_forInit = 10, RULE_forUpdate = 11, 
		RULE_expressionList = 12, RULE_judgeExpression = 13, RULE_assign = 14, 
		RULE_expression = 15, RULE_multiplyingExpression = 16, RULE_atomExpression = 17, 
		RULE_funcExpression = 18, RULE_innerFunctionName = 19, RULE_outerFunction = 20, 
		RULE_parameter = 21, RULE_string = 22, RULE_number = 23, RULE_identifier = 24;
	public static final String[] ruleNames = {
		"start", "methodBody", "block", "blockStatement", "statement", "ifBranch", 
		"elseIfBranch", "elseBranch", "returnStatement", "forControl", "forInit", 
		"forUpdate", "expressionList", "judgeExpression", "assign", "expression", 
		"multiplyingExpression", "atomExpression", "funcExpression", "innerFunctionName", 
		"outerFunction", "parameter", "string", "number", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'=='", "'>'", "'>='", "'<'", "'<='", "'<>'", "'!='", 
		"'SUM'", "'AVERAGE'", "'MAX'", "'MIN'", "'SIGNAL'", "'\"'", "'='", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", null, null, null, null, null, 
		"'@'", "'...'", null, null, null, null, "';'"
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
		"VOLATILE", "WHILE", "TRUE", "FALSE", "AND", "OR", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "NEWLINE", "SEMICOLON"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(50);
				match(EQUAL);
				}
			}

			setState(53);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitMethodBody(this);
		}
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
			setState(55);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitBlock(this);
		}
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT) | (1L << FOR) | (1L << IF))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TRUE - 77)) | (1L << (FALSE - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				{
				setState(57);
				blockStatement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(63);
				returnStatement();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AccountingParser.SEMICOLON, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitBlockStatement(this);
		}
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				assign();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(67);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				statement();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(71);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				expression(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE || _la==SEMICOLON) {
					{
					setState(75);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
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
		public IfBranchContext ifBranch() {
			return getRuleContext(IfBranchContext.class,0);
		}
		public List<ElseIfBranchContext> elseIfBranch() {
			return getRuleContexts(ElseIfBranchContext.class);
		}
		public ElseIfBranchContext elseIfBranch(int i) {
			return getRuleContext(ElseIfBranchContext.class,i);
		}
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AccountingParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
		public IfelseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterIfelseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitIfelseStatement(this);
		}
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
		public TerminalNode SEMICOLON() { return getToken(AccountingParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfelseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				ifBranch();
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						elseIfBranch();
						}
						}
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(87);
					elseBranch();
					}
				}

				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(90);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
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
				setState(93);
				match(FOR);
				setState(94);
				match(LPAREN);
				setState(95);
				forControl();
				setState(96);
				match(RPAREN);
				setState(97);
				match(T__0);
				setState(98);
				block();
				setState(99);
				match(T__1);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(100);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
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

	public static class IfBranchContext extends ParserRuleContext {
		public boolean isMatch;
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterIfBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitIfBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitIfBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBranchContext ifBranch() throws RecognitionException {
		IfBranchContext _localctx = new IfBranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			match(LPAREN);
			setState(107);
			judgeExpression(0);
			setState(108);
			match(RPAREN);
			setState(109);
			match(T__0);
			setState(110);
			block();
			setState(111);
			match(T__1);
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

	public static class ElseIfBranchContext extends ParserRuleContext {
		public boolean isMatch;
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterElseIfBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitElseIfBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitElseIfBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBranchContext elseIfBranch() throws RecognitionException {
		ElseIfBranchContext _localctx = new ElseIfBranchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIfBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ELSE);
			setState(114);
			match(IF);
			setState(115);
			match(LPAREN);
			setState(116);
			judgeExpression(0);
			setState(117);
			match(RPAREN);
			setState(118);
			match(T__0);
			setState(119);
			block();
			setState(120);
			match(T__1);
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

	public static class ElseBranchContext extends ParserRuleContext {
		public boolean isMatch;
		public BlockContext noblock;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBranchContext elseBranch() throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ELSE);
			setState(123);
			match(T__0);
			setState(124);
			((ElseBranchContext)_localctx).noblock = block();
			setState(125);
			match(T__1);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AccountingParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(RETURN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TRUE - 77)) | (1L << (FALSE - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(128);
				expression(0);
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==SEMICOLON) {
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER || _la==Identifier) {
				{
				setState(134);
				forInit();
				}
			}

			setState(137);
			match(SEMICOLON);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TRUE - 77)) | (1L << (FALSE - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(138);
				judgeExpression(0);
				}
			}

			setState(141);
			match(SEMICOLON);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER || _la==Identifier) {
				{
				setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression(0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				expression(0);
				}
				}
				setState(156);
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
		public AtomExpressionContext left;
		public Token op;
		public AtomExpressionContext right;
		public List<AtomExpressionContext> atomExpression() {
			return getRuleContexts(AtomExpressionContext.class);
		}
		public AtomExpressionContext atomExpression(int i) {
			return getRuleContext(AtomExpressionContext.class,i);
		}
		public TerminalNode TRUE() { return getToken(AccountingParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AccountingParser.FALSE, 0); }
		public List<JudgeExpressionContext> judgeExpression() {
			return getRuleContexts(JudgeExpressionContext.class);
		}
		public JudgeExpressionContext judgeExpression(int i) {
			return getRuleContext(JudgeExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AccountingParser.AND, 0); }
		public TerminalNode OR() { return getToken(AccountingParser.OR, 0); }
		public JudgeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterJudgeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitJudgeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitJudgeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionContext judgeExpression() throws RecognitionException {
		return judgeExpression(0);
	}

	private JudgeExpressionContext judgeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JudgeExpressionContext _localctx = new JudgeExpressionContext(_ctx, _parentState);
		JudgeExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_judgeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case LPAREN:
			case MINUS:
			case LETTER:
			case DIGIT:
			case Identifier:
				{
				setState(158);
				((JudgeExpressionContext)_localctx).left = atomExpression();
				setState(159);
				((JudgeExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((JudgeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				((JudgeExpressionContext)_localctx).right = atomExpression();
				}
				break;
			case TRUE:
				{
				setState(162);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(163);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new JudgeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_judgeExpression);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(AND);
						setState(168);
						judgeExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new JudgeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_judgeExpression);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						match(OR);
						setState(171);
						judgeExpression(2);
						}
						break;
					}
					}
				}
				setState(176);
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
		public TerminalNode SEMICOLON() { return getToken(AccountingParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(AccountingParser.NEWLINE, 0); }
		public AssignVariableContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterAssignVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitAssignVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		int _la;
		try {
			_localctx = new AssignVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			identifier();
			setState(178);
			match(EQUAL);
			setState(179);
			expression(0);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
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
	public static class BooleanNumberContext extends ExpressionContext {
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
		}
		public BooleanNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterBooleanNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitBooleanNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitBooleanNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinglePlusOrMinusContext extends ExpressionContext {
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public SinglePlusOrMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterSinglePlusOrMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitSinglePlusOrMinus(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterPlusOrMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitPlusOrMinus(this);
		}
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new SinglePlusOrMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				multiplyingExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new BooleanNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				judgeExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusOrMinusContext(new ExpressionContext(_parentctx, _parentState));
					((PlusOrMinusContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(188);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(189);
					((PlusOrMinusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusOrMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(190);
					((PlusOrMinusContext)_localctx).right = multiplyingExpression(0);
					}
					}
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterSingleTimesOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitSingleTimesOrDiv(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterTimesOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitTimesOrDiv(this);
		}
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_multiplyingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTimesOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(197);
			atomExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TimesOrDivContext(new MultiplyingExpressionContext(_parentctx, _parentState));
					((TimesOrDivContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyingExpression);
					setState(199);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(200);
					((TimesOrDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
						((TimesOrDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					((TimesOrDivContext)_localctx).right = atomExpression();
					}
					}
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterOuterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitOuterFunctionExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitParen(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterAtomVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitAtomVariable(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitAtomNumber(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterAtomFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitAtomFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitAtomFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atomExpression);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				number();
				}
				break;
			case 2:
				_localctx = new AtomVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				identifier();
				}
				break;
			case 3:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(LPAREN);
				setState(210);
				expression(0);
				setState(211);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new AtomFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				funcExpression();
				}
				break;
			case 5:
				_localctx = new OuterFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterFuncExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitFuncExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitFuncExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExpressionContext funcExpression() throws RecognitionException {
		FuncExpressionContext _localctx = new FuncExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			innerFunctionName();
			setState(218);
			match(LPAREN);
			setState(219);
			expression(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				expression(0);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterInnerFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitInnerFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitInnerFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerFunctionNameContext innerFunctionName() throws RecognitionException {
		InnerFunctionNameContext _localctx = new InnerFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_innerFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		public TerminalNode RPAREN() { return getToken(AccountingParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AccountingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AccountingParser.COMMA, i);
		}
		public OuterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterOuterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitOuterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitOuterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterFunctionContext outerFunction() throws RecognitionException {
		OuterFunctionContext _localctx = new OuterFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_outerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			identifier();
			setState(232);
			match(LPAREN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LPAREN) | (1L << MINUS) | (1L << LETTER) | (1L << DIGIT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TRUE - 77)) | (1L << (FALSE - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(233);
				parameter();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					parameter();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(243);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterParameterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitParameterExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterParameterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitParameterString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitParameterString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case LPAREN:
			case MINUS:
			case LETTER:
			case DIGIT:
			case TRUE:
			case FALSE:
			case Identifier:
				_localctx = new ParameterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				expression(0);
				}
				break;
			case T__14:
				_localctx = new ParameterStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__14);
			setState(250);
			identifier();
			setState(251);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(253);
				match(MINUS);
				}
			}

			setState(257);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(256);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(261);
				match(POINT);
				setState(263);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AccountingListener ) ((AccountingListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AccountingVisitor ) return ((AccountingVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		case 13:
			return judgeExpression_sempred((JudgeExpressionContext)_localctx, predIndex);
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return multiplyingExpression_sempred((MultiplyingExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean judgeExpression_sempred(JudgeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean multiplyingExpression_sempred(MultiplyingExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\3\2\3\3\3\3\3\4\7\4=\n\4\f\4\16\4@\13\4"+
		"\3\4\5\4C\n\4\3\5\3\5\5\5G\n\5\3\5\3\5\5\5K\n\5\3\5\3\5\5\5O\n\5\5\5Q"+
		"\n\5\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\6\5\6[\n\6\3\6\5\6^\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\n\u0084\n\n\3\n\5\n\u0087\n\n\3\13\5\13\u008a\n\13\3\13\3\13\5\13\u008e"+
		"\n\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u009b"+
		"\n\16\f\16\16\16\u009e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3\21\5\21\u00bd\n\21"+
		"\3\21\3\21\3\21\7\21\u00c2\n\21\f\21\16\21\u00c5\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00e1\n\24\f\24\16\24\u00e4\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u00ef\n\26\f\26\16\26\u00f2\13\26\5\26\u00f4\n\26\3\26"+
		"\3\26\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\30\3\30\3\31\5\31\u0101\n"+
		"\31\3\31\6\31\u0104\n\31\r\31\16\31\u0105\3\31\3\31\6\31\u010a\n\31\r"+
		"\31\16\31\u010b\5\31\u010e\n\31\3\32\3\32\3\32\2\5\34 \"\33\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\b\3\2YZ\3\2\5\13\3\2\25"+
		"\26\3\2\27\30\3\2\f\20\4\2\32\32SS\2\u011f\2\65\3\2\2\2\49\3\2\2\2\6>"+
		"\3\2\2\2\bP\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16s\3\2\2\2\20|\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u0089\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3"+
		"\2\2\2\34\u00a6\3\2\2\2\36\u00b3\3\2\2\2 \u00bc\3\2\2\2\"\u00c6\3\2\2"+
		"\2$\u00d9\3\2\2\2&\u00db\3\2\2\2(\u00e7\3\2\2\2*\u00e9\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u00fb\3\2\2\2\60\u0100\3\2\2\2\62\u010f\3\2\2\2\64\66\7\22\2"+
		"\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\5\4\3\28\3\3\2\2\29:"+
		"\5\6\4\2:\5\3\2\2\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2AC\5\22\n\2BA\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DF\5\36"+
		"\20\2EG\t\2\2\2FE\3\2\2\2FG\3\2\2\2GQ\3\2\2\2HJ\5\n\6\2IK\t\2\2\2JI\3"+
		"\2\2\2JK\3\2\2\2KQ\3\2\2\2LN\5 \21\2MO\t\2\2\2NM\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PD\3\2\2\2PH\3\2\2\2PL\3\2\2\2Q\t\3\2\2\2RV\5\f\7\2SU\5\16\b\2T"+
		"S\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\5\20\t\2"+
		"ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2]^\3\2\2\2^j\3\2\2"+
		"\2_`\7\61\2\2`a\7\23\2\2ab\5\24\13\2bc\7\24\2\2cd\7\3\2\2de\5\6\4\2eg"+
		"\7\4\2\2fh\t\2\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2iR\3\2\2\2i_\3\2\2\2j"+
		"\13\3\2\2\2kl\7\62\2\2lm\7\23\2\2mn\5\34\17\2no\7\24\2\2op\7\3\2\2pq\5"+
		"\6\4\2qr\7\4\2\2r\r\3\2\2\2st\7+\2\2tu\7\62\2\2uv\7\23\2\2vw\5\34\17\2"+
		"wx\7\24\2\2xy\7\3\2\2yz\5\6\4\2z{\7\4\2\2{\17\3\2\2\2|}\7+\2\2}~\7\3\2"+
		"\2~\177\5\6\4\2\177\u0080\7\4\2\2\u0080\21\3\2\2\2\u0081\u0083\7@\2\2"+
		"\u0082\u0084\5 \21\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008d\7Z\2\2\u008c\u008e\5\34\17\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7Z"+
		"\2\2\u0090\u0092\5\30\r\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\25\3\2\2\2\u0093\u0094\5\36\20\2\u0094\27\3\2\2\2\u0095\u0096\5\36\20"+
		"\2\u0096\31\3\2\2\2\u0097\u009c\5 \21\2\u0098\u0099\7\34\2\2\u0099\u009b"+
		"\5 \21\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\33\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\b\17\1"+
		"\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\t\3\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a7"+
		"\3\2\2\2\u00a4\u00a7\7O\2\2\u00a5\u00a7\7P\2\2\u00a6\u009f\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00b0\3\2\2\2\u00a8\u00a9\f\4"+
		"\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00af\5\34\17\5\u00ab\u00ac\f\3\2\2\u00ac"+
		"\u00ad\7R\2\2\u00ad\u00af\5\34\17\4\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3"+
		"\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\35\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\62\32\2\u00b4\u00b5\7\22"+
		"\2\2\u00b5\u00b7\5 \21\2\u00b6\u00b8\t\2\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\b\21\1\2\u00ba\u00bd\5\"\22"+
		"\2\u00bb\u00bd\5\34\17\2\u00bc\u00b9\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c3\3\2\2\2\u00be\u00bf\f\5\2\2\u00bf\u00c0\t\4\2\2\u00c0\u00c2\5\""+
		"\22\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\22\1\2"+
		"\u00c7\u00c8\5$\23\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\4\2\2\u00ca\u00cb"+
		"\t\5\2\2\u00cb\u00cd\5$\23\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d1\u00da\5\60\31\2\u00d2\u00da\5\62\32\2\u00d3\u00d4\7\23\2\2\u00d4"+
		"\u00d5\5 \21\2\u00d5\u00d6\7\24\2\2\u00d6\u00da\3\2\2\2\u00d7\u00da\5"+
		"&\24\2\u00d8\u00da\5*\26\2\u00d9\u00d1\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da%\3\2\2\2"+
		"\u00db\u00dc\5(\25\2\u00dc\u00dd\7\23\2\2\u00dd\u00e2\5 \21\2\u00de\u00df"+
		"\7\34\2\2\u00df\u00e1\5 \21\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\7\24\2\2\u00e6\'\3\2\2\2\u00e7\u00e8\t\6\2\2\u00e8"+
		")\3\2\2\2\u00e9\u00ea\5\62\32\2\u00ea\u00f3\7\23\2\2\u00eb\u00f0\5,\27"+
		"\2\u00ec\u00ed\7\34\2\2\u00ed\u00ef\5,\27\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\7\24\2\2\u00f6+\3\2\2\2\u00f7\u00fa\5 \21\2"+
		"\u00f8\u00fa\5.\30\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa-\3"+
		"\2\2\2\u00fb\u00fc\7\21\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\7\21\2\2"+
		"\u00fe/\3\2\2\2\u00ff\u0101\7\26\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\7\33\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010d\3\2"+
		"\2\2\u0107\u0109\7\31\2\2\u0108\u010a\7\33\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u010e\3\2\2\2\u010e\61\3\2\2\2\u010f\u0110"+
		"\t\7\2\2\u0110\63\3\2\2\2$\65>BFJNPVZ]gi\u0083\u0086\u0089\u008d\u0091"+
		"\u009c\u00a6\u00ae\u00b0\u00b7\u00bc\u00c3\u00ce\u00d9\u00e2\u00f0\u00f3"+
		"\u00f9\u0100\u0105\u010b\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}