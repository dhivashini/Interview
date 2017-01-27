package com.dhiva.problems_a;

public class AnagramStrings {
	public static boolean checkAnagram(String s1, String s2) {
		int[] countArray = new int[256];
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			countArray[s1.charAt(i)]++;
			countArray[s2.charAt(i)]--;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (countArray[i] != 0)
				return false;
		}
		return true;
	}
}
