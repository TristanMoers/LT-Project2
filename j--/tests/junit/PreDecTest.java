package junit;

import junit.framework.TestCase;
import pass.PreDec;

public class PreDecTest extends TestCase {


	private PreDec dec;

	protected void setUp() throws Exception { 
		super.setUp();
		dec = new PreDec (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLess () { 		
		this.assertEquals(dec.dec(0),  -1);
		this.assertEquals(dec.dec(5),  4);
		this.assertEquals(dec.dec(-12),  -13);
	}
}
