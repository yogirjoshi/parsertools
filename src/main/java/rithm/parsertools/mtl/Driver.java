package rithm.parsertools.mtl;

import rithm.defaultcore.DefaultRiTHMSpecification;

public class Driver {
	public static void main(String args[])
	{
		MTLParser ltlParser = new MTLParser("MTL");
		System.out.println(ltlParser.appendSpec(new DefaultRiTHMSpecification("a-><>{11,12}b")));
		System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("a-><>{11,12}b")));
		assert(ltlParser.appendSpec(new DefaultRiTHMSpecification("c-><>d")));
//		for(String pred: ltlParser.getPredsForSpec("a-><>{1,2}b"))
//			System.out.println(pred);
//		for(String pred: ltlParser.getPredsForSpec("c-><>d"))
//			System.out.println(pred);
	}
}
