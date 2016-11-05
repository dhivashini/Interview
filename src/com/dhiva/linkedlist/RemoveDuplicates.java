package com.dhiva.linkedlist;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
 public static void removeDups(LinkedListNode n){
	 HashSet<Integer> set = new HashSet<Integer>();
	 LinkedListNode previous = null;
	 while(n!=null){
		 if(set.contains(n.value)){
			 previous.next=n.next;
		 }else{
			 set.add(n.value);
			 previous=n;
		 }
		 n=n.next;
	 }
	 Iterator<Integer> i= set.iterator();
	 while(i.hasNext())
		 System.out.println(i.next());
 }
 	
}
