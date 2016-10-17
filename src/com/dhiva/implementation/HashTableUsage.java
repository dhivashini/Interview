package com.dhiva.implementation;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableUsage {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashObj = new Hashtable<Integer, String>();
		hashObj.put(21, "hello");
		hashObj.put(21, "hi");
		hashObj.put(31, "foo");
		hashObj.put(41, "world");
		// retrieve value with k
		Integer k1 = 21;
		String v1 = hashObj.get(k1);
		System.out.println(v1);
		// iterating hashtable
		Iterator<Integer> keyIterator = hashObj.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			System.out.println("key is " + key + "value is " + hashObj.get(key));
		}
		// size of table
		System.out.println("size of hashmap  is " + hashObj.size());
		// check if a table contains a key/value
		System.out.println("map has key 21?" + hashObj.containsKey(21));
		System.out.println("map has key 21?" + hashObj.containsValue(21));
	}
}
