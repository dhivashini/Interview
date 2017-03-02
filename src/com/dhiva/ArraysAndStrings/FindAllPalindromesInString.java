package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindAllPalindromesInString {
//	 static ArrayList<String> list = new ArrayList<>();
//
//	public static ArrayList<String> findPalindromes(String input) {
//		return findpalindromesUtil("", input);
//	}
//
//	public static ArrayList<String> findpalindromesUtil(String seen, String input) {
//		if (input.isEmpty()) {
//			String newSeen = seen;
//			StringBuilder s = new StringBuilder(newSeen);
//			if(s.reverse().toString().equals(seen))
//				list.add(seen);
//			return list;
//		}
//		findpalindromesUtil(seen + input.charAt(0), input.substring(1));
//		findpalindromesUtil(seen, input.substring(1));
//		return list;
//	}
	
	public static int findCount(String input) {
		Set<String> set = new HashSet<String>();
		int[][] countMatrix = new int[input.length()][input.length()];
		int maxLen = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			countMatrix[i][i] = 1;
//			if(!set.contains(input.charAt(i)))
//				set.add(String.valueOf(input.charAt(i)));
		}
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				countMatrix[i][i + 1] = 1;
//				if(!set.contains(input.charAt(i)))
//					set.add(String.valueOf(input.charAt(i)));
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
		for (int i = 0; i < countMatrix.length; i++) {
			for (int j = 0; j < countMatrix[i].length; j++) {
				if(countMatrix[i][j]==1){
					if(!set.contains(input.substring(i, j+1)))
						set.add(input.substring(i, j+1));
				}
			}
		}
		System.out.println(longestStr);
		System.out.println(set);
		return maxLen;
	}
}
