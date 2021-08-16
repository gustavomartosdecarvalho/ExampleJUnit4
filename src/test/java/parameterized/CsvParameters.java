package parameterized;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;;

@RunWith(JUnitParamsRunner.class)
public class CsvParameters {

	@Test
	@FileParameters(value = "src/test/resources/ParamsList.csv", mapper = CsvWithHeaderMapper.class)
	public static void gradeAboveSix(String name, int mathGrade, int englishGrade, int scienceGrade, int historyGrade) {
		double totalGrades = (mathGrade + englishGrade + scienceGrade + historyGrade) / 4;
		double minimumGrade = 6.0;
		assertTrue(minimumGrade < totalGrades);
	}
	
}
