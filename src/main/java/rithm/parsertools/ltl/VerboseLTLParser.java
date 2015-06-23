package rithm.parsertools.ltl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Hashtable;

import org.antlr.runtime.*;
import org.antlr.v4.codegen.model.SrcOp;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import rithm.core.*;
import rithm.defaultcore.DefaultRiTHMPredicate;
import rithm.defaultcore.DefaultRiTHMSpecification;
import rithm.defaultcore.DefaultRiTHMSpecificationCollection;
import rithm.parsertools.ltl.verboseltlgrammarParser.PredContext;

class verboseltlErrorListener extends BaseErrorListener
{
	Boolean validation_result;
	String error_message;
	public verboseltlErrorListener()
	{
		super();
		validation_result = true;
		error_message ="";
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
			int stopIndex, boolean exact, BitSet ambigAlts,
			ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts,
				configs);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, BitSet conflictingAlts,
			ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex,
				conflictingAlts, configs);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex,
				prediction, configs);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		// TODO Auto-generated method stub
		validation_result = false;
		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
		error_message = "line "+line+":"+charPositionInLine+" at "+
				offendingSymbol+": "+msg;
	}
	
}

public class VerboseLTLParser extends ParserPlugin{
	/**
     * The language used by the parser
     * Currently Unused
     */
	private String SpecLang;
	/**
     * Collection of Predicates for the specifications parsed by the parser
     * @see #getPredicates()
     */
	private HashMap<String, ArrayList<String>> predsForSpec;
	private ArrayList<RiTHMPredicate> PredicateList;
	/**
     * A Map used to maintain the references between specifications and predicates
     * @see #getPredicates()
     */
	private HashMap<RiTHMPredicate, Integer> PredCount;
	
	/**
     * A Map used to maintain the references between specifications and predicates
     * @see #getSpecs()
     */
	private RiTHMSpecificationCollection SpecList;
	
	/**
     * A Map used to maitain the references between specifications and predicates
     * @see #validateSpecs()
     */
	private ArrayList<Boolean> SpecValidationList;
	private verboseltlgrammarLexer lexer;
	private verboseltlgrammarParser parser;
	private HashMap<RiTHMSpecification, String> ErrorMessages;
	public enum Mode
	{
		insert,
		delete
	}
	public VerboseLTLParser(String Lang)
	{
		SpecLang = Lang;
		SpecList  = new DefaultRiTHMSpecificationCollection();
		SpecValidationList = new ArrayList<Boolean>();
		PredicateList = new ArrayList<RiTHMPredicate>();
		PredCount = new HashMap<RiTHMPredicate, Integer>();
		ErrorMessages = new HashMap<RiTHMSpecification, String>();
		predsForSpec = new HashMap<String, ArrayList<String>>();
	}
	class RiTHMltlgrammarListener extends verboseltlgrammarBaseListener
	{
		int mode;
		String spec;
		public RiTHMltlgrammarListener(int mode, String spec)
		{
			super();
			this.mode = mode;
			this.spec = spec;
		}
		@Override
		public void enterPred(PredContext ctx) {
			// TODO Auto-generated method stub
			super.enterPred(ctx);
//			System.out.println(PredCount.get(ctx.PREDNAME().toString()));
			switch (mode) {
			case 1:
				RiTHMPredicate rp = new DefaultRiTHMPredicate(ctx.PREDNAME().toString());
				if(!PredicateList.contains(rp))
				{
					PredicateList.add(rp);
				}
				if(PredCount.containsKey(rp))
				{
					PredCount.put(rp, PredCount.get(rp)+1);
				}
				else
				{
					PredCount.put(rp, 1);
				}
				if(!predsForSpec.containsKey(spec))
					predsForSpec.put(spec, new ArrayList<String>());
				if(!predsForSpec.get(spec).contains(ctx.PREDNAME().toString()))
					predsForSpec.get(spec).add(ctx.PREDNAME().toString());
				break;
			case 2:
				RiTHMPredicate rp1 = new DefaultRiTHMPredicate(ctx.PREDNAME().toString());
				if(PredCount.get(rp1) <= 1)
				{
					PredCount.remove(rp1);
					PredicateList.remove(rp1);
//					System.out.println("deleted from PredicateList" + ctx.PREDNAME().toString());
					for (RiTHMPredicate each_pred: PredicateList)
						System.out.println(each_pred.getTextDescription());
				}
				else
				{
					PredCount.put(rp1, PredCount.get(rp1)-1);
				}
				if(predsForSpec.get(spec).contains(ctx.PREDNAME().toString()))
					predsForSpec.get(spec).remove(ctx.PREDNAME().toString());
				break;
			default:
				break;
			}

		}
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	@Override
	public boolean removeSpec(RiTHMSpecification Spec) {
		// TODO Auto-generated method stub
		validate_spec(Spec,2);
		SpecList.remove(Spec);
		return false;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public boolean loadSpecs(String filename){
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(filename));
			String line = null;

			while((line = br.readLine())!= null)
			{
				RiTHMSpecification rs = new DefaultRiTHMSpecification(line);
				SpecList.add(rs);
			}
			br.close();
		}
		catch(IOException ie)
		{
			return false;
		}
		validateSpecs();
		return true;
	}

