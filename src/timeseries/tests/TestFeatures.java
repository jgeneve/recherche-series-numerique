package timeseries.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import results.objects.FeatureResult;
import results.objects.PatternResult;
import timeseries.functions.Feature;

public class TestFeatures extends TestCase {

	// SURFACE
	public void testSurfaceFeature() throws Exception {
		List<List<Integer>> patternRes = new ArrayList<List<Integer>>();
		List<List<Integer>> patternPos = new ArrayList<List<Integer>>();
		patternRes.add(Arrays.asList(3,4,3));
		patternRes.add(Arrays.asList(1,3,2));
		
		patternPos.add(Arrays.asList(2,3,4));
		patternPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(patternRes, patternPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(10, 6), Arrays.asList(2,11));	
		
		assertEquals(expected, Feature.surf(resultsPattern));
	}
	
	// WIDTH
	public void testWidthFeature() throws Exception {
		List<List<Integer>> patternRes = new ArrayList<List<Integer>>();
		List<List<Integer>> patternPos = new ArrayList<List<Integer>>();
		patternRes.add(Arrays.asList(3,4,3));
		patternRes.add(Arrays.asList(1,3,2));
		
		patternPos.add(Arrays.asList(2,3,4));
		patternPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(patternRes, patternPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(3, 3), Arrays.asList(2,11));	
		
		assertEquals(expected, Feature.width(resultsPattern));
	}
	
	// MIN
	public void testMinFeature() throws Exception {
		List<List<Integer>> patternRes = new ArrayList<List<Integer>>();
		List<List<Integer>> patternPos = new ArrayList<List<Integer>>();
		patternRes.add(Arrays.asList(3,4,3));
		patternRes.add(Arrays.asList(1,3,2));
		
		patternPos.add(Arrays.asList(2,3,4));
		patternPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(patternRes, patternPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(3,1), Arrays.asList(4,11));	
		
		assertEquals(expected, Feature.min(resultsPattern));
	}

	// MAX
	public void testMaxFeature() throws Exception {
		List<List<Integer>> patternRes = new ArrayList<List<Integer>>();
		List<List<Integer>> patternPos = new ArrayList<List<Integer>>();
		patternRes.add(Arrays.asList(3,4,3));
		patternRes.add(Arrays.asList(1,3,2));
		
		patternPos.add(Arrays.asList(2,3,4));
		patternPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(patternRes, patternPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(4,3), Arrays.asList(3,12));	
		
		assertEquals(expected, Feature.max(resultsPattern));
	}

	// ONE
	public void testOneFeature() throws Exception {

		List<List<Integer>> expectedRes = new ArrayList<List<Integer>>();
		List<List<Integer>> expectedPos = new ArrayList<List<Integer>>();
		expectedRes.add(Arrays.asList(3,4,3));
		expectedRes.add(Arrays.asList(1,3,2));
		
		expectedPos.add(Arrays.asList(2,3,4));
		expectedPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(expectedRes, expectedPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(3,1), Arrays.asList(2,11));	
		
		assertEquals(expected, Feature.one(resultsPattern));
	}
	
	// RANGE
	public void testRangeFeature() throws Exception {
		List<List<Integer>> expectedRes = new ArrayList<List<Integer>>();
		List<List<Integer>> expectedPos = new ArrayList<List<Integer>>();
		expectedRes.add(Arrays.asList(3,4,3));
		expectedRes.add(Arrays.asList(1,3,2));
		
		expectedPos.add(Arrays.asList(2,3,4));
		expectedPos.add(Arrays.asList(11,12,13));
		
		PatternResult resultsPattern = new PatternResult(expectedRes, expectedPos);
		
		FeatureResult expected = new FeatureResult(Arrays.asList(1,2), Arrays.asList(1,2));	
		
		assertEquals(expected.getPosSeriesInFeature(), Feature.range(resultsPattern).getSeriesInFeature());
	}
}
