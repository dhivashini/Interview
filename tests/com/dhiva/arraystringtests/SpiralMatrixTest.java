package com.dhiva.arraystringtests;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.Spiralmatrix;

public class SpiralMatrixTest {
	@Test
	public void test() {
		int[][] input = new int[][] { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 1 } };
		Spiralmatrix obj = new Spiralmatrix();
		obj.spiralOrder(input);

	}
}
