package junit;

import junit.framework.*;
import pass.XorAssign;

public class XorAssignTest extends TestCase {

	private XorAssign xor;

	protected void setUp() throws Exception { 
		super.setUp();
		xor = new XorAssign (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testXor () { 
		this.assertEquals(xor.eval(0, 42), 42);
		this.assertEquals(xor.eval(1, 1), 0); 
		this.assertEquals(xor.eval(3, 1), 2);
		this.assertEquals(xor.eval(12, 1), 13);
		this.assertEquals(xor.eval(190, 121), 199);
	}
} 