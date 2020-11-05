package tests;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import main.Aggregator;


public class TestAggregators extends TestCase {
	
	
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
	
}
