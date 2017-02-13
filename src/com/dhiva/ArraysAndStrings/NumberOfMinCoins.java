package com.dhiva.ArraysAndStrings;

public class NumberOfMinCoins {
	public static int findMinimumCoins(int amount, int[] denominations) {
		int count = 0;
		int index = 0;
		while (amount >= 1) {
			if (amount / denominations[index] >= 1) {
				count += amount / denominations[index];
				amount = amount % denominations[index];
			}
			index++;
		}
		return count;
	}
}
