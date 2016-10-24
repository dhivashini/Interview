package com.dhiva.ArraysAndStrings;

public class RotateMatrix {
	public static int[][] rotateInput(int[][] input) {
		int[][] output = new int[input.length][input.length];
		int k = 0;
	
		for (int i = 0; i < input.length; i++) {
			k=input.length-1;
			for (int j = 0; j < input.length; j++) {
				output[i][j] = input[k][i];
				k--;
			}
		}
		return output;

	}
}
