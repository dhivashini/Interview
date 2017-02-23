package com.dhiva.problems_a;

public class DuplicatesWithinKIndices {
	public boolean hasDuplicates(String input, int k) {
		boolean[] array = new boolean[256];
		for (int i = 0; i < input.length(); i++) {
			if (array[input.charAt(i)])
				return true;
			array[input.charAt(i)] = true;
			if (i - k >= 0)
				array[input.charAt(i-k)] = false;
		}
		return false;
	}
}
