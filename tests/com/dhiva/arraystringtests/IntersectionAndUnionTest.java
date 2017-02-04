package com.dhiva.arraystringtests;

import java.util.ArrayList;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.IntersectionAndUnion;

public class IntersectionAndUnionTest {

	@Test
	public void test() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		int[] inputArray1 = { 1, 5, 8, 12 };
		int[] inputArray2 = { 1, 4, 5, 8, 9, 15 };
		// expected = IntersectionAndUnion.findIntersection(inputArray1,
		// inputArray2);
		expected = IntersectionAndUnion.findUnion(inputArray1, inputArray2);
		System.out.println(expected);
	}

}
