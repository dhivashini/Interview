package com.dhiva.implementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class DeepIteratorIntegerImplementation implements Iterator {
	private Object nextItem;
	private Stack<Iterator> stack = new Stack<>();

	public DeepIteratorIntegerImplementation(Collection<?> c) {
		if (c == null)
			throw new NullPointerException("Can't iterate over a null collection.");
		else
			stack.push(c.iterator());
	}

	@Override
	public boolean hasNext() {
		if (nextItem != null)
			return true;
		while (!stack.isEmpty()) {
			Iterator i = stack.peek();
			if (i.hasNext()) {
				Object current = i.next();
				if (current instanceof Collection) {
					stack.push(((Collection) current).iterator());
				} else {
					nextItem = current;
					return true;
				}

			} else {
				stack.pop();
			}
		}
		return false;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Object temp = nextItem;
			nextItem = null;
			return temp;
		}
		return null;
	}

}
