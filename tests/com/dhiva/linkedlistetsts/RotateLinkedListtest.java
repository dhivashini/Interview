package com.dhiva.linkedlistetsts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;
import com.dhiva.linkedlist.ReturnKfromLast;
import com.dhiva.linkedlist.RotateList;

public class RotateLinkedListtest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(21, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		RotateList obj = new RotateList();
		LinkedListNode res = obj.rotate(n5, 2);
		while(res!=null){
			System.out.println(res.value);
			res = res.next;
		}
	}
}
