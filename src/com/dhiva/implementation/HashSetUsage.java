package com.dhiva.implementation;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsage {
	public static void main(String[] args) {
		Person dhiva = new Person("dhisha", "jagan", "f", 20);
		Person hari = new Person("dhisha", "jagan", "f", 20);
		Person hani = new Person("hanumesh", "m", "m", 24);
		Person sk = new Person("kou", "sekhar", "m", 24);
		Person manoj = new Person("manash", "ravi", "m", 24);

		HashSet<Person> setObj = new HashSet<Person>();
		// add objects
		setObj.add(dhiva);
		setObj.add(hari);
		setObj.add(hani);
		setObj.add(sk);
		setObj.add(manoj);
		// check if set is empty
		System.out.println("is set empty? " + setObj.isEmpty());
		// remove object
		setObj.remove(3);
		// iterate the set
		Iterator setIterator = setObj.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		// get person info
		for (Person p : setObj) {
			System.out.printf(p.getFirstName(), p.getLastName());
			System.out.println();
		}
		//check for equals method
		System.out.println(dhiva.equals(hari));
		System.out.println(dhiva.hashCode());
		System.out.println(hari.hashCode());
		// convert hashset to array
		Object[] hashsetArray = setObj.toArray();
		for (Object i : hashsetArray) {
			System.out.println(i);
		}
	}
}
