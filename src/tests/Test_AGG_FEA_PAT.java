package tests;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import main.Main;

public class Test_AGG_FEA_PAT extends TestCase {

	public void test_MIN_WIDTH_PEAK() throws Exception {
		assertEquals(2, MIN_WIDTH_PEAK([7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1]));
	}
	
	public void test_MIN_WIDTH_PLAIN() throws Exception {
		assertEquals(1, MIN_WIDTH_PLAIN([2,3,6,5,7,6,6,4,5,5,4,3,3,6,6,3]));
	}
	
}
