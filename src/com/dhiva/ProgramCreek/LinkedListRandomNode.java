package com.dhiva.ProgramCreek;

import java.util.Random;

import com.dhiva.linkedlist.LinkedListNode;

public class LinkedListRandomNode {
	LinkedListNode head;
	Random r;
	
	public LinkedListRandomNode(LinkedListNode n) {
		head = n;
		r = new Random();
	}
	
	public int getRandom(){
		LinkedListNode temp = head;
		int val = temp.value;
		
		for(int i=1;temp.next!=null;i++){
			temp = temp.next;
			if(r.nextInt(i+1)==i)
				val = temp.value;
		}
		return val;
	}
}
