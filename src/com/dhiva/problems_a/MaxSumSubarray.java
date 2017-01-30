package com.dhiva.problems_a;

public class MaxSumSubarray {
	public static int findMaxSum(int[] input) {
		int maxSoFar = 0, maxSumHere = 0;
		for (int i = 0; i < input.length; i++) {
			maxSumHere = maxSumHere + input[i];
			if (maxSumHere < 0)
				maxSumHere = 0;
			if (maxSoFar < maxSumHere)
				maxSoFar = maxSumHere;
		}
		return maxSoFar;
	}
}
