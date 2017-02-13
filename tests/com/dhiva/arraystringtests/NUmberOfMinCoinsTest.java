package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.NumberOfMinCoins;

public class NUmberOfMinCoinsTest {
	@Test
	public void test() {
		int expected = 1;
		int[] denominations = { 100, 50, 20, 5, 1 };
		int output = NumberOfMinCoins.findMinimumCoins(1, denominations);
		assertEquals(output, expected);
	}
}
