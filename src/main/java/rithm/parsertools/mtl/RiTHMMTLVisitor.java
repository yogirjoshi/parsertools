package rithm.parsertools.mtl;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;

import javax.print.attribute.standard.MediaSize.Other;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.apache.log4j.Logger;

import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;
import rithm.core.ProgState;
import rithm.core.RiTHMPredicate;
import rithm.core.RiTHMProgStateCollection;
import rithm.core.RiTHMTruthValue;
import rithm.defaultcore.DefaultRiTHMTimedTruthValue;
import rithm.defaultcore.DefaultRiTHMTruthValue;
//import rithm.mtl.MTLMonitor;
import rithm.parsertools.mtl.MTLParserParser.BinaryNonTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.BinaryTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.IntervalContext;
import rithm.parsertools.mtl.MTLParserParser.IntervalNodeContext;
import rithm.parsertools.mtl.MTLParserParser.MtlContext;
import rithm.parsertools.mtl.MTLParserParser.PredContext;
import rithm.parsertools.mtl.MTLParserParser.UnaryNonTemporalContext;
import rithm.parsertools.mtl.MTLParserParser.UnaryTemporalContext;
import rithm.core.RiTHMLogMessages;
public class RiTHMMTLVisitor extends MTLParserBaseVisitor<String>{

	protected int idCount;
	protected HashMap<String, ArrayList<RiTHMTruthValue>> evalStatus;
	protected RiTHMProgStateCollection progStateCollection;
	protected ArrayList<PredicateState> allPredValues;
	protected PredicateEvaluator pe;
	protected boolean arePredicatesEvaluated;
	final static Logger logger = Logger.getLogger(RiTHMMTLVisitor.class);
	public RiTHMMTLVisitor(RiTHMProgStateCollection progStateCollection)
	{
		super();
		this.evalStatus = new HashMap<String, ArrayList<RiTHMTruthValue>>();
		this.progStateCollection = progStateCollection;
		idCount=0;
		arePredicatesEvaluated=false;
		allPredValues = new ArrayList<PredicateState>();
	}
	public RiTHMTruthValue getTruthValuation(String nodeName)
	{
		return evalStatus.get(nodeName).get(0);
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
		return null;
	}

