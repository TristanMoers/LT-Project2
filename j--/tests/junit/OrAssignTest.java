package junit;

import junit.framework.*;
import pass.OrAssign;

public class OrAssignTest extends TestCase {

	private OrAssign or;

	protected void setUp() throws Exception { 
		super.setUp();
		or = new OrAssign (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testOr () { 
		this.assertEquals(or.eval(0, 42), 42);
		this.assertEquals(or.eval(1, 1), 1); 
		this.assertEquals(or.eval(3, 1), 3);
		this.assertEquals(or.eval(12, 1), 13);
		this.assertEquals(or.eval(190, 121), 255);
	}
} 