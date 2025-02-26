// Generated from /Users/kari/HobbyProjects/antlr-demo/MyG.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, COLUMN=2, STRING=3, INTEGER=4, DOUBLE=5, BOOLEAN=6, WHITESPACE=7;
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
			null, "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "COLUMN", "STRING", "INTEGER", "DOUBLE", "BOOLEAN", "WHITESPACE"
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
	public String getGrammarFileName() { return "MyG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGParser(TokenStream input) {
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
	public static class IntegerExpContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(MyGParser.INTEGER, 0); }
		public IntegerExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColExpContext extends ExpressionContext {
		public TerminalNode COLUMN() { return getToken(MyGParser.COLUMN, 0); }
		public ColExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrExpContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MyGParser.STRING, 0); }
		public StrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MyGParser.BOOLEAN, 0); }
		public BoolExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleExpContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(MyGParser.DOUBLE, 0); }
		public DoubleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(7);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StrExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(4);
				match(STRING);
				}
				break;
			case COLUMN:
				_localctx = new ColExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(5);
				match(COLUMN);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(6);
				match(BOOLEAN);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007\n\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\b\b\u0000\u0001\u0000\u0000"+
		"\u0000\u0001\u0000\u0000\u0000\f\u0000\u0007\u0001\u0000\u0000\u0000\u0002"+
		"\b\u0005\u0004\u0000\u0000\u0003\b\u0005\u0005\u0000\u0000\u0004\b\u0005"+
		"\u0003\u0000\u0000\u0005\b\u0005\u0002\u0000\u0000\u0006\b\u0005\u0006"+
		"\u0000\u0000\u0007\u0002\u0001\u0000\u0000\u0000\u0007\u0003\u0001\u0000"+
		"\u0000\u0000\u0007\u0004\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000"+
		"\u0000\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000"+
		"\u0000\u0001\u0007";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}