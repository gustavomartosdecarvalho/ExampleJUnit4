package othersannotations;

import static org.junit.Assert.assertEquals;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;

//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTest {
	
	@Test()
	public void first() {
		assertEquals("first", "first");
	}
	
	@Test()
	public void second() {
		assertEquals("second", "second");
	}
	
	@Test()
	public void last() {
		assertEquals("last", "last");
	}

}
