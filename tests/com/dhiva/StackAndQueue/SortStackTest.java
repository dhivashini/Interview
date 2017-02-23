package com.dhiva.StackAndQueue;

import java.util.Stack;

import org.junit.Test;

public class SortStackTest {
	@Test
	public void test(){
		Stack<Integer> input = new Stack<>();
		input.push(10);
		input.push(5);
		input.push(8);
		input.push(12);
		input.push(1);
		SortStack obj = new SortStack();
		Stack<Integer> output = obj.sort(input);
		System.out.println(output);
		
		
	}
}
