package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;

public class FindAllPalindromesInString {
	 static ArrayList<String> list = new ArrayList<>();

	public static ArrayList<String> findPalindromes(String input) {
		return findpalindromesUtil("", input);
	}

	public static ArrayList<String> findpalindromesUtil(String seen, String input) {
		if (input.isEmpty()) {
			String newSeen = seen;
			StringBuilder s = new StringBuilder(newSeen);
			if(s.reverse().toString().equals(seen))
				list.add(seen);
			return list;
		}
		findpalindromesUtil(seen + input.charAt(0), input.substring(1));
		findpalindromesUtil(seen, input.substring(1));
		return list;
	}
}
