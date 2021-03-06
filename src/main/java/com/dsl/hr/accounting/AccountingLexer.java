// Generated from /Users/yangyongli/Spring/dsl/src/main/java/com/dsl/hr/accounting/Accounting.g4 by ANTLR 4.7
package com.dsl.hr.accounting;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AccountingLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "EQUAL", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "POINT", "LETTER", "DIGIT", 
		"COMMA", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "TRUE", "FALSE", "AND", "OR", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT", "NEWLINE", "SEMICOLON"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 81:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 82:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Z\u02cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\5\31\u00fd\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3"+
		"D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0262\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\5O\u0273\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u027e\nP\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\5Q\u0286\nQ\3R\3R\7R\u028a\nR\fR\16R\u028d\13R\3S\3S"+
		"\3S\3S\3S\3S\5S\u0295\nS\3T\3T\3T\3T\3T\3T\5T\u029d\nT\3U\3U\3V\3V\3V"+
		"\3V\3W\6W\u02a6\nW\rW\16W\u02a7\3W\3W\3X\3X\3X\3X\7X\u02b0\nX\fX\16X\u02b3"+
		"\13X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u02be\nY\fY\16Y\u02c1\13Y\3Y\3Y\3Z"+
		"\5Z\u02c6\nZ\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\u02b1\2\\\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5\2\u00a7\2\u00a9"+
		"T\u00abU\u00adV\u00afW\u00b1X\u00b3Y\u00b5Z\3\2\n\4\2C\\c|\6\2&&C\\aa"+
		"c|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C"+
		"\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u02dd\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2"+
		"\2\5\u00b9\3\2\2\2\7\u00bb\3\2\2\2\t\u00be\3\2\2\2\13\u00c0\3\2\2\2\r"+
		"\u00c3\3\2\2\2\17\u00c5\3\2\2\2\21\u00c8\3\2\2\2\23\u00cb\3\2\2\2\25\u00ce"+
		"\3\2\2\2\27\u00d2\3\2\2\2\31\u00da\3\2\2\2\33\u00de\3\2\2\2\35\u00e2\3"+
		"\2\2\2\37\u00e9\3\2\2\2!\u00eb\3\2\2\2#\u00ed\3\2\2\2%\u00ef\3\2\2\2\'"+
		"\u00f1\3\2\2\2)\u00f3\3\2\2\2+\u00f5\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2"+
		"\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0100\3\2\2\2\67\u0102\3\2\2"+
		"\29\u010b\3\2\2\2;\u0112\3\2\2\2=\u011a\3\2\2\2?\u0120\3\2\2\2A\u0125"+
		"\3\2\2\2C\u012a\3\2\2\2E\u0130\3\2\2\2G\u0135\3\2\2\2I\u013b\3\2\2\2K"+
		"\u0141\3\2\2\2M\u014a\3\2\2\2O\u0152\3\2\2\2Q\u0155\3\2\2\2S\u015c\3\2"+
		"\2\2U\u0161\3\2\2\2W\u0166\3\2\2\2Y\u016e\3\2\2\2[\u0174\3\2\2\2]\u017c"+
		"\3\2\2\2_\u0182\3\2\2\2a\u0186\3\2\2\2c\u0189\3\2\2\2e\u018e\3\2\2\2g"+
		"\u0199\3\2\2\2i\u01a0\3\2\2\2k\u01ab\3\2\2\2m\u01af\3\2\2\2o\u01b9\3\2"+
		"\2\2q\u01be\3\2\2\2s\u01c5\3\2\2\2u\u01c9\3\2\2\2w\u01d1\3\2\2\2y\u01d9"+
		"\3\2\2\2{\u01e3\3\2\2\2}\u01ea\3\2\2\2\177\u01f1\3\2\2\2\u0081\u01f7\3"+
		"\2\2\2\u0083\u01fe\3\2\2\2\u0085\u0207\3\2\2\2\u0087\u020d\3\2\2\2\u0089"+
		"\u0214\3\2\2\2\u008b\u0221\3\2\2\2\u008d\u0226\3\2\2\2\u008f\u022c\3\2"+
		"\2\2\u0091\u0233\3\2\2\2\u0093\u023d\3\2\2\2\u0095\u0241\3\2\2\2\u0097"+
		"\u0246\3\2\2\2\u0099\u024f\3\2\2\2\u009b\u0261\3\2\2\2\u009d\u0272\3\2"+
		"\2\2\u009f\u027d\3\2\2\2\u00a1\u0285\3\2\2\2\u00a3\u0287\3\2\2\2\u00a5"+
		"\u0294\3\2\2\2\u00a7\u029c\3\2\2\2\u00a9\u029e\3\2\2\2\u00ab\u02a0\3\2"+
		"\2\2\u00ad\u02a5\3\2\2\2\u00af\u02ab\3\2\2\2\u00b1\u02b9\3\2\2\2\u00b3"+
		"\u02c5\3\2\2\2\u00b5\u02cb\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\4\3\2\2\2"+
		"\u00b9\u00ba\7\177\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\n\3\2\2\2\u00c0\u00c1"+
		"\7@\2\2\u00c1\u00c2\7?\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\16"+
		"\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7\20\3\2\2\2\u00c8"+
		"\u00c9\7>\2\2\u00c9\u00ca\7@\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7U\2\2\u00cf\u00d0\7W\2\2\u00d0"+
		"\u00d1\7O\2\2\u00d1\26\3\2\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7X\2\2\u00d4"+
		"\u00d5\7G\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7C\2\2\u00d7\u00d8\7I\2\2"+
		"\u00d8\u00d9\7G\2\2\u00d9\30\3\2\2\2\u00da\u00db\7O\2\2\u00db\u00dc\7"+
		"C\2\2\u00dc\u00dd\7Z\2\2\u00dd\32\3\2\2\2\u00de\u00df\7O\2\2\u00df\u00e0"+
		"\7K\2\2\u00e0\u00e1\7P\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4"+
		"\7K\2\2\u00e4\u00e5\7I\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7C\2\2\u00e7"+
		"\u00e8\7N\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7$\2\2\u00ea \3\2\2\2\u00eb"+
		"\u00ec\7?\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee$\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7/\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7"+
		"\61\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7\60\2\2\u00fa\60\3\2\2\2\u00fb\u00fd"+
		"\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\4\62;\2\u00ff"+
		"\64\3\2\2\2\u0100\u0101\7.\2\2\u0101\66\3\2\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7d\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7t\2\2"+
		"\u0107\u0108\7c\2\2\u0108\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a8\3\2\2"+
		"\2\u010b\u010c\7c\2\2\u010c\u010d\7u\2\2\u010d\u010e\7u\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7t\2\2\u0110\u0111\7v\2\2\u0111:\3\2\2\2\u0112\u0113"+
		"\7d\2\2\u0113\u0114\7q\2\2\u0114\u0115\7q\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7p\2\2\u0119<\3\2\2\2\u011a"+
		"\u011b\7d\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7c\2\2"+
		"\u011e\u011f\7m\2\2\u011f>\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7{\2"+
		"\2\u0122\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124@\3\2\2\2\u0125\u0126\7"+
		"e\2\2\u0126\u0127\7c\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129B"+
		"\3\2\2\2\u012a\u012b\7e\2\2\u012b\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d"+
		"\u012e\7e\2\2\u012e\u012f\7j\2\2\u012fD\3\2\2\2\u0130\u0131\7e\2\2\u0131"+
		"\u0132\7j\2\2\u0132\u0133\7c\2\2\u0133\u0134\7t\2\2\u0134F\3\2\2\2\u0135"+
		"\u0136\7e\2\2\u0136\u0137\7n\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2"+
		"\u0139\u013a\7u\2\2\u013aH\3\2\2\2\u013b\u013c\7e\2\2\u013c\u013d\7q\2"+
		"\2\u013d\u013e\7p\2\2\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140J\3\2"+
		"\2\2\u0141\u0142\7e\2\2\u0142\u0143\7q\2\2\u0143\u0144\7p\2\2\u0144\u0145"+
		"\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148\7w\2\2\u0148"+
		"\u0149\7g\2\2\u0149L\3\2\2\2\u014a\u014b\7f\2\2\u014b\u014c\7g\2\2\u014c"+
		"\u014d\7h\2\2\u014d\u014e\7c\2\2\u014e\u014f\7w\2\2\u014f\u0150\7n\2\2"+
		"\u0150\u0151\7v\2\2\u0151N\3\2\2\2\u0152\u0153\7f\2\2\u0153\u0154\7q\2"+
		"\2\u0154P\3\2\2\2\u0155\u0156\7f\2\2\u0156\u0157\7q\2\2\u0157\u0158\7"+
		"w\2\2\u0158\u0159\7d\2\2\u0159\u015a\7n\2\2\u015a\u015b\7g\2\2\u015bR"+
		"\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7g\2\2\u0160T\3\2\2\2\u0161\u0162\7g\2\2\u0162\u0163\7p\2\2\u0163"+
		"\u0164\7w\2\2\u0164\u0165\7o\2\2\u0165V\3\2\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7z\2\2\u0168\u0169\7v\2\2\u0169\u016a\7g\2\2\u016a\u016b\7p\2\2"+
		"\u016b\u016c\7f\2\2\u016c\u016d\7u\2\2\u016dX\3\2\2\2\u016e\u016f\7h\2"+
		"\2\u016f\u0170\7k\2\2\u0170\u0171\7p\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7n\2\2\u0173Z\3\2\2\2\u0174\u0175\7h\2\2\u0175\u0176\7k\2\2\u0176\u0177"+
		"\7p\2\2\u0177\u0178\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a\7n\2\2\u017a"+
		"\u017b\7{\2\2\u017b\\\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e\7n\2\2\u017e"+
		"\u017f\7q\2\2\u017f\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181^\3\2\2\2\u0182"+
		"\u0183\7h\2\2\u0183\u0184\7q\2\2\u0184\u0185\7t\2\2\u0185`\3\2\2\2\u0186"+
		"\u0187\7k\2\2\u0187\u0188\7h\2\2\u0188b\3\2\2\2\u0189\u018a\7i\2\2\u018a"+
		"\u018b\7q\2\2\u018b\u018c\7v\2\2\u018c\u018d\7q\2\2\u018dd\3\2\2\2\u018e"+
		"\u018f\7k\2\2\u018f\u0190\7o\2\2\u0190\u0191\7r\2\2\u0191\u0192\7n\2\2"+
		"\u0192\u0193\7g\2\2\u0193\u0194\7o\2\2\u0194\u0195\7g\2\2\u0195\u0196"+
		"\7p\2\2\u0196\u0197\7v\2\2\u0197\u0198\7u\2\2\u0198f\3\2\2\2\u0199\u019a"+
		"\7k\2\2\u019a\u019b\7o\2\2\u019b\u019c\7r\2\2\u019c\u019d\7q\2\2\u019d"+
		"\u019e\7t\2\2\u019e\u019f\7v\2\2\u019fh\3\2\2\2\u01a0\u01a1\7k\2\2\u01a1"+
		"\u01a2\7p\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7c\2\2"+
		"\u01a5\u01a6\7p\2\2\u01a6\u01a7\7e\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9"+
		"\7q\2\2\u01a9\u01aa\7h\2\2\u01aaj\3\2\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad"+
		"\7p\2\2\u01ad\u01ae\7v\2\2\u01ael\3\2\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1"+
		"\7p\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7t\2\2\u01b4"+
		"\u01b5\7h\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7g\2\2"+
		"\u01b8n\3\2\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7p\2"+
		"\2\u01bc\u01bd\7i\2\2\u01bdp\3\2\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7"+
		"c\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7x\2\2\u01c3\u01c4"+
		"\7g\2\2\u01c4r\3\2\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8"+
		"\7y\2\2\u01c8t\3\2\2\2\u01c9\u01ca\7r\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc"+
		"\7e\2\2\u01cc\u01cd\7m\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7i\2\2\u01cf"+
		"\u01d0\7g\2\2\u01d0v\3\2\2\2\u01d1\u01d2\7r\2\2\u01d2\u01d3\7t\2\2\u01d3"+
		"\u01d4\7k\2\2\u01d4\u01d5\7x\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7v\2\2"+
		"\u01d7\u01d8\7g\2\2\u01d8x\3\2\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7t\2"+
		"\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7g\2\2\u01de\u01df"+
		"\7e\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7f\2\2\u01e2"+
		"z\3\2\2\2\u01e3\u01e4\7r\2\2\u01e4\u01e5\7w\2\2\u01e5\u01e6\7d\2\2\u01e6"+
		"\u01e7\7n\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7e\2\2\u01e9|\3\2\2\2\u01ea"+
		"\u01eb\7t\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7w\2\2"+
		"\u01ee\u01ef\7t\2\2\u01ef\u01f0\7p\2\2\u01f0~\3\2\2\2\u01f1\u01f2\7u\2"+
		"\2\u01f2\u01f3\7j\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6"+
		"\7v\2\2\u01f6\u0080\3\2\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7v\2\2\u01f9"+
		"\u01fa\7c\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7k\2\2\u01fc\u01fd\7e\2\2"+
		"\u01fd\u0082\3\2\2\2\u01fe\u01ff\7u\2\2\u01ff\u0200\7v\2\2\u0200\u0201"+
		"\7t\2\2\u0201\u0202\7k\2\2\u0202\u0203\7e\2\2\u0203\u0204\7v\2\2\u0204"+
		"\u0205\7h\2\2\u0205\u0206\7r\2\2\u0206\u0084\3\2\2\2\u0207\u0208\7u\2"+
		"\2\u0208\u0209\7w\2\2\u0209\u020a\7r\2\2\u020a\u020b\7g\2\2\u020b\u020c"+
		"\7t\2\2\u020c\u0086\3\2\2\2\u020d\u020e\7u\2\2\u020e\u020f\7y\2\2\u020f"+
		"\u0210\7k\2\2\u0210\u0211\7v\2\2\u0211\u0212\7e\2\2\u0212\u0213\7j\2\2"+
		"\u0213\u0088\3\2\2\2\u0214\u0215\7u\2\2\u0215\u0216\7{\2\2\u0216\u0217"+
		"\7p\2\2\u0217\u0218\7e\2\2\u0218\u0219\7j\2\2\u0219\u021a\7t\2\2\u021a"+
		"\u021b\7q\2\2\u021b\u021c\7p\2\2\u021c\u021d\7k\2\2\u021d\u021e\7|\2\2"+
		"\u021e\u021f\7g\2\2\u021f\u0220\7f\2\2\u0220\u008a\3\2\2\2\u0221\u0222"+
		"\7v\2\2\u0222\u0223\7j\2\2\u0223\u0224\7k\2\2\u0224\u0225\7u\2\2\u0225"+
		"\u008c\3\2\2\2\u0226\u0227\7v\2\2\u0227\u0228\7j\2\2\u0228\u0229\7t\2"+
		"\2\u0229\u022a\7q\2\2\u022a\u022b\7y\2\2\u022b\u008e\3\2\2\2\u022c\u022d"+
		"\7v\2\2\u022d\u022e\7j\2\2\u022e\u022f\7t\2\2\u022f\u0230\7q\2\2\u0230"+
		"\u0231\7y\2\2\u0231\u0232\7u\2\2\u0232\u0090\3\2\2\2\u0233\u0234\7v\2"+
		"\2\u0234\u0235\7t\2\2\u0235\u0236\7c\2\2\u0236\u0237\7p\2\2\u0237\u0238"+
		"\7u\2\2\u0238\u0239\7k\2\2\u0239\u023a\7g\2\2\u023a\u023b\7p\2\2\u023b"+
		"\u023c\7v\2\2\u023c\u0092\3\2\2\2\u023d\u023e\7v\2\2\u023e\u023f\7t\2"+
		"\2\u023f\u0240\7{\2\2\u0240\u0094\3\2\2\2\u0241\u0242\7x\2\2\u0242\u0243"+
		"\7q\2\2\u0243\u0244\7k\2\2\u0244\u0245\7f\2\2\u0245\u0096\3\2\2\2\u0246"+
		"\u0247\7x\2\2\u0247\u0248\7q\2\2\u0248\u0249\7n\2\2\u0249\u024a\7c\2\2"+
		"\u024a\u024b\7v\2\2\u024b\u024c\7k\2\2\u024c\u024d\7n\2\2\u024d\u024e"+
		"\7g\2\2\u024e\u0098\3\2\2\2\u024f\u0250\7y\2\2\u0250\u0251\7j\2\2\u0251"+
		"\u0252\7k\2\2\u0252\u0253\7n\2\2\u0253\u0254\7g\2\2\u0254\u009a\3\2\2"+
		"\2\u0255\u0256\7v\2\2\u0256\u0257\7t\2\2\u0257\u0258\7w\2\2\u0258\u0262"+
		"\7g\2\2\u0259\u025a\7V\2\2\u025a\u025b\7T\2\2\u025b\u025c\7W\2\2\u025c"+
		"\u0262\7G\2\2\u025d\u025e\7V\2\2\u025e\u025f\7t\2\2\u025f\u0260\7w\2\2"+
		"\u0260\u0262\7g\2\2\u0261\u0255\3\2\2\2\u0261\u0259\3\2\2\2\u0261\u025d"+
		"\3\2\2\2\u0262\u009c\3\2\2\2\u0263\u0264\7h\2\2\u0264\u0265\7c\2\2\u0265"+
		"\u0266\7n\2\2\u0266\u0267\7u\2\2\u0267\u0273\7g\2\2\u0268\u0269\7H\2\2"+
		"\u0269\u026a\7C\2\2\u026a\u026b\7N\2\2\u026b\u026c\7U\2\2\u026c\u0273"+
		"\7G\2\2\u026d\u026e\7H\2\2\u026e\u026f\7c\2\2\u026f\u0270\7n\2\2\u0270"+
		"\u0271\7u\2\2\u0271\u0273\7g\2\2\u0272\u0263\3\2\2\2\u0272\u0268\3\2\2"+
		"\2\u0272\u026d\3\2\2\2\u0273\u009e\3\2\2\2\u0274\u0275\7c\2\2\u0275\u0276"+
		"\7p\2\2\u0276\u027e\7f\2\2\u0277\u0278\7C\2\2\u0278\u0279\7P\2\2\u0279"+
		"\u027e\7F\2\2\u027a\u027b\7C\2\2\u027b\u027c\7p\2\2\u027c\u027e\7f\2\2"+
		"\u027d\u0274\3\2\2\2\u027d\u0277\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u00a0"+
		"\3\2\2\2\u027f\u0280\7q\2\2\u0280\u0286\7t\2\2\u0281\u0282\7Q\2\2\u0282"+
		"\u0286\7T\2\2\u0283\u0284\7q\2\2\u0284\u0286\7t\2\2\u0285\u027f\3\2\2"+
		"\2\u0285\u0281\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u00a2\3\2\2\2\u0287\u028b"+
		"\5\u00a5S\2\u0288\u028a\5\u00a7T\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2"+
		"\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u00a4\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028e\u0295\t\3\2\2\u028f\u0290\n\4\2\2\u0290\u0295\6S"+
		"\2\2\u0291\u0292\t\5\2\2\u0292\u0293\t\6\2\2\u0293\u0295\6S\3\2\u0294"+
		"\u028e\3\2\2\2\u0294\u028f\3\2\2\2\u0294\u0291\3\2\2\2\u0295\u00a6\3\2"+
		"\2\2\u0296\u029d\t\7\2\2\u0297\u0298\n\4\2\2\u0298\u029d\6T\4\2\u0299"+
		"\u029a\t\5\2\2\u029a\u029b\t\6\2\2\u029b\u029d\6T\5\2\u029c\u0296\3\2"+
		"\2\2\u029c\u0297\3\2\2\2\u029c\u0299\3\2\2\2\u029d\u00a8\3\2\2\2\u029e"+
		"\u029f\7B\2\2\u029f\u00aa\3\2\2\2\u02a0\u02a1\7\60\2\2\u02a1\u02a2\7\60"+
		"\2\2\u02a2\u02a3\7\60\2\2\u02a3\u00ac\3\2\2\2\u02a4\u02a6\t\b\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\bW\2\2\u02aa\u00ae\3\2\2\2\u02ab"+
		"\u02ac\7\61\2\2\u02ac\u02ad\7,\2\2\u02ad\u02b1\3\2\2\2\u02ae\u02b0\13"+
		"\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\7,"+
		"\2\2\u02b5\u02b6\7\61\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\bX\2\2\u02b8"+
		"\u00b0\3\2\2\2\u02b9\u02ba\7\61\2\2\u02ba\u02bb\7\61\2\2\u02bb\u02bf\3"+
		"\2\2\2\u02bc\u02be\n\t\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c2\u02c3\bY\2\2\u02c3\u00b2\3\2\2\2\u02c4\u02c6\7\17\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\f"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\bZ\2\2\u02ca\u00b4\3\2\2\2\u02cb"+
		"\u02cc\7=\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\b[\2\2\u02ce\u00b6\3\2\2"+
		"\2\17\2\u00fc\u0261\u0272\u027d\u0285\u028b\u0294\u029c\u02a7\u02b1\u02bf"+
		"\u02c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}