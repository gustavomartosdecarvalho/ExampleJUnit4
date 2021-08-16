package assertstypes;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.CategoryAx;
import categories.CategoryBx;

import java.util.Arrays;
import java.util.List;

public class ThatAsserts {
	
	List<Integer> primeNumbers = Arrays.asList(2,3,5,7,11,13);
	
	@Test
	@Category(CategoryAx.class)
	public void isEqualString() {
		assertThat("This word", is("This word"));
	}
	
	@Test
	@Category(CategoryAx.class)
	public void isEqualNumber() {
		assertThat(10, is(10));
	}
	
	@Test
	public void notEqualString() {
		assertThat("This word", not("Those words"));
	}
	
	@Test
	public void notNullValue() {
		assertThat("Not null", not(nullValue()));
	}
	
	@Test
	public void isNotEqualNumber() {
		assertThat(10, is(not(5)));
	}
	
	@Test
	@Category(CategoryBx.class)
	public void anyOfThisWords() {
		assertThat("Good", anyOf(is("Bad"), is("Good")));
	}
	
	@Test
	@Category(CategoryBx.class)
	public void allOfThisNames() {
		assertThat("The Dark Knight", allOf(startsWith("The"), endsWith("night")));
	}
	
	@Test
	@Category(CategoryBx.class)
	public void containsAllOfThisString() {
		assertThat("spider", allOf(startsWith("s"), containsString("id")));
	}
	
	@Test
	@Category(CategoryBx.class)
	public void isAInteger() {
		assertThat(10, isA(Integer.class));
	}
	
	@Test
	public void xGreaterThanY() {
		assertThat(100, greaterThan(99));
	}
	
	@Test
	public void xLessThanY() {
		assertThat(-1, lessThan(0));
	}
	
	@Test
	public void primeNumbersHasSize() {
		assertThat(primeNumbers, hasSize(6));
	}
	
	@Test
	public void primeNumbersHasItem() {
		assertThat(primeNumbers, hasItem(7));
	}
	
	@Test
	public void primeNumbersHasIntems() {
		assertThat(primeNumbers, hasItems(3,13));
	}
	
	@Test
	public void primeNumbersContains() {
		assertThat(primeNumbers, contains(2,3,5,7,11,13));
	}
	
	@Test
	public void primeNumbersContainsInAnyOrder() {
		assertThat(primeNumbers, containsInAnyOrder(11,13,3,7,5,2));
	}

}
