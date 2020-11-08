package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import enums.PatternsEnum;
import junit.framework.TestCase;
import main.Patterns;

public class TestPatterns extends TestCase {

	public void testBumpOnDecreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3,4,3));
		expected.add(Arrays.asList(1,3,2));
		
		List<Integer> serie = Arrays.asList(5,4,3,4,3,2,1,4,5,3,2,1,3,2,1,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie));
	}
	
	public void testDecreasingPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,1));
		expected.add(Arrays.asList(4,3));
		expected.add(Arrays.asList(3,2));
		expected.add(Arrays.asList(2,1));
		expected.add(Arrays.asList(4,3));
		
		List<Integer> serie = Arrays.asList(1,2,1,1,2,4,4,3,3,2,1,1,2,4,3,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.DECREASING, serie));
	}

	public void testDecreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(4,1));
		expected.add(Arrays.asList(4,3,3,2,1));
		expected.add(Arrays.asList(3,2));
		
		List<Integer> serie = Arrays.asList(3,4,1,1,2,4,4,3,3,2,1,1,2,3,2,2);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie));
	}
	
	public void testDecreasingTerracePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(2,2));
		
		List<Integer> serie = Arrays.asList(3,1,1,1,3,2,2,1,2,2,3,2,2,1,1,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie));
	}
	
	public void testDipOnIncreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3,1,2));
		expected.add(Arrays.asList(4,1,2));
		
		List<Integer> serie = Arrays.asList(1,2,3,1,2,3,4,2,1,2,3,4,1,2,4,4);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie));
	}
	
	public void testGorgePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,2,2,3));
		expected.add(Arrays.asList(2,1,2,3,4));
		
		List<Integer> serie = Arrays.asList(1,3,1,2,2,3,3,2,1,1,3,2,1,2,3,4);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.GORGE, serie));
	}

	public void testIncreasingPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,4));
		expected.add(Arrays.asList(1,2));
		expected.add(Arrays.asList(2,3));
		expected.add(Arrays.asList(3,4));
		expected.add(Arrays.asList(1,3));
		
		List<Integer> serie = Arrays.asList(3,2,4,4,2,1,1,2,2,3,4,4,3,1,3,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.INCREASING, serie));
	}

	public void testIncreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,3));
		expected.add(Arrays.asList(1,2,2,3,4));
		expected.add(Arrays.asList(1,3));
		
		List<Integer> serie = Arrays.asList(2,1,3,3,2,1,1,2,2,3,4,4,3,1,3,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie));
	}
	
	public void testIncreasingTerracePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(3,3,3));
		
		List<Integer> serie = Arrays.asList(1,2,2,2,1,2,2,3,2,2,1,3,3,3,4,4);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie));
	}
	
	public void testInflexionPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,4,4));
		expected.add(Arrays.asList(3,3,2));
		expected.add(Arrays.asList(4));
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(4));
		expected.add(Arrays.asList(3,3));
		
		List<Integer> serie = Arrays.asList(1,2,4,4,3,3,2,4,1,3,1,4,3,3,4,4);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.INFLEXION, serie));
	}
	
	public void testPeakPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(4,5));
		expected.add(Arrays.asList(3,5,6));
		expected.add(Arrays.asList(3,3,3));
		
		List<Integer> serie = Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PEAK, serie));
	}
	
	public void testPlainPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(1,1));
		
		List<Integer> serie = Arrays.asList(1,2,4,3,4,3,3,2,3,3,2,1,1,4,4,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PLAIN, serie));
	}

	public void testPlateauPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(4));
		expected.add(Arrays.asList(3,3));
		
		List<Integer> serie = Arrays.asList(4,3,2,3,1,2,2,4,1,1,2,3,3,1,1,2);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PLATEAU, serie));
	}

	public void testProperPlainPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(1,1));
		expected.add(Arrays.asList(1,1,1));
		
		List<Integer> serie = Arrays.asList(1,4,2,2,3,1,4,1,1,2,3,2,1,1,1,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie));
	}
	
	public void testProperPlateauPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3,3));
		expected.add(Arrays.asList(4,4));
		expected.add(Arrays.asList(4,4,4));
		
		List<Integer> serie = Arrays.asList(4,1,3,3,1,3,1,4,4,3,1,2,4,4,4,2);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie));
	}

	public void testSteadyPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,1));
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(3,3));
		expected.add(Arrays.asList(3,3));
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(3,3));
		
		List<Integer> serie = Arrays.asList(1,1,4,2,2,3,3,3,4,2,2,2,4,1,3,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.STEADY, serie));
	}
	
	public void testSteadySequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,1));
		expected.add(Arrays.asList(3,3,3));
		expected.add(Arrays.asList(2,2));
		expected.add(Arrays.asList(4,4));
		expected.add(Arrays.asList(1,1));
		
		List<Integer> serie = Arrays.asList(3,1,1,2,3,3,3,4,2,2,4,4,3,2,1,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie));
	}
	
	public void testStrictlyDecreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(4,3, 1));
		expected.add(Arrays.asList(4,3,2));
		expected.add(Arrays.asList(4,3));
		
		List<Integer> serie = Arrays.asList(2,2,4,3,1,1,2,3,3,4,4,3,2,2,4,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie));
	}
	
	public void testStrictlyIncreasingSequencePattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3,5));
		expected.add(Arrays.asList(1,2,3,4,5));
		expected.add(Arrays.asList(1,2,3));
		
		List<Integer> serie = Arrays.asList(4,3,5,5,2,1,1,2,3,4,5,5,3,1,2,3);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie));
	}
	
	public void testSummitPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(4,3,3));
		expected.add(Arrays.asList(3,4));
		expected.add(Arrays.asList(3));
		
		List<Integer> serie = Arrays.asList(3,1,4,3,3,2,2,3,4,4,2,3,4,2,3,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.SUMMIT, serie));
	}
	
	public void testValleyPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(3,2));
		expected.add(Arrays.asList(3,2,2,1,2,3,3,3));
		
		List<Integer> serie = Arrays.asList(1,3,4,3,2,4,4,3,2,2,1,2,3,3,3,4);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.VALLEY, serie));
	}

	public void testZigZagPattern() throws Exception {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,3,1));
		expected.add(Arrays.asList(4,1));
		expected.add(Arrays.asList(2,3,2,3,1,2));
		
		List<Integer> serie = Arrays.asList(4,1,3,1,3,4,1,3,3,2,3,2,3,1,2,1);

		assertEquals(expected, Patterns.applyPattern(PatternsEnum.ZIGZAG, serie));
	}
	
}
