// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/avon/hr/expression/accounting/Accounting.g4 by ANTLR 4.5.3
package com.avon.hr.expression.accounting;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AccountingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LPAREN=7, RPAREN=8, PLUS=9, 
		MINUS=10, TIMES=11, DIV=12, POINT=13, LETTER=14, DIGIT=15, COMMA=16, NEWLINE=17, 
		ABSTRACT=18, ASSERT=19, BOOLEAN=20, BREAK=21, BYTE=22, CASE=23, CATCH=24, 
		CHAR=25, CLASS=26, CONST=27, CONTINUE=28, DEFAULT=29, DO=30, DOUBLE=31, 
		ELSE=32, ENUM=33, EXTENDS=34, FINAL=35, FINALLY=36, FLOAT=37, FOR=38, 
		IF=39, GOTO=40, IMPLEMENTS=41, IMPORT=42, INSTANCEOF=43, INT=44, INTERFACE=45, 
		LONG=46, NATIVE=47, NEW=48, PACKAGE=49, PRIVATE=50, PROTECTED=51, PUBLIC=52, 
		RETURN=53, SHORT=54, STATIC=55, STRICTFP=56, SUPER=57, SWITCH=58, SYNCHRONIZED=59, 
		THIS=60, THROW=61, THROWS=62, TRANSIENT=63, TRY=64, VOID=65, VOLATILE=66, 
		WHILE=67, Identifier=68, AT=69, ELLIPSIS=70, WS=71, COMMENT=72, LINE_COMMENT=73;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "LPAREN", "RPAREN", "PLUS", 
		"MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", "COMMA", "NEWLINE", 
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'SUM'", "'AVERAGE'", "'MAX'", "'MIN'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "'.'", null, null, "','", null, "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "LPAREN", "RPAREN", "PLUS", 
		"MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", "COMMA", "NEWLINE", 
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "Identifier", "AT", "ELLIPSIS", "WS", 
		"COMMENT", "LINE_COMMENT"
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


	public AccountingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Accounting.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 68:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 69:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2K\u025d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17\u00c1\n\17\3\20\3\20"+
		"\3\21\3\21\3\22\5\22\u00c8\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\7E\u0223\nE\fE\16E\u0226\13E"+
		"\3F\3F\3F\3F\3F\3F\5F\u022e\nF\3G\3G\3G\3G\3G\3G\5G\u0236\nG\3H\3H\3I"+
		"\3I\3I\3I\3J\6J\u023f\nJ\rJ\16J\u0240\3J\3J\3K\3K\3K\3K\7K\u0249\nK\f"+
		"K\16K\u024c\13K\3K\3K\3K\3K\3K\3L\3L\3L\3L\7L\u0257\nL\fL\16L\u025a\13"+
		"L\3L\3L\3\u024a\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008b\2\u008d\2\u008fG\u0091H\u0093I\u0095J\u0097K\3\2\n\4\2C\\c|\6"+
		"\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7"+
		"\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0263\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009b\3\2\2\2\7\u009d"+
		"\3\2\2\2\t\u00a1\3\2\2\2\13\u00a9\3\2\2\2\r\u00ad\3\2\2\2\17\u00b1\3\2"+
		"\2\2\21\u00b3\3\2\2\2\23\u00b5\3\2\2\2\25\u00b7\3\2\2\2\27\u00b9\3\2\2"+
		"\2\31\u00bb\3\2\2\2\33\u00bd\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2"+
		"!\u00c4\3\2\2\2#\u00c7\3\2\2\2%\u00cd\3\2\2\2\'\u00d6\3\2\2\2)\u00dd\3"+
		"\2\2\2+\u00e5\3\2\2\2-\u00eb\3\2\2\2/\u00f0\3\2\2\2\61\u00f5\3\2\2\2\63"+
		"\u00fb\3\2\2\2\65\u0100\3\2\2\2\67\u0106\3\2\2\29\u010c\3\2\2\2;\u0115"+
		"\3\2\2\2=\u011d\3\2\2\2?\u0120\3\2\2\2A\u0127\3\2\2\2C\u012c\3\2\2\2E"+
		"\u0131\3\2\2\2G\u0139\3\2\2\2I\u013f\3\2\2\2K\u0147\3\2\2\2M\u014d\3\2"+
		"\2\2O\u0151\3\2\2\2Q\u0154\3\2\2\2S\u0159\3\2\2\2U\u0164\3\2\2\2W\u016b"+
		"\3\2\2\2Y\u0176\3\2\2\2[\u017a\3\2\2\2]\u0184\3\2\2\2_\u0189\3\2\2\2a"+
		"\u0190\3\2\2\2c\u0194\3\2\2\2e\u019c\3\2\2\2g\u01a4\3\2\2\2i\u01ae\3\2"+
		"\2\2k\u01b5\3\2\2\2m\u01bc\3\2\2\2o\u01c2\3\2\2\2q\u01c9\3\2\2\2s\u01d2"+
		"\3\2\2\2u\u01d8\3\2\2\2w\u01df\3\2\2\2y\u01ec\3\2\2\2{\u01f1\3\2\2\2}"+
		"\u01f7\3\2\2\2\177\u01fe\3\2\2\2\u0081\u0208\3\2\2\2\u0083\u020c\3\2\2"+
		"\2\u0085\u0211\3\2\2\2\u0087\u021a\3\2\2\2\u0089\u0220\3\2\2\2\u008b\u022d"+
		"\3\2\2\2\u008d\u0235\3\2\2\2\u008f\u0237\3\2\2\2\u0091\u0239\3\2\2\2\u0093"+
		"\u023e\3\2\2\2\u0095\u0244\3\2\2\2\u0097\u0252\3\2\2\2\u0099\u009a\7="+
		"\2\2\u009a\4\3\2\2\2\u009b\u009c\7?\2\2\u009c\6\3\2\2\2\u009d\u009e\7"+
		"U\2\2\u009e\u009f\7W\2\2\u009f\u00a0\7O\2\2\u00a0\b\3\2\2\2\u00a1\u00a2"+
		"\7C\2\2\u00a2\u00a3\7X\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7T\2\2\u00a5"+
		"\u00a6\7C\2\2\u00a6\u00a7\7I\2\2\u00a7\u00a8\7G\2\2\u00a8\n\3\2\2\2\u00a9"+
		"\u00aa\7O\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7Z\2\2\u00ac\f\3\2\2\2\u00ad"+
		"\u00ae\7O\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7P\2\2\u00b0\16\3\2\2\2\u00b1"+
		"\u00b2\7*\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\22\3\2\2\2\u00b5"+
		"\u00b6\7-\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\26\3\2\2\2\u00b9"+
		"\u00ba\7,\2\2\u00ba\30\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\32\3\2\2\2\u00bd"+
		"\u00be\7\60\2\2\u00be\34\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\36\3\2\2\2\u00c2\u00c3\4\62;\2\u00c3 \3\2\2\2\u00c4\u00c5\7."+
		"\2\2\u00c5\"\3\2\2\2\u00c6\u00c8\7\17\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\22\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7d\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7c\2\2"+
		"\u00d3\u00d4\7e\2\2\u00d4\u00d5\7v\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7c\2"+
		"\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7v\2\2\u00dc(\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7p\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7m\2\2"+
		"\u00ea,\3\2\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7{\2\2\u00ed\u00ee\7v\2"+
		"\2\u00ee\u00ef\7g\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7"+
		"c\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4\60\3\2\2\2\u00f5\u00f6"+
		"\7e\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7e\2\2\u00f9"+
		"\u00fa\7j\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7j\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7t\2\2\u00ff\64\3\2\2\2\u0100\u0101\7e\2\2\u0101"+
		"\u0102\7n\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\u0105\7u\2\2"+
		"\u0105\66\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108\7q\2\2\u0108\u0109\7"+
		"p\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2\u010b8\3\2\2\2\u010c\u010d"+
		"\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7w\2\2\u0113\u0114\7g\2\2"+
		"\u0114:\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7h\2"+
		"\2\u0118\u0119\7c\2\2\u0119\u011a\7w\2\2\u011a\u011b\7n\2\2\u011b\u011c"+
		"\7v\2\2\u011c<\3\2\2\2\u011d\u011e\7f\2\2\u011e\u011f\7q\2\2\u011f>\3"+
		"\2\2\2\u0120\u0121\7f\2\2\u0121\u0122\7q\2\2\u0122\u0123\7w\2\2\u0123"+
		"\u0124\7d\2\2\u0124\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126@\3\2\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2"+
		"\u012bB\3\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7p\2\2\u012e\u012f\7w\2"+
		"\2\u012f\u0130\7o\2\2\u0130D\3\2\2\2\u0131\u0132\7g\2\2\u0132\u0133\7"+
		"z\2\2\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137"+
		"\7f\2\2\u0137\u0138\7u\2\2\u0138F\3\2\2\2\u0139\u013a\7h\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7c\2\2\u013d\u013e\7n\2\2\u013e"+
		"H\3\2\2\2\u013f\u0140\7h\2\2\u0140\u0141\7k\2\2\u0141\u0142\7p\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7n\2\2\u0145\u0146\7{\2\2"+
		"\u0146J\3\2\2\2\u0147\u0148\7h\2\2\u0148\u0149\7n\2\2\u0149\u014a\7q\2"+
		"\2\u014a\u014b\7c\2\2\u014b\u014c\7v\2\2\u014cL\3\2\2\2\u014d\u014e\7"+
		"h\2\2\u014e\u014f\7q\2\2\u014f\u0150\7t\2\2\u0150N\3\2\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7h\2\2\u0153P\3\2\2\2\u0154\u0155\7i\2\2\u0155\u0156"+
		"\7q\2\2\u0156\u0157\7v\2\2\u0157\u0158\7q\2\2\u0158R\3\2\2\2\u0159\u015a"+
		"\7k\2\2\u015a\u015b\7o\2\2\u015b\u015c\7r\2\2\u015c\u015d\7n\2\2\u015d"+
		"\u015e\7g\2\2\u015e\u015f\7o\2\2\u015f\u0160\7g\2\2\u0160\u0161\7p\2\2"+
		"\u0161\u0162\7v\2\2\u0162\u0163\7u\2\2\u0163T\3\2\2\2\u0164\u0165\7k\2"+
		"\2\u0165\u0166\7o\2\2\u0166\u0167\7r\2\2\u0167\u0168\7q\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\7v\2\2\u016aV\3\2\2\2\u016b\u016c\7k\2\2\u016c\u016d"+
		"\7p\2\2\u016d\u016e\7u\2\2\u016e\u016f\7v\2\2\u016f\u0170\7c\2\2\u0170"+
		"\u0171\7p\2\2\u0171\u0172\7e\2\2\u0172\u0173\7g\2\2\u0173\u0174\7q\2\2"+
		"\u0174\u0175\7h\2\2\u0175X\3\2\2\2\u0176\u0177\7k\2\2\u0177\u0178\7p\2"+
		"\2\u0178\u0179\7v\2\2\u0179Z\3\2\2\2\u017a\u017b\7k\2\2\u017b\u017c\7"+
		"p\2\2\u017c\u017d\7v\2\2\u017d\u017e\7g\2\2\u017e\u017f\7t\2\2\u017f\u0180"+
		"\7h\2\2\u0180\u0181\7c\2\2\u0181\u0182\7e\2\2\u0182\u0183\7g\2\2\u0183"+
		"\\\3\2\2\2\u0184\u0185\7n\2\2\u0185\u0186\7q\2\2\u0186\u0187\7p\2\2\u0187"+
		"\u0188\7i\2\2\u0188^\3\2\2\2\u0189\u018a\7p\2\2\u018a\u018b\7c\2\2\u018b"+
		"\u018c\7v\2\2\u018c\u018d\7k\2\2\u018d\u018e\7x\2\2\u018e\u018f\7g\2\2"+
		"\u018f`\3\2\2\2\u0190\u0191\7p\2\2\u0191\u0192\7g\2\2\u0192\u0193\7y\2"+
		"\2\u0193b\3\2\2\2\u0194\u0195\7r\2\2\u0195\u0196\7c\2\2\u0196\u0197\7"+
		"e\2\2\u0197\u0198\7m\2\2\u0198\u0199\7c\2\2\u0199\u019a\7i\2\2\u019a\u019b"+
		"\7g\2\2\u019bd\3\2\2\2\u019c\u019d\7r\2\2\u019d\u019e\7t\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7x\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7v\2\2\u01a2"+
		"\u01a3\7g\2\2\u01a3f\3\2\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7t\2\2\u01a6"+
		"\u01a7\7q\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7e\2\2"+
		"\u01aa\u01ab\7v\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7f\2\2\u01adh\3\2\2"+
		"\2\u01ae\u01af\7r\2\2\u01af\u01b0\7w\2\2\u01b0\u01b1\7d\2\2\u01b1\u01b2"+
		"\7n\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7e\2\2\u01b4j\3\2\2\2\u01b5\u01b6"+
		"\7t\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7w\2\2\u01b9"+
		"\u01ba\7t\2\2\u01ba\u01bb\7p\2\2\u01bbl\3\2\2\2\u01bc\u01bd\7u\2\2\u01bd"+
		"\u01be\7j\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7v\2\2"+
		"\u01c1n\3\2\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7c\2"+
		"\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7e\2\2\u01c8p\3\2"+
		"\2\2\u01c9\u01ca\7u\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd"+
		"\7k\2\2\u01cd\u01ce\7e\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7h\2\2\u01d0"+
		"\u01d1\7r\2\2\u01d1r\3\2\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7w\2\2\u01d4"+
		"\u01d5\7r\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7t\2\2\u01d7t\3\2\2\2\u01d8"+
		"\u01d9\7u\2\2\u01d9\u01da\7y\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7v\2\2"+
		"\u01dc\u01dd\7e\2\2\u01dd\u01de\7j\2\2\u01dev\3\2\2\2\u01df\u01e0\7u\2"+
		"\2\u01e0\u01e1\7{\2\2\u01e1\u01e2\7p\2\2\u01e2\u01e3\7e\2\2\u01e3\u01e4"+
		"\7j\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7\7p\2\2\u01e7"+
		"\u01e8\7k\2\2\u01e8\u01e9\7|\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7f\2\2"+
		"\u01ebx\3\2\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7j\2\2\u01ee\u01ef\7k\2"+
		"\2\u01ef\u01f0\7u\2\2\u01f0z\3\2\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7"+
		"j\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7y\2\2\u01f6|"+
		"\3\2\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7j\2\2\u01f9\u01fa\7t\2\2\u01fa"+
		"\u01fb\7q\2\2\u01fb\u01fc\7y\2\2\u01fc\u01fd\7u\2\2\u01fd~\3\2\2\2\u01fe"+
		"\u01ff\7v\2\2\u01ff\u0200\7t\2\2\u0200\u0201\7c\2\2\u0201\u0202\7p\2\2"+
		"\u0202\u0203\7u\2\2\u0203\u0204\7k\2\2\u0204\u0205\7g\2\2\u0205\u0206"+
		"\7p\2\2\u0206\u0207\7v\2\2\u0207\u0080\3\2\2\2\u0208\u0209\7v\2\2\u0209"+
		"\u020a\7t\2\2\u020a\u020b\7{\2\2\u020b\u0082\3\2\2\2\u020c\u020d\7x\2"+
		"\2\u020d\u020e\7q\2\2\u020e\u020f\7k\2\2\u020f\u0210\7f\2\2\u0210\u0084"+
		"\3\2\2\2\u0211\u0212\7x\2\2\u0212\u0213\7q\2\2\u0213\u0214\7n\2\2\u0214"+
		"\u0215\7c\2\2\u0215\u0216\7v\2\2\u0216\u0217\7k\2\2\u0217\u0218\7n\2\2"+
		"\u0218\u0219\7g\2\2\u0219\u0086\3\2\2\2\u021a\u021b\7y\2\2\u021b\u021c"+
		"\7j\2\2\u021c\u021d\7k\2\2\u021d\u021e\7n\2\2\u021e\u021f\7g\2\2\u021f"+
		"\u0088\3\2\2\2\u0220\u0224\5\u008bF\2\u0221\u0223\5\u008dG\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u008a\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022e\t\3\2\2\u0228\u0229\n\4"+
		"\2\2\u0229\u022e\6F\2\2\u022a\u022b\t\5\2\2\u022b\u022c\t\6\2\2\u022c"+
		"\u022e\6F\3\2\u022d\u0227\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u022a\3\2"+
		"\2\2\u022e\u008c\3\2\2\2\u022f\u0236\t\7\2\2\u0230\u0231\n\4\2\2\u0231"+
		"\u0236\6G\4\2\u0232\u0233\t\5\2\2\u0233\u0234\t\6\2\2\u0234\u0236\6G\5"+
		"\2\u0235\u022f\3\2\2\2\u0235\u0230\3\2\2\2\u0235\u0232\3\2\2\2\u0236\u008e"+
		"\3\2\2\2\u0237\u0238\7B\2\2\u0238\u0090\3\2\2\2\u0239\u023a\7\60\2\2\u023a"+
		"\u023b\7\60\2\2\u023b\u023c\7\60\2\2\u023c\u0092\3\2\2\2\u023d\u023f\t"+
		"\b\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bJ\2\2\u0243\u0094\3\2"+
		"\2\2\u0244\u0245\7\61\2\2\u0245\u0246\7,\2\2\u0246\u024a\3\2\2\2\u0247"+
		"\u0249\13\2\2\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u024b\3"+
		"\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d"+
		"\u024e\7,\2\2\u024e\u024f\7\61\2\2\u024f\u0250\3\2\2\2\u0250\u0251\bK"+
		"\2\2\u0251\u0096\3\2\2\2\u0252\u0253\7\61\2\2\u0253\u0254\7\61\2\2\u0254"+
		"\u0258\3\2\2\2\u0255\u0257\n\t\2\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025b\u025c\bL\2\2\u025c\u0098\3\2\2\2\13\2\u00c0\u00c7"+
		"\u0224\u022d\u0235\u0240\u024a\u0258\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}