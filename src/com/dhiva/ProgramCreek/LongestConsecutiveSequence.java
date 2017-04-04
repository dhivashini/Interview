package com.dhiva.ProgramCreek;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int findLongestSequence(int[] input) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (input.length == 0)
			return 0;
		int max = 0;
		for (int i : input)
			set.add(i);
		for (int i : input) {
			int left = i - 1;
			int right = i + 1;
			int count = 1;
			while (set.contains(left)) {
				set.remove(i);
				count++;
				left--;
			}
			while (set.contains(right)) {
				set.remove(i);
				count++;
				right++;
			}
			max = Math.max(max, count);
		}
		return max;

	}
}
