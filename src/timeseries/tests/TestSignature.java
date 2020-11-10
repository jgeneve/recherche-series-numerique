package timeseries.tests;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import timeseries.functions.Patterns;

public class TestSignature extends TestCase {

	public void testSignature1() throws Exception {
		assertEquals("=>=<<=<>>=<=====>", Patterns.getSignature(new ArrayList<>(
	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))));
	}
	
	public void testSignature2() throws Exception {
		assertEquals("<<=>=><><><>=<=", Patterns.getSignature(new ArrayList<>(
	            Arrays.asList(1,2,6,6,4,4,3,5,2,5,1,5,3,3,4,4))));
	}
	

	public void testSignatureNumberOfValue() throws Exception {
		assertEquals(17, Patterns.getSignature(new ArrayList<>(
	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))).length());
	}
	
}
