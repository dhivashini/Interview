package com.dhiva.StackAndQueue;

import java.util.Stack;

public class QueueViaStacks {
	Stack<Integer> newest = new Stack<Integer>();
	Stack<Integer> oldest = new Stack<Integer>();

	public void add(int data) {
		newest.push(data);
	}

	public int size() {
		return newest.size() + oldest.size();
	}

	public int remove() {
		shuffleStacks();
		return oldest.pop();
	}

	public int peek() {
		shuffleStacks();
		return oldest.peek();
	}

	private void shuffleStacks() {
		if (oldest.isEmpty()) {
			while (!newest.isEmpty()) {
				oldest.push(newest.pop());
			}
		}
	}
}
