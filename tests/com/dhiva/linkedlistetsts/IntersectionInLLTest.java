package com.dhiva.linkedlistetsts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.linkedlist.IntersectionInLL;
import com.dhiva.linkedlist.LinkedListNode;

public class IntersectionInLLTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(3);
		n1.next = new LinkedListNode(6);
		n1.next.next = new LinkedListNode(9);
		n1.next.next.next = new LinkedListNode(15);
		n1.next.next.next.next = new LinkedListNode(30);

		LinkedListNode n2 = new LinkedListNode(10);
		n2.next = new LinkedListNode(15);
		n2.next.next = new LinkedListNode(30);
		int doesIntersect = IntersectionInLL.checkIntersection(n1, n2);
		int expected = 15;
		assertEquals(expected, doesIntersect);

	}
}
