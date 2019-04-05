package junit;

import junit.framework.TestCase;
import pass.LShiftAssign;

public class LShiftAssignTest extends TestCase {


	private LShiftAssign shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new LShiftAssign (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.eval(4, 1), 8);
		this.assertEquals(shift.eval(8, 2), 32);
		this.assertEquals(shift.eval(8, 12), 32768);
		this.assertEquals(shift.eval(-1, 0), -1);
		this.assertEquals(shift.eval(-1, 12), -4096);
		this.assertEquals(shift.eval(-2, 1), -4);
		this.assertEquals(shift.eval(-34, 2), -136);
	}
}
