package junit;

import junit.framework.*;
import pass.And;

public class AndTest extends TestCase {

	private And and;

	protected void setUp() throws Exception { 
		super.setUp();
		and = new And(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testXor () { 
		this.assertEquals(and.and(0, 42), 0);
		this.assertEquals(and.and(1, 1), 1); 
		this.assertEquals(and.and(3, 1), 1);
		this.assertEquals(and.and(12, 1), 0);
		this.assertEquals(and.and(190, 121), 56);
		
	}
} 