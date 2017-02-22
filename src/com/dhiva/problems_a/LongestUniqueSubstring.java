package com.dhiva.problems_a;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

	public String findString(String input) {
		int curr = 0, length = 0, start = 0;
		Set<Character> check = new HashSet<Character>();
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			if (!check.contains(inputArray[i])) {
				check.add(inputArray[i]);
				if (i - curr + 1 >= length) {
					length = i - curr + 1;
					start = curr;
				}
			} else {
				Character c = inputArray[curr];
				while (c.charValue() != inputArray[i]) {
					check.remove(inputArray[curr]);
					curr++;
					c = inputArray[curr];
				}
				curr++;

			}

		}
		return input.substring(start, start + length);
	}
}
