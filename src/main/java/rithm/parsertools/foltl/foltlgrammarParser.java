// Generated from foltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.foltl;
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
public class foltlgrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PREDNAME=7, ANDNODE=8, 
		ORNODE=9, IFFNODE=10, IFNODE=11, UNTILNODE=12, EVENTUALLYNODE=13, GLOBALLYNODE=14, 
		NEXTNODE=15, NOTNODE=16, OBJNAME=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'EXISTS('", "'FORALL('", "'('", "')'", "'F[ALSE]'", "'T[RUE]'", 
		"PREDNAME", "'&&'", "'||'", "'<->'", "'->'", "'U'", "'<>'", "'[]'", "'X'", 
		"'!'", "OBJNAME", "WS"
	};
	public static final int
		RULE_foltl = 0, RULE_pred = 1, RULE_quant = 2, RULE_unaryNonTemporal = 3, 
		RULE_binaryNonTemporal = 4, RULE_binaryTemporal = 5, RULE_unaryTemporal = 6;
	public static final String[] ruleNames = {
		"foltl", "pred", "quant", "unaryNonTemporal", "binaryNonTemporal", "binaryTemporal", 
		"unaryTemporal"
	};

	@Override
	public String getGrammarFileName() { return "foltlgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		

	public foltlgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FoltlContext extends ParserRuleContext {
		public BinaryTemporalContext binaryTemporal() {
			return getRuleContext(BinaryTemporalContext.class,0);
		}
		public List<FoltlContext> foltl() {
			return getRuleContexts(FoltlContext.class);
		}
		public QuantContext quant() {
			return getRuleContext(QuantContext.class,0);
		}
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public TerminalNode WS() { return getToken(foltlgrammarParser.WS, 0); }
		public UnaryTemporalContext unaryTemporal() {
			return getRuleContext(UnaryTemporalContext.class,0);
		}
		public BinaryNonTemporalContext binaryNonTemporal() {
			return getRuleContext(BinaryNonTemporalContext.class,0);
		}
		public UnaryNonTemporalContext unaryNonTemporal() {
			return getRuleContext(UnaryNonTemporalContext.class,0);
		}
		public FoltlContext foltl(int i) {
			return getRuleContext(FoltlContext.class,i);
		}
		public FoltlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foltl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterFoltl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitFoltl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitFoltl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoltlContext foltl() throws RecognitionException {
		return foltl(0);
	}

	private FoltlContext foltl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FoltlContext _localctx = new FoltlContext(_ctx, _parentState);
		FoltlContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_foltl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			switch (_input.LA(1)) {
			case NOTNODE:
				{
				setState(15); unaryNonTemporal();
				setState(16); foltl(6);
				}
				break;
			case EVENTUALLYNODE:
			case GLOBALLYNODE:
			case NEXTNODE:
				{
				setState(18); unaryTemporal();
				setState(19); foltl(5);
				}
				break;
			case 1:
			case 2:
				{
				setState(21); quant();
				setState(22); foltl(2);
				}
				break;
			case 5:
			case 6:
			case PREDNAME:
				{
				setState(24); pred();
				}
				break;
			case 3:
				{
				setState(25); match(3);
				setState(26); foltl(0);
				setState(27); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(41);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new FoltlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_foltl);
						setState(31);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(32); binaryNonTemporal();
						setState(33); foltl(5);
						}
						break;

					case 2:
						{
						_localctx = new FoltlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_foltl);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36); binaryTemporal();
						setState(37); foltl(4);
						}
						break;

					case 3:
						{
						_localctx = new FoltlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_foltl);
						setState(39);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(40); match(WS);
						}
						break;
					}
					} 
				}
				setState(45);
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
		public TerminalNode PREDNAME() { return getToken(foltlgrammarParser.PREDNAME, 0); }
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitPred(this);
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
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << PREDNAME))) != 0)) ) {
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

	public static class QuantContext extends ParserRuleContext {
		public TerminalNode OBJNAME() { return getToken(foltlgrammarParser.OBJNAME, 0); }
		public QuantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterQuant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitQuant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitQuant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantContext quant() throws RecognitionException {
		QuantContext _localctx = new QuantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quant);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(2);
				setState(49); match(OBJNAME);
				setState(50); match(4);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); match(1);
				setState(52); match(OBJNAME);
				setState(53); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode NOTNODE() { return getToken(foltlgrammarParser.NOTNODE, 0); }
		public UnaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterUnaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitUnaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitUnaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNonTemporalContext unaryNonTemporal() throws RecognitionException {
		UnaryNonTemporalContext _localctx = new UnaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryNonTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(NOTNODE);
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
		public TerminalNode ORNODE() { return getToken(foltlgrammarParser.ORNODE, 0); }
		public TerminalNode IFNODE() { return getToken(foltlgrammarParser.IFNODE, 0); }
		public TerminalNode ANDNODE() { return getToken(foltlgrammarParser.ANDNODE, 0); }
		public TerminalNode IFFNODE() { return getToken(foltlgrammarParser.IFFNODE, 0); }
		public BinaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterBinaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitBinaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitBinaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryNonTemporalContext binaryNonTemporal() throws RecognitionException {
		BinaryNonTemporalContext _localctx = new BinaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryNonTemporal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		public TerminalNode UNTILNODE() { return getToken(foltlgrammarParser.UNTILNODE, 0); }
		public BinaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterBinaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitBinaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitBinaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTemporalContext binaryTemporal() throws RecognitionException {
		BinaryTemporalContext _localctx = new BinaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(UNTILNODE);
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
		public TerminalNode GLOBALLYNODE() { return getToken(foltlgrammarParser.GLOBALLYNODE, 0); }
		public TerminalNode EVENTUALLYNODE() { return getToken(foltlgrammarParser.EVENTUALLYNODE, 0); }
		public TerminalNode NEXTNODE() { return getToken(foltlgrammarParser.NEXTNODE, 0); }
		public UnaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).enterUnaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foltlgrammarListener ) ((foltlgrammarListener)listener).exitUnaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foltlgrammarVisitor ) return ((foltlgrammarVisitor<? extends T>)visitor).visitUnaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryTemporalContext unaryTemporal() throws RecognitionException {
		UnaryTemporalContext _localctx = new UnaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryTemporal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EVENTUALLYNODE) | (1L << GLOBALLYNODE) | (1L << NEXTNODE))) != 0)) ) {
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
		case 0: return foltl_sempred((FoltlContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean foltl_sempred(FoltlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\49\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\3\2\t\2\4\6\b\n\f\16\2\5"+
		"\3\2\7\t\3\2\n\r\3\2\17\21C\2\37\3\2\2\2\4\60\3\2\2\2\68\3\2\2\2\b:\3"+
		"\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20\21\b\2\1\2\21\22\5\b\5\2\22"+
		"\23\5\2\2\b\23 \3\2\2\2\24\25\5\16\b\2\25\26\5\2\2\7\26 \3\2\2\2\27\30"+
		"\5\6\4\2\30\31\5\2\2\4\31 \3\2\2\2\32 \5\4\3\2\33\34\7\5\2\2\34\35\5\2"+
		"\2\2\35\36\7\6\2\2\36 \3\2\2\2\37\20\3\2\2\2\37\24\3\2\2\2\37\27\3\2\2"+
		"\2\37\32\3\2\2\2\37\33\3\2\2\2 -\3\2\2\2!\"\f\6\2\2\"#\5\n\6\2#$\5\2\2"+
		"\7$,\3\2\2\2%&\f\5\2\2&\'\5\f\7\2\'(\5\2\2\6(,\3\2\2\2)*\f\3\2\2*,\7\24"+
		"\2\2+!\3\2\2\2+%\3\2\2\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3"+
		"\2\2\2/-\3\2\2\2\60\61\t\2\2\2\61\5\3\2\2\2\62\63\7\4\2\2\63\64\7\23\2"+
		"\2\649\7\6\2\2\65\66\7\3\2\2\66\67\7\23\2\2\679\7\6\2\28\62\3\2\2\28\65"+
		"\3\2\2\29\7\3\2\2\2:;\7\22\2\2;\t\3\2\2\2<=\t\3\2\2=\13\3\2\2\2>?\7\16"+
		"\2\2?\r\3\2\2\2@A\t\4\2\2A\17\3\2\2\2\6\37+-8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}