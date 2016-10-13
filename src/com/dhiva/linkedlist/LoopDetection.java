package com.dhiva.linkedlist;

public class LoopDetection {

	public static boolean detectLoop(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		boolean hasLoop = false;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				hasLoop = true;
				break;
			}
		}
		if (hasLoop)
			return true;
		else
			return false;

	}

}
