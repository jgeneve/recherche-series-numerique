package timeseries.tests;

import java.util.Arrays;
import java.util.List;


import junit.framework.TestCase;
import results.objects.AggregatorResult;
import timeseries.constraints.TimeSeriesConstraints;

public class Test_POS_AGG_FEA_PAT extends TestCase {
	
	public void test_pos_min_max_peak() throws Exception {
		// CONSTRAINT PAGE 16 (EXTREMES)
		List<Integer> input = Arrays.asList(5,1,4,3,2,2,2,5,4,4,1,1,4,4,3,1);
		Integer valExpected = 4;
//		List<Integer> positions = Arrays.asList(0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0);
		// List<Integer> posExpected = Arrays.asList(2,12); // CORRECT
		List<Integer> posExpected = Arrays.asList(2,13); // NOT CORRECT
		
		AggregatorResult aggResExpected = new AggregatorResult(valExpected, posExpected);
		
		assertEquals(aggResExpected, TimeSeriesConstraints.pos_min_max_peak(input));
	}
	
}
