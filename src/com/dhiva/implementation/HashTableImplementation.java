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

}
