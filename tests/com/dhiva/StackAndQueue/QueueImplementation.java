package com.dhiva.StackAndQueue;

public class QueueImplementation<T> {
	QueueNode<T> first;
	QueueNode<T> last;

	public void add(T element) {
		QueueNode<T> item = new QueueNode<T>(element);
		if (last != null)
			last.next = item;
		last = item;
		if (first == null)
			first = last;
	}

	public T remove() {
		if (first == null)
			throw new ArrayIndexOutOfBoundsException();
		T data = first.data;
		first = first.next;
		if (first == null)
			last = null;
		return data;
	}

	public T peek() {
		if (first == null)
			throw new ArrayIndexOutOfBoundsException();
		return first.data;
	}
}
