package com.dhiva.linkedlist;

public class ReverseALl {
		public static LinkedListNode reverseIterative(LinkedListNode head){
			if(head==null)
				return head;
			LinkedListNode current = head;
			LinkedListNode prev = null;
			LinkedListNode nextNode = null;
			while(current!=null){
				nextNode = current.next;
				current.next = prev;
				prev = current;
				current = nextNode;
			}
			return prev;
		}
}
