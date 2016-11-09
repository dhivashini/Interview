package com.dhiva.linkedlist;

public class ReverseALl {
	public static LinkedListNode reverseIterative(LinkedListNode head) {
		if (head == null)
			return head;
		LinkedListNode current = head;
		LinkedListNode prev = null;
		LinkedListNode nextNode = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		return prev;
	}

	public static LinkedListNode reverseRecusively(LinkedListNode head) {
		if (head == null || head.next == null)
			return head;
		LinkedListNode last = reverseRecusively(head.next);
		head.next.next = head;
		head.next = null;
		return last;
	}
}
