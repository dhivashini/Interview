package com.dhiva.linkedlist;

public class PalindromeNoStack {
	public static boolean isPalindrome(LinkedListNode head) {
		if (head.next == null || head == null)
			return true;

		LinkedListNode slow = head;
		LinkedListNode fast = head;
		LinkedListNode prev = null;
		LinkedListNode mid = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null) {
			mid = slow;
			slow = slow.next;
		}
		mid = null;
		LinkedListNode revHead = ReverseALl.reverseIterative(slow);
		LinkedListNode secHalf = revHead;
		while (secHalf != null && head != mid) {
			if (head.value != secHalf.value)
				return false;
			head = head.next;
			secHalf = secHalf.next;
		}
		LinkedListNode half = ReverseALl.reverseIterative(revHead);
		prev.next = half;
		return true;

	}
}
