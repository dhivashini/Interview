package com.dhiva.problems_a;

public class HashTableImplementation {
	private int TABLE_SIZE;
	HashNode[] buckets;
	int size;

	public HashTableImplementation(int size) {
		this.TABLE_SIZE = size;
		buckets = new HashNode[TABLE_SIZE];
	}

	public void put(Object key, Object value) {
		if (key == null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode() % TABLE_SIZE;
		if (buckets[location] == null)
			buckets[location] = new HashNode(key, value);
		else {
			HashNode n = buckets[location];
			while (n.next != null) {
				if (n.key.equals(key)) {
					n.value = value;
					return;
				}
				n = n.next;
			}
			n.next = new HashNode(key, value);
		}
		size++;
	}

	public Object get(Object key) {
		if (key == null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode() % TABLE_SIZE;
		if (buckets[location] == null)
			return null;
		else {
			if (buckets[location].key == key)
				return buckets[location].value;
			else {
				HashNode n = buckets[location];
				while (!n.key.equals(key) && n.next != null) {
					n = n.next;
				}
				if (n.next == null)
					return null;
				else
					return n.value;
			}
		}
	}

	public int size() {
		return size;
	}

}
