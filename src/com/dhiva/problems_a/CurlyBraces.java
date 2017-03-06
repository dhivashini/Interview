package com.dhiva.problems_a;

public class CurlyBraces {
	public void printValidBraces(String input, int start, int end) {
		if (start == 0 && end == 0) {
			System.out.println(input);
			return;
		}
		if (start > 0)
			printValidBraces( input+"{", start - 1, end);
		if (start < end)
			printValidBraces(input + "}", start, end - 1);
	}
}
