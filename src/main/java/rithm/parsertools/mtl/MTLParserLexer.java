// Generated from MTLParser.g4 by ANTLR 4.2

	package rithm.parsertools.mtl;
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
		ORNODE=9, IFFNODE=10, IFNODE=11, UNTILNODE=12, SINCENODE=13, EVENTUALLYNODE=14, 
		EVENTUALLYPASTNODE=15, GLOBALLYNODE=16, GLOBALLYPASTNODE=17, NOTNODE=18, 
		NUM=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'F[ALSE]'", "'{'", "'T[RUE]'", "'}'", "PREDNAME", "'&&'", 
		"'||'", "'<->'", "'->'", "'U'", "'S'", "'<>'", "'<*>'", "'[]'", "'[*]'", 
		"'!'", "NUM", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", 
		"ORNODE", "IFFNODE", "IFNODE", "UNTILNODE", "SINCENODE", "EVENTUALLYNODE", 
		"EVENTUALLYPASTNODE", "GLOBALLYNODE", "GLOBALLYPASTNODE", "NOTNODE", "NUM", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\bD\n\b\r\b"+
		"\16\bE\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\6\24j\n\24\r\24\16\24k\3\24\3\24\6\24p\n\24"+
		"\r\24\16\24q\3\25\6\25u\n\25\r\25\16\25v\3\25\3\25\2\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\5\7\2\62;CTVVX\\c|\5\2\60\60\62;^^\5\2\13\f\17\17\""+
		"\"}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2"+
		"\2\2\t\67\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17C\3\2\2\2\21G\3\2\2\2\23J\3"+
		"\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37"+
		"[\3\2\2\2!_\3\2\2\2#b\3\2\2\2%f\3\2\2\2\'i\3\2\2\2)t\3\2\2\2+,\7*\2\2"+
		",\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7H\2\2\60\61\7]\2\2\61\62\7C\2\2\62"+
		"\63\7N\2\2\63\64\7U\2\2\64\65\7G\2\2\65\66\7_\2\2\66\b\3\2\2\2\678\7}"+
		"\2\28\n\3\2\2\29:\7V\2\2:;\7]\2\2;<\7T\2\2<=\7W\2\2=>\7G\2\2>?\7_\2\2"+
		"?\f\3\2\2\2@A\7\177\2\2A\16\3\2\2\2BD\t\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2F\20\3\2\2\2GH\7(\2\2HI\7(\2\2I\22\3\2\2\2JK\7~\2\2KL"+
		"\7~\2\2L\24\3\2\2\2MN\7>\2\2NO\7/\2\2OP\7@\2\2P\26\3\2\2\2QR\7/\2\2RS"+
		"\7@\2\2S\30\3\2\2\2TU\7W\2\2U\32\3\2\2\2VW\7U\2\2W\34\3\2\2\2XY\7>\2\2"+
		"YZ\7@\2\2Z\36\3\2\2\2[\\\7>\2\2\\]\7,\2\2]^\7@\2\2^ \3\2\2\2_`\7]\2\2"+
		"`a\7_\2\2a\"\3\2\2\2bc\7]\2\2cd\7,\2\2de\7_\2\2e$\3\2\2\2fg\7#\2\2g&\3"+
		"\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7"+
		".\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2su\t"+
		"\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\25\2\2y*"+
		"\3\2\2\2\7\2Ekqv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}