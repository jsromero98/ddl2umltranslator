grammar ddl2umltranslgrammar;

inicio: block EOF
;

block: ( ddlStatement (NEWLINE* | EOF ))*
;

ddlStatement : createTableStatement | alterTableStatement | dropTableStatement | createIndexStatement | dropIndexStatement | LINE_COMMENT
;

createTableStatement : CREATE TABLE tableName LPAREN NEWLINE? columnDefinition (',' NEWLINE? columnDefinition)* NEWLINE? RPAREN SEMICOLON
;

alterTableStatement : ALTER TABLE tableName alterTableAction SEMICOLON
;

dropTableStatement : DROP TABLE tableName SEMICOLON
;

createIndexStatement : CREATE INDEX indexName ON tableName LPAREN columnName (',' columnName)* RPAREN SEMICOLON
;

dropIndexStatement : DROP INDEX indexName SEMICOLON
;

alterTableAction : ADD columnName datatype | ALTER COLUMN columnName datatype | DROP COLUMN columnName
;

columnDefinition : columnName datatype constraint*
;

constraint : PRIMARY KEY | UNIQUE | NOT NULL | DEFAULT
;

columnName : IDENTIFIER
;

tableName : IDENTIFIER
;

indexName : IDENTIFIER
;

datatype : DATATYPE ( LPAREN INT RPAREN )?
;

WS              : [ \t\r\n]+ -> skip ;
ON : 'ON' ;
DEFAULT : 'DEFAULT' ;
ADD : 'ADD' ;
COLUMN : 'COLUMN' ;
LPAREN : '(' ;
RPAREN : ')' ;
SEMICOLON : ';' ;
PRIMARY : 'PRIMARY';
KEY: 'KEY' ;
NOT: 'NOT' ;
NULL: 'NULL' ;
UNIQUE: 'UNIQUE' ;
CREATE : 'CREATE';
ALTER : 'ALTER';
DROP : 'DROP';
TABLE : 'TABLE';
INDEX : 'INDEX';
DATATYPE : 'INT' | 'VARCHAR' | 'BIGINT' | 'BINARY' | 'BLOB' | 'TEXT' | 'TIMESTAMP';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
LINE_COMMENT    : '--' ~[\r\n\f]* ;
INT             : [0-9]+;
DOUBLE          : [0-9]+( | [.][0-9]+);
NEWLINE         : '\r'? '\n' (' ')*;