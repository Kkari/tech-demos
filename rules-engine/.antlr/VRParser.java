// Generated from /Users/kari/HobbyProjects/react-ts-antlr-demo/rules-engine/VR.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NOT=17, 
		COLUMN=18, STRING=19, INTEGER=20, DOUBLE=21, BOOLEAN=22, WHITESPACE=23;
	public static final int
		RULE_expression = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'IF'", "'THEN'", "'ELSE'", "'LOWER('", "'ISNUMBER('", 
			"'EQUALS_IGNORE_CASE('", "','", "'+'", "'-'", "'IN LIST('", "'='", "'>'", 
			"'AND'", "'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NOT", "COLUMN", "STRING", "INTEGER", "DOUBLE", 
			"BOOLEAN", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColExpContext extends ExpressionContext {
		public TerminalNode COLUMN() { return getToken(VRParser.COLUMN, 0); }
		public ColExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InDynExpContext extends ExpressionContext {
		public TerminalNode COLUMN() { return getToken(VRParser.COLUMN, 0); }
		public TerminalNode STRING() { return getToken(VRParser.STRING, 0); }
		public TerminalNode NOT() { return getToken(VRParser.NOT, 0); }
		public InDynExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(VRParser.BOOLEAN, 0); }
		public BoolExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerExpContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(VRParser.INTEGER, 0); }
		public IntegerExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrExpContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(VRParser.STRING, 0); }
		public StrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsIgnoreCaseExpContext extends ExpressionContext {
		public List<TerminalNode> COLUMN() { return getTokens(VRParser.COLUMN); }
		public TerminalNode COLUMN(int i) {
			return getToken(VRParser.COLUMN, i);
		}
		public TerminalNode STRING() { return getToken(VRParser.STRING, 0); }
		public EqualsIgnoreCaseExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowerExpContext extends ExpressionContext {
		public TerminalNode COLUMN() { return getToken(VRParser.COLUMN, 0); }
		public LowerExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNumberExpContext extends ExpressionContext {
		public TerminalNode COLUMN() { return getToken(VRParser.COLUMN, 0); }
		public IsNumberExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleExpContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(VRParser.DOUBLE, 0); }
		public DoubleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(T__0);
				setState(4);
				expression(0);
				setState(5);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(7);
				match(T__2);
				setState(8);
				expression(0);
				setState(9);
				match(T__3);
				setState(10);
				expression(0);
				setState(13);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(11);
					match(T__4);
					setState(12);
					expression(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new LowerExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(T__5);
				setState(16);
				match(COLUMN);
				setState(17);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new IsNumberExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(T__6);
				setState(19);
				match(COLUMN);
				setState(20);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new EqualsIgnoreCaseExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__7);
				{
				setState(22);
				match(COLUMN);
				}
				setState(23);
				match(T__8);
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(25);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new InDynExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(COLUMN);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(27);
					match(NOT);
					}
				}

				setState(30);
				match(T__11);
				setState(31);
				match(STRING);
				setState(32);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new IntegerExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(INTEGER);
				}
				break;
			case 8:
				{
				_localctx = new DoubleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(DOUBLE);
				}
				break;
			case 9:
				{
				_localctx = new StrExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ColExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(COLUMN);
				}
				break;
			case 11:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(41);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new EqExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(44);
						match(T__12);
						setState(45);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new LtExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(47);
						match(T__13);
						setState(48);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(50);
						match(T__14);
						setState(51);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53);
						match(T__15);
						setState(54);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017=\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u001d\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\'\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u00008\b\u0000\n\u0000\f\u0000;\t"+
		"\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0002\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\n\u000bL\u0000&\u0001\u0000\u0000\u0000\u0002"+
		"\u0003\u0006\u0000\uffff\uffff\u0000\u0003\u0004\u0005\u0001\u0000\u0000"+
		"\u0004\u0005\u0003\u0000\u0000\u0000\u0005\u0006\u0005\u0002\u0000\u0000"+
		"\u0006\'\u0001\u0000\u0000\u0000\u0007\b\u0005\u0003\u0000\u0000\b\t\u0003"+
		"\u0000\u0000\u0000\t\n\u0005\u0004\u0000\u0000\n\r\u0003\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0005\u0000\u0000\f\u000e\u0003\u0000\u0000\u0000\r\u000b"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\'\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0005\u0006\u0000\u0000\u0010\u0011\u0005"+
		"\u0012\u0000\u0000\u0011\'\u0005\u0002\u0000\u0000\u0012\u0013\u0005\u0007"+
		"\u0000\u0000\u0013\u0014\u0005\u0012\u0000\u0000\u0014\'\u0005\u0002\u0000"+
		"\u0000\u0015\u0016\u0005\b\u0000\u0000\u0016\u0017\u0005\u0012\u0000\u0000"+
		"\u0017\u0018\u0005\t\u0000\u0000\u0018\u0019\u0007\u0000\u0000\u0000\u0019"+
		"\'\u0005\u0002\u0000\u0000\u001a\u001c\u0005\u0012\u0000\u0000\u001b\u001d"+
		"\u0005\u0011\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\f\u0000\u0000\u001f \u0005\u0013\u0000\u0000 \'\u0005\u0002\u0000"+
		"\u0000!\'\u0005\u0014\u0000\u0000\"\'\u0005\u0015\u0000\u0000#\'\u0005"+
		"\u0013\u0000\u0000$\'\u0005\u0012\u0000\u0000%\'\u0005\u0016\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000&\u0007\u0001\u0000\u0000\u0000&\u000f"+
		"\u0001\u0000\u0000\u0000&\u0012\u0001\u0000\u0000\u0000&\u0015\u0001\u0000"+
		"\u0000\u0000&\u001a\u0001\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000"+
		"&\"\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&%\u0001\u0000\u0000\u0000\'9\u0001\u0000\u0000\u0000()\n\u000b"+
		"\u0000\u0000)*\u0007\u0001\u0000\u0000*8\u0003\u0000\u0000\f+,\n\t\u0000"+
		"\u0000,-\u0005\r\u0000\u0000-8\u0003\u0000\u0000\n./\n\b\u0000\u0000/"+
		"0\u0005\u000e\u0000\u000008\u0003\u0000\u0000\t12\n\u0007\u0000\u0000"+
		"23\u0005\u000f\u0000\u000038\u0003\u0000\u0000\b45\n\u0006\u0000\u0000"+
		"56\u0005\u0010\u0000\u000068\u0003\u0000\u0000\u00077(\u0001\u0000\u0000"+
		"\u00007+\u0001\u0000\u0000\u00007.\u0001\u0000\u0000\u000071\u0001\u0000"+
		"\u0000\u000074\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0001\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000\u0005\r\u001c&79";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}