package rithm.parsertools.ptltl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.log4j.Logger;

import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;
import rithm.core.ProgState;
import rithm.core.RitHMLogMessages;
import rithm.core.RitHMProgStateCollection;
import rithm.core.RitHMTruthValue;

import rithm.defaultcore.DefaultRiTHMTruthValue;
import rithm.parsertools.ptltl.ptltlgrammarParser.BinaryNonTemporalContext;
import rithm.parsertools.ptltl.ptltlgrammarParser.BinaryTemporalContext;
import rithm.parsertools.ptltl.ptltlgrammarParser.PredContext;
import rithm.parsertools.ptltl.ptltlgrammarParser.PtltlContext;
import rithm.parsertools.ptltl.ptltlgrammarParser.UnaryNonTemporalContext;
import rithm.parsertools.ptltl.ptltlgrammarParser.UnaryTemporalContext;

import java.lang.instrument.Instrumentation;

class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}

public class RitHMPTLTLVisitor extends ptltlgrammarBaseVisitor<String>{
	/**
	 * 
	 */
	protected int idCount;
	/**
	 * 
	 */
	protected HashMap<String, ArrayList<RitHMTruthValue>> evalStatus;
	protected HashMap<String, RitHMTruthValue> oldEvalStatus;
	/**
	 * 
	 */
	protected RitHMProgStateCollection progStateCollection;
	/**
	 * 
	 */
	protected ArrayList<PredicateState> allPredValues;
	/**
	 * 
	 */
	protected PredicateEvaluator pe;
	/**
	 * 
	 */
	protected boolean arePredicatesEvaluated;
	/**
	 * 
	 */
	final static Logger logger = Logger.getLogger(RitHMPTLTLVisitor.class);
	
	public RitHMPTLTLVisitor(RitHMProgStateCollection progStateCollection){
		super();
		this.evalStatus = new HashMap<String, ArrayList<RitHMTruthValue>>();
		this.progStateCollection = progStateCollection;
		idCount=0;
		arePredicatesEvaluated=false;
		allPredValues = new ArrayList<PredicateState>();
		oldEvalStatus = new HashMap<>();
	}
	/**Finds truth-value (at an index) of intermediate operand of the parse-tree
	 * @param nodeName Name of the intermediate operand
	 * @param i the event number
	 * @return RiTHMTruthValue of the intermediate operand denoted by nodeName for event i
	 * @see RitHMTruthValue
	 */
	public RitHMTruthValue getTruthValuation(String nodeName, int i)
	{
		return evalStatus.get(nodeName).get(i);
	}
	/**
	 * @param pe
	 */
	public void setPredicateEvaluator(PredicateEvaluator pe)
	{
		this.pe = pe;
	}
	
