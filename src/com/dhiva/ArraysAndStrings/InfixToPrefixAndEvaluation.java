package com.dhiva.ArraysAndStrings;

import java.util.Stack;

public class InfixToPrefixAndEvaluation {
	public static String infixToPrefix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		StringBuffer prefix = new StringBuffer(infix.length());
		char c;

		for (int i = infix.length(); i >=0 ; i--) {
			c = infix.charAt(i);

			if (isOperand(c)) {
				prefix.append(c);
			} else if (c == ')') {
				stack.push(c);
			}
			// If the scanned character is an ‘)’, pop and output from the stack
			// until an ‘(‘ is encountered.
			else if (c == '(') {

				while (!stack.isEmpty() && stack.peek() != '(') {
					prefix.append(stack.pop());
				}
				if (!stack.isEmpty() && stack.peek() != '(')
					return null;
				else if (!stack.isEmpty())
					stack.pop();
			} else if (isOperator(c)) // operator encountered
			{
				if (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
					prefix.append(stack.pop());
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			prefix.append(stack.pop());
		}
		System.out.println(prefix.reverse().toString());
		return prefix.toString();
	}

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
}
