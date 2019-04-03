package junit;

import junit.framework.*;
import pass.Mod;

public class ModTest extends TestCase {

	private Mod mod;

	protected void setUp() throws Exception { 
		super.setUp();
		mod = new Mod(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide () { 
		this.assertEquals(mod.mod(0, 42), 0);
		this.assertEquals(mod.mod(42, 1), 0); 
		this.assertEquals(mod.mod(12, 3), 0);
		this.assertEquals(mod.mod(13, 3), 1);
	}
}
