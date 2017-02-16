package com.dhiva.ArraysAndStrings;

public class LongestPalindromeSubseq {
	public static int findCount(String input) {
		int[][] countMatrix = new int[input.length()][input.length()];
		int maxLen = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			countMatrix[i][i] = 1;
		}
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				countMatrix[i][i + 1] = 1;
				maxLen = 2;
			} else
				countMatrix[i][i + 1] = 0;
		}
		String longestStr = null;
		for (int i = 3; i < input.length(); i++) {
			for (int j = 0; j < input.length() - i; j++) {
				int k = j + i - 1;
				if (input.charAt(j) == input.charAt(k)) {
					countMatrix[j][k] = countMatrix[j + 1][k - 1];
					if (countMatrix[j][k] == 1) {
						if (i > maxLen) {
							maxLen = i;
							longestStr = input.substring(j, k + 1);
						}
					}		
				}
				else
					countMatrix[j][k]=0;
			}
		}
		System.out.println(longestStr);
		return maxLen;
	}
}