	@Override
	public String visitUnaryTemporal(UnaryTemporalContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0; i < ctx.getChildCount();i++)
			visit(ctx.getChild(i));
		return null;
	}
	
	private String evalPredicate(String predName)
	{
		logger.info(RiTHMLogMessages.RITHM_PROCESS + predName);
		ArrayList<RiTHMTruthValue> predEval = new ArrayList<RiTHMTruthValue>();
		if(!arePredicatesEvaluated)
		{
			Iterator<ProgState> itProgState= progStateCollection.iterator();
			while(itProgState.hasNext())
			{
				pe.SetProgStateObj(itProgState.next());
				PredicateState predState = pe.evaluatePredicates();
				allPredValues.add(predState);
				RiTHMTruthValue rtVal= new DefaultRiTHMTimedTruthValue(Boolean.toString(predState.getValue(predName)));
				rtVal.setTimetamp(predState.getTimestamp());
				predEval.add(rtVal);
//				System.out.println(rtVal);
			}	
		}	
		else
		{
			for(int i = 0; i < allPredValues.size();i++)
			{
				RiTHMTruthValue rtVal= new DefaultRiTHMTimedTruthValue(Boolean.toString(allPredValues.get(i).getValue(predName)));
				rtVal.setTimetamp(allPredValues.get(i).getTimestamp());
				predEval.add(rtVal);
//				System.out.println(rtVal);
			}
		}
		evalStatus.put(predName, predEval);
		return predName;
	}
	private String evalBinaryNonTemporal(ParserRuleContext ctxBase, String previousName1, String previousName2)
	{
		String opName="";
		MtlContext ctx = null;
		if(ctxBase instanceof MtlContext)
			ctx = (MtlContext) ctxBase;
		idCount++;

		ArrayList<RiTHMTruthValue> binaryNonTemporalEval = new ArrayList<RiTHMTruthValue>();
		ArrayList<RiTHMTruthValue> operandEval1 = evalStatus.get(previousName1);
		ArrayList<RiTHMTruthValue> operandEval2 = evalStatus.get(previousName2);
		RiTHMTruthValue rtVal;
		if(ctx.binaryNonTemporal().ORNODE() != null)
		{
			opName = "or";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTimedTruthValue(Boolean.toString(Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().ANDNODE() != null)
		{
			opName = "and";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTimedTruthValue(Boolean.toString(Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) &&
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().IFNODE() != null)
		{
			opName = "if";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTimedTruthValue(Boolean.toString(!Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().IFFNODE() != null)
		{
			opName = "iff";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTimedTruthValue(Boolean.toString((!Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())) && (Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						!Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription()))));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		evalStatus.put(Integer.toString(idCount), binaryNonTemporalEval);
		logger.info(RiTHMLogMessages.RITHM_PROCESS + previousName1 + " " + previousName2 + " for "
				+ opName + ", Result into " +  Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	private String evalBinaryTemporal(ParserRuleContext ctxBase, String previousName1, String previousName2)
	{
		MtlContext ctx = null;
		if(ctxBase instanceof MtlContext)
			ctx = (MtlContext) ctxBase;
		idCount++;
		String opName ="";
		ArrayList<RiTHMTruthValue> binaryTemporalEval = new ArrayList<RiTHMTruthValue>();
		ArrayList<RiTHMTruthValue> operandEval1 = evalStatus.get(previousName1);
		ArrayList<RiTHMTruthValue> operandEval2 = evalStatus.get(previousName2);
		
		String intervalString = visit(ctx.binaryTemporal().intervalNode().interval());
		String[] intervalParts = intervalString.split(",");
		Double begInterval = Double.valueOf(intervalParts[0]);
		Double endInterval = Double.valueOf(intervalParts[1]);
		
//		System.out.println("Evaluating ");
		if(ctx.binaryTemporal().UNTILNODE() != null)
		{
			opName = "Until";
//			System.out.println("Until with interval " + begInterval +" " + endInterval );
//			System.out.println("for" + previousName1 + " " + previousName2 + "\n");
			for(int i = 0; i < operandEval1.size();i++)	
			{
				Double startTS = begInterval + operandEval1.get(i).getTimetamp();
				Double endTS = endInterval + operandEval1.get(i).getTimetamp();
				int j = i, k = i;
				RiTHMTruthValue found = new DefaultRiTHMTimedTruthValue("?");
				while(j < operandEval2.size())
				{
					if(operandEval2.get(j).getTimetamp() <= endTS)
					{
						if(operandEval2.get(j).getTruthValueDescription().equals("true") 
								&& operandEval2.get(j).getTimetamp() >= startTS)
						{
							found = new DefaultRiTHMTimedTruthValue("true");
							break;
						} 	
						if(operandEval1.get(k).getTruthValueDescription().equals("false"))
							break;
					}
					else
						break;
					j++; k++;
				}
				RiTHMTruthValue rtVal = null;
				if(found.getTruthValueDescription().equals("true"))
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				if(found.getTruthValueDescription().equals("?") || j > operandEval2.size())
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}

				rtVal.setTimetamp(operandEval1.get(i).getTimetamp());
//				System.out.println(rtVal);
				binaryTemporalEval.add(rtVal);
			}
		}
		if(ctx.binaryTemporal().SINCENODE() != null)
		{
			opName = "Since";
			for(int i = 0; i < operandEval1.size();i++)	
			{
				Double startTS = begInterval - operandEval1.get(i).getTimetamp();
				Double endTS = endInterval - operandEval1.get(i).getTimetamp();
				int j = i, k = i;
				RiTHMTruthValue found = new DefaultRiTHMTimedTruthValue("?");
				while(j >= 0)
				{
					if(operandEval2.get(j).getTimetamp() >= endTS  ){
						if(operandEval2.get(j).getTruthValueDescription().equals("true") 
								&& operandEval2.get(j).getTimetamp() <= startTS)
						{
							found = new DefaultRiTHMTimedTruthValue("true");
							break;
						}

						if(operandEval1.get(k).getTruthValueDescription().equals("false"))
							break;
					}
					j--;k--;
				}
				RiTHMTruthValue rtVal = null;
				if(found.getTruthValueDescription().equals("true"))
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				if(found.getTruthValueDescription().equals("?") || j < 0)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}
				rtVal.setTimetamp(operandEval1.get(i).getTimetamp());
				binaryTemporalEval.add(rtVal);
			}
		}
		evalStatus.put(Integer.toString(idCount), binaryTemporalEval);
		logger.info(RiTHMLogMessages.RITHM_PROCESS + previousName1 + " " + previousName2 + " for "
				+ opName + "{" + begInterval + "," + endInterval + "}, Result into " +  
				Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	private String evalUnaryTemporal(ParserRuleContext ctxBase, String previousName)
	{
		String opname="";
		MtlContext ctx = null;
		if(ctxBase instanceof MtlContext)
			ctx = (MtlContext) ctxBase;
		idCount++;
		ArrayList<RiTHMTruthValue> unaryTemporalEval = new ArrayList<RiTHMTruthValue>();
		ArrayList<RiTHMTruthValue> operandEval = evalStatus.get(previousName);
		
		String intervalString = visit(ctx.unaryTemporal().intervalNode().interval());
		String[] intervalParts = intervalString.split(",");
		Double begInterval = Double.valueOf(intervalParts[0]);
		Double endInterval = Double.valueOf(intervalParts[1]);
		if(ctx.unaryTemporal().EVENTUALLYNODE() != null)
		{
			opname="eventually";
			for(int i = 0; i < operandEval.size();i++)	
			{
				Double startTS = begInterval + operandEval.get(i).getTimetamp();
				Double endTS = endInterval + operandEval.get(i).getTimetamp();
				int j = i;
				boolean found = false;
				while(j < operandEval.size())
				{
					if(operandEval.get(j).getTimetamp() <= endTS){
						if(operandEval.get(j).getTruthValueDescription().equals("true") 
								&& operandEval.get(j).getTimetamp() >= startTS)
						{
							found = true;
							break;
						}
					}
					j++;
				}
				RiTHMTruthValue rtVal = null;
				if(found == true)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				if(found == false)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}

				rtVal.setTimetamp(operandEval.get(i).getTimetamp());
				unaryTemporalEval.add(rtVal);
			}
		}
		if(ctx.unaryTemporal().GLOBALLYNODE()!= null)
		{
			opname = "globally";
			for(int i = 0; i < operandEval.size();i++)
			{
				Double startTS = begInterval + operandEval.get(i).getTimetamp();
				Double endTS = endInterval + operandEval.get(i).getTimetamp();
				int j = i;
				RiTHMTruthValue found = new DefaultRiTHMTimedTruthValue("?");;
				while(j < operandEval.size())
				{
//					if(operandEval.get(j).getTruthValueDescription().equals("?") 
//							&& operandEval.get(j).getTimetamp() >= startTS)
//					{
//						found = new DefaultRiTHMTimedTruthValue("?");
//						break;
//					}
					if(operandEval.get(j).getTimetamp() <= endTS ){
						if(operandEval.get(j).getTruthValueDescription().equals("false") 
								&& operandEval.get(j).getTimetamp() >= startTS)
						{
							found = new DefaultRiTHMTimedTruthValue("false");
							break;
						}
					}
					j++;

				}
				RiTHMTruthValue rtVal = null;
				if(found.getTruthValueDescription().equals("?"))
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				else if(found.getTruthValueDescription().equals("false") || j >= operandEval.size())
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}
//				if(j >= operandEval.size() || (found.getTruthValueDescription().equals("?") && j < operandEval.size()))
//				{
//					rtVal= new DefaultRiTHMTimedTruthValue("?");
//				}
				rtVal.setTimetamp(operandEval.get(i).getTimetamp());
				unaryTemporalEval.add(rtVal);
			}
		}
		if(ctx.unaryTemporal().EVENTUALLYPASTNODE() != null)
		{
			opname="eventually^-1";
			for(int i = 0; i < operandEval.size();i++)
			{
				Double startTS =  operandEval.get(i).getTimetamp() - begInterval;
				Double endTS = operandEval.get(i).getTimetamp() - endInterval;
				int j = i;
				boolean found = false;
				while(j >= 0)
				{
					if(operandEval.get(j).getTimetamp() >= endTS){
						if(operandEval.get(j).getTruthValueDescription().equals("true")
								&& operandEval.get(j).getTimetamp() <= startTS)
						{
							found = true;
							break;
						}
					}
					j--;
				}
				RiTHMTruthValue rtVal = null;
				if(found == true)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				if(found == false)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}
//				if(j < 0 && found == false)
//				{
//					rtVal= new DefaultRiTHMTimedTruthValue("?");
//				}
				rtVal.setTimetamp(operandEval.get(i).getTimetamp());
				unaryTemporalEval.add(rtVal);
			}
		}
		if(ctx.unaryTemporal().GLOBALLYPASTNODE() != null)
		{
			opname = "globally^-1";
			for(int i = 0; i < operandEval.size();i++)
			{
				Double startTS =  operandEval.get(i).getTimetamp() - begInterval;
				Double endTS = operandEval.get(i).getTimetamp() - endInterval;
				int j = i;
				RiTHMTruthValue found = new DefaultRiTHMTimedTruthValue("?");;
				while(j >= 0)
				{
//					if(operandEval.get(j).getTruthValueDescription().equals("?") 
//							&& operandEval.get(j).getTimetamp() <= startTS)
//					{
//						found = new DefaultRiTHMTimedTruthValue("?");
//						break;
//					}
					if(operandEval.get(j).getTimetamp() >= endTS)
					{
						if(operandEval.get(j).getTruthValueDescription().equals("false") 
								&& operandEval.get(j).getTimetamp() <= startTS)
						{
							found = new DefaultRiTHMTimedTruthValue("false");
							break;
						}
					}
					j--;
				}
				RiTHMTruthValue rtVal = null;
				if(found.getTruthValueDescription().equals("?"))
				{
					rtVal= new DefaultRiTHMTimedTruthValue("true");
				}
				else if(found.getTruthValueDescription().equals("false") || j < 0)
				{
					rtVal= new DefaultRiTHMTimedTruthValue("false");
				}
//				if(j < 0 || (found.getTruthValueDescription().equals("?") && j >= 0))
//				{
//					rtVal= new DefaultRiTHMTimedTruthValue("?");
//				}
				rtVal.setTimetamp(operandEval.get(i).getTimetamp());
				unaryTemporalEval.add(rtVal);
			}
		}
		logger.info(RiTHMLogMessages.RITHM_PROCESS + previousName + " for "
				+ opname + "{" + begInterval + "," + endInterval + "}, Result into " +  
				Integer.toString(idCount));
		evalStatus.put(Integer.toString(idCount), unaryTemporalEval);
		return Integer.toString(idCount);
	}
	private String evalNotContext(String previousName)
	{
		idCount++;
		ArrayList<RiTHMTruthValue> unaryNonTemporalEval = new ArrayList<RiTHMTruthValue>();
		ArrayList<RiTHMTruthValue> operandEval = evalStatus.get(previousName);
		for(int i = 0; i < operandEval.size();i++)
			unaryNonTemporalEval.add(evalNot(operandEval.get(i)));
		evalStatus.put(Integer.toString(idCount), unaryNonTemporalEval);
		logger.info(RiTHMLogMessages.RITHM_PROCESS + previousName + " for "
				+ "not" + ", Result into " +  
				Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	@Override
	public String visitMtl(MtlContext ctx) {

		if(ctx.pred() != null)
			return evalPredicate(ctx.pred().PREDNAME().toString());
		//TODO: add timestamp to truthvalue, 
		if(ctx.unaryNonTemporal() != null)
		{
			String previousName = visitMtl(ctx.mtl(0));
			return evalNotContext(previousName);
		}
		if(ctx.unaryTemporal() != null)
		{
			String previousName = visitMtl(ctx.mtl(0));
			return evalUnaryTemporal(ctx, previousName);
			
		}
		if(ctx.binaryTemporal() != null)
		{
			String previousName1 = visitMtl(ctx.mtl(0));
			String previousName2 = visitMtl(ctx.mtl(1));
			return evalBinaryTemporal(ctx, previousName1, previousName2);
		}
		if(ctx.binaryNonTemporal() != null)
		{
			String previousName1 = visitMtl(ctx.mtl(0));
			String previousName2 = visitMtl(ctx.mtl(1));
			return evalBinaryNonTemporal(ctx, previousName1, previousName2);
		}
		return visitMtl(ctx.mtl(0));
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
//		for(int i =0; i < ctx.getChildCount();i++)
//			visit(ctx.getChild(i));
//		System.out.println("returning " + ctx.NUM(0).toString() + "," + ctx.NUM(1).toString());
		return ctx.NUM(0).toString() + "," + ctx.NUM(1).toString();
//		System.out.println(ctx.getPayload().toString());
//		return null;
	}

	@Override
	public String visitIntervalNode(IntervalNodeContext ctx) {
		// TODO Auto-generated method stub
//		for(int i =0; i < ctx.getChildCount();i++)
//			visit(ctx.getChild(i));
//		System.out.println(ctx.getPayload().toString());
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
