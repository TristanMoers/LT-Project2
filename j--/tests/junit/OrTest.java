package junit;

import junit.framework.*;
import pass.Or;

public class OrTest extends TestCase {

	private Or or;

	protected void setUp() throws Exception { 
		super.setUp();
		or = new Or (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testOr () { 
		this.assertEquals(or.or(0, 42), 42);
		this.assertEquals(or.or(1, 1), 1); 
		this.assertEquals(or.or(3, 1), 3);
		this.assertEquals(or.or(12, 1), 13);
		this.assertEquals(or.or(190, 121), 255);
	}
} 