package com.dhiva.ProgramCreek;

import com.dhiva.linkedlist.LinkedListNode;

public class RemoveLinkedListElements {
	public LinkedListNode removeElements(LinkedListNode head, int value) {
		if (head == null)
			return null;
		LinkedListNode temp = new LinkedListNode();
		LinkedListNode prev = new LinkedListNode();
		prev.next = head;
		temp = prev;
		while (temp.next != null) {
			if (temp.next.value == value)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return prev.next;
	}
}
