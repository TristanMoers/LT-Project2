package junit;

import junit.framework.TestCase;
import pass.LShift;

public class LShiftTest extends TestCase {


	private LShift shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new LShift (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.shift(4, 1), 8);
		this.assertEquals(shift.shift(8, 2), 32);
		this.assertEquals(shift.shift(8, 12), 32768);
		this.assertEquals(shift.shift(-1, 0), -1);
		this.assertEquals(shift.shift(-1, 12), -4096);
		this.assertEquals(shift.shift(-2, 1), -4);
		this.assertEquals(shift.shift(-34, 2), -136);
	}
}
