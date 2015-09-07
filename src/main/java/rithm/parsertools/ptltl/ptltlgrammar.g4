grammar ptltlgrammar;
options {

}
@header {
	package rithm.parsertools.ptltl;
}
@members 
{
	
}
/* A number: can be an integer value, or a decimal value */
ptltl: pred 
	| '(' ptltl ')' 
	| unaryNonTemporal ptltl
	| unaryTemporal ptltl
	| ptltl binaryNonTemporal ptltl
	| ptltl binaryTemporal ptltl
	| ptltl WS;
	
pred: PREDNAME | 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFNODE| IFFNODE;
binaryTemporal: SINCENODE;
unaryTemporal: EVENTUALLYPASTNODE | GLOBALLYPASTNODE | PREVIOUSLY;
PREDNAME: [A-Za-z_0-9]+;
ANDNODE: '&&';
ORNODE: '||';
IFFNODE: '<->';
IFNODE: '->';
SINCENODE: 'S';
EVENTUALLYPASTNODE: '<*>';
GLOBALLYPASTNODE: '[*]';
PREVIOUSLY: 'X*';
NOTNODE: '!';
WS : [ \t\r\n]+ -> skip ;