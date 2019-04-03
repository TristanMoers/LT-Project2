package junit;

import junit.framework.TestCase;
import pass.PostInc;

public class PostIncTest extends TestCase {


	private PostInc inc;

	protected void setUp() throws Exception { 
		super.setUp();
		inc = new PostInc (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLess () { 		
		this.assertEquals(inc.inc(0),  1);
		this.assertEquals(inc.inc(5),  6);
		this.assertEquals(inc.inc(-12),  -11);
	}
}
