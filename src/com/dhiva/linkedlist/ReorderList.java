package com.dhiva.linkedlist;

public class ReorderList {
	public LinkedListNode partitionList(LinkedListNode head){
		if(head==null||head.next==null)
			return head;
		
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		LinkedListNode prev = null;
		LinkedListNode mid = null;

		while(fast!=null && fast.next!=null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast != null) {
			mid = slow;
			slow = slow.next;
		}
		mid = null;
		LinkedListNode revHead = ReverseALl.reverseRecusively(slow);
		LinkedListNode secHalf = revHead;
		prev.next = secHalf;
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = secHalf;
		while(p1!=secHalf){
			LinkedListNode p1 = tempHead.next;
			LinkedListNode p2 = temp.next;
			temp.next = tempHead;
			tempHead.next = p2;
		}
		
		return head;
	}
}
