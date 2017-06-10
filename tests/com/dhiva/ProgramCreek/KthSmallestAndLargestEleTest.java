package com.dhiva.ProgramCreek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestAndLargestEleTest {
	@Test
	public void test() {
		KthSmallestAndLargest obj = new KthSmallestAndLargest();
		int[] input = { 4, 6, 5, 1, 2, 3, 7 };
		int result = obj.findKthLargeEle(input, 3);
		assertEquals(3, result);
	}
}
