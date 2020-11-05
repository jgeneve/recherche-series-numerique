package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import main.Feature;

public class TestFeatures extends TestCase {
	
	public void testWidthFeature() throws Exception {
		List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
		resultsPattern.add(Arrays.asList(4,5));
		resultsPattern.add(Arrays.asList(3,5,6));
		resultsPattern.add(Arrays.asList(3,3,3));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(2);		
		expected.add(3);		
		expected.add(3);		
		
		assertEquals(expected, Feature.width(resultsPattern));
	}
}
