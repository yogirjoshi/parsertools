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
		NUM=19, COMMA=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'F[ALSE]'", "'{'", "'T[RUE]'", "'}'", "PREDNAME", "'&&'", 
		"'||'", "'<->'", "'->'", "'U'", "'S'", "'<>'", "'<*>'", "'[]'", "'[*]'", 
		"'!'", "NUM", "','", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PREDNAME", "ANDNODE", 
		"ORNODE", "IFFNODE", "IFNODE", "UNTILNODE", "SINCENODE", "EVENTUALLYNODE", 
		"EVENTUALLYPASTNODE", "GLOBALLYNODE", "GLOBALLYPASTNODE", "NOTNODE", "NUM", 
		"COMMA", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b"+
		"F\n\b\r\b\16\bG\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\6\24r"+
		"\n\24\r\24\16\24s\3\25\3\25\3\26\6\26y\n\26\r\26\16\26z\3\26\3\26\2\2"+
		"\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5/\3\2\2\2\7\61\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2"+
		"\21O\3\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31\\\3\2\2\2\33^\3\2"+
		"\2\2\35`\3\2\2\2\37c\3\2\2\2!g\3\2\2\2#j\3\2\2\2%n\3\2\2\2\'q\3\2\2\2"+
		")u\3\2\2\2+x\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62"+
		"\7H\2\2\62\63\7]\2\2\63\64\7C\2\2\64\65\7N\2\2\65\66\7U\2\2\66\67\7G\2"+
		"\2\678\7_\2\28\b\3\2\2\29:\7}\2\2:\n\3\2\2\2;<\7V\2\2<=\7]\2\2=>\7T\2"+
		"\2>?\7W\2\2?@\7G\2\2@A\7_\2\2A\f\3\2\2\2BC\7\177\2\2C\16\3\2\2\2DF\t\2"+
		"\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2\2\2IK\t\3\2\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\20\3\2\2\2NL\3\2\2\2OP\7(\2\2PQ\7"+
		"(\2\2Q\22\3\2\2\2RS\7~\2\2ST\7~\2\2T\24\3\2\2\2UV\7>\2\2VW\7/\2\2WX\7"+
		"@\2\2X\26\3\2\2\2YZ\7/\2\2Z[\7@\2\2[\30\3\2\2\2\\]\7W\2\2]\32\3\2\2\2"+
		"^_\7U\2\2_\34\3\2\2\2`a\7>\2\2ab\7@\2\2b\36\3\2\2\2cd\7>\2\2de\7,\2\2"+
		"ef\7@\2\2f \3\2\2\2gh\7]\2\2hi\7_\2\2i\"\3\2\2\2jk\7]\2\2kl\7,\2\2lm\7"+
		"_\2\2m$\3\2\2\2no\7#\2\2o&\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t(\3\2\2\2uv\7.\2\2v*\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\26\2\2},\3\2\2\2\7\2GLsz\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}