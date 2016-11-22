package com.dhiva.linkedlist;

public class IntersectionInLL {
	public static int checkIntersection(LinkedListNode n1, LinkedListNode n2) {
		int length1 = findLength(n1);
		int length2 = findLength(n2);
		int diff;
		if (length1 > length2) {
			diff = length1 - length2;
			return findIntersectingNode(diff, n1, n2);
		}
		diff = length2 - length1;
		return findIntersectingNode(diff, n2, n1);

	}

	private static int findIntersectingNode(int diff, LinkedListNode n1, LinkedListNode n2) {
		for (int i = 0; i < diff; i++) {
			if (n1 == null)
				return -1;
			n1 = n1.next;
		}
		while (n1 != null && n2 != null) {
			if (n1.value == n2.value)
				return n1.value;
			n1 = n1.next;
			n2 = n2.next;
			System.out.println(n1.value);
			System.out.println(n2.value);
		}
		return -1;
	}

	private static int findLength(LinkedListNode n1) {
		int length = 0;
		while (n1 != null) {
			length++;
			n1 = n1.next;
		}
		return length;
	}
}
