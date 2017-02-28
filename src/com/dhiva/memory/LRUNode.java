package com.dhiva.memory;

public class LRUNode {
	 int data;
	LRUNode next;
	

	public LRUNode(int data) {
		this.data = data;
		next = null;
		
	}
}
