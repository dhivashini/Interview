package com.dhiva.implementation;

public class HashTableImplementation {
	public static final int TABLE_SIZE = 31;
	HashTableEntry[] table;

	public HashTableImplementation() {
		table = new HashTableEntry[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++) {
			table[i] = null;
		}
	}

	public void put(int key, int value) {
		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key)
			hash = (hash + 1) % TABLE_SIZE;
		table[hash] = new HashTableEntry(key, value);
	}

	public int get(int key) {
		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key)
			hash = (hash + 1) % TABLE_SIZE;
		if (table[hash] == null)
			return -1;
		else
			return table[hash].getValue();
	}
}
