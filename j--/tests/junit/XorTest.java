package junit;

import junit.framework.*;
import pass.Xor;

public class XorTest extends TestCase {

	private Xor xor;

	protected void setUp() throws Exception { 
		super.setUp();
		xor = new Xor (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testXor () { 
		this.assertEquals(xor.xor(0, 42), 42);
		this.assertEquals(xor.xor(1, 1), 0); 
		this.assertEquals(xor.xor(3, 1), 2);
		this.assertEquals(xor.xor(12, 1), 13);
		this.assertEquals(xor.xor(190, 121), 199);
	}
} 