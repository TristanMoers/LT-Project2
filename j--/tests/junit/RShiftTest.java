package junit;

import junit.framework.TestCase;
import pass.RShift;

public class RShiftTest extends TestCase {


	private RShift shift;

	protected void setUp() throws Exception { 
		super.setUp();
		shift = new RShift (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShift () { 
		this.assertEquals(shift.shift(4, 1), 2);
		this.assertEquals(shift.shift(8, 2), 2);
		this.assertEquals(shift.shift(8, 12), 0);
		this.assertEquals(shift.shift(-1, 0), -1);
		this.assertEquals(shift.shift(-1, 12), -1);
		this.assertEquals(shift.shift(-2, 1), -1);
		this.assertEquals(shift.shift(-34, 2), -9);
	}
}
