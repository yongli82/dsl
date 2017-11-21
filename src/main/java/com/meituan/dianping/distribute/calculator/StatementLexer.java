// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/meituan/dianping/distribute/rule/Statement.g4 by ANTLR 4.7
package com.meituan.dianping.distribute.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StatementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, PLUS=3, MINUS=4, TIMES=5, DIV=6, POINT=7, LETTER=8, 
		DIGIT=9, COMMA=10, WS=11, COMMENT=12, LINE_COMMENT=13, NEWLINE=14, SEMICOLON=15, 
		Identifier=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "POINT", "LETTER", 
		"DIGIT", "COMMA", "WS", "COMMENT", "LINE_COMMENT", "NEWLINE", "SEMICOLON", 
		"Identifier", "JavaLetter", "JavaLetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", 
		null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "POINT", "LETTER", 
		"DIGIT", "COMMA", "WS", "COMMENT", "LINE_COMMENT", "NEWLINE", "SEMICOLON", 
		"Identifier"
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


	public StatementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Statement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\5\t\67\n\t\3\n\3\n\3\13\3\13\3\f\6\f>\n\f\r\f\16\f?\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\7\rH\n\r\f\r\16\rK\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\17\5\17^\n\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22s\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23{\n\23\3"+
		"I\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\2%\2\3\2\n\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2"+
		"\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25:\3\2\2\2"+
		"\27=\3\2\2\2\31C\3\2\2\2\33Q\3\2\2\2\35]\3\2\2\2\37c\3\2\2\2!e\3\2\2\2"+
		"#r\3\2\2\2%z\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7-\2\2"+
		",\b\3\2\2\2-.\7/\2\2.\n\3\2\2\2/\60\7,\2\2\60\f\3\2\2\2\61\62\7\61\2\2"+
		"\62\16\3\2\2\2\63\64\7\60\2\2\64\20\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2"+
		"\2\67\22\3\2\2\289\4\62;\29\24\3\2\2\2:;\7.\2\2;\26\3\2\2\2<>\t\3\2\2"+
		"=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\f\2\2B\30\3\2\2"+
		"\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2"+
		"\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MN\7\61\2\2NO\3\2\2\2OP\b\r"+
		"\2\2P\32\3\2\2\2QR\7\61\2\2RS\7\61\2\2SW\3\2\2\2TV\n\4\2\2UT\3\2\2\2V"+
		"Y\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\b\16\2\2[\34\3\2\2"+
		"\2\\^\7\17\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\f\2\2`a\3\2\2\2ab\b"+
		"\17\2\2b\36\3\2\2\2cd\7=\2\2d \3\2\2\2ei\5#\22\2fh\5%\23\2gf\3\2\2\2h"+
		"k\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2ki\3\2\2\2ls\t\5\2\2mn\n\6\2\2"+
		"ns\6\22\2\2op\t\7\2\2pq\t\b\2\2qs\6\22\3\2rl\3\2\2\2rm\3\2\2\2ro\3\2\2"+
		"\2s$\3\2\2\2t{\t\t\2\2uv\n\6\2\2v{\6\23\4\2wx\t\7\2\2xy\t\b\2\2y{\6\23"+
		"\5\2zt\3\2\2\2zu\3\2\2\2zw\3\2\2\2{&\3\2\2\2\13\2\66?IW]irz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}