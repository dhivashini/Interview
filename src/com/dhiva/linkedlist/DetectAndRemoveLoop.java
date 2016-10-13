package com.dhiva.linkedlist;

public class DetectAndRemoveLoop {
	public static boolean detectLoop(LinkedListNode node) {
		LinkedListNode slow = node;
		LinkedListNode fast = node;
		boolean removedLoop = false;
		boolean hasLoop = false;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
			    removedLoop = removeLoop(slow,node);
				break;
			}
		}
		if (removedLoop)
			return true;
		else
			return false;
	}

	private static boolean removeLoop(LinkedListNode slow, LinkedListNode node) {
		LinkedListNode p1 = null , p2 = null;
		p1 = node ;
		while (true){
			p2 = slow;
			while(p1.next!=p2 && p2.next!=p1){
				p2 = p2.next;
			}
			if(p2.next == p1)
				break;
			p1 = p1.next;
		}
		p2.next = null;
		boolean removedLoop = true;
		if (removedLoop)
			return true;
		else
			return false;
		}
	
}
