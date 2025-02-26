grammar VR;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

NOT: 'NOT';
COLUMN: '\'' .+? '\'';
STRING: '"' .*? '"';
INTEGER: '-'? DIGIT+;
DOUBLE: '-'? DIGIT+ ('.' DIGIT+);
BOOLEAN: 'TRUE' | 'FALSE';
WHITESPACE: [ \t\r\n]+ -> skip;

expression:
	'(' expression ')'											# parenExp
	| 'IF' expression 'THEN' expression ('ELSE' expression)?	# ifExp
	| 'LOWER(' COLUMN ')'										# lowerExp
	| 'ISNUMBER(' COLUMN ')'									# isNumberExp
	| 'EQUALS_IGNORE_CASE(' (COLUMN) ',' (COLUMN | STRING) ')'	# equalsIgnoreCaseExp
	| expression ('+' | '-') expression							# addSubExp
	| COLUMN NOT? 'IN LIST(' STRING ')'							# inDynExp
	| expression '=' expression									# eqExp
	| expression '>' expression									# ltExp
	| expression 'AND' expression								# andExp
	| expression 'OR' expression								# orExp
	| INTEGER													# integerExp
	| DOUBLE													# doubleExp
	| STRING													# strExp
	| COLUMN													# colExp
	| BOOLEAN													# boolExp;