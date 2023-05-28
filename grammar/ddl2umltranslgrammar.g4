grammar ddl2umltranslgrammar;

inicio: block EOF
;

block           : ( ddlStatement (NEWLINE* | EOF ))*
;

ddlStatement : createTableStatement | alterTableStatement | dropTableStatement | createIndexStatement | dropIndexStatement | LINE_COMMENT
;

createTableStatement : CREATE TABLE tableName '(' columnDefinition (',' columnDefinition)* ')' ';'
;

alterTableStatement : ALTER TABLE tableName alterTableAction ';'
;

dropTableStatement : DROP TABLE tableName ';'
;

createIndexStatement : CREATE INDEX indexName ON tableName '(' columnName (',' columnName)* ')' ';'
;

dropIndexStatement : DROP INDEX indexName ';'
;

alterTableAction : ADD columnName datatype | ALTER COLUMN columnName datatype | DROP COLUMN columnName
;

columnDefinition : columnName datatype constraint?
;

constraint : PRIMARY KEY | UNIQUE
;

columnName : IDENTIFIER
;

tableName : IDENTIFIER
;

indexName : IDENTIFIER
;

datatype : DATATYPE
;

CREATE : 'CREATE';
ALTER : 'ALTER';
DROP : 'DROP';
TABLE : 'TABLE';
INDEX : 'INDEX';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
DATATYPE : [a-zA-Z]+;
LINE_COMMENT    : '--' ~[\r\n\f]* ;