package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonSubstringTest {
	@Test
	public void test(){
		String expected = "vashi";
		String s1 ="dhivashini";
		String s2 = "sdvashimkl";
		LongestCommonSubtring obj = new LongestCommonSubtring();
		String output = obj.findLongestCS(s1, s2);
		assertEquals(output, expected);
	}
}
