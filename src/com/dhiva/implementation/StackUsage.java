package com.dhiva.implementation;
import java.util.Stack;

public class StackUsage {
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(new Integer(3));
		s.push(new Integer(6));
		s.push(new Integer(8));
		System.out.println(s.size());
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);

		
	}
}
