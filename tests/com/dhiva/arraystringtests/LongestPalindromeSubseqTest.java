package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.LongestPalindromeSubseq;

public class LongestPalindromeSubseqTest {
	@Test
	public void test() {
		int expected = 10;
		int output = LongestPalindromeSubseq.findCount("forgeeksskeegfor");
		assertEquals(expected, output);
	}
}
