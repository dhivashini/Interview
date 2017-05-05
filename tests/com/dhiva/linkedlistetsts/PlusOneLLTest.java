package com.dhiva.linkedlistetsts;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;
import com.dhiva.linkedlist.PlusOneLL;

public class PlusOneLLTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(9, null);
		LinkedListNode n2 = new LinkedListNode(1, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(2, n3);
		LinkedListNode n5 = new LinkedListNode(2, n4);
		PlusOneLL obj = new PlusOneLL();
		LinkedListNode res = obj.add(n5);
		while (res != null) {
			System.out.println(res.value);
			res = res.next;
		}
	}
}
