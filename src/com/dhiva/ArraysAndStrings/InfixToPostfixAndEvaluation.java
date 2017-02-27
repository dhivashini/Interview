package com.dhiva.ArraysAndStrings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//public class InfixToPostfixAndEvaluation {

//	public void infixToPostfix(String input) {
//
//		Stack<Character> s = new Stack<Character>();
//		Queue<Character> postfix = new LinkedList<>();
//
//		for (int count = 0; count < input.length(); count++) {
//			if (input.charAt(count) >= 'A' && input.charAt(count) <= 'Z') {
//				postfix.add(input.charAt(count));
//			} else if (input.charAt(count) == ')') {
//				while (s.peek() != '(') {
//					postfix.add(s.pop());
//				}
//				s.pop();
//			} else if (s.isEmpty() || input.charAt(count) == '(') {
//				s.push(input.charAt(count));
//			}
//
//			int value = getValue(input.charAt(count));
//			int valueAtTop = getValue(s.peek());
//				if (!s.isEmpty() && value > valueAtTop) {
//					s.push(input.charAt(count));
//				} else if (!s.isEmpty() && value <= valueAtTop) {
//					char temp = s.pop();
//					while (!s.isEmpty() && getValue(s.peek()) > getValue(temp)) {
//						postfix.add(s.pop());
//						temp = s.pop();
//					}
//					s.push(input.charAt(count));
//				}
//		}
//		System.out.println(postfix);
//	}
//
//	private int getValue(char input) {
//		if (input == '*')
//			return 4;
//		if (input == '/')
//			return 4;
//		if (input == '+')
//			return 2;
//		if (input == '-')
//			return 2;
//		if (input == '^')
//			return 6;
//		else 
//			return 0;
//
//	}

public class InfixToPostfixAndEvaluation {

	private static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';
	}

	private static int getPrecedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	// A utility function to check if the given character is operand
	private static boolean isOperand(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	//infix to postfix conversion
	public static String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		StringBuffer postfix = new StringBuffer(infix.length());
		char c;

		for (int i = 0; i < infix.length(); i++) {
			c = infix.charAt(i);

			if (isOperand(c)) {
				postfix.append(c);
			} else if (c == '(') {
				stack.push(c);
			}
			// If the scanned character is an ‘)’, pop and output from the stack
			// until an ‘(‘ is encountered.
			else if (c == ')') {

				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				if (!stack.isEmpty() && stack.peek() != '(')
					return null;
				else if (!stack.isEmpty())
					stack.pop();
			} else if (isOperator(c)) // operator encountered
			{
				if (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		System.out.println(postfix.toString());
		return postfix.toString();
	}
	
	//evaluate postfix
	public int evaluatePostfix(String input){
		Scanner sc = new Scanner(input);
	    Stack<Integer> stack = new Stack<Integer>();

	    while (sc.hasNext()) {
	        if (sc.hasNextInt()) {
	            stack.push(sc.nextInt());
	            continue;
	        }
	        int b = stack.pop();
	        int a = stack.pop();
	        char op = sc.next().charAt(0);
	        if      (op == '+') stack.push(a + b);
	        else if (op == '-') stack.push(a - b);
	        else if (op == '*') stack.push(a * b);
	        else if (op == '/') stack.push(a / b);
	        else if (op == '%') stack.push(a % b);
	    }

	    sc.close();
	    
		System.out.println(stack.peek());
		return stack.pop();
	}

}
