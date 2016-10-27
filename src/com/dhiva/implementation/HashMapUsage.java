package com.dhiva.implementation;

import java.util.*;
import java.util.Map.Entry;

public class HashMapUsage {
	public static void main(String[] args) {
//		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 20);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);
		HashMap<Person, Integer> mapObj = new HashMap<Person, Integer>();

		// add k,v pair to map
//		mapObj.put(21, "hello");
		mapObj.put(dhiva, 2);
		mapObj.put(hari, 2);
		mapObj.put(sk, 2);
		mapObj.put(manoj, 2);

		
		// retrieve value with k
		Integer k1 = 21;
		String v1 = mapObj.get(k1);
		System.out.println(v1);
		
		// iterating hashmap
		Iterator<Integer> keyIterator = mapObj.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			System.out.println("key is" + key + "value is" + mapObj.get(key));
		}
		for (Entry<Integer, String> entry : mapObj.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key is" + key + "value is" + value);
		}
		// size of map
		System.out.println("size of hashmap  is" + mapObj.size());

		// check if a map contains a key/value
		System.out.println("map has key 21?" + mapObj.containsKey(21));
		System.out.println("map has key 21?" + mapObj.containsValue(21));

		// remove entry from map
		Object value = mapObj.remove(21);
		System.out.println("Following value is removed from Map: " + value);
		System.out.println(mapObj.get(21));
		System.out.println("is map empty?" + mapObj.isEmpty());
		mapObj.put(31, "world");
		mapObj.put(41, "hey");

		// sort map
		System.out.println("Unsorted HashMap: " + mapObj);
		TreeMap sortedHashMap = new TreeMap(mapObj);
		System.out.println("Sorted HashMap: " + sortedHashMap);

		// put same key obj
		mapObj.put(21, "this is duplicate");
		System.out.println("value for key 21 is " + mapObj.get(21));
	}
}
