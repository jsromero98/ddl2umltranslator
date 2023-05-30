grammar ddl2umltranslgrammar;

inicio: block EOF
;

block: ( ddlStatement (NEWLINE* | EOF ))*
;

ddlStatement : createTableStatement | alterTableStatement | dropTableStatement | createIndexStatement | dropIndexStatement | createViewStatement | createSequenceStatement | LINE_COMMENT
;

createTableStatement : CREATE TABLE tableName LPAREN columnDefinition (',' columnDefinition)* (',' foreignKeyDefiniton)* RPAREN SEMICOLON
;

createViewStatement : CREATE VIEW tableName AS sqlStatement SEMICOLON
;

sqlStatement : SELECT columnName (',' columnName)* FROM tableName ( WHERE exprand )?
;

exprand            : expror ( AND expror)*
;

expror            : compexpr ( OR compexpr)*
;

compexpr        : arithexpr ( ( EQ | NEQ | LT | GT | LE | GE ) arithexpr )?
;

arithexpr       : arithexpr  (PLUS|SUB) term
                | term
;

term            : term  (MUL|DIV) factor
                | factor
;

factor          : (ADD|SUB) atom
                | atom
;

atom            : columnName | INTEG | DOUBLE | STRING | functionName
                | LPAREN exprand RPAREN
;


alterTableStatement : ALTER TABLE tableName alterTableAction SEMICOLON
;

dropTableStatement : DROP TABLE tableName SEMICOLON
;

createIndexStatement : CREATE INDEX indexName ON tableName LPAREN columnName (',' columnName)* RPAREN SEMICOLON
;

createSequenceStatement: CREATE SEQUENCE IDENTIFIER SEMICOLON
;

dropIndexStatement : DROP INDEX indexName SEMICOLON
;

alterTableAction : ADD columnName datatype | ALTER COLUMN columnName datatype | DROP COLUMN columnName
;

columnDefinition : columnName datatype constraint*
;

foreignKeyDefiniton : FOREIGN KEY LPAREN columnName RPAREN REFERENCES tableName LPAREN columnName RPAREN
;

constraint : PRIMARY KEY | UNIQUE | NOT NULL | DEFAULT | CT
;

columnName : IDENTIFIER
;

tableName : IDENTIFIER
;

indexName : IDENTIFIER
;

functionName : NOW LPAREN RPAREN | INTERVAL '\'' INTEG TIMEFRAME '\''
;

datatype : DATATYPE ( LPAREN INTEG RPAREN )?
;

DATATYPE : 'INT' | 'VARCHAR' | 'BIGINT' | 'BINARY' | 'BLOB' | 'TEXT' | 'TIMESTAMP';
WS              : [ \t\r\n]+ -> skip ;
EQ              : '=' ;
EE              : '==' ;
NEQ             : '<>' ;
GE             : '>=' ;
LE             : '<=' ;
GT              : '>' ;
LT              : '<' ;
ON : 'ON' ;
INTERVAL : 'INTERVAL';
NOW : 'NOW' ;
TIMEFRAME: 'minutes' | 'days' | 'months' | 'years' ;
AND : 'AND';
OR : 'OR' ;
DEFAULT : 'DEFAULT' ;
ADD : 'ADD' ;
COLUMN : 'COLUMN' ;
LPAREN : '(' ;
RPAREN : ')' ;
MUL             : '*' ;
DIV             : '/' ;
PLUS             : '+' ;
SUB             : '-' ;
SEMICOLON : ';' ;
PRIMARY : 'PRIMARY';
KEY: 'KEY' ;
AS : 'AS' ;
SELECT : 'SELECT' ;
FROM : 'FROM' ;
WHERE : 'WHERE' ;
NOT: 'NOT' ;
NULL: 'NULL' ;
UNIQUE: 'UNIQUE' ;
CREATE : 'CREATE';
ALTER : 'ALTER';
DROP : 'DROP';
TABLE : 'TABLE';
FOREIGN: 'FOREIGN' ;
INDEX : 'INDEX';
SEQUENCE : 'SEQUENCE' ;
CT : 'CURRENT_TIMESTAMP' ;
REFERENCES : 'REFERENCES' ;
VIEW : 'VIEW';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
LINE_COMMENT    : '--' ~[\r\n\f]* ;
INTEG             : [0-9]+;
DOUBLE          : [0-9]+( | [.][0-9]+);
STRING          : '"' ~ ["\r\n]* '"' ;
NEWLINE         : '\r'? '\n' (' ')*;
