package assertstypes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.CategoryAx;
import categories.CategoryBx;

public class NegativeAsserts {
	private int numberA = 2;
	private int numberB = 3;
	
	@Test
	@Category(CategoryAx.class)
	public void notEqualsValues() {
		assertNotEquals("Verify if number B isn't equal 2", 2, numberB);
	}
	
	@Test
	@Category(CategoryBx.class)
	public void falseCondition() {
		assertFalse("Verify if number A plus number B not equal 6", 6 == numberA + numberB);
	}
	
	@Test
	public void notNullValue() {
		assertNotNull("Verify if number A isn't null", numberA);
	}
}
