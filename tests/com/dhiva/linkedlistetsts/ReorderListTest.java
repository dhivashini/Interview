package com.dhiva.linkedlistetsts;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;
import com.dhiva.linkedlist.ReorderList;

public class ReorderListTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(1, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		ReorderList obj= new ReorderList();
		
		LinkedListNode res = obj.reorderList(n5);
		while(res!=null){
			System.out.println(res.value);
			res = res.next;
		}
	}
	
	@Test
	public void test1() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(1, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode t3 = new LinkedListNode(3, n3);
		LinkedListNode n4 = new LinkedListNode(21, t3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		ReorderList obj= new ReorderList();
		
		LinkedListNode res = obj.reorderList(n5);
		while(res!=null){
			System.out.println(res.value);
			res = res.next;
		}
	}
}
