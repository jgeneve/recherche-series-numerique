package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import main.Feature;

public class TestFeatures extends TestCase {

	// WIDTH
	public void testSurfaceFeature() throws Exception {
		List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
		resultsPattern.add(Arrays.asList(3,3));
		resultsPattern.add(Arrays.asList(3,5));
		resultsPattern.add(Arrays.asList(3,3,3));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(6);		
		expected.add(8);		
		expected.add(9);		
		
		assertEquals(expected, Feature.surf(resultsPattern));
	}
	
	// WIDTH
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
	
	// WIDTH null
		public void testWidthNull() throws Exception {
			List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
			resultsPattern.add(Arrays.asList());
			resultsPattern.add(Arrays.asList(3,5,6));
			resultsPattern.add(Arrays.asList(3,3,3));	
			
			assertEquals(null, Feature.width(resultsPattern));
		}
	
	
	
	// MIN
	public void testMinFeature() throws Exception {
		List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
		resultsPattern.add(Arrays.asList(4,5));
		resultsPattern.add(Arrays.asList(3,5,6));
		resultsPattern.add(Arrays.asList(3,3,3));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(4);		
		expected.add(3);		
		expected.add(3);		
		
		assertEquals(expected, Feature.min(resultsPattern));
	}

	// MAX
	public void testMaxFeature() throws Exception {
		List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
		resultsPattern.add(Arrays.asList(4,5));
		resultsPattern.add(Arrays.asList(3,5,6));
		resultsPattern.add(Arrays.asList(3,3,3));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(5);		
		expected.add(6);		
		expected.add(3);		
		
		assertEquals(expected, Feature.max(resultsPattern));
	}
	
	// ONE
	public void testOneFeature() throws Exception {
		List<List<Integer>> resultsPattern = new ArrayList<List<Integer>>();
		resultsPattern.add(Arrays.asList(4,5));
		resultsPattern.add(Arrays.asList(3,22,6));
		resultsPattern.add(Arrays.asList(8,3,3));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(4);		
		expected.add(3);		
		expected.add(8);		
		
		assertEquals(expected, Feature.one(resultsPattern));
	}
}
