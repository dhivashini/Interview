package com.dhiva.implementation;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableUsage {
	public static void main(String[] args) {
		// //hashtable with primitives
		// Hashtable<Integer, String> hashObj = new Hashtable<Integer,
		// String>();
		// hashObj.put(21, "hello");
		// hashObj.put(21, "hi");
		// hashObj.put(31, "foo");
		// hashObj.put(41, "world");

		// hashtable with objects
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);
		Hashtable<Person, Integer> hashObj = new Hashtable<Person, Integer>();

		// insert k-v pairs
		hashObj.put(dhiva, 10);
		hashObj.put(hari, 2);
		hashObj.put(sk, 5);
		hashObj.put(manoj, 1);
		hashObj.put(hani, 3);

		// retrieve value with k
		// Integer k1 = 21;
		// String v1 = hashObj.get(k1);
		// System.out.println(v1);
		System.out.println(hashObj.get(dhiva));
		System.out.println(hashObj.get(hari));

		// iterating hashtable
		// Iterator<Integer> keyIterator = hashObj.keySet().iterator();
		// while (keyIterator.hasNext()) {
		// Integer key = keyIterator.next();
		// System.out.println("key is " + key + "value is " + hashObj.get(key));
		// }
		Iterator<Person> keyIterator = hashObj.keySet().iterator();
		while (keyIterator.hasNext()) {
			Person key = keyIterator.next();
			System.out.println(
					"key is " + key.getFirstName() + " " + key.getLastName() + " value is " + hashObj.get(key));
		}

		// get all keys
		Enumeration<Person> e = hashObj.keys();
		while (e.hasMoreElements())
			System.out.println(e.nextElement().getFirstName());

		Enumeration<Integer> e1=hashObj.elements();
		while (e1.hasMoreElements())
		System.out.println(e1.nextElement());

		// size of table
		System.out.println("size of hashmap  is " + hashObj.size());

		// check if a table contains a key/value
		System.out.println("table has key hari?" + hashObj.containsKey(hari));
		System.out.println("table has key dhiva?" + hashObj.containsKey(dhiva));
		System.out.println("table has val 2?" + hashObj.containsValue(2));
		System.out.println("table has val 10?" + hashObj.containsValue(10));
	}
}
