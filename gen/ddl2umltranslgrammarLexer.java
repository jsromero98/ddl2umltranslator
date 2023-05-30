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
		T__0=1, T__1=2, DATATYPE=3, WS=4, EQ=5, EE=6, NEQ=7, GE=8, LE=9, GT=10, 
		LT=11, ON=12, INTERVAL=13, NOW=14, TIMEFRAME=15, AND=16, OR=17, DEFAULT=18, 
		ADD=19, COLUMN=20, LPAREN=21, RPAREN=22, MUL=23, DIV=24, PLUS=25, SUB=26, 
		SEMICOLON=27, PRIMARY=28, KEY=29, AS=30, SELECT=31, FROM=32, WHERE=33, 
		NOT=34, NULL=35, UNIQUE=36, CREATE=37, ALTER=38, DROP=39, TABLE=40, FOREIGN=41, 
		INDEX=42, SEQUENCE=43, CT=44, REFERENCES=45, VIEW=46, IDENTIFIER=47, LINE_COMMENT=48, 
		INTEG=49, DOUBLE=50, STRING=51, NEWLINE=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DATATYPE", "WS", "EQ", "EE", "NEQ", "GE", "LE", "GT", 
			"LT", "ON", "INTERVAL", "NOW", "TIMEFRAME", "AND", "OR", "DEFAULT", "ADD", 
			"COLUMN", "LPAREN", "RPAREN", "MUL", "DIV", "PLUS", "SUB", "SEMICOLON", 
			"PRIMARY", "KEY", "AS", "SELECT", "FROM", "WHERE", "NOT", "NULL", "UNIQUE", 
			"CREATE", "ALTER", "DROP", "TABLE", "FOREIGN", "INDEX", "SEQUENCE", "CT", 
			"REFERENCES", "VIEW", "IDENTIFIER", "LINE_COMMENT", "INTEG", "DOUBLE", 
			"STRING", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'''", null, null, "'='", "'=='", "'<>'", "'>='", "'<='", 
			"'>'", "'<'", "'ON'", "'INTERVAL'", "'NOW'", null, "'AND'", "'OR'", "'DEFAULT'", 
			"'ADD'", "'COLUMN'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "';'", 
			"'PRIMARY'", "'KEY'", "'AS'", "'SELECT'", "'FROM'", "'WHERE'", "'NOT'", 
			"'NULL'", "'UNIQUE'", "'CREATE'", "'ALTER'", "'DROP'", "'TABLE'", "'FOREIGN'", 
			"'INDEX'", "'SEQUENCE'", "'CURRENT_TIMESTAMP'", "'REFERENCES'", "'VIEW'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DATATYPE", "WS", "EQ", "EE", "NEQ", "GE", "LE", "GT", 
			"LT", "ON", "INTERVAL", "NOW", "TIMEFRAME", "AND", "OR", "DEFAULT", "ADD", 
			"COLUMN", "LPAREN", "RPAREN", "MUL", "DIV", "PLUS", "SUB", "SEMICOLON", 
			"PRIMARY", "KEY", "AS", "SELECT", "FROM", "WHERE", "NOT", "NULL", "UNIQUE", 
			"CREATE", "ALTER", "DROP", "TABLE", "FOREIGN", "INDEX", "SEQUENCE", "CT", 
			"REFERENCES", "VIEW", "IDENTIFIER", "LINE_COMMENT", "INTEG", "DOUBLE", 
			"STRING", "NEWLINE"
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
		"\u0004\u00004\u01b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0095"+
		"\b\u0002\u0001\u0003\u0004\u0003\u0098\b\u0003\u000b\u0003\f\u0003\u0099"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d6\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0005.\u0184\b.\n."+
		"\f.\u0187\t.\u0001/\u0001/\u0001/\u0001/\u0005/\u018d\b/\n/\f/\u0190\t"+
		"/\u00010\u00040\u0193\b0\u000b0\f0\u0194\u00011\u00041\u0198\b1\u000b"+
		"1\f1\u0199\u00011\u00011\u00011\u00041\u019f\b1\u000b1\f1\u01a0\u0003"+
		"1\u01a3\b1\u00012\u00012\u00052\u01a7\b2\n2\f2\u01aa\t2\u00012\u00012"+
		"\u00013\u00033\u01af\b3\u00013\u00013\u00053\u01b3\b3\n3\f3\u01b6\t3\u0000"+
		"\u00004\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4\u0001\u0000\u0007\u0003\u0000\t"+
		"\n\r\r  \u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\f\r\u0001"+
		"\u000009\u0001\u0000..\u0003\u0000\n\n\r\r\"\"\u01c9\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0001i\u0001\u0000\u0000\u0000\u0003k\u0001\u0000\u0000\u0000\u0005\u0094"+
		"\u0001\u0000\u0000\u0000\u0007\u0097\u0001\u0000\u0000\u0000\t\u009d\u0001"+
		"\u0000\u0000\u0000\u000b\u009f\u0001\u0000\u0000\u0000\r\u00a2\u0001\u0000"+
		"\u0000\u0000\u000f\u00a5\u0001\u0000\u0000\u0000\u0011\u00a8\u0001\u0000"+
		"\u0000\u0000\u0013\u00ab\u0001\u0000\u0000\u0000\u0015\u00ad\u0001\u0000"+
		"\u0000\u0000\u0017\u00af\u0001\u0000\u0000\u0000\u0019\u00b2\u0001\u0000"+
		"\u0000\u0000\u001b\u00bb\u0001\u0000\u0000\u0000\u001d\u00d5\u0001\u0000"+
		"\u0000\u0000\u001f\u00d7\u0001\u0000\u0000\u0000!\u00db\u0001\u0000\u0000"+
		"\u0000#\u00de\u0001\u0000\u0000\u0000%\u00e6\u0001\u0000\u0000\u0000\'"+
		"\u00ea\u0001\u0000\u0000\u0000)\u00f1\u0001\u0000\u0000\u0000+\u00f3\u0001"+
		"\u0000\u0000\u0000-\u00f5\u0001\u0000\u0000\u0000/\u00f7\u0001\u0000\u0000"+
		"\u00001\u00f9\u0001\u0000\u0000\u00003\u00fb\u0001\u0000\u0000\u00005"+
		"\u00fd\u0001\u0000\u0000\u00007\u00ff\u0001\u0000\u0000\u00009\u0107\u0001"+
		"\u0000\u0000\u0000;\u010b\u0001\u0000\u0000\u0000=\u010e\u0001\u0000\u0000"+
		"\u0000?\u0115\u0001\u0000\u0000\u0000A\u011a\u0001\u0000\u0000\u0000C"+
		"\u0120\u0001\u0000\u0000\u0000E\u0124\u0001\u0000\u0000\u0000G\u0129\u0001"+
		"\u0000\u0000\u0000I\u0130\u0001\u0000\u0000\u0000K\u0137\u0001\u0000\u0000"+
		"\u0000M\u013d\u0001\u0000\u0000\u0000O\u0142\u0001\u0000\u0000\u0000Q"+
		"\u0148\u0001\u0000\u0000\u0000S\u0150\u0001\u0000\u0000\u0000U\u0156\u0001"+
		"\u0000\u0000\u0000W\u015f\u0001\u0000\u0000\u0000Y\u0171\u0001\u0000\u0000"+
		"\u0000[\u017c\u0001\u0000\u0000\u0000]\u0181\u0001\u0000\u0000\u0000_"+
		"\u0188\u0001\u0000\u0000\u0000a\u0192\u0001\u0000\u0000\u0000c\u0197\u0001"+
		"\u0000\u0000\u0000e\u01a4\u0001\u0000\u0000\u0000g\u01ae\u0001\u0000\u0000"+
		"\u0000ij\u0005,\u0000\u0000j\u0002\u0001\u0000\u0000\u0000kl\u0005\'\u0000"+
		"\u0000l\u0004\u0001\u0000\u0000\u0000mn\u0005I\u0000\u0000no\u0005N\u0000"+
		"\u0000o\u0095\u0005T\u0000\u0000pq\u0005V\u0000\u0000qr\u0005A\u0000\u0000"+
		"rs\u0005R\u0000\u0000st\u0005C\u0000\u0000tu\u0005H\u0000\u0000uv\u0005"+
		"A\u0000\u0000v\u0095\u0005R\u0000\u0000wx\u0005B\u0000\u0000xy\u0005I"+
		"\u0000\u0000yz\u0005G\u0000\u0000z{\u0005I\u0000\u0000{|\u0005N\u0000"+
		"\u0000|\u0095\u0005T\u0000\u0000}~\u0005B\u0000\u0000~\u007f\u0005I\u0000"+
		"\u0000\u007f\u0080\u0005N\u0000\u0000\u0080\u0081\u0005A\u0000\u0000\u0081"+
		"\u0082\u0005R\u0000\u0000\u0082\u0095\u0005Y\u0000\u0000\u0083\u0084\u0005"+
		"B\u0000\u0000\u0084\u0085\u0005L\u0000\u0000\u0085\u0086\u0005O\u0000"+
		"\u0000\u0086\u0095\u0005B\u0000\u0000\u0087\u0088\u0005T\u0000\u0000\u0088"+
		"\u0089\u0005E\u0000\u0000\u0089\u008a\u0005X\u0000\u0000\u008a\u0095\u0005"+
		"T\u0000\u0000\u008b\u008c\u0005T\u0000\u0000\u008c\u008d\u0005I\u0000"+
		"\u0000\u008d\u008e\u0005M\u0000\u0000\u008e\u008f\u0005E\u0000\u0000\u008f"+
		"\u0090\u0005S\u0000\u0000\u0090\u0091\u0005T\u0000\u0000\u0091\u0092\u0005"+
		"A\u0000\u0000\u0092\u0093\u0005M\u0000\u0000\u0093\u0095\u0005P\u0000"+
		"\u0000\u0094m\u0001\u0000\u0000\u0000\u0094p\u0001\u0000\u0000\u0000\u0094"+
		"w\u0001\u0000\u0000\u0000\u0094}\u0001\u0000\u0000\u0000\u0094\u0083\u0001"+
		"\u0000\u0000\u0000\u0094\u0087\u0001\u0000\u0000\u0000\u0094\u008b\u0001"+
		"\u0000\u0000\u0000\u0095\u0006\u0001\u0000\u0000\u0000\u0096\u0098\u0007"+
		"\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006"+
		"\u0003\u0000\u0000\u009c\b\u0001\u0000\u0000\u0000\u009d\u009e\u0005="+
		"\u0000\u0000\u009e\n\u0001\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000"+
		"\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1\f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005<\u0000\u0000\u00a3\u00a4\u0005>\u0000\u0000\u00a4\u000e"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000\u00a6\u00a7\u0005"+
		"=\u0000\u0000\u00a7\u0010\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005<\u0000"+
		"\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u0012\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005>\u0000\u0000\u00ac\u0014\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005<\u0000\u0000\u00ae\u0016\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005O\u0000\u0000\u00b0\u00b1\u0005N\u0000\u0000\u00b1\u0018\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005I\u0000\u0000\u00b3\u00b4\u0005N\u0000\u0000"+
		"\u00b4\u00b5\u0005T\u0000\u0000\u00b5\u00b6\u0005E\u0000\u0000\u00b6\u00b7"+
		"\u0005R\u0000\u0000\u00b7\u00b8\u0005V\u0000\u0000\u00b8\u00b9\u0005A"+
		"\u0000\u0000\u00b9\u00ba\u0005L\u0000\u0000\u00ba\u001a\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005N\u0000\u0000\u00bc\u00bd\u0005O\u0000\u0000\u00bd"+
		"\u00be\u0005W\u0000\u0000\u00be\u001c\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005m\u0000\u0000\u00c0\u00c1\u0005i\u0000\u0000\u00c1\u00c2\u0005n"+
		"\u0000\u0000\u00c2\u00c3\u0005u\u0000\u0000\u00c3\u00c4\u0005t\u0000\u0000"+
		"\u00c4\u00c5\u0005e\u0000\u0000\u00c5\u00d6\u0005s\u0000\u0000\u00c6\u00c7"+
		"\u0005d\u0000\u0000\u00c7\u00c8\u0005a\u0000\u0000\u00c8\u00c9\u0005y"+
		"\u0000\u0000\u00c9\u00d6\u0005s\u0000\u0000\u00ca\u00cb\u0005m\u0000\u0000"+
		"\u00cb\u00cc\u0005o\u0000\u0000\u00cc\u00cd\u0005n\u0000\u0000\u00cd\u00ce"+
		"\u0005t\u0000\u0000\u00ce\u00cf\u0005h\u0000\u0000\u00cf\u00d6\u0005s"+
		"\u0000\u0000\u00d0\u00d1\u0005y\u0000\u0000\u00d1\u00d2\u0005e\u0000\u0000"+
		"\u00d2\u00d3\u0005a\u0000\u0000\u00d3\u00d4\u0005r\u0000\u0000\u00d4\u00d6"+
		"\u0005s\u0000\u0000\u00d5\u00bf\u0001\u0000\u0000\u0000\u00d5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d6\u001e\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"A\u0000\u0000\u00d8\u00d9\u0005N\u0000\u0000\u00d9\u00da\u0005D\u0000"+
		"\u0000\u00da \u0001\u0000\u0000\u0000\u00db\u00dc\u0005O\u0000\u0000\u00dc"+
		"\u00dd\u0005R\u0000\u0000\u00dd\"\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005D\u0000\u0000\u00df\u00e0\u0005E\u0000\u0000\u00e0\u00e1\u0005F"+
		"\u0000\u0000\u00e1\u00e2\u0005A\u0000\u0000\u00e2\u00e3\u0005U\u0000\u0000"+
		"\u00e3\u00e4\u0005L\u0000\u0000\u00e4\u00e5\u0005T\u0000\u0000\u00e5$"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005A\u0000\u0000\u00e7\u00e8\u0005"+
		"D\u0000\u0000\u00e8\u00e9\u0005D\u0000\u0000\u00e9&\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005C\u0000\u0000\u00eb\u00ec\u0005O\u0000\u0000\u00ec"+
		"\u00ed\u0005L\u0000\u0000\u00ed\u00ee\u0005U\u0000\u0000\u00ee\u00ef\u0005"+
		"M\u0000\u0000\u00ef\u00f0\u0005N\u0000\u0000\u00f0(\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005(\u0000\u0000\u00f2*\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005)\u0000\u0000\u00f4,\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"*\u0000\u0000\u00f6.\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005/\u0000"+
		"\u0000\u00f80\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005+\u0000\u0000\u00fa"+
		"2\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005-\u0000\u0000\u00fc4\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005;\u0000\u0000\u00fe6\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005P\u0000\u0000\u0100\u0101\u0005R\u0000\u0000\u0101"+
		"\u0102\u0005I\u0000\u0000\u0102\u0103\u0005M\u0000\u0000\u0103\u0104\u0005"+
		"A\u0000\u0000\u0104\u0105\u0005R\u0000\u0000\u0105\u0106\u0005Y\u0000"+
		"\u0000\u01068\u0001\u0000\u0000\u0000\u0107\u0108\u0005K\u0000\u0000\u0108"+
		"\u0109\u0005E\u0000\u0000\u0109\u010a\u0005Y\u0000\u0000\u010a:\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005A\u0000\u0000\u010c\u010d\u0005S\u0000"+
		"\u0000\u010d<\u0001\u0000\u0000\u0000\u010e\u010f\u0005S\u0000\u0000\u010f"+
		"\u0110\u0005E\u0000\u0000\u0110\u0111\u0005L\u0000\u0000\u0111\u0112\u0005"+
		"E\u0000\u0000\u0112\u0113\u0005C\u0000\u0000\u0113\u0114\u0005T\u0000"+
		"\u0000\u0114>\u0001\u0000\u0000\u0000\u0115\u0116\u0005F\u0000\u0000\u0116"+
		"\u0117\u0005R\u0000\u0000\u0117\u0118\u0005O\u0000\u0000\u0118\u0119\u0005"+
		"M\u0000\u0000\u0119@\u0001\u0000\u0000\u0000\u011a\u011b\u0005W\u0000"+
		"\u0000\u011b\u011c\u0005H\u0000\u0000\u011c\u011d\u0005E\u0000\u0000\u011d"+
		"\u011e\u0005R\u0000\u0000\u011e\u011f\u0005E\u0000\u0000\u011fB\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005N\u0000\u0000\u0121\u0122\u0005O\u0000"+
		"\u0000\u0122\u0123\u0005T\u0000\u0000\u0123D\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005N\u0000\u0000\u0125\u0126\u0005U\u0000\u0000\u0126\u0127\u0005"+
		"L\u0000\u0000\u0127\u0128\u0005L\u0000\u0000\u0128F\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0005U\u0000\u0000\u012a\u012b\u0005N\u0000\u0000\u012b"+
		"\u012c\u0005I\u0000\u0000\u012c\u012d\u0005Q\u0000\u0000\u012d\u012e\u0005"+
		"U\u0000\u0000\u012e\u012f\u0005E\u0000\u0000\u012fH\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005C\u0000\u0000\u0131\u0132\u0005R\u0000\u0000\u0132"+
		"\u0133\u0005E\u0000\u0000\u0133\u0134\u0005A\u0000\u0000\u0134\u0135\u0005"+
		"T\u0000\u0000\u0135\u0136\u0005E\u0000\u0000\u0136J\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005A\u0000\u0000\u0138\u0139\u0005L\u0000\u0000\u0139"+
		"\u013a\u0005T\u0000\u0000\u013a\u013b\u0005E\u0000\u0000\u013b\u013c\u0005"+
		"R\u0000\u0000\u013cL\u0001\u0000\u0000\u0000\u013d\u013e\u0005D\u0000"+
		"\u0000\u013e\u013f\u0005R\u0000\u0000\u013f\u0140\u0005O\u0000\u0000\u0140"+
		"\u0141\u0005P\u0000\u0000\u0141N\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"T\u0000\u0000\u0143\u0144\u0005A\u0000\u0000\u0144\u0145\u0005B\u0000"+
		"\u0000\u0145\u0146\u0005L\u0000\u0000\u0146\u0147\u0005E\u0000\u0000\u0147"+
		"P\u0001\u0000\u0000\u0000\u0148\u0149\u0005F\u0000\u0000\u0149\u014a\u0005"+
		"O\u0000\u0000\u014a\u014b\u0005R\u0000\u0000\u014b\u014c\u0005E\u0000"+
		"\u0000\u014c\u014d\u0005I\u0000\u0000\u014d\u014e\u0005G\u0000\u0000\u014e"+
		"\u014f\u0005N\u0000\u0000\u014fR\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"I\u0000\u0000\u0151\u0152\u0005N\u0000\u0000\u0152\u0153\u0005D\u0000"+
		"\u0000\u0153\u0154\u0005E\u0000\u0000\u0154\u0155\u0005X\u0000\u0000\u0155"+
		"T\u0001\u0000\u0000\u0000\u0156\u0157\u0005S\u0000\u0000\u0157\u0158\u0005"+
		"E\u0000\u0000\u0158\u0159\u0005Q\u0000\u0000\u0159\u015a\u0005U\u0000"+
		"\u0000\u015a\u015b\u0005E\u0000\u0000\u015b\u015c\u0005N\u0000\u0000\u015c"+
		"\u015d\u0005C\u0000\u0000\u015d\u015e\u0005E\u0000\u0000\u015eV\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005C\u0000\u0000\u0160\u0161\u0005U\u0000"+
		"\u0000\u0161\u0162\u0005R\u0000\u0000\u0162\u0163\u0005R\u0000\u0000\u0163"+
		"\u0164\u0005E\u0000\u0000\u0164\u0165\u0005N\u0000\u0000\u0165\u0166\u0005"+
		"T\u0000\u0000\u0166\u0167\u0005_\u0000\u0000\u0167\u0168\u0005T\u0000"+
		"\u0000\u0168\u0169\u0005I\u0000\u0000\u0169\u016a\u0005M\u0000\u0000\u016a"+
		"\u016b\u0005E\u0000\u0000\u016b\u016c\u0005S\u0000\u0000\u016c\u016d\u0005"+
		"T\u0000\u0000\u016d\u016e\u0005A\u0000\u0000\u016e\u016f\u0005M\u0000"+
		"\u0000\u016f\u0170\u0005P\u0000\u0000\u0170X\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005R\u0000\u0000\u0172\u0173\u0005E\u0000\u0000\u0173\u0174\u0005"+
		"F\u0000\u0000\u0174\u0175\u0005E\u0000\u0000\u0175\u0176\u0005R\u0000"+
		"\u0000\u0176\u0177\u0005E\u0000\u0000\u0177\u0178\u0005N\u0000\u0000\u0178"+
		"\u0179\u0005C\u0000\u0000\u0179\u017a\u0005E\u0000\u0000\u017a\u017b\u0005"+
		"S\u0000\u0000\u017bZ\u0001\u0000\u0000\u0000\u017c\u017d\u0005V\u0000"+
		"\u0000\u017d\u017e\u0005I\u0000\u0000\u017e\u017f\u0005E\u0000\u0000\u017f"+
		"\u0180\u0005W\u0000\u0000\u0180\\\u0001\u0000\u0000\u0000\u0181\u0185"+
		"\u0007\u0001\u0000\u0000\u0182\u0184\u0007\u0002\u0000\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186^\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"-\u0000\u0000\u0189\u018a\u0005-\u0000\u0000\u018a\u018e\u0001\u0000\u0000"+
		"\u0000\u018b\u018d\b\u0003\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0001\u0000\u0000\u0000\u018f`\u0001\u0000\u0000\u0000\u0190"+
		"\u018e\u0001\u0000\u0000\u0000\u0191\u0193\u0007\u0004\u0000\u0000\u0192"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"b\u0001\u0000\u0000\u0000\u0196\u0198\u0007\u0004\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01a2"+
		"\u0001\u0000\u0000\u0000\u019b\u01a3\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0007\u0005\u0000\u0000\u019d\u019f\u0007\u0004\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a2\u019b\u0001\u0000\u0000\u0000\u01a2\u019c"+
		"\u0001\u0000\u0000\u0000\u01a3d\u0001\u0000\u0000\u0000\u01a4\u01a8\u0005"+
		"\"\u0000\u0000\u01a5\u01a7\b\u0006\u0000\u0000\u01a6\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\"\u0000"+
		"\u0000\u01acf\u0001\u0000\u0000\u0000\u01ad\u01af\u0005\r\u0000\u0000"+
		"\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b4\u0005\n\u0000\u0000\u01b1"+
		"\u01b3\u0005 \u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5h\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\r\u0000\u0094\u0099\u00d5\u0185\u018e\u0194\u0199\u01a0"+
		"\u01a2\u01a8\u01ae\u01b4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}