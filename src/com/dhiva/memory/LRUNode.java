package com.dhiva.memory;

public class LRUNode {
	 int data;
	 int value;
	 LRUNode next;
	 LRUNode prev;
	

	public LRUNode(int data, int value) {
		this.data = data;
		this.value = data;
		next = null;
		prev = null;
		
	}
}
