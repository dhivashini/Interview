package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.ZeroMatrix;;

public class ZeroMatrixTest {
	@Test
	public void test() {
		int[][] input = new int[][] { { 1, 0, 1 }, { 0, 1, 1 }, { 1, 1, 1 } };
		int[][] output = ZeroMatrix.setZero(input);
		int[][] expected = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		int[][] input = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] output = ZeroMatrix.setZero(input);
		int[][] expected = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		assertEquals(expected, output);
	}
}
