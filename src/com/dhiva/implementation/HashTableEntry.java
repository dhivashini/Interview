package com.dhiva.implementation;

public class HashTableEntry {
	private int key;
	private int value;

	HashTableEntry(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return this.key;
	}

	public int getValue() {
		return this.value;
	}

}
