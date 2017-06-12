package com.dhiva.linkedlist;

public class DelLinkedListNodeGreaterThanVal {
	public LinkedListNode delete(LinkedListNode head, int n) {
		if (head == null)
			return null;
		LinkedListNode temp = head.next;
		LinkedListNode prev = head;
		while (temp != null) {
			if (temp.value > n) {
				prev.next = temp.next;
				temp = temp.next;
			} else {
				prev = prev.next;
				temp = temp.next;
			}
		}
		if (head.value > n)
			return head.next;
		else
			return head;
	}
}
