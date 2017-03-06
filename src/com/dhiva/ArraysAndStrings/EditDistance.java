package com.dhiva.ArraysAndStrings;

public class EditDistance {
	public int findShortestEditDistance(String s1, String s2) {
		return findShortestEditDistanceUtil(s1, s2, s1.length(), s2.length());
	}

	private int findShortestEditDistanceUtil(String s1, String s2, int m, int n) {
		int[][] countTable = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0)
					countTable[i][j] = j;
				else if (j == 0)
					countTable[i][j] = i;
				else if (s1.charAt(i-1) == s2.charAt(j-1))
					countTable[i][j] = countTable[i - 1][j - 1];
				else
					countTable[i][j] =  1 + min(countTable[i - 1][j - 1], countTable[i][j - 1], countTable[i - 1][j]);
			}
		}
		return countTable[m][n];
	}

	private int min(int x, int y, int z) {
		if (x < y && x < z)
			return x;
		if (y < x && y < z)
			return y;
		else
			return z;
	}
}
