package com.dhiva.memory;

public class LRUCacheImplementation {
	int CACHE_SIZE = 0;
	LRUNode first;
	LRUNode last;
	int size = 0;

	public LRUCacheImplementation(int size) {
		CACHE_SIZE = size;
		first = null;
		last = null;
	}

	public int getSize() {
		return this.size;
	}

	public void setNodeToCache(int data) {
		if (first == null && last == null) {
			first = new LRUNode(data);
			first = last;
		}
		else {
			LRUNode temp = first;
			while (temp.next != null) {
				if (temp.data == data) {
					temp.next = first;
					first = temp;
				}
			}
		}
		if (size <= CACHE_SIZE) {
			 
				temp.next = new LRUNode(data);
				last = temp;
			}
			size++;
		} else {
			while (temp.next != null) {
				if (temp.data == data) {
					temp.next = first;
					first = temp;
				}
			}
			LRUNode temp = new LRUNode(data);
			temp.next = first;
			first = temp;
			
		}

	}

	public int getNodeFromCache() {

	}
}
