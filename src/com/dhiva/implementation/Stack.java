package com.dhiva.implementation;

public class Stack {
	private int[] stack;
	private int size;
	private int top;

	public Stack(int stackSize) {
		stack = new int[stackSize];
		size = stackSize;
		top = -1;
	}

	public void push(int element) {
		if (top <= size) {
			top++;
			stack[top] = element;
		} else {
			System.out.println("Stack full");
		}
	}

	public void pop() {
		if (top <= -1) {
			System.out.println("Stack empty. Cant pop.");
		} else {
			top--;
		}

	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i] + "\n");
		}
	}

}
