package rithm.parsertools;

import java.lang.reflect.Array;
import java.util.ArrayList;

import rithm.core.RitHMPredicate;
import rithm.defaultcore.DefaultRiTHMSpecification;
import rithm.parsertools.foltl.FOLTLParser;
import rithm.parsertools.ltl.LTLParser;
import rithm.parsertools.mtl.MTLParser;
import rithm.parsertools.ptltl.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ParserTestCollection 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParserTestCollection( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ParserTestCollection.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLTL1()
    {
    	LTLParser ltlParser = new LTLParser("LTL");
    	assertTrue(ltlParser.appendSpec(new DefaultRiTHMSpecification("<>B0")));
    	ltlParser.appendSpec(new DefaultRiTHMSpecification("[](a-><>bUc)"));
    	ltlParser.appendSpec(new DefaultRiTHMSpecification("[]((q&&! r&&<>r)->(p U r))"));
    	ltlParser.appendSpec(new DefaultRiTHMSpecification("[]((q&&! r&&<>r)->(! s U r))"));
    	System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("[](a-><>bUc)")));
    	System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("[]((q&&! r&&<>r)->(p U r))")));
    	System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("[]((q&&! r&&<>r)->(! s U r))")));
    }
    public void testPTLTL1()
    {
    	PTLTLParser ltlParser = new PTLTLParser("PTLTL");
    	assertTrue(ltlParser.appendSpec(new DefaultRiTHMSpecification("<*>B0")));
    }
    public void testMTL1()
    {
    	MTLParser mtlParser = new MTLParser("MTL");
    	assertTrue(mtlParser.appendSpec(new DefaultRiTHMSpecification("<>{1,2}b")));
    	assertTrue(mtlParser.appendSpec(new DefaultRiTHMSpecification("20-><>{0,0.5}20")));
    	assertTrue(mtlParser.appendSpec(new DefaultRiTHMSpecification("aU{1,2}b")));
    	assertFalse(mtlParser.appendSpec(new DefaultRiTHMSpecification("aU1,2}b")));
    	ArrayList<String> res;
    	res = mtlParser.getPredsForSpec("<>{1,2}b");
    	assertTrue(res.contains("b"));
    	ArrayList<RitHMPredicate> preds = mtlParser.getPredicates();
    	mtlParser.removeSpec(new DefaultRiTHMSpecification("<>{1,2}b"));
    	assertTrue(mtlParser.getPredsForSpec("<>{1,2}b")==null);
    }
    public void testPTLTL2()
    {
    	PTLTLParser ltlParser = new PTLTLParser("LTL");
    	assertTrue(ltlParser.appendSpec(new DefaultRiTHMSpecification("aSb")));
    	assertTrue(ltlParser.appendSpec(new DefaultRiTHMSpecification("[*](a->(!(X*b))&&b)")));
    	ltlParser.appendSpec(new DefaultRiTHMSpecification("[*](aS<*>b)"));
    	System.out.println(ltlParser.getErrorforSpec(new DefaultRiTHMSpecification("[*](aS(<*>b))")));
 
    }
    public void testFOLTL()
    {
    	FOLTLParser foltlParser = new FOLTLParser("FOLTL");
//    	assertTrue(foltlParser.appendSpec(new DefaultRiTHMSpecification("FORALL(Y)")));
    	foltlParser.appendSpec(new DefaultRiTHMSpecification("FORALL(YOBJ)[](a(YOBJ))"));
//    	System.out.println(foltlParser.getErrorforSpec(new DefaultRiTHMSpecification("FORALL(Y)[](a(Y))")));
    	assertTrue(foltlParser.appendSpec(new DefaultRiTHMSpecification("FORALL(T)EXISTS(Z)FORALL(Y)[](b(Z)->a(Y)Ub(T))")));
    	System.out.println(foltlParser.getErrorforSpec(new DefaultRiTHMSpecification("FORALL(Z)FORALL(Y)[](a(Y)Ub(Y))")));
//    	foltlParser.appendSpec(new DefaultRiTHMSpecification("[*](aS<*>b)"));
//    	System.out.println(foltlParser.getErrorforSpec(new DefaultRiTHMSpecification("[*](aS(<*>b))")));
    	for (String objID : foltlParser.getObjectIDs("FORALL(T)EXISTS(Z)FORALL(Y)[](b(Z)->a(Y)Ub(T))"))
    		System.out.println(objID);
    	System.out.println(foltlParser.rewriteSpec(new DefaultRiTHMSpecification("FORALL(T)EXISTS(Z)FORALL(Y)[](b(Z)->a(Y)Ub(T))")));
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
