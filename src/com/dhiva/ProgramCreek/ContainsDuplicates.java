package com.dhiva.ProgramCreek;

import java.util.HashSet;

public class ContainsDuplicates {
	public boolean hasDuplicates(int[] input) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : input) {
			if (!set.contains(i))
				set.add(i);
			else
				return true;
		}
		return false;
	}
}
