package com.dhiva.ProgramCreek;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FourSumTest {
	@Test
	public void test() {
		int[] input = { 1, 0, -1, 0, -2, 2 };
		FourSum obj = new FourSum();
		List<ArrayList<Integer>> result = obj.fourSum(input, 0);
		System.out.println(result.size());
		for (List i : result) {
			System.out.println(i);
		}
	}
}
