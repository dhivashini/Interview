package com.dhiva.linkedlist;

public class ReorderList {
	public LinkedListNode reorderList(LinkedListNode head) {
		if (head == null || head.next == null)
			return head;

		LinkedListNode slow = head;
		LinkedListNode fast = head;
		LinkedListNode l1 = head;
		LinkedListNode prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		LinkedListNode l2 = ReverseALl.reverseRecusively(slow);

		merge(l1, l2);

		return head;
	}

	private void merge(LinkedListNode l1, LinkedListNode l2) {
		while (l1 != null) {
			LinkedListNode n1 = l1.next, n2 = l2.next;
			l1.next = l2;
			if (n1 == null)
				break;

			l2.next = n1;
			l1 = n1;
			l2 = n2;
		}
	}
}
