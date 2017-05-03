package com.dhiva.ProgramCreek;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;

public class OddEvenLLTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(3);
		n1.next = new LinkedListNode(6);
		n1.next.next = new LinkedListNode(9);
		n1.next.next.next = new LinkedListNode(15);
		n1.next.next.next.next = new LinkedListNode(30);
		OddEvenLL obj = new OddEvenLL();
		LinkedListNode node = obj.modifyList(n1);
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
