package com.dhiva.linkedlist;

public class LinkedListNode {
	
		public int value;
		public LinkedListNode next;
		
		LinkedListNode(){
			
		}
		public LinkedListNode(int value) {
			this.value = value;
			next = null;
		}
		
	    public LinkedListNode(int value, LinkedListNode next) {
			this.value = value;
			this.next = next;
		}

}
