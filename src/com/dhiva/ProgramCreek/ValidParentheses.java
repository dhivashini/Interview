package com.dhiva.ProgramCreek;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String input) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			Character current = input.charAt(i);
			if (map.containsKey(current))
				stack.push(current);
			else if (map.containsValue(current)) {
				if (!stack.isEmpty() && map.get(stack.peek()) == current)
					stack.pop();
				else
					return false;
			}

		}
		return true;
	}

}
