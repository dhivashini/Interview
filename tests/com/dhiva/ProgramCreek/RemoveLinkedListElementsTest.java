package com.dhiva.ProgramCreek;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListNode;

public class RemoveLinkedListElementsTest {
	@Test
	public void test(){
		LinkedListNode n1 = new LinkedListNode(10);
		LinkedListNode n2 = new LinkedListNode(5,n1);	
		LinkedListNode n3 = new LinkedListNode(15,n2);
		LinkedListNode n4 = new LinkedListNode(30,n3);
		LinkedListNode n5 = new LinkedListNode(30,n4);
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		LinkedListNode head = obj.removeElements(n5, 30);
		while(head!=null){
			System.out.println(head.value);
			head = head.next;
		}
	}
}
