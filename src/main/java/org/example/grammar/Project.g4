grammar Project;
///////////////////////////////////////////////////////////////////////////////
program: declaration * EOF;
declaration: varDecl
           | statement ;
varDecl: VAR IDENTIFIER (ASSIGN expression)? SEMICOLON ;
statement: exprStmt
         | ifStmt
         | printStmt
         | whileStmt
         | block ;
exprStmt: expression SEMICOLON ;
ifStmt: IF LPARA expression RPARA statement (ELSE statement) ? ;
printStmt: PRINT expression SEMICOLON ;
whileStmt: WHILE LPARA expression RPARA statement ;
block: LBRACE declaration* RBRACE ;
expression: assignment ;
assignment : IDENTIFIER ASSIGN assignment
           | logic_or ;
logic_or: logic_and (OR logic_and)* ;
logic_and: equality (AND equality)* ;
equality: comparison ((NOTEQUAL|EQUAL) comparison)* ;
comparison: term ((LESS|LESSEQUAL|GREATER|GREATEREQUAL) term)* ;
term: factor ((MINUS|PLUS) factor)* ;
factor: unary ((BACKSLASH|STAR) unary)* ;
unary: (EXCLAMATION|MINUS) unary
     | primary ;
primary : TRUE|FALSE|NUMBER|STRING
 | LPARA expression RPARA
 | IDENTIFIER ;
///////////////////////////////////////////////////////////////////////////////
//lexer
//keywords
TRUE: 'true';
FALSE: 'false';
PRINT: 'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: 'and';
OR: 'or';
VAR: 'var';
//special chars
SEMICOLON: ';';
LBRACE: '{';
RBRACE: '}';
LPARA: '(';
RPARA: ')';
//operators
PLUS: '+';
MINUS: '-';
STAR: '*';
BACKSLASH: '/';
ASSIGN: '=';
EQUAL: '==';
NOTEQUAL: '!=';
GREATER: '>';
LESS: '<';
GREATEREQUAL: '>=';
LESSEQUAL: '<=';
EXCLAMATION: '!';
//prod rules
STRING: '"'~["]*'"';
NUMBER: [0-9]+(.[0-9]+)?;
IDENTIFIER: [A-Za-z][A-Za-z0-9]*;
COMMENT: '//' ~[\r\n]*'\n'  -> skip;
WHITESPACE: [ \t\r\n]+ -> skip;















