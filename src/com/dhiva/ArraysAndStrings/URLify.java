package com.dhiva.ArraysAndStrings;

public class URLify {
	public static String convertToUrl(String input) {
		String[] s = input.split(" ");
		String output = s[0];
		for(int i=1;i<s.length;i++){
			output += "%20"+s[i];
		}
		System.out.println(output);
		return output;
	}
}
