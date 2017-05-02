package com.dhiva.ProgramCreek;

public class UniqueBst {
	public int findUniqueBst(int[] input) {
		int[] arr = new int[input.length + 1];
		arr[0] = arr[1] = 1;
		for (int i = 2; i <= input.length; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i] += arr[j - 1] * arr[i - j];
			}
		}
		return arr[input.length];
	}
}
