package com.dhiva.sorting;

import java.util.Arrays;

public class Merge {
	public static int[] mergeSort(int[] input) {
		return mergeSplit(input, 0, input.length);
	}

	private static int[] mergeSplit(int[] input, int start, int length) {
		int mid = (length / 2);
		if (input.length <= 1)
			return input;
//		int[] left = new int[length / 2 + 1];
//		int[] right = new int[(length - mid) + 1];
		int[] temp = new int[length];
		for (int i = start; i < length; i++)
			temp[i] = input[i];
		int[] left = mergeSplit(temp, start, mid);
		int[] right = mergeSplit(temp, mid + 1, length);
		return mergeJoin(left, right);
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
