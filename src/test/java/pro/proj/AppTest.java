package pro.proj;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
 
    public void testApp()
    {
	
		learn ta=new learn();
		int result =ta.multiply(1,6);
		int result2 =ta.divide(6,2);
		String result1 =ta.concate("a","b"); 
		assertEquals("ab",result1);
		assertEquals(3,result2);
		assertEquals(6,result);
         assertTrue( true );
    }
}
