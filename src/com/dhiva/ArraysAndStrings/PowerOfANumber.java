package com.dhiva.ArraysAndStrings;

public class PowerOfANumber {
	public int findPower(int a, int b) {
		if (b == 1)
			return a;
		if (b == 0)
			return 1;
		int result = findPower(a, b / 2);
		if (b % 2 == 0)
			return result * result;
		return result * result * a;
	}
}
