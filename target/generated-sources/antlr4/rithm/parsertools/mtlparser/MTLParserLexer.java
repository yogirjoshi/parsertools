// Generated from MTLParser.g4 by ANTLR 4.2.2

	package rithm.parsertools.mtlparser;
	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MTLParserLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PREDNAME=7, ANDNODE=8, 
		ORNODE=9, IFFNODE=10, IFNODE=11, UNTILNODE=12, EVENTUALLYNODE=13, GLOBALLYNODE=14, 
		NOTNODE=15, NUM=16, COMMA=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'F[ALSE]'", "'{'", "'T[RUE]'", "'}'", "PREDNAME", "'&&'", 
		"'||'", "'<->'", "'->'", "'U'", "'<>'", "'[]'", "'!'", "NUM", "','", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", 
		"ORNODE", "IFFNODE", "IFNODE", "UNTILNODE", "EVENTUALLYNODE", "GLOBALLYNODE", 
		"NOTNODE", "NUM", "COMMA", "WS"
	};


		


	public MTLParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MTLParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b@\n\b\r\b\16\bA\3\b\7\bE\n\b\f"+
		"\b\16\bH\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\6\21b\n\21\r\21"+
		"\16\21c\3\22\3\22\3\23\6\23i\n\23\r\23\16\23j\3\23\3\23\2\2\24\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"q\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r<\3\2\2\2\17"+
		"?\3\2\2\2\21I\3\2\2\2\23L\3\2\2\2\25O\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2"+
		"\33X\3\2\2\2\35[\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#e\3\2\2\2%h\3\2\2\2\'("+
		"\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7H\2\2,-\7]\2\2-.\7C\2\2./\7"+
		"N\2\2/\60\7U\2\2\60\61\7G\2\2\61\62\7_\2\2\62\b\3\2\2\2\63\64\7}\2\2\64"+
		"\n\3\2\2\2\65\66\7V\2\2\66\67\7]\2\2\678\7T\2\289\7W\2\29:\7G\2\2:;\7"+
		"_\2\2;\f\3\2\2\2<=\7\177\2\2=\16\3\2\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2BF\3\2\2\2CE\t\3\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2G\20\3\2\2\2HF\3\2\2\2IJ\7(\2\2JK\7(\2\2K\22\3\2\2\2LM\7~\2"+
		"\2MN\7~\2\2N\24\3\2\2\2OP\7>\2\2PQ\7/\2\2QR\7@\2\2R\26\3\2\2\2ST\7/\2"+
		"\2TU\7@\2\2U\30\3\2\2\2VW\7W\2\2W\32\3\2\2\2XY\7>\2\2YZ\7@\2\2Z\34\3\2"+
		"\2\2[\\\7]\2\2\\]\7_\2\2]\36\3\2\2\2^_\7#\2\2_ \3\2\2\2`b\t\3\2\2a`\3"+
		"\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\"\3\2\2\2ef\7.\2\2f$\3\2\2\2gi\t"+
		"\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\23\2\2m&"+
		"\3\2\2\2\7\2AFcj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}