package rithm.parsertools.mtl;

public class MTLEvaluator {
	public static enum OperatorType
	{
		AND, OR, IF, IFF, NOT, UNTIL, EVENTUALLY, ALWAYS;
	}
	protected OperatorType currentOperator;
	protected String operand1Name;
	protected String operand2Name;
	public MTLEvaluator(OperatorType opType, String operand1Name, String operand2Name)
	{
		this.currentOperator = opType;
		this.operand1Name = operand1Name;
		this.operand2Name = operand2Name;
	}
}
