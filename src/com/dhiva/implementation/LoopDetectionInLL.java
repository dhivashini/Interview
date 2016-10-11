package com.dhiva.implementation;

public class LoopDetectionInLL {
	Node head;

	class Node {
		int value;
		Node next;

		Node(int n) {
			value = n;
			next = null;
		}
	}

	public void push(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public void detectLoop() {
		Node slow = head;
		Node fast = head;
		while (slow.next != null && fast.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop exists");
				break;
			}
		}
		return;
	}

	public static void main(String[] args) {
		LoopDetectionInLL list = new LoopDetectionInLL();
		list.push(2);
		list.push(6);
		list.push(1);
		list.push(3);
		list.push(5);
		list.head.next.next.next.next = list.head;
		list.detectLoop();
	}
}
