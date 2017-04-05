package com.dhiva.ProgramCreek;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] input) {
		int i = 0;
		for (int n : input)
			if (i == 0 || n > input[i - 1])
				input[i++] = n;
		return i;
	}
}
