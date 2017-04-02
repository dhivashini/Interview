package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortedArrayTest {
	@Test
	public void test() {
		MergeSortedArray obj = new MergeSortedArray();
		int[] A = new int[7];
		A[0] = 1;
		A[1] = 4;
		A[2] = 5;
		A[3] = 9;
		int[] B = { 2, 6, 11 };
		int[] output = obj.merge(A, 4, B, B.length);
		int[] expected = { 1, 2, 4, 5, 6, 9, 11 };
		assertEquals(expected, output);
	}
}
