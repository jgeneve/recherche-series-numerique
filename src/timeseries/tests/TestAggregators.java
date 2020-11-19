package timeseries.tests;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import results.objects.AggregatorResult;
import results.objects.FeatureResult;
import timeseries.functions.Aggregator;


public class TestAggregators extends TestCase {
	
	// TEST AGGREGATORS
	public void test_MIN_Aggregator() throws Exception {

		// INPUT (featureResult)
		List<Integer> seriesInFeature = Arrays.asList(2,1,4);
		List<Integer> posSerieInFeature = Arrays.asList(0,4,9);
		FeatureResult input = new FeatureResult(seriesInFeature, posSerieInFeature);
		
		// EXPECTED
		AggregatorResult expected = new AggregatorResult(1, Arrays.asList(4));
		
		assertEquals(expected, Aggregator.min(input));
	}

	// TEST AGGREGATORS
	public void test_MAX_Aggregator() throws Exception {

		// INPUT (featureResult)
		List<Integer> seriesInFeature = Arrays.asList(4,1,4);
		List<Integer> posSerieInFeature = Arrays.asList(0,4,9);
		FeatureResult input = new FeatureResult(seriesInFeature, posSerieInFeature);
		
		// EXPECTED
		AggregatorResult expected = new AggregatorResult(4, Arrays.asList(0,9));
		
		assertEquals(expected, Aggregator.max(input));
	}
	
	// TEST AGGREGATORS ERRORS
//	public void test_MIN_Aggregator_ERROR() throws Exception {
//		List<Integer> features = Arrays.asList();
//		Integer expected = ;
//		assertEquals(expected, Aggregator.min(features));
//	}

	
	
}
