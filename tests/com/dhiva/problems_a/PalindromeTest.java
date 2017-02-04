package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void test() {
		boolean expected = true;
		boolean output = Palindrome.checkPalindrome("malayalam");
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean expected = false;
		boolean output = Palindrome.checkPalindrome("dog");
		assertEquals(expected, output);
	}
	
	@Test
	public void test2() {
		boolean expected = true;
		boolean output = Palindrome.checkPalindromeRecursive("malayalam");
		assertEquals(expected, output);
	}

	@Test
	public void test3() {
		boolean expected = false;
		boolean output = Palindrome.checkPalindromeRecursive("dog");
		assertEquals(expected, output);
	}
	@Test
	public void test4() {
		boolean expected = true;
		boolean output = Palindrome.checkPalindromeRecursive("");
		assertEquals(expected, output);
	}
	
	@Test
	public void test5() {
		boolean expected = true;
		boolean output = Palindrome.checkPalindromeRecursive("A");
		assertEquals(expected, output);
	}
}
