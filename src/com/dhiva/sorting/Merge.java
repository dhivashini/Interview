package com.dhiva.sorting;

import java.util.Arrays;

public class Merge {
	public static int[] mergeSort(int[] input) {
		return mergeSplit(input);
	}

	private static int[] mergeSplit(int[] input) {
		int mid = Math.abs(input.length / 2);
		System.out.println(mid);
		if (input.length <= 1)
			return input;
		return mergeJoin(mergeSplit(Arrays.copyOfRange(input, 0, mid)),
				mergeSplit(Arrays.copyOfRange(input, mid, input.length)));

	}

	private static int[] mergeJoin(int[] left, int[] right) {
		int length = left.length + right.length;
		int[] output = new int[length];
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				output[k] = left[i];
				k++;
				i++;
			} else {
				output[k] = right[j];
				k++;
				j++;
			}
		}

		while (j < right.length) {
			output[k] = right[j];
			k++;
			j++;

		}
		while (i < left.length) {
			output[k] = left[i];
			k++;
			i++;
		}
		return output;
	}

}
