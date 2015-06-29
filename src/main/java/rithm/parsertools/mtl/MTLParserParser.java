// Generated from MTLParser.g4 by ANTLR 4.2

	package rithm.parsertools.mtl;
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
public class MTLParserParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PREDNAME=7, ANDNODE=8, 
		ORNODE=9, IFFNODE=10, IFNODE=11, UNTILNODE=12, SINCENODE=13, EVENTUALLYNODE=14, 
		EVENTUALLYPASTNODE=15, GLOBALLYNODE=16, GLOBALLYPASTNODE=17, NOTNODE=18, 
		NUM=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'F[ALSE]'", "'{'", "'T[RUE]'", "'}'", "PREDNAME", 
		"'&&'", "'||'", "'<->'", "'->'", "'U'", "'S'", "'<>'", "'<*>'", "'[]'", 
		"'[*]'", "'!'", "NUM", "WS"
	};
	public static final int
		RULE_mtl = 0, RULE_pred = 1, RULE_unaryNonTemporal = 2, RULE_binaryNonTemporal = 3, 
		RULE_binaryTemporal = 4, RULE_unaryTemporal = 5, RULE_intervalNode = 6, 
		RULE_interval = 7;
	public static final String[] ruleNames = {
		"mtl", "pred", "unaryNonTemporal", "binaryNonTemporal", "binaryTemporal", 
		"unaryTemporal", "intervalNode", "interval"
	};

	@Override
	public String getGrammarFileName() { return "MTLParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		

	public MTLParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MtlContext extends ParserRuleContext {
		public BinaryTemporalContext binaryTemporal() {
			return getRuleContext(BinaryTemporalContext.class,0);
		}
		public List<MtlContext> mtl() {
			return getRuleContexts(MtlContext.class);
		}
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public TerminalNode WS() { return getToken(MTLParserParser.WS, 0); }
		public UnaryTemporalContext unaryTemporal() {
			return getRuleContext(UnaryTemporalContext.class,0);
		}
		public BinaryNonTemporalContext binaryNonTemporal() {
			return getRuleContext(BinaryNonTemporalContext.class,0);
		}
		public UnaryNonTemporalContext unaryNonTemporal() {
			return getRuleContext(UnaryNonTemporalContext.class,0);
		}
		public MtlContext mtl(int i) {
			return getRuleContext(MtlContext.class,i);
		}
		public MtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mtl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterMtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitMtl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitMtl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MtlContext mtl() throws RecognitionException {
		return mtl(0);
	}

	private MtlContext mtl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MtlContext _localctx = new MtlContext(_ctx, _parentState);
		MtlContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_mtl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			switch (_input.LA(1)) {
			case NOTNODE:
				{
				setState(17); unaryNonTemporal();
				setState(18); mtl(5);
				}
				break;
			case EVENTUALLYNODE:
			case EVENTUALLYPASTNODE:
			case GLOBALLYNODE:
			case GLOBALLYPASTNODE:
				{
				setState(20); unaryTemporal();
				setState(21); mtl(2);
				}
				break;
			case 3:
			case 5:
			case PREDNAME:
				{
				setState(23); pred();
				}
				break;
			case 1:
				{
				setState(24); match(1);
				setState(25); mtl(0);
				setState(26); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mtl);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(31); binaryNonTemporal();
						setState(32); mtl(5);
						}
						break;

					case 2:
						{
						_localctx = new MtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mtl);
						setState(34);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(35); binaryTemporal();
						setState(36); mtl(4);
						}
						break;

					case 3:
						{
						_localctx = new MtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mtl);
						setState(38);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(39); match(WS);
						}
						break;
					}
					} 
				}
				setState(44);
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
		public TerminalNode PREDNAME() { return getToken(MTLParserParser.PREDNAME, 0); }
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitPred(this);
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
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << PREDNAME))) != 0)) ) {
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
		public TerminalNode NOTNODE() { return getToken(MTLParserParser.NOTNODE, 0); }
		public UnaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterUnaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitUnaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitUnaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNonTemporalContext unaryNonTemporal() throws RecognitionException {
		UnaryNonTemporalContext _localctx = new UnaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryNonTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(NOTNODE);
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
		public TerminalNode ORNODE() { return getToken(MTLParserParser.ORNODE, 0); }
		public TerminalNode IFNODE() { return getToken(MTLParserParser.IFNODE, 0); }
		public TerminalNode ANDNODE() { return getToken(MTLParserParser.ANDNODE, 0); }
		public TerminalNode IFFNODE() { return getToken(MTLParserParser.IFFNODE, 0); }
		public BinaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterBinaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitBinaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitBinaryNonTemporal(this);
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
			setState(49);
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
		public TerminalNode SINCENODE() { return getToken(MTLParserParser.SINCENODE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalNodeContext intervalNode() {
			return getRuleContext(IntervalNodeContext.class,0);
		}
		public TerminalNode UNTILNODE() { return getToken(MTLParserParser.UNTILNODE, 0); }
		public BinaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterBinaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitBinaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitBinaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTemporalContext binaryTemporal() throws RecognitionException {
		BinaryTemporalContext _localctx = new BinaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryTemporal);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case UNTILNODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(UNTILNODE);
				setState(52); intervalNode();
				}
				break;
			case SINCENODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(SINCENODE);
				setState(54); interval();
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

	public static class UnaryTemporalContext extends ParserRuleContext {
		public TerminalNode GLOBALLYNODE() { return getToken(MTLParserParser.GLOBALLYNODE, 0); }
		public TerminalNode EVENTUALLYNODE() { return getToken(MTLParserParser.EVENTUALLYNODE, 0); }
		public IntervalNodeContext intervalNode() {
			return getRuleContext(IntervalNodeContext.class,0);
		}
		public TerminalNode EVENTUALLYPASTNODE() { return getToken(MTLParserParser.EVENTUALLYPASTNODE, 0); }
		public TerminalNode GLOBALLYPASTNODE() { return getToken(MTLParserParser.GLOBALLYPASTNODE, 0); }
		public UnaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterUnaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitUnaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitUnaryTemporal(this);
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
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EVENTUALLYNODE) | (1L << EVENTUALLYPASTNODE) | (1L << GLOBALLYNODE) | (1L << GLOBALLYPASTNODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(58); intervalNode();
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

	public static class IntervalNodeContext extends ParserRuleContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterIntervalNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitIntervalNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitIntervalNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalNodeContext intervalNode() throws RecognitionException {
		IntervalNodeContext _localctx = new IntervalNodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intervalNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(4);
			setState(61); interval();
			setState(62); match(6);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MTLParserParser.NUM, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MTLParserListener ) ((MTLParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MTLParserVisitor ) return ((MTLParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(NUM);
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
		case 0: return mtl_sempred((MtlContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mtl_sempred(MtlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6:\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2\3\2\n\2\4\6\b"+
		"\n\f\16\20\2\5\5\2\5\5\7\7\t\t\3\2\n\r\3\2\20\23C\2\36\3\2\2\2\4/\3\2"+
		"\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16>\3\2\2\2\20B\3"+
		"\2\2\2\22\23\b\2\1\2\23\24\5\6\4\2\24\25\5\2\2\7\25\37\3\2\2\2\26\27\5"+
		"\f\7\2\27\30\5\2\2\4\30\37\3\2\2\2\31\37\5\4\3\2\32\33\7\3\2\2\33\34\5"+
		"\2\2\2\34\35\7\4\2\2\35\37\3\2\2\2\36\22\3\2\2\2\36\26\3\2\2\2\36\31\3"+
		"\2\2\2\36\32\3\2\2\2\37,\3\2\2\2 !\f\6\2\2!\"\5\b\5\2\"#\5\2\2\7#+\3\2"+
		"\2\2$%\f\5\2\2%&\5\n\6\2&\'\5\2\2\6\'+\3\2\2\2()\f\3\2\2)+\7\26\2\2* "+
		"\3\2\2\2*$\3\2\2\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2"+
		".,\3\2\2\2/\60\t\2\2\2\60\5\3\2\2\2\61\62\7\24\2\2\62\7\3\2\2\2\63\64"+
		"\t\3\2\2\64\t\3\2\2\2\65\66\7\16\2\2\66:\5\16\b\2\678\7\17\2\28:\5\20"+
		"\t\29\65\3\2\2\29\67\3\2\2\2:\13\3\2\2\2;<\t\4\2\2<=\5\16\b\2=\r\3\2\2"+
		"\2>?\7\6\2\2?@\5\20\t\2@A\7\b\2\2A\17\3\2\2\2BC\7\25\2\2C\21\3\2\2\2\6"+
		"\36*,9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}