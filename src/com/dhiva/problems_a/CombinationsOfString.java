package com.dhiva.problems_a;

import java.util.ArrayList;

public class CombinationsOfString {
	public void findCombinations(String input) {
		combinations(input, "");
	}

	public static void combinations(String input, String prefix) {
		if (input.length() == 0)
			System.out.println(prefix);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '?') {
				combinations(input.substring(i + 1), prefix + '0');
				combinations(input.substring(0, i) + input.substring(i + 1), prefix + '1');
			}
			else
			combinations(input.substring(i + 1), prefix + input.charAt(i));
		}

	}

}
