package tests;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import main.Patterns;

public class TestSignature extends TestCase {
	
	public void testSignature() throws Exception {
		assertEquals("=>=<<=<>>=<=====>", Patterns.getSignature(new ArrayList<>(
	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))));
	}
	

	public void testSignatureNumberOfValue() throws Exception {
		assertEquals(17, Patterns.getSignature(new ArrayList<>(
	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))).length());
	}
	
}
