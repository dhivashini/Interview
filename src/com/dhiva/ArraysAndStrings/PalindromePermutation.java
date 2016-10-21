package com.dhiva.ArraysAndStrings;

public class PalindromePermutation {
	public static boolean isPalindromePermutation(String input) {
		int[] table = buildFrequencyTable(input);
		return checkForOdd(table);
	}

	private static boolean checkForOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	private static int[] buildFrequencyTable(String input) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')];
		for (char c : input.toCharArray()) {
			int value = getCharValue(c);
			if (value != -1)
				table[value]++;
		}
		return table;

	}

	private static int getCharValue(char inputChar) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int value = Character.getNumericValue(inputChar);
		if (a <= value && value <= z)
			return value - a;
		return -1;
	}

}
