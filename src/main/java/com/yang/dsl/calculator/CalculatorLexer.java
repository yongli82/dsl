// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/yang/dsl/calc/Calculator.g4 by ANTLR 4.5.3
package com.yang.dsl.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LPAREN=7, RPAREN=8, PLUS=9, 
		MINUS=10, TIMES=11, DIV=12, POINT=13, LETTER=14, DIGIT=15, COMMA=16, NEWLINE=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "LPAREN", "RPAREN", "PLUS", 
		"MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", "COMMA", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'SUM'", "'AVE'", "'CELL'", "'FLOOR'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "LPAREN", "RPAREN", "PLUS", 
		"MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", "COMMA", "NEWLINE", 
		"WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\5\17N\n\17\3\20\3\20\3\21\3\21\3\22\5\22U"+
		"\n\22\3\22\3\22\3\22\3\22\3\23\6\23\\\n\23\r\23\16\23]\3\23\3\23\2\2\24"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\3\2\4\4\2C\\c|\4\2\13\13\"\"b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r8\3\2\2\2\17>\3"+
		"\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33"+
		"J\3\2\2\2\35M\3\2\2\2\37O\3\2\2\2!Q\3\2\2\2#T\3\2\2\2%[\3\2\2\2\'(\7?"+
		"\2\2(\4\3\2\2\2)*\7=\2\2*\6\3\2\2\2+,\7U\2\2,-\7W\2\2-.\7O\2\2.\b\3\2"+
		"\2\2/\60\7C\2\2\60\61\7X\2\2\61\62\7G\2\2\62\n\3\2\2\2\63\64\7E\2\2\64"+
		"\65\7G\2\2\65\66\7N\2\2\66\67\7N\2\2\67\f\3\2\2\289\7H\2\29:\7N\2\2:;"+
		"\7Q\2\2;<\7Q\2\2<=\7T\2\2=\16\3\2\2\2>?\7*\2\2?\20\3\2\2\2@A\7+\2\2A\22"+
		"\3\2\2\2BC\7-\2\2C\24\3\2\2\2DE\7/\2\2E\26\3\2\2\2FG\7,\2\2G\30\3\2\2"+
		"\2HI\7\61\2\2I\32\3\2\2\2JK\7\60\2\2K\34\3\2\2\2LN\t\2\2\2ML\3\2\2\2N"+
		"\36\3\2\2\2OP\4\62;\2P \3\2\2\2QR\7.\2\2R\"\3\2\2\2SU\7\17\2\2TS\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\f\2\2WX\3\2\2\2XY\b\22\2\2Y$\3\2\2\2Z\\\t\3"+
		"\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\23\2\2`&\3"+
		"\2\2\2\6\2MT]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}