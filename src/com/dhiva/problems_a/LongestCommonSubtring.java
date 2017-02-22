package com.dhiva.problems_a;

public class LongestCommonSubtring {
	public String findLongestCS(String s1, String s2) {
		int start = 0, length = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				
				int x = 0;
				
				while (s1.charAt(x + i) == s2.charAt(x + j)) {
					x++;
					if (((i + x) >= s1.length()) || ((j + x) >= s2.length()))
						break;
				}
				
				if (x > length) {
					length = x;
					start = i;
				}

			}
		}
		return s1.substring(start, start + length);
	}
}
