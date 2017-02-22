package com.dhiva.problems_a;

import java.util.Set;

public class WordBreak {
	public String fillSpaces(String input, Set<String> dict) {
		StringBuilder prefix = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			
			prefix.append(input.charAt(i));
			
			if (dict.contains(prefix.toString())) {
				
				if (prefix.length() == input.length())
					return input;

				String suffix = fillSpaces(new String(input.substring(i+1)), dict);
				
				if (suffix != null) {
					prefix.append(" ");
					prefix.append(suffix);
					return prefix.toString();
				}
			}
		}
		return null;
	}
}
