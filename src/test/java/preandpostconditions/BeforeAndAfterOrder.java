package preandpostconditions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterOrder {
	
	@BeforeClass
	public static void firstMethod() {
		System.out.println("Begin test sequence");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before each test");
	}
	
	@Test
	public void testOne() {
		System.out.println("This is a Test in any order");
	}
	
	@Test
	public void testTwo() {
		System.out.println("this is another test in any order");
	}
	
	@After
	public void afterTest() {
		System.out.println("After each test");
	}
	
	@AfterClass
	public static void lastMethod() {
		System.out.println("finish test sequence");
	}

}
