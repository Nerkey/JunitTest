package com.test.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTestSuite(CalculatorTest.class);
        suite.addTestSuite(LargestTest.class);

        return suite;
    }

}
