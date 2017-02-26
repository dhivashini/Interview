package com.dhiva.ArraysAndStrings;

public class SelfExcludingProduct {
	public int[] findProduct(int[] input) {
		int[] left = new int[input.length];
		int[] right = new int[input.length];
		int[] output = new int[input.length];
		left[0] = 1;
		right[input.length - 1] = 1;
		
		for (int i = 1; i < input.length; i++) {
			left[i] = input[i - 1] * left[i - 1];
		}
		for (int i = input.length - 2; i >= 0; i--) {
			right[i] = input[i + 1] * right[i + 1];
		}
		for (int i = 0; i < input.length; i++) {
			output[i] = left[i] * right[i];
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println(output[i]);
		}
		return output;
	}
}
