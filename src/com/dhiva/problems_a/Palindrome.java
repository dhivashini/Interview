package com.dhiva.problems_a;

public class Palindrome {
	public static boolean checkPalindrome(String input) {
		int i = 0, j = input.length() - 1;
		while (i <= j) {
			if (input.charAt(i) != input.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static boolean checkPalindromeRecursive(String input) {

		if (input.length() <= 1)
			return true;
		return input.charAt(0) == input.charAt(input.length() - 1)
				&& checkPalindromeRecursive(input.substring(1, input.length() - 1));
	}
}
