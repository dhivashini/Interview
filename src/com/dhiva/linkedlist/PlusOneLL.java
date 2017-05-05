package com.dhiva.linkedlist;

public class PlusOneLL {
	public LinkedListNode add(LinkedListNode head) {
		if (addOne(head) == 1) {
			LinkedListNode temp = new LinkedListNode(1);
			temp.next = head;
			temp = head;
		}
		return head;
	}

	private int addOne(LinkedListNode node) {
		if (node == null)
			return 1;
		if (addOne(node.next) == 1) {
			int rem = (node.value + 1) / 10;
			node.value = (node.value + 1) % 10;
			return rem;
		}
		return 0;
	}
}
