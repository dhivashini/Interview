package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.MaxDiff;
import com.dhiva.ArraysAndStrings.MaxProductSubArray;

public class MaxDifftest {
	@Test
	public void test() {
		int expected = 8;
		int[] input = { 2, 3, 10, 6, 4, 8, 1 };
		MaxDiff obj = new MaxDiff();
		int output = obj.findDiff(input);
		assertEquals(output, expected);

	}
	@Test
	public void test1() {
		int expected = 2;
		int[] input = {  7, 9, 5, 6, 3, 2 };
		MaxDiff obj = new MaxDiff();
		int output = obj.findDiff(input);
		assertEquals(output, expected);

	}
}
