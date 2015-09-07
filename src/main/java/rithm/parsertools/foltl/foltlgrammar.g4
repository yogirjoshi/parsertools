grammar foltlgrammar;
options {

}
@header {
	package rithm.parsertools.foltl;
	import java.util.HashMap;
}
@members 
{
	
}
/* A number: can be an integer value, or a decimal value */

foltl: pred 
	| '(' foltl ')' 
	| unaryNonTemporal foltl
	| unaryTemporal foltl
	| foltl binaryNonTemporal foltl
	| foltl binaryTemporal foltl
	| quant foltl
	| foltl WS;
	
pred: PREDNAME| 'T[RUE]' | 'F[ALSE]';
quant: 'FORALL(' OBJNAME ')' | 'EXISTS(' OBJNAME ')';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFFNODE| IFNODE;
binaryTemporal: UNTILNODE;
unaryTemporal: EVENTUALLYNODE | GLOBALLYNODE | NEXTNODE;
PREDNAME: [a-z_0-9]+'('[A-Z]+')';
ANDNODE: '&&';
ORNODE: '||';
//FORALL: 'FORALL('[A-Z]')';
//EXISTS: 'EXISTS('[A-Z]')';
IFFNODE: '<->';
IFNODE: '->';
UNTILNODE: 'U';
EVENTUALLYNODE: '<>';
GLOBALLYNODE: '[]';
NEXTNODE: 'X';
NOTNODE: '!';
OBJNAME: [A-Z]+;
WS : [ \t\r\n]+ -> skip ;