	@Override
	public boolean loadSpecs(RiTHMSpecificationCollection Specs) {
		// TODO Auto-generated method stub
		for(RiTHMSpecification spec: Specs)
			this.SpecList.add(spec);
		validateSpecs();
		return false;
	}

	@Override 
	public ArrayList<Boolean> validateSpecs() {
		// TODO Auto-generated method stub

		for(int i = 0; i < SpecList.length();i++)
		{	
			if(!validate_spec(SpecList.at(i),1))
				SpecList.remove(i);
			
		}
		for(int i = 0; i < SpecList.length();i++)
			SpecValidationList.add(true);
		
		return SpecValidationList;
	}

	@Override
	public boolean appendSpec(RiTHMSpecification Spec) {
		// TODO Auto-generated method stub

		if(validate_spec(Spec,1))
		{
			SpecList.add(Spec);
			SpecValidationList.add(true);
		}
		else
			return false;
		return true;
	}
	private boolean validate_spec(RiTHMSpecification Spec, int mode)
	{
		lexer = new verboseltlgrammarLexer(new ANTLRInputStream(Spec.getTextDescription()));
		lexer.removeErrorListeners();
		verboseltlErrorListener le2 = new verboseltlErrorListener();
		lexer.addErrorListener(le2);
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		RiTHMltlgrammarListener rllistener = new RiTHMltlgrammarListener(mode, Spec.getTextDescription());
		parser = new verboseltlgrammarParser(tokenstream);
		ParseTreeWalker ptwalker = new ParseTreeWalker();
		parser.removeErrorListeners();
		verboseltlErrorListener le1 = new verboseltlErrorListener();
		parser.addErrorListener(le1);
		ParseTree ptree = parser.ltl();
		ptwalker.walk(rllistener, ptree);
		boolean retval = le1.validation_result && le2.validation_result;
		ptwalker = null;
		
		if(retval)
			ErrorMessages.put(Spec, "No error, Valid LTL formula\n");
		else
			ErrorMessages.put(Spec, le1.error_message + le2.error_message);
		
		lexer = null;
		parser = null;
		tokenstream = null;
		le1 = null;
		le2 = null;

		return retval;
	}
	@Override
	public ArrayList<Boolean> validationResults() {
		// TODO Auto-generated method stub
		return SpecValidationList;
	}

	@Override
	public boolean exportSpecs(RiTHMSpecificationCollection args) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rewriteSpecs(RiTHMSpecificationCollection args) {
		// TODO Auto-generated method stub

		return true;
	}
	@Override
	public RiTHMSpecificationCollection getSpecs()
	{
		return SpecList;
	}
	@Override
	public ArrayList<RiTHMPredicate> getPredicates()
	{
		return PredicateList;
	}
	@Override
	public HashMap<RiTHMSpecification, String> getErrorMessages() {
		// TODO Auto-generated method stub
		return ErrorMessages;
	}
	public void clearErrors()
	{
		ErrorMessages.clear();
	}
	public String getErrorforSpec(RiTHMSpecification Spec)
	{
		if(ErrorMessages.containsKey(Spec))
			return ErrorMessages.get(Spec);
		else
			return "No Record Found";
	}

	@Override
	public boolean removeAllSpecs() {
		// TODO Auto-generated method stub
		for(RiTHMSpecification each_spec: SpecList)
			validate_spec(each_spec, 2);
		SpecList.clear();
		return false;
	}
	public ArrayList<String> getPredsForSpec(String spec)
	{
		if(predsForSpec.containsKey(spec))
			return predsForSpec.get(spec);
		return null;
	}

	@Override
	public String rewriteSpec(RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		String rewrittenSpec = spec.getTextDescription();
		rewrittenSpec = rewrittenSpec.replaceAll(" AND ", "&&");
		rewrittenSpec = rewrittenSpec.replaceAll(" OR ", "||");
		rewrittenSpec = rewrittenSpec.replaceAll(" IF-AND-ONLY-IF ", "<->");
		rewrittenSpec = rewrittenSpec.replaceAll(" IMPLIES ", "->");
		rewrittenSpec = rewrittenSpec.replaceAll(" UNTIL ", "U");
		rewrittenSpec = rewrittenSpec.replaceAll(" EVENTUALLY ", "<>");
		rewrittenSpec = rewrittenSpec.replaceAll(" ALWAYS ", "[]");
		rewrittenSpec = rewrittenSpec.replaceAll(" NOT ", "!");
		return rewrittenSpec;
	}

	@Override
	public ParseTree getTreeforSpec(RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
