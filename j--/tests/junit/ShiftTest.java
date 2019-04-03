package junit;

import junit.framework.TestCase;
import pass.Shift;

public class ShiftTest extends TestCase {


	private Shift shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new Shift (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.shift(4, 1), 2);
		this.assertEquals(shift.shift(8, 2), 2);
		this.assertEquals(shift.shift(8, 12), 0);
		this.assertEquals(shift.shift(-1, 0), -1);
		this.assertEquals(shift.shift(-1, 25), 127);
		this.assertEquals(shift.shift(-1, 31), 1);
		this.assertEquals(shift.shift(-1, 32), -1);
	}
}
