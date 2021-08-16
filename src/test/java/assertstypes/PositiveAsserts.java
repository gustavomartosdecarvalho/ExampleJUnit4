package assertstypes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.CategoryAx;
import categories.CategoryBx;

public class PositiveAsserts {
	private int numberA = 2;
	private int numberB = 3;
	private Object numberC = null;
	
	@Test
	@Category(CategoryAx.class)
	public void equalValues() {
		assertEquals("Verify if number A is equal 2", 2, numberA);
	}
	
	@Test
	@Category(CategoryAx.class)
	public void arrayEqualsValues() {
		String[] expectedDays = {"Monday", "Wednesday","Fryday"};
		String[] realDays = {"Monday", "Wednesday","Fryday"};
		assertArrayEquals("Verify Gym days", expectedDays, realDays);
	}
	
	@Test
	@Category(CategoryBx.class)
	public void trueCondition() {
		assertTrue("Verify if number A plus number B equals 5", 5 == numberA + numberB);
	}
	
	@Test
	public void nullValue() {
		assertNull("Verify if number C is null", numberC );
	}
		
}
