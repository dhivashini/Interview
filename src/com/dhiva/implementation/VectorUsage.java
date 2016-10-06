package com.dhiva.implementation;

import java.util.Enumeration;
import java.util.Vector;

public class VectorUsage {
	public static void main(String[]args){
		Vector v = new Vector();
		System.out.println("Initial size: " + v.size());
	    System.out.println("Initial capacity: " + v.capacity());
	    
	    //add element to vector
	    v.addElement(new Integer(1));
	    v.addElement(new Integer(2));
	    Integer s = (Integer) v.get(1);
	    System.out.println(s);
	    Enumeration vEnum = v.elements();
	      System.out.println("\nElements in vector:");  
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
	      System.out.println();
	}
}
