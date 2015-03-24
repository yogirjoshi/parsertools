grammar ltlgrammar;
options {

}
@header {
	package rithm.parsertools;
	import java.util.HashMap;
}
@members 
{
	
}
/* A number: can be an integer value, or a decimal value */
ltl: pred 
	| '(' ltl ')' 
	| unaryNonTemporal ltl
	| ltl binaryNonTemporal ltl
	| ltl binaryTemporal ltl
	| unaryTemporal ltl
	| ltl WS;
	
pred: PREDNAME | 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFFNODE| IFNODE;
binaryTemporal: UNTILNODE;
unaryTemporal: EVENTUALLYNODE | GLOBALLYNODE;
PREDNAME: [a-z_0-9]+;
ANDNODE: '&&';
ORNODE: '||';
IFFNODE: '<->';
IFNODE: '->';
UNTILNODE: 'U';
EVENTUALLYNODE: '<>';
GLOBALLYNODE: '[]';
NOTNODE: '!';
WS : [ \t\r\n]+ -> skip ;