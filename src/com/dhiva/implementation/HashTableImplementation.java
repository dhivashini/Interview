package com.dhiva.implementation;

public class HashTableImplementation<K,V> {
	public static int TABLE_SIZE ;
	public HashTableEntry<K,V>[] table;
	private int size = 0;
	
	public HashTableImplementation(int size){
		TABLE_SIZE = size;
		table = new HashTableEntry[TABLE_SIZE];
	}
	
	public void put(K key, V value){
		if (key == null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode() % TABLE_SIZE;
		if (table[location] == null)
			table[location] = new HashTableEntry<K,V>(key, value);
		else {
			HashTableEntry<K,V> n = table[location];
			while (n.next != null) {
				if (n.key.equals(key)) {
					n.value = value;
					return;
				}
				n = n.next;
			}
			n.next = new HashTableEntry<K,V>(key, value);
		}
		size++;
	}
	public V get(K key){
		if (key == null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode() % TABLE_SIZE;
		if (table[location] == null)
			return null;
		else {
			if (table[location].key == key)
				return (V) table[location].value;
			else {
				HashTableEntry<K,V> n = table[location];
				while (!n.key.equals(key) && n.next != null) {
					n = n.next;
				}
				if (n.next == null)
					return null;
				else
					return (V) n.value;
			}
		}
	}
	
	
	public int size(){
		return this.size;
	}
	
//	public void remove(){
//		
//	}

}
