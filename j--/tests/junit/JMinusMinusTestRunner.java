// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import java.io.File;
import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;
import pass.*;

/**
 * JUnit test suite for running the j-- programs in tests/pass.
 */

public class JMinusMinusTestRunner {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(HelloWorldTest.class);
        suite.addTestSuite(FactorialTest.class);
        suite.addTestSuite(SeriesTest.class);
        suite.addTestSuite(ClassesTest.class);
        suite.addTestSuite(ShiftTest.class);
        suite.addTestSuite(LorTest.class);
        suite.addTestSuite(OrTest.class);
        suite.addTestSuite(XorTest.class);
        suite.addTestSuite(AndTest.class);
        suite.addTestSuite(LessTest.class);
        suite.addTestSuite(GreaterEqualTest.class);
        suite.addTestSuite(PreDecTest.class);
        suite.addTestSuite(RShiftTest.class);
        suite.addTestSuite(LShiftTest.class);
        suite.addTestSuite(DivisionTest.class);
        suite.addTestSuite(ModTest.class);
        suite.addTestSuite(NotEqualTest.class);
        suite.addTestSuite(MinusAssignTest.class);
        suite.addTestSuite(StarAssignTest.class);
        suite.addTestSuite(DivAssignTest.class);
        suite.addTestSuite(ModAssignTest.class);
        suite.addTestSuite(AndAssignTest.class);
        suite.addTestSuite(XorAssignTest.class);
        suite.addTestSuite(OrAssignTest.class);
        suite.addTestSuite(RShiftAssignTest.class);
        suite.addTestSuite(LShiftAssignTest.class);
        suite.addTestSuite(ShiftAssignTest.class);
        suite.addTestSuite(NotTest.class);
        //suite.addTestSuite(TernaryTest.class);
        return suite;
    }

    /**
     * Runs the test suite using the textual runner.
     */

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
