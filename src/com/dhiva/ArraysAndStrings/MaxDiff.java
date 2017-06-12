package com.dhiva.ArraysAndStrings;

public class MaxDiff {
	public int findDiff(int[] input) {
		int diff = -1;
		int min = input[0];

		for (int i = 1; i < input.length - 1; i++) {
			if (input[i] < min)
				min = input[i];
			else {
				if (diff < (input[i] - min)) {
					diff = input[i] - min;
				}
			}
		}
		if(diff<=0)
			return -1;
		return diff;
 
	}
}
