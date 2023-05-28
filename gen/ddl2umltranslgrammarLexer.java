// Generated from C:/Users/johanlap21/Desktop/ddl2umltranslator/grammar\ddl2umltranslgrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ddl2umltranslgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ON=2, ADD=3, COLUMN=4, LPAREN=5, RPAREN=6, SEMICOLON=7, PRIMARY=8, 
		KEY=9, NOT=10, NULL=11, UNIQUE=12, CREATE=13, ALTER=14, DROP=15, TABLE=16, 
		INDEX=17, DATATYPE=18, IDENTIFIER=19, LINE_COMMENT=20, INT=21, DOUBLE=22, 
		NEWLINE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ON", "ADD", "COLUMN", "LPAREN", "RPAREN", "SEMICOLON", "PRIMARY", 
			"KEY", "NOT", "NULL", "UNIQUE", "CREATE", "ALTER", "DROP", "TABLE", "INDEX", 
			"DATATYPE", "IDENTIFIER", "LINE_COMMENT", "INT", "DOUBLE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'ON'", "'ADD'", "'COLUMN'", "'('", "')'", "';'", "'PRIMARY'", 
			"'KEY'", "'NOT'", "'NULL'", "'UNIQUE'", "'CREATE'", "'ALTER'", "'DROP'", 
			"'TABLE'", "'INDEX'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ON", "ADD", "COLUMN", "LPAREN", "RPAREN", "SEMICOLON", "PRIMARY", 
			"KEY", "NOT", "NULL", "UNIQUE", "CREATE", "ALTER", "DROP", "TABLE", "INDEX", 
			"DATATYPE", "IDENTIFIER", "LINE_COMMENT", "INT", "DOUBLE", "NEWLINE"
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


	public ddl2umltranslgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ddl2umltranslgrammar.g4"; }

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
		"\u0004\u0000\u0017\u00b3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u008a\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u008e\b\u0012\n\u0012\f\u0012\u0091\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0097\b\u0013\n\u0013\f\u0013"+
		"\u009a\t\u0013\u0001\u0014\u0004\u0014\u009d\b\u0014\u000b\u0014\f\u0014"+
		"\u009e\u0001\u0015\u0004\u0015\u00a2\b\u0015\u000b\u0015\f\u0015\u00a3"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u00a9\b\u0015\u000b\u0015"+
		"\f\u0015\u00aa\u0003\u0015\u00ad\b\u0015\u0001\u0016\u0003\u0016\u00b0"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\f\r\u0001\u000009\u0001\u0000"+
		"..\u00ba\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00054"+
		"\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t?\u0001\u0000"+
		"\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000"+
		"\u000fE\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013Q"+
		"\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000"+
		"\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000\u0000"+
		"\u001dn\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000\u0000!y\u0001"+
		"\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000%\u008b\u0001\u0000\u0000"+
		"\u0000\'\u0092\u0001\u0000\u0000\u0000)\u009c\u0001\u0000\u0000\u0000"+
		"+\u00a1\u0001\u0000\u0000\u0000-\u00af\u0001\u0000\u0000\u0000/0\u0005"+
		",\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005O\u0000\u000023\u0005"+
		"N\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005A\u0000\u000056\u0005"+
		"D\u0000\u000067\u0005D\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005"+
		"C\u0000\u00009:\u0005O\u0000\u0000:;\u0005L\u0000\u0000;<\u0005U\u0000"+
		"\u0000<=\u0005M\u0000\u0000=>\u0005N\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005(\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005)\u0000"+
		"\u0000B\f\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u000e\u0001\u0000"+
		"\u0000\u0000EF\u0005P\u0000\u0000FG\u0005R\u0000\u0000GH\u0005I\u0000"+
		"\u0000HI\u0005M\u0000\u0000IJ\u0005A\u0000\u0000JK\u0005R\u0000\u0000"+
		"KL\u0005Y\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0005K\u0000\u0000"+
		"NO\u0005E\u0000\u0000OP\u0005Y\u0000\u0000P\u0012\u0001\u0000\u0000\u0000"+
		"QR\u0005N\u0000\u0000RS\u0005O\u0000\u0000ST\u0005T\u0000\u0000T\u0014"+
		"\u0001\u0000\u0000\u0000UV\u0005N\u0000\u0000VW\u0005U\u0000\u0000WX\u0005"+
		"L\u0000\u0000XY\u0005L\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005"+
		"U\u0000\u0000[\\\u0005N\u0000\u0000\\]\u0005I\u0000\u0000]^\u0005Q\u0000"+
		"\u0000^_\u0005U\u0000\u0000_`\u0005E\u0000\u0000`\u0018\u0001\u0000\u0000"+
		"\u0000ab\u0005C\u0000\u0000bc\u0005R\u0000\u0000cd\u0005E\u0000\u0000"+
		"de\u0005A\u0000\u0000ef\u0005T\u0000\u0000fg\u0005E\u0000\u0000g\u001a"+
		"\u0001\u0000\u0000\u0000hi\u0005A\u0000\u0000ij\u0005L\u0000\u0000jk\u0005"+
		"T\u0000\u0000kl\u0005E\u0000\u0000lm\u0005R\u0000\u0000m\u001c\u0001\u0000"+
		"\u0000\u0000no\u0005D\u0000\u0000op\u0005R\u0000\u0000pq\u0005O\u0000"+
		"\u0000qr\u0005P\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005T\u0000"+
		"\u0000tu\u0005A\u0000\u0000uv\u0005B\u0000\u0000vw\u0005L\u0000\u0000"+
		"wx\u0005E\u0000\u0000x \u0001\u0000\u0000\u0000yz\u0005I\u0000\u0000z"+
		"{\u0005N\u0000\u0000{|\u0005D\u0000\u0000|}\u0005E\u0000\u0000}~\u0005"+
		"X\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0080\u0005I\u0000\u0000"+
		"\u0080\u0081\u0005N\u0000\u0000\u0081\u008a\u0005T\u0000\u0000\u0082\u0083"+
		"\u0005V\u0000\u0000\u0083\u0084\u0005A\u0000\u0000\u0084\u0085\u0005R"+
		"\u0000\u0000\u0085\u0086\u0005C\u0000\u0000\u0086\u0087\u0005H\u0000\u0000"+
		"\u0087\u0088\u0005A\u0000\u0000\u0088\u008a\u0005R\u0000\u0000\u0089\u007f"+
		"\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u008a$\u0001"+
		"\u0000\u0000\u0000\u008b\u008f\u0007\u0000\u0000\u0000\u008c\u008e\u0007"+
		"\u0001\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090&\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005-\u0000\u0000\u0093\u0094\u0005-\u0000\u0000"+
		"\u0094\u0098\u0001\u0000\u0000\u0000\u0095\u0097\b\u0002\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"(\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0007\u0003\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f*\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007"+
		"\u0003\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00ac\u0001\u0000\u0000\u0000\u00a5\u00ad\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0007\u0004\u0000\u0000\u00a7\u00a9\u0007"+
		"\u0003\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ad,\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0005\r\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\n\u0000\u0000\u00b2.\u0001\u0000\u0000\u0000"+
		"\t\u0000\u0089\u008f\u0098\u009e\u00a3\u00aa\u00ac\u00af\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}