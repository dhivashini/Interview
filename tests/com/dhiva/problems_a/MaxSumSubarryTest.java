package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumSubarryTest {
	@Test
	public void test() {
		int expected = 7;
		int[] input = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int output = MaxSumSubarray.findMaxSum(input);
		assertEquals(expected, output);
	}
}
