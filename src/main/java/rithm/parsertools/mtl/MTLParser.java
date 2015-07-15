package rithm.parsertools.mtl;
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
import rithm.parsertools.mtl.*;
import rithm.parsertools.mtl.MTLParserParser.PredContext;
class MTLErrorListener extends BaseErrorListener
{
	Boolean validation_result;
	String error_message;
	public MTLErrorListener()
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

public class MTLParser extends ParserPlugin{
	/**
     * The language used by the parser
     * Currently Unused
     */
	private String specLang;
	/**
     * Collection of Predicates for the specifications parsed by the parser
     * @see #getPredicates()
     */
	private HashMap<String, ArrayList<String>> predsForSpec;
	private ArrayList<RitHMPredicate> predicateList;
	/**
     * A Map used to maintain the references between specifications and predicates
     * @see #getPredicates()
     */
	private HashMap<RitHMPredicate, Integer> predCount;
	
	/**
     * A Map used to maintain the references between specifications and predicates
     * @see #getSpecs()
     */
	private RitHMSpecificationCollection specList;
	
	/**
     * A Map used to maitain the references between specifications and predicates
     * @see #validateSpecs()
     */
	private ArrayList<Boolean> specValidationList;
	private MTLParserLexer lexer;
	private MTLParserParser parser;
	private HashMap<RitHMSpecification, String> errorMessages;
	
	public enum Mode
	{
		insert,
		delete
	}
	public MTLParser(String Lang)
	{
		specLang = Lang;
		specList  = new DefaultRiTHMSpecificationCollection();
		specValidationList = new ArrayList<Boolean>();
		predicateList = new ArrayList<RitHMPredicate>();
		predCount = new HashMap<RitHMPredicate, Integer>();
		errorMessages = new HashMap<RitHMSpecification, String>();
		predsForSpec = new HashMap<String, ArrayList<String>>();
	}
	class RiTHMMTLgrammarListener extends MTLParserBaseListener
	{
		int mode;
		String spec;
		public RiTHMMTLgrammarListener(int mode, String spec)
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
				RitHMPredicate rp = new DefaultRiTHMPredicate(ctx.PREDNAME().toString());
				if(!predicateList.contains(rp))
				{
					predicateList.add(rp);
				}
				if(predCount.containsKey(rp))
				{
					predCount.put(rp, predCount.get(rp)+1);
				}
				else
				{
					predCount.put(rp, 1);
				}
				if(!predsForSpec.containsKey(spec))
					predsForSpec.put(spec, new ArrayList<String>());
				if(!predsForSpec.get(spec).contains(ctx.PREDNAME().toString()))
					predsForSpec.get(spec).add(ctx.PREDNAME().toString());
				break;
			case 2:
				RitHMPredicate rp1 = new DefaultRiTHMPredicate(ctx.PREDNAME().toString());
				if(predCount.get(rp1) <= 1)
				{
					predCount.remove(rp1);
					predicateList.remove(rp1);
//					System.out.println("deleted from PredicateList" + ctx.PREDNAME().toString());
					for (RitHMPredicate each_pred: predicateList)
						System.out.println(each_pred.getTextDescription());
				}
				else
				{
					predCount.put(rp1, predCount.get(rp1)-1);
				}
				if(predsForSpec.get(spec).contains(ctx.PREDNAME().toString()))
				{
					predsForSpec.get(spec).remove(ctx.PREDNAME().toString());
					if(predsForSpec.get(spec).size() <= 0)
						predsForSpec.remove(spec);
				}
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
	public boolean removeSpec(RitHMSpecification Spec) {
		// TODO Auto-generated method stub
		validatesSpec(Spec,2);
		specList.remove(Spec);
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
				RitHMSpecification r = new DefaultRiTHMSpecification(line);
				specList.add(r);
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
	public boolean loadSpecs(RitHMSpecificationCollection Specs) {
		// TODO Auto-generated method stub
		for(RitHMSpecification spec : Specs )
			this.specList.add(spec);
		validateSpecs();
		return false;
	}

	@Override 
	public ArrayList<Boolean> validateSpecs() {
		// TODO Auto-generated method stub

		for(int i = 0; i < specList.length();i++)
		{	
			if(!validatesSpec(specList.at(i),1))
				specList.remove(i);
			
		}
		for(int i = 0; i < specList.length();i++)
			specValidationList.add(true);
		
		return specValidationList;
	}

	@Override
	public boolean appendSpec(RitHMSpecification Spec) {
		// TODO Auto-generated method stub

		if(validatesSpec(Spec,1))
		{
			specList.add(Spec);
			specValidationList.add(true);
		}
		else
			return false;
		return true;
	}
	
	public ParseTree getTreeforSpec(RitHMSpecification spec)
	{
		lexer = new MTLParserLexer(new ANTLRInputStream(spec.getTextDescription()));
		lexer.removeErrorListeners();
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		parser = new MTLParserParser(tokenstream);
		return parser.mtl();
	}
	private boolean validatesSpec(RitHMSpecification Spec, int mode)
	{
		lexer = new MTLParserLexer(new ANTLRInputStream(Spec.getTextDescription()));
		lexer.removeErrorListeners();
		MTLErrorListener le2 = new MTLErrorListener();
		lexer.addErrorListener(le2);
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		RiTHMMTLgrammarListener rllistener = new RiTHMMTLgrammarListener(mode, Spec.getTextDescription());
//		RiTHMMTLVisitor rVisitor = new RiTHMMTLVisitor(null, null);
		parser = new MTLParserParser(tokenstream);
		ParseTreeWalker ptwalker = new ParseTreeWalker();
		parser.removeErrorListeners();
		MTLErrorListener le1 = new MTLErrorListener();
		parser.addErrorListener(le1);
		ParseTree ptree = parser.mtl();
//		rVisitor.visit(ptree);
		ptwalker.walk(rllistener, ptree);
		boolean retval = le1.validation_result && le2.validation_result;
		ptwalker = null;
		
		if(retval)
			errorMessages.put(Spec, "No error, Valid MTL formula\n");
		else
			errorMessages.put(Spec, le1.error_message + le2.error_message);
		
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
		return specValidationList;
	}

	@Override
	public boolean exportSpecs(RitHMSpecificationCollection Specs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rewriteSpecs(RitHMSpecificationCollection Specs) {
		// TODO Auto-generated method stub

		return true;
	}

	@Override
	public RitHMSpecificationCollection getSpecs()
	{
		return specList;
	}
	@Override
	public ArrayList<RitHMPredicate> getPredicates()
	{
		return predicateList;
	}
	@Override
	public HashMap<RitHMSpecification, String> getErrorMessages() {
		// TODO Auto-generated method stub
		return errorMessages;
	}
	public void clearErrors()
	{
		errorMessages.clear();
	}
	public String getErrorforSpec(RitHMSpecification Spec)
	{
		if(errorMessages.containsKey(Spec))
			return errorMessages.get(Spec);
		else
			return "No Record Found";
	}

	@Override
	public boolean removeAllSpecs() {
		// TODO Auto-generated method stub
		for(RitHMSpecification each_spec: specList)
			validatesSpec(each_spec, 2);
		specList.clear();
		return false;
	}
	public ArrayList<String> getPredsForSpec(String spec)
	{
		if(predsForSpec.containsKey(spec))
			return predsForSpec.get(spec);
		return null;
	}

	@Override
	public String rewriteSpec(RitHMSpecification spec) {
		// TODO Auto-generated method stub
		return spec.getTextDescription();
	}
	
}
