package com.dhiva.linkedlist;

public class ReturnKfromLast {
	public static int returnKNode(LinkedListNode head,int k){
		int length=0;
		LinkedListNode temp = head;
		while(temp!=null){
			temp=temp.next;
			length++;
		}
		temp=head;
		for(int i=0;i<length-k;i++){
			temp=temp.next;
		}
		System.out.println(temp.value);
		return temp.value;
	}
	
}
