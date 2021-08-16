package suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import assertstypes.NegativeAsserts;
import assertstypes.PositiveAsserts;
import assertstypes.ThatAsserts;
import categories.CategoryAx;

@RunWith(Categories.class)
@IncludeCategory(CategoryAx.class)
@SuiteClasses({PositiveAsserts.class, NegativeAsserts.class, ThatAsserts.class})
public class SuiteCategoryAx {

}
