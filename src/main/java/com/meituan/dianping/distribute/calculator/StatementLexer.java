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
		T__0=1, T__1=2, T__2=3, T__3=4, LPAREN=5, RPAREN=6, PLUS=7, MINUS=8, TIMES=9, 
		DIV=10, POINT=11, LETTER=12, DIGIT=13, COMMA=14, WS=15, COMMENT=16, LINE_COMMENT=17, 
		NEWLINE=18, SEMICOLON=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "POINT", "LETTER", "DIGIT", "COMMA", "WS", "COMMENT", "LINE_COMMENT", 
		"NEWLINE", "SEMICOLON"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'S'", "'A'", "'B'", "'C'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
		"'.'", null, null, "','", null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "POINT", "LETTER", "DIGIT", "COMMA", "WS", "COMMENT", "LINE_COMMENT", 
		"NEWLINE", "SEMICOLON"
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

	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\rA\n\r\3\16\3\16\3\17\3"+
		"\17\3\20\6\20H\n\20\r\20\16\20I\3\20\3\20\3\21\3\21\3\21\3\21\7\21R\n"+
		"\21\f\21\16\21U\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"`\n\22\f\22\16\22c\13\22\3\22\3\22\3\23\5\23h\n\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3S\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\5\4\2C\\c|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2"+
		"\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67"+
		"\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31@\3\2\2\2\33B\3\2\2\2\35"+
		"D\3\2\2\2\37G\3\2\2\2!M\3\2\2\2#[\3\2\2\2%g\3\2\2\2\'m\3\2\2\2)*\7U\2"+
		"\2*\4\3\2\2\2+,\7C\2\2,\6\3\2\2\2-.\7D\2\2.\b\3\2\2\2/\60\7E\2\2\60\n"+
		"\3\2\2\2\61\62\7*\2\2\62\f\3\2\2\2\63\64\7+\2\2\64\16\3\2\2\2\65\66\7"+
		"-\2\2\66\20\3\2\2\2\678\7/\2\28\22\3\2\2\29:\7,\2\2:\24\3\2\2\2;<\7\61"+
		"\2\2<\26\3\2\2\2=>\7\60\2\2>\30\3\2\2\2?A\t\2\2\2@?\3\2\2\2A\32\3\2\2"+
		"\2BC\4\62;\2C\34\3\2\2\2DE\7.\2\2E\36\3\2\2\2FH\t\3\2\2GF\3\2\2\2HI\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\20\2\2L \3\2\2\2MN\7\61\2\2N"+
		"O\7,\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7,\2\2WX\7\61\2\2XY\3\2\2\2YZ\b\21\2\2Z\"\3\2\2"+
		"\2[\\\7\61\2\2\\]\7\61\2\2]a\3\2\2\2^`\n\4\2\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\b\22\2\2e$\3\2\2\2fh\7\17\2\2g"+
		"f\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\f\2\2jk\3\2\2\2kl\b\23\2\2l&\3\2\2\2"+
		"mn\7=\2\2n(\3\2\2\2\b\2@ISag\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}