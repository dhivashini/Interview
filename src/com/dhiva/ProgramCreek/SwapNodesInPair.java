package com.dhiva.ProgramCreek;

import com.dhiva.linkedlist.LinkedListNode;

public class SwapNodesInPair {
	public LinkedListNode swap(LinkedListNode head) {
		if (head == null || head.next == null)
			return head;
		LinkedListNode tempHead = new LinkedListNode();
		tempHead.next = head;
		LinkedListNode curr = tempHead;

		while (curr.next != null && curr.next.next != null) {
			LinkedListNode first = curr.next;
			LinkedListNode second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			curr.next.next = first;
			curr = curr.next.next;
		}
		return tempHead.next;
	}
}
