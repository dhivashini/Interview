package com.dhiva.linkedlist;

public class RotateList {
	public LinkedListNode rotate(LinkedListNode head, int k) {

		LinkedListNode n = head;
		int i = 0;
		while (i < k) {
			n = n.next;
			i++;
		}
		LinkedListNode temp = n.next;
		LinkedListNode temphead = temp;
		n.next = null;
		while (temp.next != null)
			temp = temp.next;
		temp.next = head;
		return temphead;
	}
}
