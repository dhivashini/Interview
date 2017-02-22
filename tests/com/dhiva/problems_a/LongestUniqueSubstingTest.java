package com.dhiva.problems_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestUniqueSubstingTest {
	@Test
	public void test(){
		String expected = "1234a56";
		LongestUniqueSubstring obj = new LongestUniqueSubstring();
		String output = obj.findString("0a1234a56ab");
		assertEquals(output, expected);
	}
}
