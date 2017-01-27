package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PermutationsOfAStringTest {
	@Test
	public void test() {
		String expected = "[abcd, abdc, acbd, acdb, adbc, adcb, bacd, badc, bcad, bcda, bdac, bdca, cabd, cadb, cbad, cbda, cdab, cdba, dabc, dacb, dbac, dbca, dcab, dcba]";
	    ArrayList<String> output = PermutationsOfAString.findPermutations("abcd");
		assertEquals(expected, output);
	}
}
