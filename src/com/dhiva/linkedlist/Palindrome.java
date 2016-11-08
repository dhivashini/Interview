package com.dhiva.linkedlist;

import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		Stack<Integer> palindromeStack = new Stack<Integer>();
		while (fast != null || fast.next != null) {
			palindromeStack.push(slow.value);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null)
			slow = slow.next;
		while (slow != null) {
			if (palindromeStack.pop().intValue() != slow.value)
				return false;
			slow = slow.next;
		}
		return true;
	}
}
