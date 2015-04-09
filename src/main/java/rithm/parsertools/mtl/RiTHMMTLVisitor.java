package rithm.parsertools.mtl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.print.attribute.standard.MediaSize.Other;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;
import rithm.core.ProgState;
import rithm.core.RiTHMPredicate;
import rithm.core.RiTHMProgStateCollection;
import rithm.core.RiTHMTruthValue;
import rithm.defaultcore.DefaultRiTHMTruthValue;
import rithm.parsertools.mtl.MTLParserParser.BinaryNonTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.BinaryTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.IntervalContext;
import rithm.parsertools.mtl.MTLParserParser.IntervalNodeContext;
import rithm.parsertools.mtl.MTLParserParser.MtlContext;
import rithm.parsertools.mtl.MTLParserParser.PredContext;
import rithm.parsertools.mtl.MTLParserParser.UnaryNonTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.UnaryTemporalContext;

public class RiTHMMTLVisitor extends MTLParserBaseVisitor<String>{

	protected int idCount;
	protected HashMap<String, ArrayList<RiTHMTruthValue>> evalStatus;
	protected RiTHMProgStateCollection progStateCollection;
	protected ArrayList<PredicateState> allPredValues;
	protected PredicateEvaluator pe;
	protected boolean arePredicatesEvaluated;
	public RiTHMMTLVisitor(HashMap<String, ArrayList<RiTHMTruthValue>> evStatus, RiTHMProgStateCollection progStateCollection)
	{
		super();
		this.evalStatus = evStatus;
		this.progStateCollection = progStateCollection;
		idCount=0;
		arePredicatesEvaluated=false;
		allPredValues = new ArrayList<PredicateState>();
	}
	public void setPredicateEvaluator(PredicateEvaluator pe)
	{
		this.pe = pe;
	}
	@Override
	public String visitUnaryNonTemporal(UnaryNonTemporalContext ctx) {
		// TODO Auto-generated method stub

		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		System.out.println(ctx.NOTNODE());
		return null;
	}

	@Override
	public String visitUnaryTemporal(UnaryTemporalContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
//		System.out.println(ctx.EVENTUALLYNODE());
//		System.out.println(ctx.GLOBALLYNODE());
		return null;
	}

	@Override
	public String visitMtl(MtlContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.pred() != null)
		{
			String predName = ctx.pred().PREDNAME().toString();
			ArrayList<RiTHMTruthValue> predEval = new ArrayList<RiTHMTruthValue>();
			if(!arePredicatesEvaluated)
			{
				Iterator<ProgState> itProgState= progStateCollection.iterator();
				while(itProgState.hasNext())
				{
					pe.SetProgStateObj(itProgState.next());
					allPredValues.add(pe.EvaluatePredicates());
					RiTHMTruthValue rtVal= new DefaultRiTHMTruthValue(Boolean.toString(pe.getPredicateValue(predName)));
					predEval.add(rtVal);
				}	
			}	
			else
			{
				for(int i = 0; i < allPredValues.size();i++)
				{
					RiTHMTruthValue rtVal= new DefaultRiTHMTruthValue(Boolean.toString(allPredValues.get(i).getValue(predName)));
					predEval.add(rtVal);
				}
			}
			evalStatus.put(predName, predEval);
			return predName;
		}
		//TODO: add timestamp to truthvalue, 
		if(ctx.unaryNonTemporal() != null)
		{
			idCount++;
			String previousName = visitMtl(ctx.mtl(0));
			ArrayList<RiTHMTruthValue> unaryNonTemporalEval = new ArrayList<RiTHMTruthValue>();
			ArrayList<RiTHMTruthValue> operandEval = evalStatus.get(previousName);
			for(int i = 0; i < operandEval.size();i++)
				unaryNonTemporalEval.add(evalNot(operandEval.get(i)));
				
		}
		
		return null;
	}
	protected final RiTHMTruthValue evalNot(RiTHMTruthValue tval)
	{
		if(tval.getTruthValueDescription().equals("?"))
			return new DefaultRiTHMTruthValue("?");
		if(Boolean.getBoolean(tval.getTruthValueDescription()))
			return new DefaultRiTHMTruthValue("false");
		else
			return new DefaultRiTHMTruthValue("true");
	}
	@Override
	public String visitPred(PredContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.PREDNAME().toString());
		return null;
	}

	@Override
	public String visitBinaryTemporal(BinaryTemporalContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		System.out.println(ctx.getPayload().toString());
		return null;
	}

	@Override
	public String visitInterval(IntervalContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		System.out.println(ctx.getPayload().toString());
		return null;
	}

	@Override
	public String visitIntervalNode(IntervalNodeContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		System.out.println(ctx.getPayload().toString());
		return null;
	}

	@Override
	public String visitBinaryNonTemporal(BinaryNonTemporalContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		System.out.println(ctx.getPayload().toString());
		return null;
	}
	

}
