package com.dhiva.ArraysAndStrings;
import java.util.Arrays;

public class CheckPermutation {
	public static boolean isPermutation(String s1,String s2){
		if(s1.length()!= s2.length())
			return false;
		return sortChar(s1).equals(sortChar(s2));
	}
	public static String sortChar(String s){
		char[] charSet = s.toCharArray();
		Arrays.sort(charSet);
		System.out.println(charSet.toString());
		return charSet.toString();
		
	}
}
