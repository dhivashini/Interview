package com.dhiva.implementation;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsage {
	public static void main(String[] args) {
		TreeSet<Integer> treesetObj = new TreeSet<Integer>();
		treesetObj.add(20);
		treesetObj.add(1);
		treesetObj.add(0);
		treesetObj.add(5);
		// iterate
		Iterator setIterator = treesetObj.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
	}
}
