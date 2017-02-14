package com.dhiva.ArraysAndStrings;

public class ShortestWordDistance {
	public static int findShortestDistance(String word1, String word2, String[] words) {
		int m = -1, n = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if (s.equals(word1)) {
				m = i;
				if (n != -1)
					min = Math.min(min, m - n);
			}
			if (s.equals(word2)) {
				n = i;
				if (m != -1)
					min = Math.min(min, n - m);
			}
		}
		System.out.println(m);
		System.out.println(n);
		return min;
	}
}
