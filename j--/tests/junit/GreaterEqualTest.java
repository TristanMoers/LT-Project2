package junit;

import junit.framework.TestCase;
import pass.GreaterEqual;

public class GreaterEqualTest extends TestCase {


	private GreaterEqual ge;

	protected void setUp() throws Exception { 
		super.setUp();
		ge = new GreaterEqual (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLess () { 		
		this.assertTrue(ge.ge(1, 1));
		this.assertTrue(ge.ge(11, 10));
		this.assertTrue(ge.ge(-2, -3));
		this.assertFalse(ge.ge(2, 3));
		this.assertFalse(ge.ge(-7, -6));
	}
}
