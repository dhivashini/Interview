package com.dhiva.implementation;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsage {
	public static void main(String[] args) {
		HashSet<Integer> setObj = new HashSet<Integer>();
		// add objects
		setObj.add(2);
		setObj.add(3);
		setObj.add(4);
		setObj.add(5);
		// check if set is empty
		System.out.println("is set empty? " + setObj.isEmpty());
		// remove object
		setObj.remove(3);
		// iterate the set
		Iterator setIterator = setObj.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		// convert hashset to array
		Object[] hashsetArray = setObj.toArray();
		for(Object i :hashsetArray){
			System.out.println(i);
		}
	}
}
