package com.dhiva.problems_a;

public class Palindrome {
	public static boolean checkPalindrome(String input) {
		int i = 0, j = input.length()-1;
		while (i <= j) {
			if (input.charAt(i) != input.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
