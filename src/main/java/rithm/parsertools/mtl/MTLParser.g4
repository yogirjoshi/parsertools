grammar MTLParser;
options {

}
@header {
	package rithm.parsertools.mtl;
	import java.util.HashMap;
}
@members 
{
	
}
/* A number: can be an integer value, or a decimal value */
mtl: pred 
	| '(' mtl ')' 
	| unaryNonTemporal mtl
	| unaryTemporal mtl
	| mtl binaryNonTemporal mtl
	| mtl binaryTemporal mtl
	| mtl WS;
	
pred: PREDNAME | 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFFNODE| IFNODE;
binaryTemporal: UNTILNODE intervalNode | SINCENODE interval;
unaryTemporal: (EVENTUALLYNODE | GLOBALLYNODE |EVENTUALLYPASTNODE | GLOBALLYPASTNODE) intervalNode;
intervalNode: '{' interval '}';
interval: NUM;
PREDNAME: [a-zA-RTV-Z0-9]+;
ANDNODE: '&&';
ORNODE: '||';
IFFNODE: '<->';
IFNODE: '->';
UNTILNODE: 'U';
SINCENODE: 'S';
EVENTUALLYNODE: '<>';
EVENTUALLYPASTNODE: '<*>';
GLOBALLYNODE: '[]';
GLOBALLYPASTNODE: '[*]';
NOTNODE: '!';
NUM: [\.0-9]+','[\.0-9]+;
WS : [ \t\r\n]+ -> skip ;