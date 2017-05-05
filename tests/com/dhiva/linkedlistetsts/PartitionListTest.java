package com.dhiva.linkedlistetsts;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;
import com.dhiva.linkedlist.PartitionLL;

public class PartitionListTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(1, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		PartitionLL obj = new PartitionLL();
		LinkedListNode res = obj.partitionList(n5, 3);
		while (res != null) {
			System.out.println(res.value);
			res = res.next;
		}
	}
}
