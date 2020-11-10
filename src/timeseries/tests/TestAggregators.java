package timeseries.tests;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import timeseries.functions.Aggregator;


public class TestAggregators extends TestCase {
	
	// TEST AGGREGATORS
	public void test_MIN_Aggregator() throws Exception {
		List<Integer> features = Arrays.asList(3,4,6,3);
		Integer expected = 3;
		assertEquals(expected, Aggregator.min(features));
	}

	public void test_MAX_Aggregator() throws Exception {
		List<Integer> features = Arrays.asList(3,4,6,3);
		Integer expected = 6;
		assertEquals(expected, Aggregator.max(features));
	}
	
	// TEST AGGREGATORS ERRORS
//	public void test_MIN_Aggregator_ERROR() throws Exception {
//		List<Integer> features = Arrays.asList();
//		Integer expected = ;
//		assertEquals(expected, Aggregator.min(features));
//	}

	
	
}
