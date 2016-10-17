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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", 
		"COMMA", "NEWLINE", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
		"CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", 
		"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
		"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT"
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
		case 77:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 78:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2T\u0286\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u00f1\n\31\3\32\3\32\3\33"+
		"\3\33\3\34\5\34\u00f8\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39"+
		"\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I"+
		"\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\5O\u0257"+
		"\nO\3P\3P\3P\3P\3P\3P\5P\u025f\nP\3Q\3Q\3R\3R\3R\3R\3S\6S\u0268\nS\rS"+
		"\16S\u0269\3S\3S\3T\3T\3T\3T\7T\u0272\nT\fT\16T\u0275\13T\3T\3T\3T\3T"+
		"\3T\3U\3U\3U\3U\7U\u0280\nU\fU\16U\u0283\13U\3U\3U\3\u0273\2V\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d\2\u009f\2\u00a1P\u00a3Q\u00a5"+
		"R\u00a7S\u00a9T\3\2\n\4\2C\\c|\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3"+
		"\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2"+
		"\f\f\17\17\u028b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00b6\3\2\2\2\13"+
		"\u00b8\3\2\2\2\r\u00bb\3\2\2\2\17\u00bd\3\2\2\2\21\u00c0\3\2\2\2\23\u00c2"+
		"\3\2\2\2\25\u00c5\3\2\2\2\27\u00c8\3\2\2\2\31\u00cb\3\2\2\2\33\u00cd\3"+
		"\2\2\2\35\u00d1\3\2\2\2\37\u00d9\3\2\2\2!\u00dd\3\2\2\2#\u00e1\3\2\2\2"+
		"%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3"+
		"\2\2\2/\u00ed\3\2\2\2\61\u00f0\3\2\2\2\63\u00f2\3\2\2\2\65\u00f4\3\2\2"+
		"\2\67\u00f7\3\2\2\29\u00fd\3\2\2\2;\u0106\3\2\2\2=\u010d\3\2\2\2?\u0115"+
		"\3\2\2\2A\u011b\3\2\2\2C\u0120\3\2\2\2E\u0125\3\2\2\2G\u012b\3\2\2\2I"+
		"\u0130\3\2\2\2K\u0136\3\2\2\2M\u013c\3\2\2\2O\u0145\3\2\2\2Q\u014d\3\2"+
		"\2\2S\u0150\3\2\2\2U\u0157\3\2\2\2W\u015c\3\2\2\2Y\u0161\3\2\2\2[\u0169"+
		"\3\2\2\2]\u016f\3\2\2\2_\u0177\3\2\2\2a\u017d\3\2\2\2c\u0181\3\2\2\2e"+
		"\u0184\3\2\2\2g\u0189\3\2\2\2i\u0194\3\2\2\2k\u019b\3\2\2\2m\u01a6\3\2"+
		"\2\2o\u01aa\3\2\2\2q\u01b4\3\2\2\2s\u01b9\3\2\2\2u\u01c0\3\2\2\2w\u01c4"+
		"\3\2\2\2y\u01cc\3\2\2\2{\u01d4\3\2\2\2}\u01de\3\2\2\2\177\u01e5\3\2\2"+
		"\2\u0081\u01ec\3\2\2\2\u0083\u01f2\3\2\2\2\u0085\u01f9\3\2\2\2\u0087\u0202"+
		"\3\2\2\2\u0089\u0208\3\2\2\2\u008b\u020f\3\2\2\2\u008d\u021c\3\2\2\2\u008f"+
		"\u0221\3\2\2\2\u0091\u0227\3\2\2\2\u0093\u022e\3\2\2\2\u0095\u0238\3\2"+
		"\2\2\u0097\u023c\3\2\2\2\u0099\u0241\3\2\2\2\u009b\u024a\3\2\2\2\u009d"+
		"\u0256\3\2\2\2\u009f\u025e\3\2\2\2\u00a1\u0260\3\2\2\2\u00a3\u0262\3\2"+
		"\2\2\u00a5\u0267\3\2\2\2\u00a7\u026d\3\2\2\2\u00a9\u027b\3\2\2\2\u00ab"+
		"\u00ac\7}\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7\177\2\2\u00ae\6\3\2\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7}\2\2\u00b5\b\3\2\2\2\u00b6\u00b7\7"+
		"=\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\u00ba\7?\2\2\u00ba\f\3"+
		"\2\2\2\u00bb\u00bc\7@\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\22\3\2\2\2\u00c2\u00c3"+
		"\7>\2\2\u00c3\u00c4\7?\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7"+
		"\7@\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca\30"+
		"\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7U\2\2\u00ce"+
		"\u00cf\7W\2\2\u00cf\u00d0\7O\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7C\2\2\u00d2"+
		"\u00d3\7X\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7C\2\2"+
		"\u00d6\u00d7\7I\2\2\u00d7\u00d8\7G\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7"+
		"O\2\2\u00da\u00db\7C\2\2\u00db\u00dc\7Z\2\2\u00dc \3\2\2\2\u00dd\u00de"+
		"\7O\2\2\u00de\u00df\7K\2\2\u00df\u00e0\7P\2\2\u00e0\"\3\2\2\2\u00e1\u00e2"+
		"\7*\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7"+
		"-\2\2\u00e6(\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7,"+
		"\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7"+
		"\60\2\2\u00ee\60\3\2\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\62\3\2\2\2\u00f2\u00f3\4\62;\2\u00f3\64\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5"+
		"\66\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2"+
		"\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\b\34\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100"+
		"\7u\2\2\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7v\2\2\u0105:\3\2\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7u\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2"+
		"\u010b\u010c\7v\2\2\u010c<\3\2\2\2\u010d\u010e\7d\2\2\u010e\u010f\7q\2"+
		"\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7c\2\2\u0113\u0114\7p\2\2\u0114>\3\2\2\2\u0115\u0116\7d\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7c\2\2\u0119\u011a\7m\2\2\u011a"+
		"@\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7{\2\2\u011d\u011e\7v\2\2\u011e"+
		"\u011f\7g\2\2\u011fB\3\2\2\2\u0120\u0121\7e\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124D\3\2\2\2\u0125\u0126\7e\2\2\u0126"+
		"\u0127\7c\2\2\u0127\u0128\7v\2\2\u0128\u0129\7e\2\2\u0129\u012a\7j\2\2"+
		"\u012aF\3\2\2\2\u012b\u012c\7e\2\2\u012c\u012d\7j\2\2\u012d\u012e\7c\2"+
		"\2\u012e\u012f\7t\2\2\u012fH\3\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7"+
		"n\2\2\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134\u0135\7u\2\2\u0135J"+
		"\3\2\2\2\u0136\u0137\7e\2\2\u0137\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139"+
		"\u013a\7u\2\2\u013a\u013b\7v\2\2\u013bL\3\2\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f\u0140\7v\2\2\u0140\u0141\7k\2\2"+
		"\u0141\u0142\7p\2\2\u0142\u0143\7w\2\2\u0143\u0144\7g\2\2\u0144N\3\2\2"+
		"\2\u0145\u0146\7f\2\2\u0146\u0147\7g\2\2\u0147\u0148\7h\2\2\u0148\u0149"+
		"\7c\2\2\u0149\u014a\7w\2\2\u014a\u014b\7n\2\2\u014b\u014c\7v\2\2\u014c"+
		"P\3\2\2\2\u014d\u014e\7f\2\2\u014e\u014f\7q\2\2\u014fR\3\2\2\2\u0150\u0151"+
		"\7f\2\2\u0151\u0152\7q\2\2\u0152\u0153\7w\2\2\u0153\u0154\7d\2\2\u0154"+
		"\u0155\7n\2\2\u0155\u0156\7g\2\2\u0156T\3\2\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7n\2\2\u0159\u015a\7u\2\2\u015a\u015b\7g\2\2\u015bV\3\2\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7p\2\2\u015e\u015f\7w\2\2\u015f\u0160\7o\2\2"+
		"\u0160X\3\2\2\2\u0161\u0162\7g\2\2\u0162\u0163\7z\2\2\u0163\u0164\7v\2"+
		"\2\u0164\u0165\7g\2\2\u0165\u0166\7p\2\2\u0166\u0167\7f\2\2\u0167\u0168"+
		"\7u\2\2\u0168Z\3\2\2\2\u0169\u016a\7h\2\2\u016a\u016b\7k\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e\\\3\2\2\2\u016f\u0170"+
		"\7h\2\2\u0170\u0171\7k\2\2\u0171\u0172\7p\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u0174\7n\2\2\u0174\u0175\7n\2\2\u0175\u0176\7{\2\2\u0176^\3\2\2\2\u0177"+
		"\u0178\7h\2\2\u0178\u0179\7n\2\2\u0179\u017a\7q\2\2\u017a\u017b\7c\2\2"+
		"\u017b\u017c\7v\2\2\u017c`\3\2\2\2\u017d\u017e\7h\2\2\u017e\u017f\7q\2"+
		"\2\u017f\u0180\7t\2\2\u0180b\3\2\2\2\u0181\u0182\7k\2\2\u0182\u0183\7"+
		"h\2\2\u0183d\3\2\2\2\u0184\u0185\7i\2\2\u0185\u0186\7q\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7q\2\2\u0188f\3\2\2\2\u0189\u018a\7k\2\2\u018a\u018b"+
		"\7o\2\2\u018b\u018c\7r\2\2\u018c\u018d\7n\2\2\u018d\u018e\7g\2\2\u018e"+
		"\u018f\7o\2\2\u018f\u0190\7g\2\2\u0190\u0191\7p\2\2\u0191\u0192\7v\2\2"+
		"\u0192\u0193\7u\2\2\u0193h\3\2\2\2\u0194\u0195\7k\2\2\u0195\u0196\7o\2"+
		"\2\u0196\u0197\7r\2\2\u0197\u0198\7q\2\2\u0198\u0199\7t\2\2\u0199\u019a"+
		"\7v\2\2\u019aj\3\2\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e"+
		"\7u\2\2\u019e\u019f\7v\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7p\2\2\u01a1"+
		"\u01a2\7e\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5\7h\2\2"+
		"\u01a5l\3\2\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7v\2"+
		"\2\u01a9n\3\2\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7"+
		"v\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1"+
		"\7c\2\2\u01b1\u01b2\7e\2\2\u01b2\u01b3\7g\2\2\u01b3p\3\2\2\2\u01b4\u01b5"+
		"\7n\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7i\2\2\u01b8"+
		"r\3\2\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7v\2\2\u01bc"+
		"\u01bd\7k\2\2\u01bd\u01be\7x\2\2\u01be\u01bf\7g\2\2\u01bft\3\2\2\2\u01c0"+
		"\u01c1\7p\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7y\2\2\u01c3v\3\2\2\2\u01c4"+
		"\u01c5\7r\2\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7e\2\2\u01c7\u01c8\7m\2\2"+
		"\u01c8\u01c9\7c\2\2\u01c9\u01ca\7i\2\2\u01ca\u01cb\7g\2\2\u01cbx\3\2\2"+
		"\2\u01cc\u01cd\7r\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0"+
		"\7x\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7g\2\2\u01d3"+
		"z\3\2\2\2\u01d4\u01d5\7r\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7q\2\2\u01d7"+
		"\u01d8\7v\2\2\u01d8\u01d9\7g\2\2\u01d9\u01da\7e\2\2\u01da\u01db\7v\2\2"+
		"\u01db\u01dc\7g\2\2\u01dc\u01dd\7f\2\2\u01dd|\3\2\2\2\u01de\u01df\7r\2"+
		"\2\u01df\u01e0\7w\2\2\u01e0\u01e1\7d\2\2\u01e1\u01e2\7n\2\2\u01e2\u01e3"+
		"\7k\2\2\u01e3\u01e4\7e\2\2\u01e4~\3\2\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7"+
		"\7g\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7t\2\2\u01ea"+
		"\u01eb\7p\2\2\u01eb\u0080\3\2\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7j\2"+
		"\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7v\2\2\u01f1\u0082"+
		"\3\2\2\2\u01f2\u01f3\7u\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7c\2\2\u01f5"+
		"\u01f6\7v\2\2\u01f6\u01f7\7k\2\2\u01f7\u01f8\7e\2\2\u01f8\u0084\3\2\2"+
		"\2\u01f9\u01fa\7u\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd"+
		"\7k\2\2\u01fd\u01fe\7e\2\2\u01fe\u01ff\7v\2\2\u01ff\u0200\7h\2\2\u0200"+
		"\u0201\7r\2\2\u0201\u0086\3\2\2\2\u0202\u0203\7u\2\2\u0203\u0204\7w\2"+
		"\2\u0204\u0205\7r\2\2\u0205\u0206\7g\2\2\u0206\u0207\7t\2\2\u0207\u0088"+
		"\3\2\2\2\u0208\u0209\7u\2\2\u0209\u020a\7y\2\2\u020a\u020b\7k\2\2\u020b"+
		"\u020c\7v\2\2\u020c\u020d\7e\2\2\u020d\u020e\7j\2\2\u020e\u008a\3\2\2"+
		"\2\u020f\u0210\7u\2\2\u0210\u0211\7{\2\2\u0211\u0212\7p\2\2\u0212\u0213"+
		"\7e\2\2\u0213\u0214\7j\2\2\u0214\u0215\7t\2\2\u0215\u0216\7q\2\2\u0216"+
		"\u0217\7p\2\2\u0217\u0218\7k\2\2\u0218\u0219\7|\2\2\u0219\u021a\7g\2\2"+
		"\u021a\u021b\7f\2\2\u021b\u008c\3\2\2\2\u021c\u021d\7v\2\2\u021d\u021e"+
		"\7j\2\2\u021e\u021f\7k\2\2\u021f\u0220\7u\2\2\u0220\u008e\3\2\2\2\u0221"+
		"\u0222\7v\2\2\u0222\u0223\7j\2\2\u0223\u0224\7t\2\2\u0224\u0225\7q\2\2"+
		"\u0225\u0226\7y\2\2\u0226\u0090\3\2\2\2\u0227\u0228\7v\2\2\u0228\u0229"+
		"\7j\2\2\u0229\u022a\7t\2\2\u022a\u022b\7q\2\2\u022b\u022c\7y\2\2\u022c"+
		"\u022d\7u\2\2\u022d\u0092\3\2\2\2\u022e\u022f\7v\2\2\u022f\u0230\7t\2"+
		"\2\u0230\u0231\7c\2\2\u0231\u0232\7p\2\2\u0232\u0233\7u\2\2\u0233\u0234"+
		"\7k\2\2\u0234\u0235\7g\2\2\u0235\u0236\7p\2\2\u0236\u0237\7v\2\2\u0237"+
		"\u0094\3\2\2\2\u0238\u0239\7v\2\2\u0239\u023a\7t\2\2\u023a\u023b\7{\2"+
		"\2\u023b\u0096\3\2\2\2\u023c\u023d\7x\2\2\u023d\u023e\7q\2\2\u023e\u023f"+
		"\7k\2\2\u023f\u0240\7f\2\2\u0240\u0098\3\2\2\2\u0241\u0242\7x\2\2\u0242"+
		"\u0243\7q\2\2\u0243\u0244\7n\2\2\u0244\u0245\7c\2\2\u0245\u0246\7v\2\2"+
		"\u0246\u0247\7k\2\2\u0247\u0248\7n\2\2\u0248\u0249\7g\2\2\u0249\u009a"+
		"\3\2\2\2\u024a\u024b\7y\2\2\u024b\u024c\7j\2\2\u024c\u024d\7k\2\2\u024d"+
		"\u024e\7n\2\2\u024e\u024f\7g\2\2\u024f\u009c\3\2\2\2\u0250\u0257\t\3\2"+
		"\2\u0251\u0252\n\4\2\2\u0252\u0257\6O\2\2\u0253\u0254\t\5\2\2\u0254\u0255"+
		"\t\6\2\2\u0255\u0257\6O\3\2\u0256\u0250\3\2\2\2\u0256\u0251\3\2\2\2\u0256"+
		"\u0253\3\2\2\2\u0257\u009e\3\2\2\2\u0258\u025f\t\7\2\2\u0259\u025a\n\4"+
		"\2\2\u025a\u025f\6P\4\2\u025b\u025c\t\5\2\2\u025c\u025d\t\6\2\2\u025d"+
		"\u025f\6P\5\2\u025e\u0258\3\2\2\2\u025e\u0259\3\2\2\2\u025e\u025b\3\2"+
		"\2\2\u025f\u00a0\3\2\2\2\u0260\u0261\7B\2\2\u0261\u00a2\3\2\2\2\u0262"+
		"\u0263\7\60\2\2\u0263\u0264\7\60\2\2\u0264\u0265\7\60\2\2\u0265\u00a4"+
		"\3\2\2\2\u0266\u0268\t\b\2\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\bS"+
		"\2\2\u026c\u00a6\3\2\2\2\u026d\u026e\7\61\2\2\u026e\u026f\7,\2\2\u026f"+
		"\u0273\3\2\2\2\u0270\u0272\13\2\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3"+
		"\2\2\2\u0273\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0276\u0277\7,\2\2\u0277\u0278\7\61\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027a\bT\2\2\u027a\u00a8\3\2\2\2\u027b\u027c\7\61\2\2\u027c"+
		"\u027d\7\61\2\2\u027d\u0281\3\2\2\2\u027e\u0280\n\t\2\2\u027f\u027e\3"+
		"\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\bU\2\2\u0285\u00aa\3\2"+
		"\2\2\n\2\u00f0\u00f7\u0256\u025e\u0269\u0273\u0281\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}