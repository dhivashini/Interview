package com.dhiva.ProgramCreek;

public class LengthOfLastWord {
	public int findLength(String input) {
		if (input == null || input.length() == 0)
			return 0;
		boolean flag = false;
		int result = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				flag = true;
				result++;
			} else {
				if (flag)
					return result;
			}
		}
		return result;

	}
}
