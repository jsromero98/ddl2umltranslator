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
		T__0=1, ON=2, ADD=3, COLUMN=4, LPAREN=5, RPAREN=6, SEMICOLON=7, PRIMARY=8, 
		KEY=9, NOT=10, NULL=11, UNIQUE=12, CREATE=13, ALTER=14, DROP=15, TABLE=16, 
		INDEX=17, DATATYPE=18, IDENTIFIER=19, LINE_COMMENT=20, INT=21, DOUBLE=22, 
		NEWLINE=23;
	public static final int
		RULE_inicio = 0, RULE_block = 1, RULE_ddlStatement = 2, RULE_createTableStatement = 3, 
		RULE_alterTableStatement = 4, RULE_dropTableStatement = 5, RULE_createIndexStatement = 6, 
		RULE_dropIndexStatement = 7, RULE_alterTableAction = 8, RULE_columnDefinition = 9, 
		RULE_constraint = 10, RULE_columnName = 11, RULE_tableName = 12, RULE_indexName = 13, 
		RULE_datatype = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "block", "ddlStatement", "createTableStatement", "alterTableStatement", 
			"dropTableStatement", "createIndexStatement", "dropIndexStatement", "alterTableAction", 
			"columnDefinition", "constraint", "columnName", "tableName", "indexName", 
			"datatype"
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
			setState(30);
			block();
			setState(31);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1105920L) != 0)) {
				{
				{
				setState(33);
				ddlStatement();
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(34);
						match(NEWLINE);
						}
						}
						setState(39);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(40);
					match(EOF);
					}
					break;
				}
				}
				}
				setState(47);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				alterTableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				dropTableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				createIndexStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				dropIndexStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ddl2umltranslgrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ddl2umltranslgrammarParser.NEWLINE, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CREATE);
			setState(57);
			match(TABLE);
			setState(58);
			tableName();
			setState(59);
			match(LPAREN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(60);
				match(NEWLINE);
				}
			}

			setState(63);
			columnDefinition();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(64);
				match(T__0);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(65);
					match(NEWLINE);
					}
				}

				setState(68);
				columnDefinition();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(74);
				match(NEWLINE);
				}
			}

			setState(77);
			match(RPAREN);
			setState(78);
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
		enterRule(_localctx, 8, RULE_alterTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ALTER);
			setState(81);
			match(TABLE);
			setState(82);
			tableName();
			setState(83);
			alterTableAction();
			setState(84);
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
		enterRule(_localctx, 10, RULE_dropTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DROP);
			setState(87);
			match(TABLE);
			setState(88);
			tableName();
			setState(89);
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
		enterRule(_localctx, 12, RULE_createIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CREATE);
			setState(92);
			match(INDEX);
			setState(93);
			indexName();
			setState(94);
			match(ON);
			setState(95);
			tableName();
			setState(96);
			match(LPAREN);
			setState(97);
			columnName();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(98);
				match(T__0);
				setState(99);
				columnName();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RPAREN);
			setState(106);
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
		enterRule(_localctx, 14, RULE_dropIndexStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DROP);
			setState(109);
			match(INDEX);
			setState(110);
			indexName();
			setState(111);
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
		enterRule(_localctx, 16, RULE_alterTableAction);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ADD);
				setState(114);
				columnName();
				setState(115);
				datatype();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ALTER);
				setState(118);
				match(COLUMN);
				setState(119);
				columnName();
				setState(120);
				datatype();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(DROP);
				setState(123);
				match(COLUMN);
				setState(124);
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
		enterRule(_localctx, 18, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			columnName();
			setState(128);
			datatype();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5376L) != 0)) {
				{
				{
				setState(129);
				constraint();
				}
				}
				setState(134);
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
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ddl2umltranslgrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ddl2umltranslgrammarParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(ddl2umltranslgrammarParser.UNIQUE, 0); }
		public TerminalNode NOT() { return getToken(ddl2umltranslgrammarParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ddl2umltranslgrammarParser.NULL, 0); }
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
		enterRule(_localctx, 20, RULE_constraint);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(PRIMARY);
				setState(136);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(NOT);
				setState(139);
				match(NULL);
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
		enterRule(_localctx, 22, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 26, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(ddl2umltranslgrammarParser.DATATYPE, 0); }
		public TerminalNode LPAREN() { return getToken(ddl2umltranslgrammarParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(ddl2umltranslgrammarParser.INT, 0); }
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
		enterRule(_localctx, 28, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DATATYPE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(149);
				match(LPAREN);
				setState(150);
				match(INT);
				setState(151);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u009b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001$\b\u0001\n\u0001"+
		"\f\u0001\'\t\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0005\u0001,\b\u0001"+
		"\n\u0001\f\u0001/\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0005\u0003"+
		"F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006e\b"+
		"\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b~\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0083\b\t\n\t"+
		"\f\t\u0086\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008d\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0099\b\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0000\u009e\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002-\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006"+
		"8\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"}\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u008c"+
		"\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u0090"+
		"\u0001\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u0094"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005"+
		"\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!)\u0003\u0004\u0002"+
		"\u0000\"$\u0005\u0017\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&*\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0005\u0000\u0000"+
		"\u0001)%\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+!\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000007\u0003\u0006\u0003\u000017\u0003\b\u0004"+
		"\u000027\u0003\n\u0005\u000037\u0003\f\u0006\u000047\u0003\u000e\u0007"+
		"\u000057\u0005\u0014\u0000\u000060\u0001\u0000\u0000\u000061\u0001\u0000"+
		"\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000"+
		"\u000089\u0005\r\u0000\u00009:\u0005\u0010\u0000\u0000:;\u0003\u0018\f"+
		"\u0000;=\u0005\u0005\u0000\u0000<>\u0005\u0017\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?G\u0003"+
		"\u0012\t\u0000@B\u0005\u0001\u0000\u0000AC\u0005\u0017\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DF\u0003\u0012\t\u0000E@\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JL\u0005\u0017\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0006\u0000\u0000NO\u0005\u0007\u0000\u0000O\u0007\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u000e\u0000\u0000QR\u0005\u0010\u0000\u0000RS\u0003\u0018"+
		"\f\u0000ST\u0003\u0010\b\u0000TU\u0005\u0007\u0000\u0000U\t\u0001\u0000"+
		"\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\u0010\u0000\u0000XY\u0003"+
		"\u0018\f\u0000YZ\u0005\u0007\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000"+
		"[\\\u0005\r\u0000\u0000\\]\u0005\u0011\u0000\u0000]^\u0003\u001a\r\u0000"+
		"^_\u0005\u0002\u0000\u0000_`\u0003\u0018\f\u0000`a\u0005\u0005\u0000\u0000"+
		"af\u0003\u0016\u000b\u0000bc\u0005\u0001\u0000\u0000ce\u0003\u0016\u000b"+
		"\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0006\u0000\u0000jk\u0005\u0007\u0000\u0000"+
		"k\r\u0001\u0000\u0000\u0000lm\u0005\u000f\u0000\u0000mn\u0005\u0011\u0000"+
		"\u0000no\u0003\u001a\r\u0000op\u0005\u0007\u0000\u0000p\u000f\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0003\u0016\u000b\u0000st\u0003"+
		"\u001c\u000e\u0000t~\u0001\u0000\u0000\u0000uv\u0005\u000e\u0000\u0000"+
		"vw\u0005\u0004\u0000\u0000wx\u0003\u0016\u000b\u0000xy\u0003\u001c\u000e"+
		"\u0000y~\u0001\u0000\u0000\u0000z{\u0005\u000f\u0000\u0000{|\u0005\u0004"+
		"\u0000\u0000|~\u0003\u0016\u000b\u0000}q\u0001\u0000\u0000\u0000}u\u0001"+
		"\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0003\u0016\u000b\u0000\u0080\u0084\u0003\u001c\u000e"+
		"\u0000\u0081\u0083\u0003\u0014\n\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088"+
		"\u008d\u0005\t\u0000\u0000\u0089\u008d\u0005\f\u0000\u0000\u008a\u008b"+
		"\u0005\n\u0000\u0000\u008b\u008d\u0005\u000b\u0000\u0000\u008c\u0087\u0001"+
		"\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u0013\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u0013\u0000\u0000\u0091\u0019\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0013\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0098\u0005"+
		"\u0012\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0097\u0005"+
		"\u0015\u0000\u0000\u0097\u0099\u0005\u0006\u0000\u0000\u0098\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001d\u0001"+
		"\u0000\u0000\u0000\r%)-6=BGKf}\u0084\u008c\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}