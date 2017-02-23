package com.dhiva.StackAndQueue;

import java.util.Stack;

public class SortStack {
	public Stack<Integer> sort(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<>();
		while (!input.isEmpty()) {
			int temp = input.pop();
			while ( !tempStack.isEmpty() && temp < tempStack.peek()) {
				input.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}
}
