package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import assertstypes.NegativeAsserts;
import assertstypes.PositiveAsserts;
import assertstypes.ThatAsserts;

@RunWith(Suite.class)
@SuiteClasses({PositiveAsserts.class, NegativeAsserts.class, ThatAsserts.class})
public class SimpleSuite {

}
