package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App2.
 */
public class App2Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App2Test.class );
    }

    /**
     * Test addition with positive numbers
     */
    public void testAdditionPositive()
    {
        assertEquals(13, App2.addition(10, 3));
    }

    /**
     * Test addition with negative numbers
     */
    public void testAdditionNegative()
    {
        assertEquals(-8, App2.addition(-5, -3));
    }

}