package com.aetsmtl.fizzbApp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String BUZZFIZZ = "fizzBuzz";
	
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
        assertTrue( true );
    }
    
    public void testCheckFizzBuzz ()
    {
    	Buzzer b = new Buzzer();
    	List<Integer> buzzing = new ArrayList<Integer>();
    	buzzing.add(0); buzzing.add(12); buzzing.add(13);
    	buzzing.add(14); buzzing.add(15); buzzing.add(20);
    	try 
    	{
    		b.setInputNumber(buzzing.get(0).intValue());
        	assertEquals(BUZZFIZZ , b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(1).intValue());
        	assertEquals(FIZZ , b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(2).intValue());
        	assertEquals("13" , b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(3).intValue());
        	assertEquals("14" , b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(4).intValue());
        	assertEquals(BUZZFIZZ , b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(5).intValue());
        	assertEquals(BUZZ , b.checkFizzBuzz());	
    	}
    	catch (Exception e)
    	{
    		System.out.print(e.getMessage());
    	}	
    	
    }
    
    public void testExceptionCheckFizzBuzz ()
    {
    	Buzzer b = new Buzzer();
    	List<Integer> buzzing = new ArrayList<Integer>();
    	buzzing.add(0); buzzing.add(-9);
    	try 
    	{
    		b.setInputNumber(buzzing.get(0).intValue());
        	assertEquals(BUZZFIZZ, b.checkFizzBuzz());
        	
        	b.setInputNumber(buzzing.get(1).intValue());
        	//if exception wasn't handled
        	assertFalse(true);
        	
    	}
    	catch (Exception e)
    	{
    		System.out.print(e.getMessage());
    		assertTrue(true);
    	}
    }

}
