package com.dhiva.ProgramCreek;

import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
	@Test
	public void test() {
		COmbinationSum obj = new COmbinationSum();
		int[] input = { 2, 3, 5, 6 };
		List<List<Integer>> result = obj.findCombinations(input, 7);
		for (List<Integer> i :result)
			System.out.println(i);
	}
}
