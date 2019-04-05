package junit;

import junit.framework.*;
import pass.DivAssign;

public class DivAssignTest extends TestCase {

	private DivAssign c;

	protected void setUp() throws Exception { 
		super.setUp();
		c = new DivAssign(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(c.eval(0, 42), 0);
		this.assertEquals(c.eval(42, 1), 42); 
		this.assertEquals(c.eval(127, 3), 42);
	}
}
