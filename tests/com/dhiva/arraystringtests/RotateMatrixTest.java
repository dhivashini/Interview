package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.RotateMatrix;

public class RotateMatrixTest {

	@Test
	public void test() {
		int[][] input = new int[][] { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 9 } };
		int[][] output = RotateMatrix.rotateInput(input);
		int[][] expected = new int[][] { { 8, 5, 2 }, { 9, 6, 3 }, { 9, 7, 4 } };
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		int[][] input = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] output = RotateMatrix.rotateInput(input);
		int[][] expected = new int[][] { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
		assertEquals(expected, output);
	}
}
