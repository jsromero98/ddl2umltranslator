import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ddl2umltrad extends ddl2umltranslgrammarBaseListener{
    @Override
    public void enterInicio(ddl2umltranslgrammarParser.InicioContext ctx) {
        super.enterInicio(ctx);
    }

    @Override
    public void exitInicio(ddl2umltranslgrammarParser.InicioContext ctx) {
        super.exitInicio(ctx);
    }

    @Override
    public void enterBlock(ddl2umltranslgrammarParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(ddl2umltranslgrammarParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterDdlStatement(ddl2umltranslgrammarParser.DdlStatementContext ctx) {
        System.out.println(ctx.getText());
        super.enterDdlStatement(ctx);
    }

    @Override
    public void exitDdlStatement(ddl2umltranslgrammarParser.DdlStatementContext ctx) {
        super.exitDdlStatement(ctx);
    }

    @Override
    public void enterCreateTableStatement(ddl2umltranslgrammarParser.CreateTableStatementContext ctx) {
        super.enterCreateTableStatement(ctx);
    }

    @Override
    public void exitCreateTableStatement(ddl2umltranslgrammarParser.CreateTableStatementContext ctx) {
        super.exitCreateTableStatement(ctx);
    }

    @Override
    public void enterCreateViewStatement(ddl2umltranslgrammarParser.CreateViewStatementContext ctx) {
        super.enterCreateViewStatement(ctx);
    }

    @Override
    public void exitCreateViewStatement(ddl2umltranslgrammarParser.CreateViewStatementContext ctx) {
        super.exitCreateViewStatement(ctx);
    }

    @Override
    public void enterSqlStatement(ddl2umltranslgrammarParser.SqlStatementContext ctx) {
        super.enterSqlStatement(ctx);
    }

    @Override
    public void exitSqlStatement(ddl2umltranslgrammarParser.SqlStatementContext ctx) {
        super.exitSqlStatement(ctx);
    }

    @Override
    public void enterExprand(ddl2umltranslgrammarParser.ExprandContext ctx) {
        super.enterExprand(ctx);
    }

    @Override
    public void exitExprand(ddl2umltranslgrammarParser.ExprandContext ctx) {
        super.exitExprand(ctx);
    }

    @Override
    public void enterExpror(ddl2umltranslgrammarParser.ExprorContext ctx) {
        super.enterExpror(ctx);
    }

    @Override
    public void exitExpror(ddl2umltranslgrammarParser.ExprorContext ctx) {
        super.exitExpror(ctx);
    }

    @Override
    public void enterCompexpr(ddl2umltranslgrammarParser.CompexprContext ctx) {
        super.enterCompexpr(ctx);
    }

    @Override
    public void exitCompexpr(ddl2umltranslgrammarParser.CompexprContext ctx) {
        super.exitCompexpr(ctx);
    }

    @Override
    public void enterArithexpr(ddl2umltranslgrammarParser.ArithexprContext ctx) {
        super.enterArithexpr(ctx);
    }

    @Override
    public void exitArithexpr(ddl2umltranslgrammarParser.ArithexprContext ctx) {
        super.exitArithexpr(ctx);
    }

    @Override
    public void enterTerm(ddl2umltranslgrammarParser.TermContext ctx) {
        super.enterTerm(ctx);
    }

    @Override
    public void exitTerm(ddl2umltranslgrammarParser.TermContext ctx) {
        super.exitTerm(ctx);
    }

    @Override
    public void enterFactor(ddl2umltranslgrammarParser.FactorContext ctx) {
        super.enterFactor(ctx);
    }

    @Override
    public void exitFactor(ddl2umltranslgrammarParser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterAtom(ddl2umltranslgrammarParser.AtomContext ctx) {
        super.enterAtom(ctx);
    }

    @Override
    public void exitAtom(ddl2umltranslgrammarParser.AtomContext ctx) {
        super.exitAtom(ctx);
    }

    @Override
    public void enterAlterTableStatement(ddl2umltranslgrammarParser.AlterTableStatementContext ctx) {
        super.enterAlterTableStatement(ctx);
    }

    @Override
    public void exitAlterTableStatement(ddl2umltranslgrammarParser.AlterTableStatementContext ctx) {
        super.exitAlterTableStatement(ctx);
    }

    @Override
    public void enterDropTableStatement(ddl2umltranslgrammarParser.DropTableStatementContext ctx) {
        super.enterDropTableStatement(ctx);
    }

    @Override
    public void exitDropTableStatement(ddl2umltranslgrammarParser.DropTableStatementContext ctx) {
        super.exitDropTableStatement(ctx);
    }

    @Override
    public void enterCreateIndexStatement(ddl2umltranslgrammarParser.CreateIndexStatementContext ctx) {
        super.enterCreateIndexStatement(ctx);
    }

    @Override
    public void exitCreateIndexStatement(ddl2umltranslgrammarParser.CreateIndexStatementContext ctx) {
        super.exitCreateIndexStatement(ctx);
    }

    @Override
    public void enterCreateSequenceStatement(ddl2umltranslgrammarParser.CreateSequenceStatementContext ctx) {
        super.enterCreateSequenceStatement(ctx);
    }

    @Override
    public void exitCreateSequenceStatement(ddl2umltranslgrammarParser.CreateSequenceStatementContext ctx) {
        super.exitCreateSequenceStatement(ctx);
    }

    @Override
    public void enterDropIndexStatement(ddl2umltranslgrammarParser.DropIndexStatementContext ctx) {
        super.enterDropIndexStatement(ctx);
    }

    @Override
    public void exitDropIndexStatement(ddl2umltranslgrammarParser.DropIndexStatementContext ctx) {
        super.exitDropIndexStatement(ctx);
    }

    @Override
    public void enterAlterTableAction(ddl2umltranslgrammarParser.AlterTableActionContext ctx) {
        super.enterAlterTableAction(ctx);
    }

    @Override
    public void exitAlterTableAction(ddl2umltranslgrammarParser.AlterTableActionContext ctx) {
        super.exitAlterTableAction(ctx);
    }

    @Override
    public void enterColumnDefinition(ddl2umltranslgrammarParser.ColumnDefinitionContext ctx) {
        super.enterColumnDefinition(ctx);
    }

    @Override
    public void exitColumnDefinition(ddl2umltranslgrammarParser.ColumnDefinitionContext ctx) {
        super.exitColumnDefinition(ctx);
    }

    @Override
    public void enterForeignKeyDefiniton(ddl2umltranslgrammarParser.ForeignKeyDefinitonContext ctx) {
        super.enterForeignKeyDefiniton(ctx);
    }

    @Override
    public void exitForeignKeyDefiniton(ddl2umltranslgrammarParser.ForeignKeyDefinitonContext ctx) {
        super.exitForeignKeyDefiniton(ctx);
    }

    @Override
    public void enterConstraint(ddl2umltranslgrammarParser.ConstraintContext ctx) {
        super.enterConstraint(ctx);
    }

    @Override
    public void exitConstraint(ddl2umltranslgrammarParser.ConstraintContext ctx) {
        super.exitConstraint(ctx);
    }

    @Override
    public void enterColumnName(ddl2umltranslgrammarParser.ColumnNameContext ctx) {
        super.enterColumnName(ctx);
    }

    @Override
    public void exitColumnName(ddl2umltranslgrammarParser.ColumnNameContext ctx) {
        super.exitColumnName(ctx);
    }

    @Override
    public void enterTableName(ddl2umltranslgrammarParser.TableNameContext ctx) {
        super.enterTableName(ctx);
    }

    @Override
    public void exitTableName(ddl2umltranslgrammarParser.TableNameContext ctx) {
        super.exitTableName(ctx);
    }

    @Override
    public void enterIndexName(ddl2umltranslgrammarParser.IndexNameContext ctx) {
        super.enterIndexName(ctx);
    }

    @Override
    public void exitIndexName(ddl2umltranslgrammarParser.IndexNameContext ctx) {
        super.exitIndexName(ctx);
    }

    @Override
    public void enterFunctionName(ddl2umltranslgrammarParser.FunctionNameContext ctx) {
        super.enterFunctionName(ctx);
    }

    @Override
    public void exitFunctionName(ddl2umltranslgrammarParser.FunctionNameContext ctx) {
        super.exitFunctionName(ctx);
    }

    @Override
    public void enterDatatype(ddl2umltranslgrammarParser.DatatypeContext ctx) {
        super.enterDatatype(ctx);
    }

    @Override
    public void exitDatatype(ddl2umltranslgrammarParser.DatatypeContext ctx) {
        super.exitDatatype(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
