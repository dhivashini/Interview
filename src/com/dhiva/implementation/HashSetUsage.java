package com.dhiva.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetUsage {
	public static void main(String[] args) {
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);

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
		// setObj.remove(sk);
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
		// check for equals method
		System.out.println(dhiva.equals(hari));
		System.out.println(dhiva.hashCode());
		System.out.println(hari.hashCode());
		List<Person> sortedList = new ArrayList(setObj);

		// compareTo
		Collections.sort(sortedList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});

		for (Person p : sortedList) {
			System.out.printf(p.getFirstName(), p.getLastName());
			System.out.println();
		}

		// comparable
		Collections.sort(sortedList);
		for (Person p : sortedList) {
			System.out.println(p.getLastName());

		}
		// convert hashset to array
		Object[] hashsetArray = setObj.toArray();
		for (Object i : hashsetArray) {
			System.out.println(i);
		}
	}

}
