package com.dhiva.linkedlistetsts;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;
import com.dhiva.linkedlist.UnionIntersectionOfLL;

public class UnionIntersectionOfLLTest {
	@Test
	public void test() {
		UnionIntersectionOfLL obj = new UnionIntersectionOfLL();
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(21, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		LinkedListNode n6 = new LinkedListNode(26, n5);

		LinkedListNode h1 = new LinkedListNode(20, null);
		LinkedListNode h2 = new LinkedListNode(8, h1);
		LinkedListNode h3 = new LinkedListNode(5, h2);
		LinkedListNode h4 = new LinkedListNode(2, h3);
		LinkedListNode h5 = new LinkedListNode(24, h4);
		LinkedListNode h6 = new LinkedListNode(29, h5);

		LinkedListNode res = obj.findUnion(h6, n6);
		while (res != null) {
			System.out.println(res.value);
			res = res.next;
		}

	}

	@Test
	public void test1() {
		UnionIntersectionOfLL obj = new UnionIntersectionOfLL();
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(21, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		LinkedListNode n6 = new LinkedListNode(26, n5);

		LinkedListNode h1 = new LinkedListNode(20, null);
		LinkedListNode h2 = new LinkedListNode(8, h1);
		LinkedListNode h3 = new LinkedListNode(5, h2);
		LinkedListNode h4 = new LinkedListNode(2, h3);
		LinkedListNode h5 = new LinkedListNode(24, h4);
		LinkedListNode h6 = new LinkedListNode(29, h5);

		LinkedListNode res = obj.findIntersection(h6, n6);
		while (res != null) {
			System.out.println(res.value);
			res = res.next;
		}

	}

}
