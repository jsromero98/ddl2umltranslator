// Generated from C:/Users/johanlap21/Desktop/ddl2umltranslator/grammar\ddl2umltranslgrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ddl2umltranslgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DATATYPE=4, WS=5, EQ=6, EE=7, NEQ=8, GE=9, LE=10, 
		GT=11, LT=12, ON=13, INTERVAL=14, NOW=15, TIMEFRAME=16, AND=17, OR=18, 
		DEFAULT=19, ADD=20, COLUMN=21, LPAREN=22, RPAREN=23, MUL=24, DIV=25, PLUS=26, 
		SUB=27, SEMICOLON=28, PRIMARY=29, KEY=30, AS=31, SELECT=32, FROM=33, WHERE=34, 
		NOT=35, NULL=36, UNIQUE=37, CREATE=38, ALTER=39, DROP=40, TABLE=41, FOREIGN=42, 
		INDEX=43, SEQUENCE=44, CT=45, REFERENCES=46, VIEW=47, IDENTIFIER=48, LINE_COMMENT=49, 
		INTEG=50, DOUBLE=51, STRING=52, NEWLINE=53;
	public static final int
		RULE_inicio = 0, RULE_block = 1, RULE_ddlStatement = 2, RULE_createTableStatement = 3, 
		RULE_createViewStatement = 4, RULE_sqlStatement = 5, RULE_exprand = 6, 
		RULE_expror = 7, RULE_compexpr = 8, RULE_arithexpr = 9, RULE_term = 10, 
		RULE_factor = 11, RULE_atom = 12, RULE_alterTableStatement = 13, RULE_dropTableStatement = 14, 
		RULE_createIndexStatement = 15, RULE_createSequenceStatement = 16, RULE_dropIndexStatement = 17, 
		RULE_alterTableAction = 18, RULE_columnDefinition = 19, RULE_foreignKeyDefiniton = 20, 
		RULE_constraint = 21, RULE_columnName = 22, RULE_tableName = 23, RULE_indexName = 24, 
		RULE_functionName = 25, RULE_datatype = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "block", "ddlStatement", "createTableStatement", "createViewStatement", 
			"sqlStatement", "exprand", "expror", "compexpr", "arithexpr", "term", 
			"factor", "atom", "alterTableStatement", "dropTableStatement", "createIndexStatement", 
			"createSequenceStatement", "dropIndexStatement", "alterTableAction", 
			"columnDefinition", "foreignKeyDefiniton", "constraint", "columnName", 
			"tableName", "indexName", "functionName", "datatype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'`'", "'''", null, null, "'='", "'=='", "'<>'", "'>='", 
			"'<='", "'>'", "'<'", "'ON'", "'INTERVAL'", "'NOW'", null, "'AND'", "'OR'", 
			"'DEFAULT'", "'ADD'", "'COLUMN'", "'('", "')'", "'*'", "'/'", "'+'", 
			"'-'", "';'", "'PRIMARY'", "'KEY'", "'AS'", "'SELECT'", "'FROM'", "'WHERE'", 
			"'NOT'", "'NULL'", "'UNIQUE'", "'CREATE'", "'ALTER'", "'DROP'", "'TABLE'", 
			"'FOREIGN'", "'INDEX'", "'SEQUENCE'", "'CURRENT_TIMESTAMP'", "'REFERENCES'", 
			"'VIEW'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "DATATYPE", "WS", "EQ", "EE", "NEQ", "GE", "LE", 
			"GT", "LT", "ON", "INTERVAL", "NOW", "TIMEFRAME", "AND", "OR", "DEFAULT", 
			"ADD", "COLUMN", "LPAREN", "RPAREN", "MUL", "DIV", "PLUS", "SUB", "SEMICOLON", 
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

	@Override
	public String getGrammarFileName() { return "ddl2umltranslgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ddl2umltranslgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ddl2umltranslgrammarParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			block();
			setState(55);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<DdlStatementContext> ddlStatement() {
			return getRuleContexts(DdlStatementContext.class);
		}
		public DdlStatementContext ddlStatement(int i) {
			return getRuleContext(DdlStatementContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(ddl2umltranslgrammarParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(ddl2umltranslgrammarParser.EOF, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ddl2umltranslgrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ddl2umltranslgrammarParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098769920L) != 0)) {
				{
				{
				setState(57);
				ddlStatement();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(58);
						match(NEWLINE);
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(64);
					match(EOF);
					}
					break;
				}
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdlStatementContext extends ParserRuleContext {
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public AlterTableStatementContext alterTableStatement() {
			return getRuleContext(AlterTableStatementContext.class,0);
		}
		public DropTableStatementContext dropTableStatement() {
			return getRuleContext(DropTableStatementContext.class,0);
		}
		public CreateIndexStatementContext createIndexStatement() {
			return getRuleContext(CreateIndexStatementContext.class,0);
		}
		public DropIndexStatementContext dropIndexStatement() {
			return getRuleContext(DropIndexStatementContext.class,0);
		}
		public CreateViewStatementContext createViewStatement() {
			return getRuleContext(CreateViewStatementContext.class,0);
		}
		public CreateSequenceStatementContext createSequenceStatement() {
			return getRuleContext(CreateSequenceStatementContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(ddl2umltranslgrammarParser.LINE_COMMENT, 0); }
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitDdlStatement(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddlStatement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				alterTableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				dropTableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				createIndexStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				dropIndexStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				createViewStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				createSequenceStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(LINE_COMMENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddl2umltranslgrammarParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ddl2umltranslgrammarParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ddl2umltranslgrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public List<ForeignKeyDefinitonContext> foreignKeyDefiniton() {
			return getRuleContexts(ForeignKeyDefinitonContext.class);
		}
		public ForeignKeyDefinitonContext foreignKeyDefiniton(int i) {
			return getRuleContext(ForeignKeyDefinitonContext.class,i);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitCreateTableStatement(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTableStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CREATE);
			setState(83);
			match(TABLE);
			setState(84);
			tableName();
			setState(85);
			match(LPAREN);
			setState(86);
			columnDefinition();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(T__0);
					setState(88);
					columnDefinition();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(94);
				match(T__0);
				setState(95);
				foreignKeyDefiniton();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RPAREN);
			setState(102);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddl2umltranslgrammarParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ddl2umltranslgrammarParser.VIEW, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ddl2umltranslgrammarParser.AS, 0); }
		public SqlStatementContext sqlStatement() {
			return getRuleContext(SqlStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public CreateViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterCreateViewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitCreateViewStatement(this);
		}
	}

	public final CreateViewStatementContext createViewStatement() throws RecognitionException {
		CreateViewStatementContext _localctx = new CreateViewStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createViewStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CREATE);
			setState(105);
			match(VIEW);
			setState(106);
			tableName();
			setState(107);
			match(AS);
			setState(108);
			sqlStatement();
			setState(109);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ddl2umltranslgrammarParser.SELECT, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ddl2umltranslgrammarParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ddl2umltranslgrammarParser.WHERE, 0); }
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitSqlStatement(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sqlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SELECT);
			setState(112);
			columnName();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(113);
				match(T__0);
				setState(114);
				columnName();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(FROM);
			setState(121);
			tableName();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(122);
				match(WHERE);
				setState(123);
				exprand();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprandContext extends ParserRuleContext {
		public List<ExprorContext> expror() {
			return getRuleContexts(ExprorContext.class);
		}
		public ExprorContext expror(int i) {
			return getRuleContext(ExprorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ddl2umltranslgrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ddl2umltranslgrammarParser.AND, i);
		}
		public ExprandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterExprand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitExprand(this);
		}
	}

	public final ExprandContext exprand() throws RecognitionException {
		ExprandContext _localctx = new ExprandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expror();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(127);
				match(AND);
				setState(128);
				expror();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprorContext extends ParserRuleContext {
		public List<CompexprContext> compexpr() {
			return getRuleContexts(CompexprContext.class);
		}
		public CompexprContext compexpr(int i) {
			return getRuleContext(CompexprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ddl2umltranslgrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ddl2umltranslgrammarParser.OR, i);
		}
		public ExprorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expror; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterExpror(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitExpror(this);
		}
	}

	public final ExprorContext expror() throws RecognitionException {
		ExprorContext _localctx = new ExprorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expror);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			compexpr();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(135);
				match(OR);
				setState(136);
				compexpr();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompexprContext extends ParserRuleContext {
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ddl2umltranslgrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ddl2umltranslgrammarParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(ddl2umltranslgrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(ddl2umltranslgrammarParser.GT, 0); }
		public TerminalNode LE() { return getToken(ddl2umltranslgrammarParser.LE, 0); }
		public TerminalNode GE() { return getToken(ddl2umltranslgrammarParser.GE, 0); }
		public CompexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterCompexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitCompexpr(this);
		}
	}

	public final CompexprContext compexpr() throws RecognitionException {
		CompexprContext _localctx = new CompexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			arithexpr(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8000L) != 0)) {
				{
				setState(143);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8000L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				arithexpr(0);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithexprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ddl2umltranslgrammarParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ddl2umltranslgrammarParser.SUB, 0); }
		public ArithexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterArithexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitArithexpr(this);
		}
	}

	public final ArithexprContext arithexpr() throws RecognitionException {
		return arithexpr(0);
	}

	private ArithexprContext arithexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithexprContext _localctx = new ArithexprContext(_ctx, _parentState);
		ArithexprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(152);
					term(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ddl2umltranslgrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ddl2umltranslgrammarParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(163);
					factor();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ddl2umltranslgrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ddl2umltranslgrammarParser.SUB, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				atom();
				}
				break;
			case T__1:
			case INTERVAL:
			case NOW:
			case LPAREN:
			case IDENTIFIER:
			case INTEG:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				atom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode INTEG() { return getToken(ddl2umltranslgrammarParser.INTEG, 0); }
		public TerminalNode DOUBLE() { return getToken(ddl2umltranslgrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(ddl2umltranslgrammarParser.STRING, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ddl2umltranslgrammarParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				columnName();
				}
				break;
			case INTEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(INTEG);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(STRING);
				}
				break;
			case INTERVAL:
			case NOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				functionName();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(LPAREN);
				setState(180);
				exprand();
				setState(181);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ddl2umltranslgrammarParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ddl2umltranslgrammarParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTableActionContext alterTableAction() {
			return getRuleContext(AlterTableActionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public AlterTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterAlterTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitAlterTableStatement(this);
		}
	}

	public final AlterTableStatementContext alterTableStatement() throws RecognitionException {
		AlterTableStatementContext _localctx = new AlterTableStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alterTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ALTER);
			setState(186);
			match(TABLE);
			setState(187);
			tableName();
			setState(188);
			alterTableAction();
			setState(189);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ddl2umltranslgrammarParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ddl2umltranslgrammarParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public DropTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterDropTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitDropTableStatement(this);
		}
	}

	public final DropTableStatementContext dropTableStatement() throws RecognitionException {
		DropTableStatementContext _localctx = new DropTableStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dropTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DROP);
			setState(192);
			match(TABLE);
			setState(193);
			tableName();
			setState(194);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddl2umltranslgrammarParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(ddl2umltranslgrammarParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(ddl2umltranslgrammarParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ddl2umltranslgrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public CreateIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterCreateIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitCreateIndexStatement(this);
		}
	}

	public final CreateIndexStatementContext createIndexStatement() throws RecognitionException {
		CreateIndexStatementContext _localctx = new CreateIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(CREATE);
			setState(197);
			match(INDEX);
			setState(198);
			indexName();
			setState(199);
			match(ON);
			setState(200);
			tableName();
			setState(201);
			match(LPAREN);
			setState(202);
			columnName();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(203);
				match(T__0);
				setState(204);
				columnName();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(RPAREN);
			setState(211);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateSequenceStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddl2umltranslgrammarParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(ddl2umltranslgrammarParser.SEQUENCE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ddl2umltranslgrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public CreateSequenceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequenceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterCreateSequenceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitCreateSequenceStatement(this);
		}
	}

	public final CreateSequenceStatementContext createSequenceStatement() throws RecognitionException {
		CreateSequenceStatementContext _localctx = new CreateSequenceStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createSequenceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(CREATE);
			setState(214);
			match(SEQUENCE);
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ddl2umltranslgrammarParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ddl2umltranslgrammarParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ddl2umltranslgrammarParser.SEMICOLON, 0); }
		public DropIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterDropIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitDropIndexStatement(this);
		}
	}

	public final DropIndexStatementContext dropIndexStatement() throws RecognitionException {
		DropIndexStatementContext _localctx = new DropIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dropIndexStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(DROP);
			setState(219);
			match(INDEX);
			setState(220);
			indexName();
			setState(221);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ddl2umltranslgrammarParser.ADD, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(ddl2umltranslgrammarParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(ddl2umltranslgrammarParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(ddl2umltranslgrammarParser.DROP, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterAlterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitAlterTableAction(this);
		}
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alterTableAction);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ADD);
				setState(224);
				columnName();
				setState(225);
				datatype();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ALTER);
				setState(228);
				match(COLUMN);
				setState(229);
				columnName();
				setState(230);
				datatype();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(DROP);
				setState(233);
				match(COLUMN);
				setState(234);
				columnName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitColumnDefinition(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			columnName();
			setState(238);
			datatype();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35356708175872L) != 0)) {
				{
				{
				setState(239);
				constraint();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyDefinitonContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(ddl2umltranslgrammarParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(ddl2umltranslgrammarParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ddl2umltranslgrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ddl2umltranslgrammarParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ddl2umltranslgrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ddl2umltranslgrammarParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(ddl2umltranslgrammarParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ForeignKeyDefinitonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyDefiniton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterForeignKeyDefiniton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitForeignKeyDefiniton(this);
		}
	}

	public final ForeignKeyDefinitonContext foreignKeyDefiniton() throws RecognitionException {
		ForeignKeyDefinitonContext _localctx = new ForeignKeyDefinitonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_foreignKeyDefiniton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(FOREIGN);
			setState(246);
			match(KEY);
			setState(247);
			match(LPAREN);
			setState(248);
			columnName();
			setState(249);
			match(RPAREN);
			setState(250);
			match(REFERENCES);
			setState(251);
			tableName();
			setState(252);
			match(LPAREN);
			setState(253);
			columnName();
			setState(254);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ddl2umltranslgrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ddl2umltranslgrammarParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(ddl2umltranslgrammarParser.UNIQUE, 0); }
		public TerminalNode NOT() { return getToken(ddl2umltranslgrammarParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ddl2umltranslgrammarParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(ddl2umltranslgrammarParser.DEFAULT, 0); }
		public TerminalNode CT() { return getToken(ddl2umltranslgrammarParser.CT, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constraint);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(PRIMARY);
				setState(257);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(NOT);
				setState(260);
				match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(DEFAULT);
				}
				break;
			case CT:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(CT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ddl2umltranslgrammarParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_columnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(265);
				match(T__1);
				}
			}

			setState(268);
			match(IDENTIFIER);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269);
				match(T__1);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ddl2umltranslgrammarParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ddl2umltranslgrammarParser.IDENTIFIER, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitIndexName(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode NOW() { return getToken(ddl2umltranslgrammarParser.NOW, 0); }
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ddl2umltranslgrammarParser.RPAREN, 0); }
		public TerminalNode INTERVAL() { return getToken(ddl2umltranslgrammarParser.INTERVAL, 0); }
		public TerminalNode INTEG() { return getToken(ddl2umltranslgrammarParser.INTEG, 0); }
		public TerminalNode TIMEFRAME() { return getToken(ddl2umltranslgrammarParser.TIMEFRAME, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionName);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(NOW);
				setState(277);
				match(LPAREN);
				setState(278);
				match(RPAREN);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(INTERVAL);
				setState(280);
				match(T__2);
				setState(281);
				match(INTEG);
				setState(282);
				match(TIMEFRAME);
				setState(283);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(ddl2umltranslgrammarParser.DATATYPE, 0); }
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public TerminalNode INTEG() { return getToken(ddl2umltranslgrammarParser.INTEG, 0); }
		public TerminalNode RPAREN() { return getToken(ddl2umltranslgrammarParser.RPAREN, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ddl2umltranslgrammarListener ) ((ddl2umltranslgrammarListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(DATATYPE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(287);
				match(LPAREN);
				setState(288);
				match(INTEG);
				setState(289);
				match(RPAREN);
				}
			}

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
		case 9:
			return arithexpr_sempred((ArithexprContext)_localctx, predIndex);
		case 10:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithexpr_sempred(ArithexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0125\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001"+
		"?\t\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0005\u0001D\b\u0001\n\u0001"+
		"\f\u0001G\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003Z\b\u0003\n\u0003\f\u0003]\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0082\b\u0006\n\u0006\f\u0006\u0085\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008a\b\u0007\n\u0007"+
		"\f\u0007\u008d\t\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0092\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009a\b\t\n\t\f\t\u009d"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a5\b\n"+
		"\n\n\f\n\u00a8\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ad"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b8\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00ce\b\u000f\n\u000f\f\u000f\u00d1"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00f1\b\u0013\n\u0013\f\u0013\u00f4\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0108\b\u0015\u0001\u0016\u0003\u0016\u010b\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u010f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011d\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0123\b\u001a\u0001\u001a\u0000"+
		"\u0002\u0012\u0014\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0004\u0002\u0000"+
		"\u0006\u0006\b\f\u0001\u0000\u001a\u001b\u0001\u0000\u0018\u0019\u0002"+
		"\u0000\u0014\u0014\u001b\u001b\u012e\u00006\u0001\u0000\u0000\u0000\u0002"+
		"E\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006R\u0001"+
		"\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000"+
		"\f~\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010"+
		"\u008e\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014"+
		"\u009e\u0001\u0000\u0000\u0000\u0016\u00ac\u0001\u0000\u0000\u0000\u0018"+
		"\u00b7\u0001\u0000\u0000\u0000\u001a\u00b9\u0001\u0000\u0000\u0000\u001c"+
		"\u00bf\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00d5"+
		"\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00eb\u0001"+
		"\u0000\u0000\u0000&\u00ed\u0001\u0000\u0000\u0000(\u00f5\u0001\u0000\u0000"+
		"\u0000*\u0107\u0001\u0000\u0000\u0000,\u010a\u0001\u0000\u0000\u0000."+
		"\u0110\u0001\u0000\u0000\u00000\u0112\u0001\u0000\u0000\u00002\u011c\u0001"+
		"\u0000\u0000\u00004\u011e\u0001\u0000\u0000\u000067\u0003\u0002\u0001"+
		"\u000078\u0005\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009A\u0003"+
		"\u0004\u0002\u0000:<\u00055\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">B\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0005\u0000\u0000"+
		"\u0001A=\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000C9\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0003\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HQ\u0003\u0006\u0003\u0000IQ\u0003\u001a"+
		"\r\u0000JQ\u0003\u001c\u000e\u0000KQ\u0003\u001e\u000f\u0000LQ\u0003\""+
		"\u0011\u0000MQ\u0003\b\u0004\u0000NQ\u0003 \u0010\u0000OQ\u00051\u0000"+
		"\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PJ\u0001\u0000"+
		"\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"Q\u0005\u0001\u0000\u0000\u0000RS\u0005&\u0000\u0000ST\u0005)\u0000\u0000"+
		"TU\u0003.\u0017\u0000UV\u0005\u0016\u0000\u0000V[\u0003&\u0013\u0000W"+
		"X\u0005\u0001\u0000\u0000XZ\u0003&\u0013\u0000YW\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\b\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0001"+
		"\u0000\u0000_a\u0003(\u0014\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0017\u0000\u0000"+
		"fg\u0005\u001c\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005&\u0000"+
		"\u0000ij\u0005/\u0000\u0000jk\u0003.\u0017\u0000kl\u0005\u001f\u0000\u0000"+
		"lm\u0003\n\u0005\u0000mn\u0005\u001c\u0000\u0000n\t\u0001\u0000\u0000"+
		"\u0000op\u0005 \u0000\u0000pu\u0003,\u0016\u0000qr\u0005\u0001\u0000\u0000"+
		"rt\u0003,\u0016\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0005!\u0000\u0000y|\u0003.\u0017\u0000"+
		"z{\u0005\"\u0000\u0000{}\u0003\f\u0006\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u000b\u0001\u0000\u0000\u0000~\u0083\u0003"+
		"\u000e\u0007\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0082\u0003"+
		"\u000e\u0007\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u008b\u0003\u0010\b\u0000\u0087\u0088\u0005\u0012\u0000"+
		"\u0000\u0088\u008a\u0003\u0010\b\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u000f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0003\u0012\t\u0000\u008f"+
		"\u0090\u0007\u0000\u0000\u0000\u0090\u0092\u0003\u0012\t\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0011"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0006\t\uffff\uffff\u0000\u0094\u0095"+
		"\u0003\u0014\n\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\n"+
		"\u0002\u0000\u0000\u0097\u0098\u0007\u0001\u0000\u0000\u0098\u009a\u0003"+
		"\u0014\n\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0006\n\uffff\uffff\u0000\u009f\u00a0\u0003\u0016"+
		"\u000b\u0000\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0002\u0000"+
		"\u0000\u00a2\u00a3\u0007\u0002\u0000\u0000\u00a3\u00a5\u0003\u0016\u000b"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0003\u0000\u0000\u00aa\u00ad\u0003\u0018\f\u0000"+
		"\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b8\u0003,\u0016\u0000\u00af\u00b8\u00052\u0000\u0000\u00b0\u00b8\u0005"+
		"3\u0000\u0000\u00b1\u00b8\u00054\u0000\u0000\u00b2\u00b8\u00032\u0019"+
		"\u0000\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b5\u0003\f\u0006\u0000"+
		"\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b8\u0019\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\'\u0000\u0000\u00ba"+
		"\u00bb\u0005)\u0000\u0000\u00bb\u00bc\u0003.\u0017\u0000\u00bc\u00bd\u0003"+
		"$\u0012\u0000\u00bd\u00be\u0005\u001c\u0000\u0000\u00be\u001b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005(\u0000\u0000\u00c0\u00c1\u0005)\u0000\u0000"+
		"\u00c1\u00c2\u0003.\u0017\u0000\u00c2\u00c3\u0005\u001c\u0000\u0000\u00c3"+
		"\u001d\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u00c6"+
		"\u0005+\u0000\u0000\u00c6\u00c7\u00030\u0018\u0000\u00c7\u00c8\u0005\r"+
		"\u0000\u0000\u00c8\u00c9\u0003.\u0017\u0000\u00c9\u00ca\u0005\u0016\u0000"+
		"\u0000\u00ca\u00cf\u0003,\u0016\u0000\u00cb\u00cc\u0005\u0001\u0000\u0000"+
		"\u00cc\u00ce\u0003,\u0016\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0017\u0000\u0000\u00d3"+
		"\u00d4\u0005\u001c\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005&\u0000\u0000\u00d6\u00d7\u0005,\u0000\u0000\u00d7\u00d8\u0005"+
		"0\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9!\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005(\u0000\u0000\u00db\u00dc\u0005+\u0000\u0000\u00dc"+
		"\u00dd\u00030\u0018\u0000\u00dd\u00de\u0005\u001c\u0000\u0000\u00de#\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\u0014\u0000\u0000\u00e0\u00e1\u0003"+
		",\u0016\u0000\u00e1\u00e2\u00034\u001a\u0000\u00e2\u00ec\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\'\u0000\u0000\u00e4\u00e5\u0005\u0015\u0000\u0000"+
		"\u00e5\u00e6\u0003,\u0016\u0000\u00e6\u00e7\u00034\u001a\u0000\u00e7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005(\u0000\u0000\u00e9\u00ea\u0005"+
		"\u0015\u0000\u0000\u00ea\u00ec\u0003,\u0016\u0000\u00eb\u00df\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003,\u0016\u0000"+
		"\u00ee\u00f2\u00034\u001a\u0000\u00ef\u00f1\u0003*\u0015\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\'\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"*\u0000\u0000\u00f6\u00f7\u0005\u001e\u0000\u0000\u00f7\u00f8\u0005\u0016"+
		"\u0000\u0000\u00f8\u00f9\u0003,\u0016\u0000\u00f9\u00fa\u0005\u0017\u0000"+
		"\u0000\u00fa\u00fb\u0005.\u0000\u0000\u00fb\u00fc\u0003.\u0017\u0000\u00fc"+
		"\u00fd\u0005\u0016\u0000\u0000\u00fd\u00fe\u0003,\u0016\u0000\u00fe\u00ff"+
		"\u0005\u0017\u0000\u0000\u00ff)\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\u001d\u0000\u0000\u0101\u0108\u0005\u001e\u0000\u0000\u0102\u0108\u0005"+
		"%\u0000\u0000\u0103\u0104\u0005#\u0000\u0000\u0104\u0108\u0005$\u0000"+
		"\u0000\u0105\u0108\u0005\u0013\u0000\u0000\u0106\u0108\u0005-\u0000\u0000"+
		"\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000\u0000"+
		"\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108+\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0005\u0002\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u00050\u0000\u0000\u010d\u010f\u0005\u0002\u0000\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f-\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u00050\u0000\u0000\u0111/\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u00050\u0000\u0000\u01131\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005\u000f\u0000\u0000\u0115\u0116\u0005\u0016\u0000\u0000\u0116"+
		"\u011d\u0005\u0017\u0000\u0000\u0117\u0118\u0005\u000e\u0000\u0000\u0118"+
		"\u0119\u0005\u0003\u0000\u0000\u0119\u011a\u00052\u0000\u0000\u011a\u011b"+
		"\u0005\u0010\u0000\u0000\u011b\u011d\u0005\u0003\u0000\u0000\u011c\u0114"+
		"\u0001\u0000\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011d3\u0001"+
		"\u0000\u0000\u0000\u011e\u0122\u0005\u0004\u0000\u0000\u011f\u0120\u0005"+
		"\u0016\u0000\u0000\u0120\u0121\u00052\u0000\u0000\u0121\u0123\u0005\u0017"+
		"\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u01235\u0001\u0000\u0000\u0000\u0017=AEP[bu|\u0083\u008b"+
		"\u0091\u009b\u00a6\u00ac\u00b7\u00cf\u00eb\u00f2\u0107\u010a\u010e\u011c"+
		"\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}