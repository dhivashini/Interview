package com.dhiva.implementation;

import java.util.*;
import java.util.Map.Entry;

public class HashMapUsage {
	public static void main(String[] args) {
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		//add k,v pair to map
		mapObj.put(21, "hello");
		//retrieve value with k
		Integer k1 = 21;
		String v1 = mapObj.get(k1);
		System.out.println(v1);
		//iterating hashmap
		Iterator<Integer> keyIterator = mapObj.keySet().iterator();
		while(keyIterator.hasNext()){
			Integer key = keyIterator.next();
			System.out.println("key is"+key+"value is"+mapObj.get(key));		
		}
		//size of map
		System.out.println("size of hashmap  is"+mapObj.size());
		//check if a map contains a key/value
		System.out.println("map has key 21?"+mapObj.containsKey(21));
		System.out.println("map has key 21?"+mapObj.containsValue(21));
		//remove entry from map
		Object value = mapObj.remove(21);
		System.out.println("Following value is removed from Map: " + value);
		System.out.println(mapObj.get(21));
		System.out.println("is map empty?"+mapObj.isEmpty());
		mapObj.put(31, "world");
		mapObj.put(41, "hey");
		//sort map
		System.out.println("Unsorted HashMap: " + mapObj); 
		TreeMap sortedHashMap = new TreeMap(mapObj); 
		System.out.println("Sorted HashMap: " + sortedHashMap); 
		//put same key obj
		mapObj.put(21, "this is duplicate");
		System.out.println("value for key 21 is "+mapObj.get(21));
	}
}
