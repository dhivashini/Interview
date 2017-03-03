package com.dhiva.implementation;

public class HashTableEntry<K,V> {
	public K key;
	public V value;
	HashTableEntry<K,V> next;
	
	HashTableEntry(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

}
