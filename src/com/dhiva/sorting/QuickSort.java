package com.dhiva.sorting;

import java.util.Arrays;

public class QuickSort {
	public static int[] quickSort(int[] input) {
		return sort(input, 0, input.length - 1);
	}

	private static int[] sort(int[] input, int start, int length) {
		if (start < length) {
			int pivot = partition(input, start, length);
			sort(input, start, pivot - 1);
			sort(input, pivot + 1, length);
		}
		return input;
	}

	private static int partition(int[] input, int start, int length) {
		int pindex = start;
		int pivot = input[length];

		for (int i = start; i < length; i++) {
			if (input[i] < pivot) {
				int temp = input[i];
				input[i] = input[pindex];
				input[pindex] = temp;
				pindex++;
			}
		}
		int temp = input[length];
		input[length] = input[pindex];
		input[pindex] = temp;
		return pindex;
	}

}
