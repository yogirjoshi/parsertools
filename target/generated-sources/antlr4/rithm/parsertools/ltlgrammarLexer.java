// Generated from ltlgrammar.g4 by ANTLR 4.2.2

	package rithm.parsertools;
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
public class ltlgrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PREDNAME=5, ANDNODE=6, ORNODE=7, IFFNODE=8, 
		IFNODE=9, UNTILNODE=10, EVENTUALLYNODE=11, GLOBALLYNODE=12, NOTNODE=13, 
		WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'F[ALSE]'", "'T[RUE]'", "PREDNAME", "'&&'", "'||'", "'<->'", 
		"'->'", "'U'", "'<>'", "'[]'", "'!'", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", "ORNODE", "IFFNODE", 
		"IFNODE", "UNTILNODE", "EVENTUALLYNODE", "GLOBALLYNODE", "NOTNODE", "WS"
	};


		


	public ltlgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ltlgrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20U\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6\64\n\6\r\6\16\6"+
		"\65\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\6\17P\n\17\r\17\16\17Q\3\17\3\17\2"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\4\5\2\62;aac|\5\2\13\f\17\17\"\"V\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t+\3\2\2\2\13\63\3\2\2"+
		"\2\r\67\3\2\2\2\17:\3\2\2\2\21=\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27F\3"+
		"\2\2\2\31I\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37 \7*\2\2 \4\3\2\2\2!\"\7"+
		"+\2\2\"\6\3\2\2\2#$\7H\2\2$%\7]\2\2%&\7C\2\2&\'\7N\2\2\'(\7U\2\2()\7G"+
		"\2\2)*\7_\2\2*\b\3\2\2\2+,\7V\2\2,-\7]\2\2-.\7T\2\2./\7W\2\2/\60\7G\2"+
		"\2\60\61\7_\2\2\61\n\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\66\f\3\2\2\2\678\7(\2\289\7(\2\29\16\3\2"+
		"\2\2:;\7~\2\2;<\7~\2\2<\20\3\2\2\2=>\7>\2\2>?\7/\2\2?@\7@\2\2@\22\3\2"+
		"\2\2AB\7/\2\2BC\7@\2\2C\24\3\2\2\2DE\7W\2\2E\26\3\2\2\2FG\7>\2\2GH\7@"+
		"\2\2H\30\3\2\2\2IJ\7]\2\2JK\7_\2\2K\32\3\2\2\2LM\7#\2\2M\34\3\2\2\2NP"+
		"\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\17\2\2"+
		"T\36\3\2\2\2\5\2\65Q\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}