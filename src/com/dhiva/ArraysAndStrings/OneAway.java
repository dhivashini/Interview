package com.dhiva.ArraysAndStrings;

public class OneAway {
	public static boolean isOneStepAway(String input1, String input2) {
		if (input1.length() == input2.length())
			return oneEditInsert(input1, input2);
		if (input1.length() + 1 == input2.length())
			return oneEditReplace(input1, input2);
		if (input1.length() - 1 == input2.length())
			return oneEditReplace(input2, input1);

		return false;
	}

	private static boolean oneEditInsert(String first, String second) {
		boolean different = false;
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) != second.charAt(i)) {
				if (different) {
					return false;
				}
				different = true;
			}
		}
		return true;
	}

	private static boolean oneEditReplace(String first, String second) {
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index1 < first.length() && index2 < second.length()) {
			if (first.charAt(index1) != second.charAt(index2)) {
				if (foundDifference)
					return false;
				foundDifference = true;
				if (first.length() < second.length())
					index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
}
