package com.dhiva.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetUsage {
	public static void main(String[] args) {
		TreeSet<Person> treesetObj = new TreeSet<Person>();
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);
		
//		//add integers
//		treesetObj.add(20);
//		treesetObj.add(1);
//		treesetObj.add(0);
//		treesetObj.add(5);
//		
		//add person objects
		treesetObj.add(dhiva);
		treesetObj.add(hari);
		treesetObj.add(sk);
		treesetObj.add(manoj);
		treesetObj.add(hani);
		
		System.out.println(treesetObj.contains(hari));
		System.out.println(treesetObj.contains(dhiva));
		System.out.println(treesetObj.size());

		//sort by age
		List<Person> sortedList = new ArrayList(treesetObj);
		Collections.sort(sortedList);

		// iterate
		Iterator<Person> setIterator = treesetObj.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next().getFirstName());
		}
	}
}
