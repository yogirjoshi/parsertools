// Generated from ltlgrammar.g4 by ANTLR 4.2

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
public class ltlgrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PREDNAME=5, ANDNODE=6, ORNODE=7, IFFNODE=8, 
		IFNODE=9, UNTILNODE=10, EVENTUALLYNODE=11, NEXTNODE=12, GLOBALLYNODE=13, 
		NOTNODE=14, ES=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'F[ALSE]'", "'T[RUE]'", "PREDNAME", "'&&'", 
		"'||'", "'<->'", "'->'", "'U'", "'<>'", "'X'", "'[]'", "'!'", "ES", "WS"
	};
	public static final int
		RULE_ltl = 0, RULE_pred = 1, RULE_unaryNonTemporal = 2, RULE_unaryTemporal = 3, 
		RULE_binaryNonTemporal = 4, RULE_binaryTemporal = 5;
	public static final String[] ruleNames = {
		"ltl", "pred", "unaryNonTemporal", "unaryTemporal", "binaryNonTemporal", 
		"binaryTemporal"
	};

	@Override
	public String getGrammarFileName() { return "ltlgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		

	public ltlgrammarParser(TokenStream input) {
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
		public TerminalNode WS() { return getToken(ltlgrammarParser.WS, 0); }
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
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterLtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitLtl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitLtl(this);
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
			case NEXTNODE:
			case GLOBALLYNODE:
				{
				setState(16); unaryTemporal();
				setState(17); ltl(4);
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
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(27); binaryNonTemporal();
						setState(28); ltl(4);
						}
						break;

					case 2:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(30);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(31); binaryTemporal();
						setState(32); ltl(3);
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
		public TerminalNode ES() { return getToken(ltlgrammarParser.ES, 0); }
		public TerminalNode PREDNAME() { return getToken(ltlgrammarParser.PREDNAME, 0); }
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitPred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredContext pred() throws RecognitionException {
		PredContext _localctx = new PredContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pred);
		try {
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(PREDNAME);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(PREDNAME);
				setState(43); match(ES);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(4);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); match(3);
				}
				break;
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
		public TerminalNode ES() { return getToken(ltlgrammarParser.ES, 0); }
		public TerminalNode NOTNODE() { return getToken(ltlgrammarParser.NOTNODE, 0); }
		public UnaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterUnaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitUnaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitUnaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNonTemporalContext unaryNonTemporal() throws RecognitionException {
		UnaryNonTemporalContext _localctx = new UnaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryNonTemporal);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(NOTNODE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(NOTNODE);
				setState(50); match(ES);
				}
				break;
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
		public TerminalNode GLOBALLYNODE() { return getToken(ltlgrammarParser.GLOBALLYNODE, 0); }
		public TerminalNode ES() { return getToken(ltlgrammarParser.ES, 0); }
		public TerminalNode EVENTUALLYNODE() { return getToken(ltlgrammarParser.EVENTUALLYNODE, 0); }
		public TerminalNode NEXTNODE() { return getToken(ltlgrammarParser.NEXTNODE, 0); }
		public UnaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterUnaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitUnaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitUnaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryTemporalContext unaryTemporal() throws RecognitionException {
		UnaryTemporalContext _localctx = new UnaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryTemporal);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(EVENTUALLYNODE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(EVENTUALLYNODE);
				setState(55); match(ES);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56); match(GLOBALLYNODE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); match(GLOBALLYNODE);
				setState(58); match(ES);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); match(NEXTNODE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60); match(NEXTNODE);
				setState(61); match(ES);
				}
				break;
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
		public TerminalNode ORNODE() { return getToken(ltlgrammarParser.ORNODE, 0); }
		public TerminalNode IFNODE() { return getToken(ltlgrammarParser.IFNODE, 0); }
		public TerminalNode ES() { return getToken(ltlgrammarParser.ES, 0); }
		public TerminalNode ANDNODE() { return getToken(ltlgrammarParser.ANDNODE, 0); }
		public TerminalNode IFFNODE() { return getToken(ltlgrammarParser.IFFNODE, 0); }
		public BinaryNonTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNonTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterBinaryNonTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitBinaryNonTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitBinaryNonTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryNonTemporalContext binaryNonTemporal() throws RecognitionException {
		BinaryNonTemporalContext _localctx = new BinaryNonTemporalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryNonTemporal);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(ANDNODE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(ANDNODE);
				setState(66); match(ES);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(ORNODE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); match(ORNODE);
				setState(69); match(ES);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70); match(IFFNODE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71); match(IFFNODE);
				setState(72); match(ES);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73); match(IFNODE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74); match(IFNODE);
				setState(75); match(ES);
				}
				break;
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
		public TerminalNode ES() { return getToken(ltlgrammarParser.ES, 0); }
		public TerminalNode UNTILNODE() { return getToken(ltlgrammarParser.UNTILNODE, 0); }
		public BinaryTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).enterBinaryTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlgrammarListener ) ((ltlgrammarListener)listener).exitBinaryTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlgrammarVisitor ) return ((ltlgrammarVisitor<? extends T>)visitor).visitBinaryTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTemporalContext binaryTemporal() throws RecognitionException {
		BinaryTemporalContext _localctx = new BinaryTemporalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryTemporal);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(UNTILNODE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(UNTILNODE);
				setState(80); match(ES);
				}
				break;
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
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\'"+
		"\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\5\7T\n\7\3\7\2\3\2\b"+
		"\2\4\6\b\n\f\2\2f\2\32\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\b@\3\2\2\2\n"+
		"N\3\2\2\2\fS\3\2\2\2\16\17\b\2\1\2\17\20\5\6\4\2\20\21\5\2\2\7\21\33\3"+
		"\2\2\2\22\23\5\b\5\2\23\24\5\2\2\6\24\33\3\2\2\2\25\33\5\4\3\2\26\27\7"+
		"\3\2\2\27\30\5\2\2\2\30\31\7\4\2\2\31\33\3\2\2\2\32\16\3\2\2\2\32\22\3"+
		"\2\2\2\32\25\3\2\2\2\32\26\3\2\2\2\33(\3\2\2\2\34\35\f\5\2\2\35\36\5\n"+
		"\6\2\36\37\5\2\2\6\37\'\3\2\2\2 !\f\4\2\2!\"\5\f\7\2\"#\5\2\2\5#\'\3\2"+
		"\2\2$%\f\3\2\2%\'\7\22\2\2&\34\3\2\2\2& \3\2\2\2&$\3\2\2\2\'*\3\2\2\2"+
		"(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+\61\7\7\2\2,-\7\7\2\2-\61\7"+
		"\21\2\2.\61\7\6\2\2/\61\7\5\2\2\60+\3\2\2\2\60,\3\2\2\2\60.\3\2\2\2\60"+
		"/\3\2\2\2\61\5\3\2\2\2\62\66\7\20\2\2\63\64\7\20\2\2\64\66\7\21\2\2\65"+
		"\62\3\2\2\2\65\63\3\2\2\2\66\7\3\2\2\2\67A\7\r\2\289\7\r\2\29A\7\21\2"+
		"\2:A\7\17\2\2;<\7\17\2\2<A\7\21\2\2=A\7\16\2\2>?\7\16\2\2?A\7\21\2\2@"+
		"\67\3\2\2\2@8\3\2\2\2@:\3\2\2\2@;\3\2\2\2@=\3\2\2\2@>\3\2\2\2A\t\3\2\2"+
		"\2BO\7\b\2\2CD\7\b\2\2DO\7\21\2\2EO\7\t\2\2FG\7\t\2\2GO\7\21\2\2HO\7\n"+
		"\2\2IJ\7\n\2\2JO\7\21\2\2KO\7\13\2\2LM\7\13\2\2MO\7\21\2\2NB\3\2\2\2N"+
		"C\3\2\2\2NE\3\2\2\2NF\3\2\2\2NH\3\2\2\2NI\3\2\2\2NK\3\2\2\2NL\3\2\2\2"+
		"O\13\3\2\2\2PT\7\f\2\2QR\7\f\2\2RT\7\21\2\2SP\3\2\2\2SQ\3\2\2\2T\r\3\2"+
		"\2\2\n\32&(\60\65@NS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}