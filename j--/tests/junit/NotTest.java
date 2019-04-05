package junit;

import junit.framework.TestCase;
import pass.Not;

public class NotTest extends TestCase {


	private Not not;

	protected void setUp() throws Exception { 
		super.setUp();
		not = new Not (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLor () { 		
		this.assertEquals(not.not(0), 0b11111111111111111111111111111111);
		this.assertEquals(not.not(0b11111111111111111111111111111111), 0);
		this.assertEquals(not.not(0b11111111000000001111111100000000), 0b00000000111111110000000011111111);
	}
}
