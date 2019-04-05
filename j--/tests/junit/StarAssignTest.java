package junit;

import junit.framework.*;
import pass.StarAssign;

public class StarAssignTest extends TestCase {

	private StarAssign c;

	protected void setUp() throws Exception { 
		super.setUp();
		c = new StarAssign(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(c.eval(0, 42), 0);
		this.assertEquals(c.eval(42, 1), 42); 
		this.assertEquals(c.eval(3, 3), 9);
	}
}
