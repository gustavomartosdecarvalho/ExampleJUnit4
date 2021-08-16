package suites;

import org.junit.runner.JUnitCore;

public class ExternalRun {

	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.run(SimpleSuite.class);
		//junit.run(SuiteCategoryAx.class);
		//junit.run(SuiteExcludeCategoryBx.class);
//		System.out.println("End tests");
	}

}
