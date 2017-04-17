package com.dhiva.problems_a;

import java.util.ArrayList;

public class CombinationsOfString {
	public void findCombinations(String input) {
		combinations(input, "", input.length());
	}

	public static void combinations(String input, String prefix, int length) {
		if (input.length() == 0 && prefix.length()==length)
			System.out.println(prefix);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '?') {
				combinations(input.substring(i + 1), prefix + '0',length);
				combinations(input.substring(i + 1), prefix + '1',length);
			}
			else
			combinations(input.substring(i + 1), prefix + input.charAt(i),length);
		}

	}

}
