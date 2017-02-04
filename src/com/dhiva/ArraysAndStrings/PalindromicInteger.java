package com.dhiva.ArraysAndStrings;

public class PalindromicInteger {

	public static boolean isPallindrome(int number) {

		int reverseNum;
		if (number < 0)
			return false;
		reverseNum = reverseNumber(number);
		if (number == reverseNum)
			return true;
		return false;

	}

	public static int reverseNumber(int number) {
		int reverserdNum = 0;
		while (number > 0) {
			int temp = number % 10;
			reverserdNum = reverserdNum * 10 + temp;
			number /= 10;

		}
		return reverserdNum;
	}

}
