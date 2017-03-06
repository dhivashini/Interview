package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.MaxProductSubArray;

public class MaxProductSubArrayTest {
	@Test
	public void test() {
		int expected = 48;
		int[] input = { 2, 3, -2, -4 };
		MaxProductSubArray obj = new MaxProductSubArray();
		int output = obj.findMaxProductSubArray(input);
		assertEquals(output, expected);

	}
}
