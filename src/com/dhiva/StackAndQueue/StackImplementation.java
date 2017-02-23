package com.dhiva.StackAndQueue;

public class StackImplementation<T> {
	public StackNode<T> top;

	public void push(T data) {
		StackNode<T> current = new StackNode<T>(data);
		current.next = top;
		top = current;
	}

	public T pop() {
		if (top == null)
			throw new ArrayIndexOutOfBoundsException();
		T item = top.data;
		top.next = top;
		return item;
	}

	public T peek() {
		if (top == null)
			throw new ArrayIndexOutOfBoundsException();
		return top.data;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}
}
