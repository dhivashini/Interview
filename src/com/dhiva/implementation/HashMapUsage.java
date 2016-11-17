package com.dhiva.implementation;

import java.util.*;
import java.util.Map.Entry;

public class HashMapUsage {
	public static void main(String[] args) {
		// HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);
		HashMap<Person, Integer> mapObj = new HashMap<Person, Integer>();

		// add k,v pair to map
		// mapObj.put(21, "hello");
		mapObj.put(dhiva, 10);
		mapObj.put(hari, 2);
		mapObj.put(sk, 5);
		mapObj.put(manoj, 1);
		mapObj.put(hani, 3);

		// retrieve value with k
		// Integer k1 = 21;
		// String v1 = mapObj.get(k1);
		System.out.println(mapObj.get(dhiva));
		
		System.out.println("hash val"+manoj.hashCode());
		System.out.println("hash val"+manoj.hashCode());

		// iterating hashmap with keyset
		Iterator<Person> keyIterator = mapObj.keySet().iterator();
		while (keyIterator.hasNext()) {
			Person key = keyIterator.next();
			System.out
					.println("key is " + key.getFirstName() + " " + key.getLastName() + " value is " + mapObj.get(key));
		}
		
		//iterate using entryset
		for (Entry<Person, Integer> entry : mapObj.entrySet()) {
			Person key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key is " + key.getFirstName() + " " + key.getLastName() + " value is " + value);
		}
		
		// size of map
		System.out.println("size of hashmap  is" + mapObj.size());

		// check if a map contains a key/value
		System.out.println("map has key hari?" + mapObj.containsKey(dhiva));
		System.out.println("map has value 2?" + mapObj.containsValue(10));

		// remove entry from map
		Object value = mapObj.remove(sk);
		System.out.println("Following value is removed from Map: " + value);
		System.out.println(mapObj.get(sk));
		System.out.println("is map empty?" + mapObj.isEmpty());
		// mapObj.put(31, "world");
		// mapObj.put(41, "hey");

		// sort map
		System.out.println("Unsorted HashMap: " + mapObj);
		TreeMap<Person, Integer> sortedHashMap = new TreeMap<Person, Integer>(mapObj);
		for (Entry<Person, Integer> entry : sortedHashMap.entrySet()) {
			System.out.println(entry.getKey().getFirstName() + "/" + entry.getValue());
		}

		// put same key obj
		// mapObj.put(21, "this is duplicate");
		System.out.println("value for key 21 is " + mapObj.get(21));
	}
}
