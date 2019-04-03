package junit;

import junit.framework.TestCase;
import pass.Less;

public class LessTest extends TestCase {


	private Less less;

	protected void setUp() throws Exception { 
		super.setUp();
		less = new Less (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLess () { 		
		this.assertTrue(less.less(1, 2));
		this.assertTrue(less.less(11, 12));
		this.assertTrue(less.less(-2, -1));
		this.assertFalse(less.less(2, 1));
		this.assertFalse(less.less(-7, -8));
	}
}
