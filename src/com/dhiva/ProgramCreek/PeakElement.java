package com.dhiva.ProgramCreek;

public class PeakElement {
	public int findPeak(int[] input) {
		int max = input[0];
		int index = 0;
		for (int i = 1; i <= input.length - 2; i++) {
			int prev = input[i - 1];
			int curr = input[i];
			int next = input[i + 1];
			if (curr > prev && curr > next && curr > max) {
				index = i;
				max = curr;
			}
		}
		if (input[input.length - 1] > max) {
			return input.length - 1;
		}
		return index;
	}
}
