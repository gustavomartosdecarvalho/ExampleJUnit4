package othersannotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTests {
	
	@Rule public Timeout timesup = Timeout.seconds(1);
	
	@Test
	public void VerifyCalc() {
		int a = 2;
		int b = 4;
		assertTrue(b == a*a);
	}
	
	@Test
	public void waiting() throws InterruptedException {
		Thread.sleep(950);
	}
	
	
	@Test(timeout = 2000)
	public void VerifyFruits() {
		String selectedFruit = "Apple";
		String storedFruit = "Apple";
		assertEquals(selectedFruit, storedFruit);
	}
}
