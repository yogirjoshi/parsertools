package rithm.parsertools;

import java.lang.reflect.Array;
import java.util.ArrayList;

import rithm.core.RitHMPredicate;
import rithm.defaultcore.DefaultRiTHMSpecification;
import rithm.parsertools.ltl.LTLParser;
import rithm.parsertools.mtl.MTLParser;
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
    public void testApp()
    {
        assertTrue( true );
    }
}
