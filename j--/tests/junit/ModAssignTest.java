package junit;

import junit.framework.*;
import pass.ModAssign;

public class ModAssignTest extends TestCase {

	private ModAssign c;

	protected void setUp() throws Exception { 
		super.setUp();
		c = new ModAssign(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(c.eval(0, 42), 0);
		this.assertEquals(c.eval(42, 1), 0); 
		this.assertEquals(c.eval(4, 3), 1);
	}
}
