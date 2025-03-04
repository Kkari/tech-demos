// Generated from /Users/kari/HobbyProjects/react-ts-antlr-demo/rules-engine/VR.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NOT=17, 
		COLUMN=18, STRING=19, INTEGER=20, DOUBLE=21, BOOLEAN=22, WHITESPACE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LETTER", 
			"DIGIT", "NOT", "COLUMN", "STRING", "INTEGER", "DOUBLE", "BOOLEAN", "WHITESPACE"
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


	public VRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00c4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0004\u0013\u008e"+
		"\b\u0013\u000b\u0013\f\u0013\u008f\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0096\b\u0014\n\u0014\f\u0014\u0099\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u009e\b\u0015\u0001\u0015\u0004"+
		"\u0015\u00a1\b\u0015\u000b\u0015\f\u0015\u00a2\u0001\u0016\u0003\u0016"+
		"\u00a6\b\u0016\u0001\u0016\u0004\u0016\u00a9\b\u0016\u000b\u0016\f\u0016"+
		"\u00aa\u0001\u0016\u0001\u0016\u0004\u0016\u00af\b\u0016\u000b\u0016\f"+
		"\u0016\u00b0\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00bc\b\u0017"+
		"\u0001\u0018\u0004\u0018\u00bf\b\u0018\u000b\u0018\f\u0018\u00c0\u0001"+
		"\u0018\u0001\u0018\u0002\u008f\u0097\u0000\u0019\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000"+
		"#\u0000%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u0017\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00ca\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013"+
		"\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000"+
		"\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000"+
		"\u000bD\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fU\u0001"+
		"\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000"+
		"\u0000\u0015m\u0001\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019"+
		"x\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d|\u0001"+
		"\u0000\u0000\u0000\u001f\u0080\u0001\u0000\u0000\u0000!\u0083\u0001\u0000"+
		"\u0000\u0000#\u0085\u0001\u0000\u0000\u0000%\u0087\u0001\u0000\u0000\u0000"+
		"\'\u008b\u0001\u0000\u0000\u0000)\u0093\u0001\u0000\u0000\u0000+\u009d"+
		"\u0001\u0000\u0000\u0000-\u00a5\u0001\u0000\u0000\u0000/\u00bb\u0001\u0000"+
		"\u0000\u00001\u00be\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\u0002"+
		"\u0001\u0000\u0000\u000056\u0005)\u0000\u00006\u0004\u0001\u0000\u0000"+
		"\u000078\u0005I\u0000\u000089\u0005F\u0000\u00009\u0006\u0001\u0000\u0000"+
		"\u0000:;\u0005T\u0000\u0000;<\u0005H\u0000\u0000<=\u0005E\u0000\u0000"+
		"=>\u0005N\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005E\u0000\u0000"+
		"@A\u0005L\u0000\u0000AB\u0005S\u0000\u0000BC\u0005E\u0000\u0000C\n\u0001"+
		"\u0000\u0000\u0000DE\u0005L\u0000\u0000EF\u0005O\u0000\u0000FG\u0005W"+
		"\u0000\u0000GH\u0005E\u0000\u0000HI\u0005R\u0000\u0000IJ\u0005(\u0000"+
		"\u0000J\f\u0001\u0000\u0000\u0000KL\u0005I\u0000\u0000LM\u0005S\u0000"+
		"\u0000MN\u0005N\u0000\u0000NO\u0005U\u0000\u0000OP\u0005M\u0000\u0000"+
		"PQ\u0005B\u0000\u0000QR\u0005E\u0000\u0000RS\u0005R\u0000\u0000ST\u0005"+
		"(\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005E\u0000\u0000VW\u0005"+
		"Q\u0000\u0000WX\u0005U\u0000\u0000XY\u0005A\u0000\u0000YZ\u0005L\u0000"+
		"\u0000Z[\u0005S\u0000\u0000[\\\u0005_\u0000\u0000\\]\u0005I\u0000\u0000"+
		"]^\u0005G\u0000\u0000^_\u0005N\u0000\u0000_`\u0005O\u0000\u0000`a\u0005"+
		"R\u0000\u0000ab\u0005E\u0000\u0000bc\u0005_\u0000\u0000cd\u0005C\u0000"+
		"\u0000de\u0005A\u0000\u0000ef\u0005S\u0000\u0000fg\u0005E\u0000\u0000"+
		"gh\u0005(\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005,\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000kl\u0005+\u0000\u0000l\u0014\u0001\u0000"+
		"\u0000\u0000mn\u0005-\u0000\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005"+
		"I\u0000\u0000pq\u0005N\u0000\u0000qr\u0005 \u0000\u0000rs\u0005L\u0000"+
		"\u0000st\u0005I\u0000\u0000tu\u0005S\u0000\u0000uv\u0005T\u0000\u0000"+
		"vw\u0005(\u0000\u0000w\u0018\u0001\u0000\u0000\u0000xy\u0005=\u0000\u0000"+
		"y\u001a\u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{\u001c\u0001\u0000"+
		"\u0000\u0000|}\u0005A\u0000\u0000}~\u0005N\u0000\u0000~\u007f\u0005D\u0000"+
		"\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005O\u0000\u0000"+
		"\u0081\u0082\u0005R\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0007\u0000\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085\u0086\u0007"+
		"\u0001\u0000\u0000\u0086$\u0001\u0000\u0000\u0000\u0087\u0088\u0005N\u0000"+
		"\u0000\u0088\u0089\u0005O\u0000\u0000\u0089\u008a\u0005T\u0000\u0000\u008a"+
		"&\u0001\u0000\u0000\u0000\u008b\u008d\u0005\'\u0000\u0000\u008c\u008e"+
		"\t\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\'\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093\u0097\u0005\"\u0000"+
		"\u0000\u0094\u0096\t\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\"\u0000\u0000\u009b"+
		"*\u0001\u0000\u0000\u0000\u009c\u009e\u0005-\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0003#\u0011\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3,\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005-\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0003#\u0011\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0005.\u0000\u0000\u00ad\u00af\u0003#\u0011\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1.\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005T\u0000\u0000\u00b3\u00b4\u0005R\u0000\u0000"+
		"\u00b4\u00b5\u0005U\u0000\u0000\u00b5\u00bc\u0005E\u0000\u0000\u00b6\u00b7"+
		"\u0005F\u0000\u0000\u00b7\u00b8\u0005A\u0000\u0000\u00b8\u00b9\u0005L"+
		"\u0000\u0000\u00b9\u00ba\u0005S\u0000\u0000\u00ba\u00bc\u0005E\u0000\u0000"+
		"\u00bb\u00b2\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bc0\u0001\u0000\u0000\u0000\u00bd\u00bf\u0007\u0002\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\u0018\u0000\u0000\u00c3"+
		"2\u0001\u0000\u0000\u0000\n\u0000\u008f\u0097\u009d\u00a2\u00a5\u00aa"+
		"\u00b0\u00bb\u00c0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}