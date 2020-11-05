package tests;

import junit.framework.TestCase;
import main.Aggregator;

public class TestAggregators extends TestCase {
	
	
	public void test_MIN_Aggregator() throws Exception {
		int [] features = { 3,4,6,3 } ;
		assertEquals(3, Aggregator.MIN(features));
	}

	public void test_MAX_Aggregator() throws Exception {
		int [] features = { 3,4,6,3 } ;
		assertEquals(6, Aggregator.MAX(features));
	}
	
}
