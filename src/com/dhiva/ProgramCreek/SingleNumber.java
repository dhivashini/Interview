package com.dhiva.ProgramCreek;

public class SingleNumber {
	public int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
}
