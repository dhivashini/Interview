package com.dhiva.ProgramCreek;

public class MinSizeSubarraySum {
	public int findLength(int[] input, int target) {
		int start = 0, end = 0;
		int min = Integer.MAX_VALUE;
		int length = input.length ;
		int sum = 0;
		if(input == null || input.length ==0)
			return 0;
		while (end < length) {
			sum += input[end++];
			while (target <= sum) {
				min = Math.min(min, end - start);
				sum -= input[start++];
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
