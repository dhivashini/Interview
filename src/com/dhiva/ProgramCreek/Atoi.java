package com.dhiva.ProgramCreek;

public class Atoi {
	public int atoi(String input) {
		if (input == null || input.length() < 1)
			return 0;
		input = input.trim();
		char flag = '+';
		int i = 0;
		if (input.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (input.charAt(0) == '+') {
			flag = '+';
			i++;
		}
		double result = 0;
		while (input.length() > i && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
			result = result * 10 + (input.charAt(i) - '0');
			i++;
		}
		if (flag == '-')
			result = -result;
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}
}
