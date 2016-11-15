package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseStringWithSpecialChar {
	// public static String reverseString(String input){
	// char[] inputCharArray = input.toCharArray();
	// char[] output;
	// for(int i=0;i<input.length();i++){
	// if(input.charAt(i)<Character.valueOf('a')||input.charAt(i)<Character.valueOf('z')){
	// output[i]=input.charAt(i);
	// }
	// }
	//
	//
	// return output.toString();
	// }
	 public static void main(String[] args){
	 List<Integer> list1 = new ArrayList<Integer>();
	
	
	 list1.add(2);
	 list1.add(3);
	 list1.add(4);
	 list1.add(5);
	 List<Integer> list2 = new ArrayList<Integer>();
	 //list2.addAll(list1);
	 list2 = list1;
	 Iterator i = list2.iterator();
	 while(i.hasNext())
	 {
	 Object element = i.next();
	 System.out.print(element + " ");
	 }
	 list1.remove(2);
	 Iterator i1 = list2.iterator();
	 while(i1.hasNext())
	 {
	 Object element = i1.next();
	 System.out.print(element + " ");
	 }
	
	 }
}
