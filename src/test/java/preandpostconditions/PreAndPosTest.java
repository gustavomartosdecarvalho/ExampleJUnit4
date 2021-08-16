package preandpostconditions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreAndPosTest {
	
	private int x = 10;
	private int y = 2;

	@Before
	public void beforeCalc() {
		x--;
	}
	
	@Test
	public void xEquals9() {
		assertEquals("x == 9", 9, x);
	}

	
	@Test
	public void xNotEqual10() {
		assertNotEquals("x != 10", 10, x);
	}

	
	@Test
	public void yEquals2() {
		assertEquals("y == 2", 2, y);
	}

	
	@Test
	public void yNotEquals4() {
		assertNotEquals("y != 4", 4, y);
	}
	
	@Test
	public void sumXandY() {
		assertEquals("X + Y = 11", 11 , x + y);
	}
	
	@Test
	public void subXAndY() {
		assertEquals("X - Y = 7", 7 , x - y);
	}
	
	@After
	public void afterCalc() {
		y = y*2;
	}
}
