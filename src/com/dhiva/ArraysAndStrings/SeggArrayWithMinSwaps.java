package com.dhiva.ArraysAndStrings;

public class SeggArrayWithMinSwaps {
	public int[] swap(int[] input) {
		int left = 0, right = input.length - 1;
		while (input[left] == 0 && left < right)
			left++;
		while (input[right] == 1 && left < right)
			right--;
		if (left < right) {
			input[left] = 0;
			input[right] = 1;
			left++;
			right--;
		}
		return input;
	}
}
