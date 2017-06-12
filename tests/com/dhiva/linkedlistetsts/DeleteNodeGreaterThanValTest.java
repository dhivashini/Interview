package com.dhiva.linkedlistetsts;

import org.junit.Test;

import com.dhiva.linkedlist.DelLinkedListNodeGreaterThanVal;
import com.dhiva.linkedlist.LinkedListNode;

public class DeleteNodeGreaterThanValTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(3);
		n1.next = new LinkedListNode(6);
		n1.next.next = new LinkedListNode(9);
		n1.next.next.next = new LinkedListNode(1);
		n1.next.next.next.next = new LinkedListNode(30);
		DelLinkedListNodeGreaterThanVal obj = new DelLinkedListNodeGreaterThanVal();
		LinkedListNode n = obj.delete(n1, 20);
		while (n != null) {
			
			System.out.println(n.value);
			n = n.next;
		}
	}
}
