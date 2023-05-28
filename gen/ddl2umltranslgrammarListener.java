// Generated from C:/Users/johanlap21/Desktop/ddl2umltranslator/grammar\ddl2umltranslgrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ddl2umltranslgrammarParser}.
 */
public interface ddl2umltranslgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(ddl2umltranslgrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(ddl2umltranslgrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ddl2umltranslgrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ddl2umltranslgrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(ddl2umltranslgrammarParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(ddl2umltranslgrammarParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(ddl2umltranslgrammarParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(ddl2umltranslgrammarParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStatement(ddl2umltranslgrammarParser.AlterTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStatement(ddl2umltranslgrammarParser.AlterTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStatement(ddl2umltranslgrammarParser.DropTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStatement(ddl2umltranslgrammarParser.DropTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexStatement(ddl2umltranslgrammarParser.CreateIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexStatement(ddl2umltranslgrammarParser.CreateIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexStatement(ddl2umltranslgrammarParser.DropIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexStatement(ddl2umltranslgrammarParser.DropIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(ddl2umltranslgrammarParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(ddl2umltranslgrammarParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(ddl2umltranslgrammarParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(ddl2umltranslgrammarParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(ddl2umltranslgrammarParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(ddl2umltranslgrammarParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(ddl2umltranslgrammarParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(ddl2umltranslgrammarParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ddl2umltranslgrammarParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ddl2umltranslgrammarParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(ddl2umltranslgrammarParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(ddl2umltranslgrammarParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddl2umltranslgrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(ddl2umltranslgrammarParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddl2umltranslgrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(ddl2umltranslgrammarParser.DatatypeContext ctx);
}