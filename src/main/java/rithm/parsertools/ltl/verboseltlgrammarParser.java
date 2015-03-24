// Generated from verboseltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.ltl;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class verboseltlgrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PREDNAME=5, ANDNODE=6, ORNODE=7, IFFNODE=8, 
		IFNODE=9, UNTILNODE=10, EVENTUALLYNODE=11, GLOBALLYNODE=12, NOTNODE=13, 
		WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'F[ALSE]'", "'T[RUE]'", "PREDNAME", "' AND '", 
		"' OR '", "' IF-AND-ONLY-IF '", "' IMPLIES '", "' UNTIL '", "' EVENTUALLY '", 
		"' ALWAYS '", "' NOT '", "WS"
	};
	public static final int
		RULE_ltl = 0, RULE_pred = 1, RULE_unaryNonTemporal = 2, RULE_binaryNonTemporal = 3, 
		RULE_binaryTemporal = 4, RULE_unaryTemporal = 5;
	public static final String[] ruleNames = {
		"ltl", "pred", "unaryNonTemporal", "binaryNonTemporal", "binaryTemporal", 
		"unaryTemporal"
	};

	@Override
	public String getGrammarFileName() { return "verboseltlgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		

	public verboseltlgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LtlContext extends ParserRuleContext {
		public BinaryTemporalContext binaryTemporal() {
			return getRuleContext(BinaryTemporalContext.class,0);
		}
		public LtlContext ltl(int i) {
			return getRuleContext(LtlContext.class,i);
		}
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public TerminalNode WS() { return getToken(verboseltlgrammarParser.WS, 0); }
		public List<LtlContext> ltl() {
			return getRuleContexts(LtlContext.class);
		}
		public UnaryTemporalContext unaryTemporal() {
			return getRuleContext(UnaryTemporalContext.class,0);
		}
		public BinaryNonTemporalContext binaryNonTemporal() {
			return getRuleContext(BinaryNonTemporalContext.class,0);
		}
		public UnaryNonTemporalContext unaryNonTemporal() {
			return getRuleContext(UnaryNonTemporalContext.class,0);
		}
		public LtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterLtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitLtl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitLtl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlContext ltl() throws RecognitionException {
		return ltl(0);
	}

	private LtlContext ltl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LtlContext _localctx = new LtlContext(_ctx, _parentState);
		LtlContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_ltl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			switch (_input.LA(1)) {
			case NOTNODE:
				{
				setState(13); unaryNonTemporal();
				setState(14); ltl(5);
				}
				break;
			case EVENTUALLYNODE:
			case GLOBALLYNODE:
				{
				setState(16); unaryTemporal();
				setState(17); ltl(2);
				}
				break;
			case 3:
			case 4:
			case PREDNAME:
				{
				setState(19); pred();
				}
				break;
			case 1:
				{
				setState(20); match(1);
				setState(21); ltl(0);
				setState(22); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(36);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(26);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(27); binaryNonTemporal();
						setState(28); ltl(5);
						}
						break;

					case 2:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31); binaryTemporal();
						setState(32); ltl(4);
						}
						break;

					case 3:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(34);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(35); match(WS);
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredContext extends ParserRuleContext {
		public TerminalNode PREDNAME() { return getToken(verboseltlgrammarParser.PREDNAME, 0); }
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitPred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredContext pred() throws RecognitionException {
		PredContext _localctx = new PredContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << PREDNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryNonTemporalContext extends ParserRuleContext {
		public TerminalNode NOTNODE() { return getToken(verboseltlgrammarParser.NOTNODE, 0); }
		public UnaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterUnaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitUnaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitUnaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNonTemporalContext unaryNonTemporal() throws RecognitionException {
		UnaryNonTemporalContext _localctx = new UnaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryNonTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(NOTNODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryNonTemporalContext extends ParserRuleContext {
		public TerminalNode ORNODE() { return getToken(verboseltlgrammarParser.ORNODE, 0); }
		public TerminalNode IFNODE() { return getToken(verboseltlgrammarParser.IFNODE, 0); }
		public TerminalNode ANDNODE() { return getToken(verboseltlgrammarParser.ANDNODE, 0); }
		public TerminalNode IFFNODE() { return getToken(verboseltlgrammarParser.IFFNODE, 0); }
		public BinaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterBinaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitBinaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitBinaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryNonTemporalContext binaryNonTemporal() throws RecognitionException {
		BinaryNonTemporalContext _localctx = new BinaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binaryNonTemporal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANDNODE) | (1L << ORNODE) | (1L << IFFNODE) | (1L << IFNODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryTemporalContext extends ParserRuleContext {
		public TerminalNode UNTILNODE() { return getToken(verboseltlgrammarParser.UNTILNODE, 0); }
		public BinaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterBinaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitBinaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitBinaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTemporalContext binaryTemporal() throws RecognitionException {
		BinaryTemporalContext _localctx = new BinaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(UNTILNODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryTemporalContext extends ParserRuleContext {
		public TerminalNode GLOBALLYNODE() { return getToken(verboseltlgrammarParser.GLOBALLYNODE, 0); }
		public TerminalNode EVENTUALLYNODE() { return getToken(verboseltlgrammarParser.EVENTUALLYNODE, 0); }
		public UnaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).enterUnaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof verboseltlgrammarListener ) ((verboseltlgrammarListener)listener).exitUnaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof verboseltlgrammarVisitor ) return ((verboseltlgrammarVisitor<? extends T>)visitor).visitUnaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryTemporalContext unaryTemporal() throws RecognitionException {
		UnaryTemporalContext _localctx = new UnaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryTemporal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==EVENTUALLYNODE || _la==GLOBALLYNODE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return ltl_sempred((LtlContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ltl_sempred(LtlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\3"+
		"\2\b\2\4\6\b\n\f\2\5\3\2\5\7\3\2\b\13\3\2\r\16\65\2\32\3\2\2\2\4+\3\2"+
		"\2\2\6-\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\63\3\2\2\2\16\17\b\2\1\2\17"+
		"\20\5\6\4\2\20\21\5\2\2\7\21\33\3\2\2\2\22\23\5\f\7\2\23\24\5\2\2\4\24"+
		"\33\3\2\2\2\25\33\5\4\3\2\26\27\7\3\2\2\27\30\5\2\2\2\30\31\7\4\2\2\31"+
		"\33\3\2\2\2\32\16\3\2\2\2\32\22\3\2\2\2\32\25\3\2\2\2\32\26\3\2\2\2\33"+
		"(\3\2\2\2\34\35\f\6\2\2\35\36\5\b\5\2\36\37\5\2\2\7\37\'\3\2\2\2 !\f\5"+
		"\2\2!\"\5\n\6\2\"#\5\2\2\6#\'\3\2\2\2$%\f\3\2\2%\'\7\20\2\2&\34\3\2\2"+
		"\2& \3\2\2\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2"+
		"\2\2+,\t\2\2\2,\5\3\2\2\2-.\7\17\2\2.\7\3\2\2\2/\60\t\3\2\2\60\t\3\2\2"+
		"\2\61\62\7\f\2\2\62\13\3\2\2\2\63\64\t\4\2\2\64\r\3\2\2\2\5\32&(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}