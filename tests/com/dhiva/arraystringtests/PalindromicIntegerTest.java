package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.PalindromicInteger;

public class PalindromicIntegerTest {
	@Test
	public void test() {
		boolean expected = false;
		boolean output = PalindromicInteger.isPallindrome(1234);
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean expected = false;
		boolean output = PalindromicInteger.isPallindrome(-1234);
		assertEquals(expected, output);
	}

	@Test
	public void test2() {
		boolean expected = true;
		boolean output = PalindromicInteger.isPallindrome(0);
		assertEquals(expected, output);
	}

	@Test
	public void test3() {
		boolean expected = true;
		boolean output = PalindromicInteger.isPallindrome(1221);
		assertEquals(expected, output);
	}

}
