package com.dhiva.ArraysAndStrings;

public class IsNumber {

	public static boolean isNumber(String toTest) {
		if (toTest.startsWith("-")) {
			toTest = toTest.substring(1, toTest.length()); // remove starting
															// "-"
		}
		if (toTest.contains("-") || toTest.isEmpty()) {
			return false; // cannot have more "-" and empty string is not a
							// number
		}

		String[] parts = toTest.split(".");
		if (parts.length == 0) {
			if (toTest.startsWith(".")) { // special case for ".123"
				toTest = toTest.substring(1, toTest.length());
			}
			if (toTest.isEmpty()) {
				return false;
			}
			return isSimpleNumber(toTest);
		} else if (parts.length == 2) {
			return isSimpleNumber(parts[0]) && isSimpleNumber(parts[1]);
		} else {
			return false; // more than one "."
		}
	}

	private static boolean isSimpleNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (!"0123456789".contains(Character.toString(number.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

}
