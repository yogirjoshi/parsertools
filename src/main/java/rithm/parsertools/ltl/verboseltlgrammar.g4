grammar verboseltlgrammar;
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
		| unaryTemporal ltl
	| ltl binaryNonTemporal ltl
	| ltl binaryTemporal ltl

	| ltl WS;
	
pred: PREDNAME | 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFFNODE| IFNODE;
binaryTemporal: UNTILNODE;
unaryTemporal: EVENTUALLYNODE | GLOBALLYNODE;
PREDNAME: [a-z_0-9]+;
ANDNODE: ' AND ';
ORNODE: ' OR ';
IFFNODE: ' IF-AND-ONLY-IF ';
IFNODE: ' IMPLIES ';
UNTILNODE: ' UNTIL ';
EVENTUALLYNODE: ' EVENTUALLY ';
GLOBALLYNODE: ' ALWAYS ';
NOTNODE: ' NOT ';
WS : [ \t\r\n]+ -> skip ;