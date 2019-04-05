package junit;

import junit.framework.*;
import pass.Ternary;

public class TernaryTest extends TestCase {

	private Ternary xor;

	protected void setUp() throws Exception { 
		super.setUp();
		xor = new Ternary (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testTernary () { 

		this.assertEquals(xor.test(0, 42), 42);
	}
} 