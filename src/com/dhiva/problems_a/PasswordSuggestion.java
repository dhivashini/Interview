package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PasswordSuggestion {
	public List<String> findPasswords(String str, HashMap<Character, Character> map) {
		List<String> result = new ArrayList<String>();
		char[] input = str.toCharArray();
		for (int i = 0; i < input.length; i++) {
			Character c = map.get(input[i]);
			if (c != null) {
				int len = result.size();
				for (int j = 0; j < len; j++) {
					String temp = result.get(j);
					result.add(temp.substring(0, i) + c + temp.substring(i + 1));
				}
				result.add(str.substring(0, i) + c + str.substring(i + 1));
			}
		}
		return result;
	}
}