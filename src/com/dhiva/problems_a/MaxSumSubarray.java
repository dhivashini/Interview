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

	public static int findMaxSumTemp(int[] input) {
		int maxSoFar = input[0], maxSumHere = input[0];
		for (int i = 1; i < input.length; i++) {
			maxSumHere = Math.max(maxSumHere, maxSumHere + input[i]);
			maxSoFar = Math.max(maxSoFar, maxSumHere);
		}
		return maxSoFar;
	}
}