	/**
	 * @param predName
	 * @return
	 */
	private String evalPredicate(String predName)
	{
		logger.info(RitHMLogMessages.RITHM_PROCESS + predName);
		ArrayList<RitHMTruthValue> predEval = new ArrayList<RitHMTruthValue>();
		if(!arePredicatesEvaluated)
		{
			Iterator<ProgState> itProgState= progStateCollection.iterator();
			while(itProgState.hasNext())
			{
				pe.SetProgStateObj(itProgState.next());
				PredicateState predState = pe.evaluatePredicates();
				allPredValues.add(predState);
				RitHMTruthValue rtVal= new DefaultRiTHMTruthValue(Boolean.toString(predState.getValue(predName)));
				predEval.add(rtVal);
			}	
		}	
		else
		{
			for(int i = 0; i < allPredValues.size();i++)
			{
				RitHMTruthValue rtVal= new DefaultRiTHMTruthValue(Boolean.toString(allPredValues.get(i).getValue(predName)));
				predEval.add(rtVal);
			}
		}
//		oldEvalStatus.put(Integer.toString(idCount),unaryNonTemporalEval.get(unaryNonTemporalEval.size()-1));
		evalStatus.put(predName, predEval);
		return predName;
	}
	/**
	 * @param ctxBase
	 * @param previousName1
	 * @param previousName2
	 * @return
	 */
	private String evalBinaryNonTemporal(ParserRuleContext ctxBase, String previousName1, String previousName2)
	{
		String opName="";
		PtltlContext ctx = null;
		if(ctxBase instanceof PtltlContext)
			ctx = (PtltlContext) ctxBase;
		idCount++;

		ArrayList<RitHMTruthValue> binaryNonTemporalEval = new ArrayList<RitHMTruthValue>();
		ArrayList<RitHMTruthValue> operandEval1 = evalStatus.get(previousName1);
		ArrayList<RitHMTruthValue> operandEval2 = evalStatus.get(previousName2);
		RitHMTruthValue rtVal;
		
		if(ctx.binaryNonTemporal().ORNODE() != null)
		{
			opName = "or";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTruthValue(Boolean.toString(Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().ANDNODE() != null)
		{
			opName = "and";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTruthValue(Boolean.toString(Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) &&
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().IFNODE() != null)
		{
			opName = "if";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTruthValue(Boolean.toString(!Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		if(ctx.binaryNonTemporal().IFFNODE() != null)
		{
			opName = "iff";
			for(int i = 0 ; i < operandEval1.size();i++)
			{
				rtVal = new DefaultRiTHMTruthValue(Boolean.toString((!Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription())) && (Boolean.parseBoolean(operandEval1.get(i).getTruthValueDescription()) ||
						!Boolean.parseBoolean(operandEval2.get(i).getTruthValueDescription()))));
				binaryNonTemporalEval.add(i, rtVal);
			}
		}
		oldEvalStatus.put(Integer.toString(idCount),binaryNonTemporalEval.get(binaryNonTemporalEval.size()-1));
		evalStatus.put(Integer.toString(idCount), binaryNonTemporalEval);
		logger.info(RitHMLogMessages.RITHM_PROCESS + previousName1 + " " + previousName2 + " for "
				+ opName + ", Result into " +  Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	/**
	 * @param ctxBase
	 * @param previousName1
	 * @param previousName2
	 * @return
	 */
	private String evalBinaryTemporal(ParserRuleContext ctxBase, String previousName1, String previousName2)
	{
		PtltlContext ctx = null;
		if(ctxBase instanceof PtltlContext)
			ctx = (PtltlContext) ctxBase;
		idCount++;
		String opName ="";
		ArrayList<RitHMTruthValue> binaryTemporalEval = new ArrayList<RitHMTruthValue>();
		ArrayList<RitHMTruthValue> operandEval1 = evalStatus.get(previousName1);
		ArrayList<RitHMTruthValue> operandEval2 = evalStatus.get(previousName2);
		
//		System.out.println("Evaluating ");
		RitHMTruthValue previousVal;
		if(oldEvalStatus.containsKey(Integer.toString(idCount)))
			previousVal = oldEvalStatus.get(Integer.toString(idCount));
		else
			previousVal = new DefaultRiTHMTruthValue("true");
		
		if(ctx.binaryTemporal().SINCENODE() != null)
		{
			opName = "Since";
			
			for(int i = 0 ; i < operandEval2.size();i++){
				boolean toSet = false;
				if(operandEval2.get(i).getTruthValueDescription().equals("true")){
					toSet = true;
				}else{
					if(operandEval1.get(i).getTruthValueDescription().equals("true") &&
						previousVal.getTruthValueDescription().equals("true")){
						toSet = true;
					}
				}
				if(toSet){
					binaryTemporalEval.add(new DefaultRiTHMTruthValue("true"));
					previousVal = new DefaultRiTHMTruthValue("true");
				}
				else{
					binaryTemporalEval.add(new DefaultRiTHMTruthValue("false"));
					previousVal = new DefaultRiTHMTruthValue("false");
				}
			}
		}
		oldEvalStatus.put(Integer.toString(idCount),binaryTemporalEval.get(binaryTemporalEval.size()-1));
		evalStatus.put(Integer.toString(idCount), binaryTemporalEval);
		logger.info(RitHMLogMessages.RITHM_PROCESS + previousName1 + " " + previousName2 + " for "
				+ opName + " Result into " +  
				Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	/**
	 * @param ctxBase
	 * @param previousName
	 * @return
	 */
	private String evalUnaryTemporal(ParserRuleContext ctxBase, String previousName)
	{
		String opname="";
		PtltlContext ctx = null;
		if(ctxBase instanceof PtltlContext)
			ctx = (PtltlContext) ctxBase;
		idCount++;
		ArrayList<RitHMTruthValue> unaryTemporalEval = new ArrayList<RitHMTruthValue>();
		ArrayList<RitHMTruthValue> operandEval = evalStatus.get(previousName);
		RitHMTruthValue previousVal;
		if(oldEvalStatus.containsKey(Integer.toString(idCount)))
			previousVal = oldEvalStatus.get(Integer.toString(idCount));
		else
			previousVal = new DefaultRiTHMTruthValue("true");
		
		if(ctx.unaryTemporal().EVENTUALLYPASTNODE() != null)
		{
			opname="EventuallyPast";
			
			for(int i = 0 ; i < operandEval.size();i++){
				boolean toSet = false;
				if(operandEval.get(i).getTruthValueDescription().equals("true")){
					toSet = true;
				}else{
					if(previousVal.getTruthValueDescription().equals("true")){
						toSet = true;
					}
				}
				if(toSet){
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("true"));
					previousVal = new DefaultRiTHMTruthValue("true");
				}
				else{
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("false"));
					previousVal = new DefaultRiTHMTruthValue("false");
				}
			}
		}
		if(ctx.unaryTemporal().GLOBALLYPASTNODE()!= null)
		{
			opname = "GloballyPast";
			for(int i = 0 ; i < operandEval.size();i++){
				boolean toSet = false;
				if(operandEval.get(i).getTruthValueDescription().equals("true") &&
						previousVal.getTruthValueDescription().equals("true")){
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("true"));
					previousVal = new DefaultRiTHMTruthValue("true");
				}else{
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("false"));
					previousVal = new DefaultRiTHMTruthValue("false");
				}
			}
		}
		if(ctx.unaryTemporal().PREVIOUSLY()!= null)
		{
			opname = "Previously";
			for(int i = 0 ; i < operandEval.size();i++){
				boolean toSet = false;
				if(previousVal.getTruthValueDescription().equals("true")){
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("true"));
					previousVal = operandEval.get(i);
				}else{
					unaryTemporalEval.add(new DefaultRiTHMTruthValue("false"));
					previousVal = operandEval.get(i);
				}
			}
		}
		logger.info(RitHMLogMessages.RITHM_PROCESS + previousName + " for "
				+ opname + "}, Result into " +  
				Integer.toString(idCount));
		oldEvalStatus.put(Integer.toString(idCount),unaryTemporalEval.get(unaryTemporalEval.size()-1));
		evalStatus.put(Integer.toString(idCount), unaryTemporalEval);
		return Integer.toString(idCount);
	}
	/**
	 * @param previousName
	 * @return
	 */
	private String evalNotContext(String previousName)
	{
		idCount++;
		ArrayList<RitHMTruthValue> unaryNonTemporalEval = new ArrayList<RitHMTruthValue>();
		ArrayList<RitHMTruthValue> operandEval = evalStatus.get(previousName);
		for(int i = 0; i < operandEval.size();i++){
			logger.debug(evalNot(operandEval.get(i)).getTruthValueDescription());
			unaryNonTemporalEval.add(evalNot(operandEval.get(i)));
		}
		oldEvalStatus.put(Integer.toString(idCount),unaryNonTemporalEval.get(unaryNonTemporalEval.size()-1));
		evalStatus.put(Integer.toString(idCount), unaryNonTemporalEval);
		logger.info(RitHMLogMessages.RITHM_PROCESS + previousName + " for "
				+ "not" + ", Result into " +  
				Integer.toString(idCount));
		return Integer.toString(idCount);
	}
	/**
	 * @param tval
	 * @return
	 */
	protected final RitHMTruthValue evalNot(RitHMTruthValue tval)
	{
//		if(tval.getTruthValueDescription().equals("?"))
//			return new DefaultRiTHMTruthValue("?");
		if(Boolean.parseBoolean(tval.getTruthValueDescription()))
			return new DefaultRiTHMTruthValue("false");
		else
			return new DefaultRiTHMTruthValue("true");
	}
	@Override
	public String visitPtltl(PtltlContext ctx) {
		// TODO Auto-generated method stub
		String prevName, prevName1, prevName2;
		if(ctx.pred() != null){
			return evalPredicate(ctx.pred().PREDNAME().toString());
		}
		if(ctx.unaryNonTemporal() != null){
			prevName = visitPtltl(ctx.ptltl(0));
			return evalNotContext(prevName);
		}
		if(ctx.unaryTemporal() != null){
			prevName = visitPtltl(ctx.ptltl(0));
			return evalUnaryTemporal(ctx, prevName);
		}
		if(ctx.binaryNonTemporal() != null){
			prevName1 = visitPtltl(ctx.ptltl(0));
			prevName2 = visitPtltl(ctx.ptltl(1));
			return evalBinaryNonTemporal(ctx, prevName1, prevName2);
		}
		if(ctx.binaryTemporal() != null){
			prevName1 = visitPtltl(ctx.ptltl(0));
			prevName2 = visitPtltl(ctx.ptltl(1));
			return evalBinaryTemporal(ctx, prevName1, prevName2);
		}

		return visitPtltl(ctx.ptltl(0));
	}
	public int getBufferSize(){
		return oldEvalStatus.size();
	}
	@Override
	public String visitUnaryNonTemporal(UnaryNonTemporalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnaryNonTemporal(ctx);
	}

	@Override
	public String visitUnaryTemporal(UnaryTemporalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnaryTemporal(ctx);
	}

	@Override
	public String visitPred(PredContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPred(ctx);
	}

	@Override
	public String visitBinaryTemporal(BinaryTemporalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBinaryTemporal(ctx);
	}

	@Override
	public String visitBinaryNonTemporal(BinaryNonTemporalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBinaryNonTemporal(ctx);
	}
	
}
