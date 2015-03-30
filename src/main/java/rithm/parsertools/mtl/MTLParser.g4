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
	| mtl binaryNonTemporal mtl
	| mtl binaryTemporal mtl
	| unaryTemporal mtl
	| mtl WS;
	
pred: PREDNAME | 'T[RUE]' | 'F[ALSE]';
unaryNonTemporal : NOTNODE;
binaryNonTemporal: ANDNODE | ORNODE | IFFNODE| IFNODE;
binaryTemporal: UNTILNODE intervalNode;
unaryTemporal: (EVENTUALLYNODE | GLOBALLYNODE) intervalNode;
intervalNode: '{' interval '}';
interval: NUM COMMA NUM;
PREDNAME: [a-z]+[0-9]*;
ANDNODE: '&&';
ORNODE: '||';
IFFNODE: '<->';
IFNODE: '->';
UNTILNODE: 'U';
EVENTUALLYNODE: '<>';
GLOBALLYNODE: '[]';
NOTNODE: '!';
NUM: [0-9]+;
COMMA: ',';
WS : [ \t\r\n]+ -> skip ;