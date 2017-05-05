package com.dhiva.linkedlist;

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};

public class DeepCopyOfList {
	public RandomListNode deepCopy(RandomListNode head) {
		if (head == null)
			return head;
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

		RandomListNode temp = head;

		while (temp != null) {
			map.put(temp, new RandomListNode(temp.label));
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			map.get(temp).next = map.get(temp.next);
			map.get(temp).random = map.get(temp.random);
			temp = temp.next;
		}
		return map.get(head);
	}
}
