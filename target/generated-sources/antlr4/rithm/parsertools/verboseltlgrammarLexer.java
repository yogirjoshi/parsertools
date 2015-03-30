// Generated from verboseltlgrammar.g4 by ANTLR 4.2.2

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
public class verboseltlgrammarLexer extends Lexer {
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
		"'('", "')'", "'F[ALSE]'", "'T[RUE]'", "PREDNAME", "' AND '", "' OR '", 
		"' IF-AND-ONLY-IF '", "' IMPLIES '", "' UNTIL '", "' EVENTUALLY '", "' ALWAYS '", 
		"' NOT '", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", "ORNODE", "IFFNODE", 
		"IFNODE", "UNTILNODE", "EVENTUALLYNODE", "GLOBALLYNODE", "NOTNODE", "WS"
	};


		


	public verboseltlgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "verboseltlgrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6\64\n\6\r\6"+
		"\16\6\65\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u0083\n\17\r\17\16\17"+
		"\u0084\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\3\2\4\5\2\62;aac|\5\2\13\f\17\17\"\"\u0089\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2"+
		"\t+\3\2\2\2\13\63\3\2\2\2\r\67\3\2\2\2\17=\3\2\2\2\21B\3\2\2\2\23S\3\2"+
		"\2\2\25]\3\2\2\2\27e\3\2\2\2\31r\3\2\2\2\33{\3\2\2\2\35\u0082\3\2\2\2"+
		"\37 \7*\2\2 \4\3\2\2\2!\"\7+\2\2\"\6\3\2\2\2#$\7H\2\2$%\7]\2\2%&\7C\2"+
		"\2&\'\7N\2\2\'(\7U\2\2()\7G\2\2)*\7_\2\2*\b\3\2\2\2+,\7V\2\2,-\7]\2\2"+
		"-.\7T\2\2./\7W\2\2/\60\7G\2\2\60\61\7_\2\2\61\n\3\2\2\2\62\64\t\2\2\2"+
		"\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\f\3\2\2\2"+
		"\678\7\"\2\289\7C\2\29:\7P\2\2:;\7F\2\2;<\7\"\2\2<\16\3\2\2\2=>\7\"\2"+
		"\2>?\7Q\2\2?@\7T\2\2@A\7\"\2\2A\20\3\2\2\2BC\7\"\2\2CD\7K\2\2DE\7H\2\2"+
		"EF\7/\2\2FG\7C\2\2GH\7P\2\2HI\7F\2\2IJ\7/\2\2JK\7Q\2\2KL\7P\2\2LM\7N\2"+
		"\2MN\7[\2\2NO\7/\2\2OP\7K\2\2PQ\7H\2\2QR\7\"\2\2R\22\3\2\2\2ST\7\"\2\2"+
		"TU\7K\2\2UV\7O\2\2VW\7R\2\2WX\7N\2\2XY\7K\2\2YZ\7G\2\2Z[\7U\2\2[\\\7\""+
		"\2\2\\\24\3\2\2\2]^\7\"\2\2^_\7W\2\2_`\7P\2\2`a\7V\2\2ab\7K\2\2bc\7N\2"+
		"\2cd\7\"\2\2d\26\3\2\2\2ef\7\"\2\2fg\7G\2\2gh\7X\2\2hi\7G\2\2ij\7P\2\2"+
		"jk\7V\2\2kl\7W\2\2lm\7C\2\2mn\7N\2\2no\7N\2\2op\7[\2\2pq\7\"\2\2q\30\3"+
		"\2\2\2rs\7\"\2\2st\7C\2\2tu\7N\2\2uv\7Y\2\2vw\7C\2\2wx\7[\2\2xy\7U\2\2"+
		"yz\7\"\2\2z\32\3\2\2\2{|\7\"\2\2|}\7P\2\2}~\7Q\2\2~\177\7V\2\2\177\u0080"+
		"\7\"\2\2\u0080\34\3\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\b\17\2\2\u0087\36\3\2\2\2\5\2\65\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}