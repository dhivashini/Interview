package com.dhiva.linkedlist;

public class UnionIntersectionOfLL {
	LinkedListNode res = null;

	public LinkedListNode findIntersection(LinkedListNode head1, LinkedListNode head2) {
		LinkedListNode temp = head1;
		while (temp != null) {
			if (isPresent(temp.value, head2))
				push(temp.value);
			temp = temp.next;
		}
		return res;
	}

	public LinkedListNode findUnion(LinkedListNode head1, LinkedListNode head2) {
		LinkedListNode temp1 = head1;
		LinkedListNode temp2 = head1;

		while (temp1 != null) {
			push(temp1.value);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			if (!isPresent(temp2.value, temp1))
				push(temp2.value);
			temp2 = temp2.next;
		}
		return res;
	}

	private void push(int temp) {
		LinkedListNode n = new LinkedListNode(temp);
		n.next = res;
		res = n;

	}

	private boolean isPresent(int temp, LinkedListNode head2) {
		while (head2 != null) {
			if (temp == head2.value)
				return true;
			head2 = head2.next;
		}
		return false;
	}
}
