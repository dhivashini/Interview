package com.dhiva.memory;

import java.util.HashMap;

public class LRUCacheImplementation {
	LRUNode first;
	LRUNode last;
	int size = 0;
	HashMap<Integer, LRUNode> cache = new HashMap<Integer, LRUNode>();

	public LRUCacheImplementation(int size) {
		this.size = size;
		first = null;
		last = null;
	}

	public int getSize() {
		return this.size;
	}

	public int get(int key) {
		if (cache.containsKey(key)) {
			LRUNode n = cache.get(key);
			remove(n);
			addAsHead(n);
			return n.value;
		}
		return -1;
	}

	private void addAsHead(LRUNode n) {
		n.next = first;
		n.prev = null;

		if (first != null)
			first.prev = n;

		first = n;

		if (last == null)
			last = first;
	}

	private void remove(LRUNode n) {
		if (n.prev != null)
			n.prev.next = n.next;
		else
			first = n.next;
		if (n.next != null)
			n.next.prev = n.prev;
		else
			last = n.prev;
	}

	public void set(int key, int value) {
		if (cache.containsKey(key)) {
			LRUNode n = cache.get(key);
			n.value = value;
			remove(n);
			addAsHead(n);
		} else {
			LRUNode n = new LRUNode(key, value);
			if (cache.size() >= size) {
				cache.remove(last);
				remove(last);
				addAsHead(n);
			} else {
				addAsHead(n);
			}
			cache.put(key, n);
		}

	}

}
