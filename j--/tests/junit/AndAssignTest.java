package junit;

import junit.framework.*;
import pass.AndAssign;

public class AndAssignTest extends TestCase {

	private AndAssign and;

	protected void setUp() throws Exception { 
		super.setUp();
		and = new AndAssign(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(and.eval(0, 42), 0);
		this.assertEquals(and.eval(1, 1), 1); 
		this.assertEquals(and.eval(3, 1), 1);
		this.assertEquals(and.eval(12, 1), 0);
		this.assertEquals(and.eval(190, 121), 56);
	}
}
