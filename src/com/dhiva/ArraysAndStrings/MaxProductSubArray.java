package com.dhiva.ArraysAndStrings;

public class MaxProductSubArray {
	public int findMaxProductSubArray(int[] input) {
		int[] max = new int[input.length];
		int[] min = new int[input.length];
		int result;
		max[0] = min[0] = result = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > 0) {
				max[i] = Math.max(input[i], max[i - 1] * input[i]);
				min[i] = Math.min(input[i], min[i - 1] * input[i]);
			} else {
				max[i] = Math.max(input[i], min[i - 1] * input[i]);
				min[i] = Math.min(input[i], max[i - 1] * input[i]);
			}
			result = Math.max(result, max[i]);
		}
		return result;
	}
}
