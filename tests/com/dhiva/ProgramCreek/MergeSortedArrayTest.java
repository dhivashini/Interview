package com.dhiva.ProgramCreek;

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
		int[] output = obj.merge(A, A.length, B, B.length);
		System.out.println(output);
	}
}
