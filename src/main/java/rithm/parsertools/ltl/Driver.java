package rithm.parsertools.ltl;

import rithm.defaultcore.DefaultRiTHMSpecification;

public class Driver {
	public static void main(String args[])
	{
		VerboseLTLParser ltlParser = new VerboseLTLParser("LTL");
		ltlParser.appendSpec(new DefaultRiTHMSpecification("a UNTIL b"));
		ltlParser.appendSpec(new DefaultRiTHMSpecification (" ALWAYS (x UNTIL y)"));
		ltlParser.appendSpec(new DefaultRiTHMSpecification("c IMPLIES  EVENTUALLY d"));
		for(String pred: ltlParser.getPredsForSpec("a UNTIL b"))
			System.out.println(pred);
		for(String pred: ltlParser.getPredsForSpec(" ALWAYS (x UNTIL y)"))
			System.out.println(pred);
		for(String pred: ltlParser.getPredsForSpec("c IMPLIES  EVENTUALLY d"))
			System.out.println(pred);
//		LTLParser ltlParser = new LTLParser("LTL");
//		ltlParser.appendSpec(new DefaultRiTHMSpecification("a U b"));
//		ltlParser.appendSpec(new DefaultRiTHMSpecification("p-><q"));
//		System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("a U b")));
//		System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("p-><q")));
//		ltlParser.appendSpec("c IMPLIES  EVENTUALLY d");
//		for(String pred: ltlParser.getPredsForSpec("a UNTIL b"))
//			System.out.println(pred);
//		for(String pred: ltlParser.getPredsForSpec(" ALWAYS (x UNTIL y)"))
//			System.out.println(pred);
//		for(String pred: ltlParser.getPredsForSpec("c IMPLIES  EVENTUALLY d"))
//			System.out.println(pred);
	}
}
