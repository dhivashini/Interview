package com.dhiva.ProgramCreek;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;

public class SortLLTest {
	@Test
	public void test() {
		SortLL obj = new SortLL();
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(10, n1);
		LinkedListNode n3 = new LinkedListNode(3, n2);
		LinkedListNode n4 = new LinkedListNode(2, n3);
		LinkedListNode curr = obj.sortList(n4);
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}
}
