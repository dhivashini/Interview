package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.PalindromePermutation;;

public class PalindromePermutationTest {
	@Test
	public void test() {
		boolean output = PalindromePermutation.isPalindromePermutation("tact coa");
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean output = PalindromePermutation.isPalindromePermutation("dog");
		boolean expected = false;
		assertEquals(expected, output);
	}
}
