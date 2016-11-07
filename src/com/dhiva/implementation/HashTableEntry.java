package com.dhiva.implementation;

public class HashTableEntry {
	private Object key;
	private Object value;

	HashTableEntry(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	public Object getKey() {
		return this.key;
	}

	public Object getValue() {
		return this.value;
	}

}
