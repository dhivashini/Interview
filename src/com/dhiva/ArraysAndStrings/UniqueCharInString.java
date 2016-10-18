package com.dhiva.ArraysAndStrings;

public class UniqueCharInString {
	public static boolean hasUniqueChar(String input){
		if(input.length()>128)
			return false;
		boolean[] charSet = new boolean[128];
		for(int i=0;i<input.length();i++){
			if(charSet[input.charAt(i)])
				return false;
			charSet[input.charAt(i)]=true;
		}
		return true;
	}
}
