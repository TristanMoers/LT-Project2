package junit;

import junit.framework.TestCase;
import pass.Lor;

public class LorTest extends TestCase {


	private Lor lor;

	protected void setUp() throws Exception { 
		super.setUp();
		lor = new Lor (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLor () { 		
		this.assertTrue(lor.lor(true, true));
		this.assertTrue(lor.lor(true, false));
		this.assertTrue(lor.lor(false, true));
		this.assertFalse(lor.lor(false, false));
	}
}
