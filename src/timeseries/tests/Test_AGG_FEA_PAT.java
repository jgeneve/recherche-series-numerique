package timeseries.tests;

import java.util.Arrays;
import java.util.List;


import junit.framework.TestCase;
import timeseries.constraints.TimeSeriesConstraints;

public class Test_AGG_FEA_PAT extends TestCase {

//	public void test_MIN_WIDTH_PEAK() throws Exception {
//		assertEquals(2, MIN_WIDTH_PEAK([7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1]));
//	}
//	
//	public void test_MIN_WIDTH_PLAIN() throws Exception {
//		assertEquals(1, MIN_WIDTH_PLAIN([2,3,6,5,7,6,6,4,5,5,4,3,3,6,6,3]));
//	}

	public void test_min_max_peak() throws Exception {
		// CONSTRAINT PAGE 1672
		List<Integer> input = Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1);
		Integer expectedVal = 3;
		
		assertEquals(expectedVal, TimeSeriesConstraints.min_max_peak(input));
	}
	
	public void test_min_max_increasing() throws Exception {
		// CONSTRAINT PAGE 1660
		List<Integer> input = Arrays.asList(4,3,5,5,2,1,1,3,3,4,6,6,3,1,3,3);
		Integer expected = 3;
		assertEquals(expected, TimeSeriesConstraints.min_max_increasing(input));
	}

	public void test_min_max_increasing_sequence() throws Exception {
		// CONSTRAINT PAGE 1664
		List<Integer> input = Arrays.asList(4,3,5,5,2,1,1,3,3,4,6,6,3,1,3,3);
		Integer expected = 3;
		assertEquals(expected, TimeSeriesConstraints.min_max_increasing_sequence(input));
	}

	public void test_max_min_zigzag() throws Exception {
		// CONSTRAINT PAGE 1360
		List<Integer> input = Arrays.asList(4,1,3,1,4,6,1,5,5,2,7,2,3,1,6,1);
		Integer expected = 1;
		assertEquals(expected, TimeSeriesConstraints.max_min_zigzag(input));
	}

	public void test_max_range_decreasing() throws Exception {
		List<Integer> input = Arrays.asList(3,4,2,2,5,6,6,4,4,3,1,1,4,6,4,4);
		Integer expected = 2;
		assertEquals(expected, TimeSeriesConstraints.max_range_decreasing(input));
	}
	
	public void test_max_range_decreasing_sequence() throws Exception {
		// CONSTRAINT PAGE 1376
		List<Integer> input = Arrays.asList(3,4,2,2,5,6,6,4,4,3,1,1,4,6,4,4);
		Integer expected = 5;
		assertEquals(expected, TimeSeriesConstraints.max_range_decreasing_sequence(input));
	}
	
}
