package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import enums.PatternsEnum;
import junit.framework.TestCase;
import main.Patterns;

public class TestPatterns extends TestCase {
	
	public void testPeakPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(4,5));
		expected.add(Arrays.asList(3,5,6));
		expected.add(Arrays.asList(3,3,3));
		
		List<Integer> serie = Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PEAK, serie));
	}
}
