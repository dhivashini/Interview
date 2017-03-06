package com.dhiva.implementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class DeepIteratorImplementation<T> implements Iterator<T> {
	private T item;
	private final Stack<Iterator<?>> stack = new Stack<Iterator<?>>();

	public DeepIteratorImplementation(Collection<?> collection) {
		if (collection == null)
			throw new NullPointerException("Can't iterate over a null collection.");
		else
			stack.push(collection.iterator());
	}

	@Override
	public boolean hasNext() {
		if (item != null)
			return true;
		while (!stack.isEmpty()) {
			Iterator<?> i = stack.pop();
			if (i.hasNext()) {
				Object current = i.next();
				if (current instanceof Collection<?>)
					stack.add(((Collection<?>) current).iterator());
				else {
					item = (T) current;
					return true;
				}
			} else {
				stack.pop();
			}
		}
		return false;
	}

	@Override
	public T next() {
		if (hasNext()) {
			T toReturn = item;
			item = null;
			return toReturn;
		}
		throw new NoSuchElementException();
	}

}
