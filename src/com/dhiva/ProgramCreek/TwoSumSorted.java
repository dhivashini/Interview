package com.dhiva.ProgramCreek;

public class TwoSumSorted {
	public int[] twoSum(int[] input, int target) {
		if (input == null || input.length == 0)
			return null;
		int i = 0;
		int j = input.length - 1;
		while (i < j) {
			int x = input[i] + input[j];
			if (x < target) {
				++i;
			} else if (x > target) {
				j--;
			} else {
				return new int[] { i , j };
			}
		}
		return null;
	}
}
