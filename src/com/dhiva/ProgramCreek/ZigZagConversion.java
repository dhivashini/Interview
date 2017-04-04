package com.dhiva.ProgramCreek;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		char[] input = s.toCharArray();
		StringBuilder[] output = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++)
			output[i] = new StringBuilder();
		int count = 0;
		int temp = 1;
		for (int i = 0; i < input.length; i++) {
			output[count].append(input[i]);
			if (numRows == count + 1)
				temp = -1;
			if (count == 0)
				temp = 1;
			count = count + temp;
		}
		for (int i = 1; i < numRows; i++) {
			output[0].append(output[i].toString());
		}
		return output[0].toString();
	}
}
