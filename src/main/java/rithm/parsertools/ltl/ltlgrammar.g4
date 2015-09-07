grammar ltlgrammar;
options {

}
@header {
	package rithm.parsertools.ltl;
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
	
pred: PREDNAME | PREDNAME ES| 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE | NOTNODE ES;
unaryTemporal: EVENTUALLYNODE | EVENTUALLYNODE ES| GLOBALLYNODE | GLOBALLYNODE ES| NEXTNODE  | NEXTNODE ES;
binaryNonTemporal: ANDNODE | ANDNODE ES| ORNODE | ORNODE ES| IFFNODE | IFFNODE ES| IFNODE | IFNODE ES;
binaryTemporal: UNTILNODE | UNTILNODE ES;

PREDNAME: [A-RTV-Za-z_0-9]+;
ANDNODE: '&&';
ORNODE: '||';
IFFNODE: '<->';
IFNODE: '->';
UNTILNODE: 'U';
EVENTUALLYNODE: '<>';
NEXTNODE: 'X';
GLOBALLYNODE: '[]';
NOTNODE: '!';
ES: [ ]+;
WS : [ \t\r\n]+ -> skip ;