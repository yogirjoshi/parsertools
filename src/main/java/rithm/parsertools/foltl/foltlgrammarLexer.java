// Generated from foltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.foltl;
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
public class foltlgrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PREDNAME=7, ANDNODE=8, 
		ORNODE=9, IFFNODE=10, IFNODE=11, UNTILNODE=12, EVENTUALLYNODE=13, GLOBALLYNODE=14, 
		NEXTNODE=15, NOTNODE=16, OBJNAME=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'EXISTS('", "'FORALL('", "'('", "')'", "'F[ALSE]'", "'T[RUE]'", "PREDNAME", 
		"'&&'", "'||'", "'<->'", "'->'", "'U'", "'<>'", "'[]'", "'X'", "'!'", 
		"OBJNAME", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", 
		"ORNODE", "IFFNODE", "IFNODE", "UNTILNODE", "EVENTUALLYNODE", "GLOBALLYNODE", 
		"NEXTNODE", "NOTNODE", "OBJNAME", "WS"
	};


		


	public foltlgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "foltlgrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\6\bR\n\b\r\b\16\bS\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22r\n\22\r\22\16\22"+
		"s\3\23\6\23w\n\23\r\23\16\23x\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5"+
		"\5\2\62;aac|\3\2C\\\5\2\13\f\17\17\"\"\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2"+
		"\5/\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rC\3\2\2\2\17K\3\2\2\2"+
		"\21W\3\2\2\2\23Z\3\2\2\2\25]\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33f\3\2\2"+
		"\2\35i\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#q\3\2\2\2%v\3\2\2\2\'(\7G\2\2()\7"+
		"Z\2\2)*\7K\2\2*+\7U\2\2+,\7V\2\2,-\7U\2\2-.\7*\2\2.\4\3\2\2\2/\60\7H\2"+
		"\2\60\61\7Q\2\2\61\62\7T\2\2\62\63\7C\2\2\63\64\7N\2\2\64\65\7N\2\2\65"+
		"\66\7*\2\2\66\6\3\2\2\2\678\7*\2\28\b\3\2\2\29:\7+\2\2:\n\3\2\2\2;<\7"+
		"H\2\2<=\7]\2\2=>\7C\2\2>?\7N\2\2?@\7U\2\2@A\7G\2\2AB\7_\2\2B\f\3\2\2\2"+
		"CD\7V\2\2DE\7]\2\2EF\7T\2\2FG\7W\2\2GH\7G\2\2HI\7_\2\2I\16\3\2\2\2JL\t"+
		"\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7*\2\2PR\t"+
		"\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7+\2\2V\20"+
		"\3\2\2\2WX\7(\2\2XY\7(\2\2Y\22\3\2\2\2Z[\7~\2\2[\\\7~\2\2\\\24\3\2\2\2"+
		"]^\7>\2\2^_\7/\2\2_`\7@\2\2`\26\3\2\2\2ab\7/\2\2bc\7@\2\2c\30\3\2\2\2"+
		"de\7W\2\2e\32\3\2\2\2fg\7>\2\2gh\7@\2\2h\34\3\2\2\2ij\7]\2\2jk\7_\2\2"+
		"k\36\3\2\2\2lm\7Z\2\2m \3\2\2\2no\7#\2\2o\"\3\2\2\2pr\t\3\2\2qp\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t$\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\23\2\2{&\3\2\2\2\7\2MSsx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}