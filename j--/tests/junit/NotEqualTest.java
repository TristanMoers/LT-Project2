package junit;

import junit.framework.TestCase;
import pass.NotEqual;

public class NotEqualTest extends TestCase {


	private NotEqual ne;

	protected void setUp() throws Exception { 
		super.setUp();
		ne = new NotEqual (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testNotEqual () {
		this.assertTrue(ne.check(1, 2));
		this.assertTrue(ne.check(52, 53));
		this.assertTrue(ne.check(-123, -1));
		this.assertFalse(ne.check(-123, -123));
		this.assertFalse(ne.check(0, -0));
	}
}
