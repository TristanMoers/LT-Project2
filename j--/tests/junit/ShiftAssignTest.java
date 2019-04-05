package junit;

import junit.framework.TestCase;
import pass.ShiftAssign;

public class ShiftAssignTest extends TestCase {


	private ShiftAssign shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new ShiftAssign (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.eval(4, 1), 2);
		this.assertEquals(shift.eval(8, 2), 2);
		this.assertEquals(shift.eval(8, 12), 0);
		this.assertEquals(shift.eval(-1, 0), -1);
		this.assertEquals(shift.eval(-1, 25), 127);
		this.assertEquals(shift.eval(-1, 31), 1);
		this.assertEquals(shift.eval(-1, 32), -1);
	}
}
