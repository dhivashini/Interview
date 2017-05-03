package com.dhiva.ProgramCreek;

import com.dhiva.linkedlist.LinkedListNode;

public class OddEvenLL {
	public LinkedListNode modifyList(LinkedListNode head) {
		if (head == null)
			return head;
		LinkedListNode odd = head;
		LinkedListNode even = head.next;
		LinkedListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}
