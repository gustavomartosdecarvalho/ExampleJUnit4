package othersannotations;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;


public class IgnoreTests {

	@Ignore(value = "test skipped")
	@Test
	public void ignoredTestTrueAssert() {
		assertTrue(true);
	}
	@Ignore(value = "test skipped")
	@Test
	public void ignoredTestFalseAssert() {
		assertTrue(false);
	}
	
	@Test
	public void testOk() {
		assertTrue(true);
	}
}
