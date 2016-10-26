package com.dhiva.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistUsage {
	public static void main(String[] args){
		Person dhiva = new Person("dhisha", "jagan", "f", 20);
		Person hari = new Person("small", "prasad", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 24);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 25);
		ArrayList<Person> personList = new ArrayList<Person>();
		
//		list.add(new Integer(2));
//		list.add(new Integer(3));
//		list.add("a");
		personList.add(dhiva);
		personList.add(hari);
		personList.add(hani);
		personList.add(sk);
		System.out.println(personList.size());
		System.out.println(personList);
	    System.out.println(personList.get(2));
//	    list.add(3, new Integer(4));
//		System.out.println(list);
//		list.remove(3);
//		System.out.println(list);
	    
	    for (Person p : personList) {
			System.out.printf(p.getFirstName()+" "+ p.getLastName());
			System.out.println();
		}
	    
		Iterator i = personList.iterator();
		while(i.hasNext())
		{
			Object element = i.next();
	        System.out.print(element + " ");
		}	
	}
}
