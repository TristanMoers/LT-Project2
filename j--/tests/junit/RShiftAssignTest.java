package junit;

import junit.framework.TestCase;
import pass.RShiftAssign;

public class RShiftAssignTest extends TestCase {


	private RShiftAssign shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new RShiftAssign (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.eval(4, 1), 2);
		this.assertEquals(shift.eval(8, 2), 2);
		this.assertEquals(shift.eval(8, 12), 0);
		this.assertEquals(shift.eval(-1, 0), -1);
		this.assertEquals(shift.eval(-1, 12), -1);
		this.assertEquals(shift.eval(-2, 1), -1);
		this.assertEquals(shift.eval(-34, 2), -9);
	}
}
