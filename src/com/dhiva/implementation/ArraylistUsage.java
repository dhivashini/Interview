package com.dhiva.implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistUsage {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add("a");
		System.out.println(list);
	    System.out.println(list.get(2));
	    list.add(3, new Integer(4));
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object element = i.next();
	         System.out.print(element + " ");
		}
	}
}
