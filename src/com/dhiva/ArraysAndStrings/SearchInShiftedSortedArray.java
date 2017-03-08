package com.dhiva.ArraysAndStrings;

public class SearchInShiftedSortedArray {
	public int searchElement(int[] input, int target) {
		return searchElementUtil(input, 0, input.length - 1, target);
	}

	private int searchElementUtil(int[] input, int left, int right, int target) {
		if (left > right)
			return -1;
		int mid = (left + right) / 2;
		if (input[mid] == target)
			return mid;
		if (input[left] < input[mid]) {
			if (target >= input[left] && target < input[mid])
				return searchElementUtil(input, left, mid - 1, target);
			else
				return searchElementUtil(input, mid + 1, right, target);
		} else {
			if (target > input[mid] && target <= input[right])
				return searchElementUtil(input, mid + 1, right, target);
			else
				return searchElementUtil(input, left, mid - 1, target);
		}
	}
}
