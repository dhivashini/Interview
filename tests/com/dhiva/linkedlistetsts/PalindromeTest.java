package com.dhiva.linkedlistetsts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.linkedlist.*;

public class PalindromeTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(1, null);
		LinkedListNode n2 = new LinkedListNode(0, n1);
		LinkedListNode n3 = new LinkedListNode(0, n2);
		LinkedListNode n4 = new LinkedListNode(0, n3);
		LinkedListNode n5 = new LinkedListNode(0, n4);
		LinkedListNode n6 = new LinkedListNode(1, n5);
		boolean output = Palindrome.isPalindrome(n6);
		boolean expected = true;
		assertEquals(expected, output);
	}
}
