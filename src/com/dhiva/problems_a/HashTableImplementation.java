package com.dhiva.problems_a;

public class HashTableImplementation {
	private int TABLE_SIZE;
	HashNode[] buckets;
	int size;

	public HashTableImplementation(int size) {
		this.TABLE_SIZE = size;
		buckets = new HashNode[TABLE_SIZE];
	}
	
	public void put(Object key, Object value){
		if(key==null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode()%TABLE_SIZE;
		buckets[location] = new HashNode(key,value);
		size++;
		
	}
	
	public Object get(Object key){
		if(key==null)
			throw new NullPointerException("Key cannot be null");
		int location = key.hashCode()%TABLE_SIZE;
		if(buckets[location]==null)
			return null;
		Object value = buckets[location].value;
		return value;
	}
	
	public int size(){
		return size;
	}
	
}
