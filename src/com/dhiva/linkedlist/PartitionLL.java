package com.dhiva.linkedlist;

public class PartitionLL {
	public LinkedListNode partitionList(LinkedListNode head, int target) {
		if (head == null)
			return head;
		LinkedListNode temp1 = new LinkedListNode();
		LinkedListNode temp2 = new LinkedListNode();
		LinkedListNode tail1 = temp1;
		LinkedListNode tail2 = temp2;
		while (head != null) {
			if (head.value > target) {
				tail2.next = head;
				tail2 = tail2.next;
			} else {
				tail1.next = head;
				tail1 = tail1.next;
			}
			head = head.next;
		}
		tail2.next = null;
		tail1.next = temp2.next;
		return temp1.next;
	}
}
