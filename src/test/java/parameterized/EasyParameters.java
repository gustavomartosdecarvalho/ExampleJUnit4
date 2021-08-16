package parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EasyParameters {
	
	@Parameter(0)
	public String name;
	
	@Parameter(1)
	public int group;
	
	@Parameter(2)
	public int number;
	
	@Parameters(name = "Name: {0}   Group: {1}   Number: {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"A", 0, -1}, {"B", 0, 0}, {"C", 1, 1}, {"D", 1, 99}, {"E", 1, 100}, {"F", 2, 101}, {"G", 2, 150}
		});
	}
	
	@Test
	public void numberLessFiveHundred() {
		assertTrue(number < 500);
	}
	
	@Test
	public void groupNumbers() {
		int validGroup = 0;
		if(number < 1) {
			validGroup = 0;
		}else if (number <= 100) {
			validGroup = 1;
		}else {
			validGroup = 2;
		}
		assertEquals(validGroup, group);
	}
	
	@Test
	public void nameHasOneCaracter() {
		assertEquals(1, name.length());
	}
}
