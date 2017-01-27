package com.dhiva.problems_a;

import java.util.ArrayList;

public class PermutationsOfAString {
	static ArrayList<String> list = new ArrayList<String>();

	public static ArrayList<String> findPermutations(String input) {
		list = permutations(input, "");
		return list;
	}

	public static ArrayList<String> permutations(String input, String prefix) {
		if (input.length() == 0)
			list.add(prefix);
		for (int i = 0; i < input.length(); i++) {
			permutations(input.substring(0, i) + input.substring(i + 1), prefix + input.charAt(i));
		}
		return list;
	}

}
