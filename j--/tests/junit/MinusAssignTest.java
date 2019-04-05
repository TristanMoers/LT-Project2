package junit;

import junit.framework.*;
import pass.MinusAssign;

public class MinusAssignTest extends TestCase {

	private MinusAssign c;

	protected void setUp() throws Exception { 
		super.setUp();
		c = new MinusAssign(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(c.eval(0, 42), -42);
		this.assertEquals(c.eval(42, 1), 41); 
		this.assertEquals(c.eval(127, 3), 124);
	}
}
