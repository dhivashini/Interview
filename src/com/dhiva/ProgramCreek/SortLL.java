package com.dhiva.ProgramCreek;

import com.dhiva.linkedlist.LinkedListNode;

public class SortLL {
	public LinkedListNode sortList(LinkedListNode head) {
		if (head == null || head.next == null)
			return head;

		LinkedListNode prev = null, slow = head, fast = head;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = null;
		LinkedListNode l1 = sortList(head);
		LinkedListNode l2 = sortList(slow);
		return merge(l1, l2);
	}

	LinkedListNode merge(LinkedListNode l1, LinkedListNode l2) {
		LinkedListNode l = new LinkedListNode(0), p = l;

		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}

		if (l1 != null)
			p.next = l1;

		if (l2 != null)
			p.next = l2;

		return l.next;
	}
}
