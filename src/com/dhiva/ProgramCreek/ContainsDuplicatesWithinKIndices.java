package com.dhiva.ProgramCreek;

import java.util.HashSet;

public class ContainsDuplicatesWithinKIndices {
	public boolean containsDuplicates(int[] input, int k) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < input.length; i++) {
			if (i - k >= 0)
				set.remove(input[i - k]);
			if (!set.add(input[i]))
				return true;
		}
		return false;
	}
}
