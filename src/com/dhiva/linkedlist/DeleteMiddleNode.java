package com.dhiva.linkedlist;

public class DeleteMiddleNode {
	public static boolean deleteMidNode(LinkedListNode node){
		if(node==null||node.next==null)
			return false;
		LinkedListNode next = node.next;
		node.value = next.value;
		node.next=next.next;
		return true;
	}
}
