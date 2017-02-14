package com.dhiva.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Node {
	String word;
	int length;

	Node(String word, int length) {
		this.word = word;
		this.length = length;
	}
}

public class ShortestWordTransition {
	public static int findLength(String start, String target, Set<String> dict) {
		Queue<Node> queue = new LinkedList<>();
		Node node = new Node(start, 1);
		queue.add(node);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			for (String s : dict) {
				if (areAdjacent(temp.word, s)) {
					Node n = new Node(s, temp.length + 1);
					queue.add(n);
					if (s == target)
						return n.length;
				}
			}
		}
		return 0;
	}

	private static boolean areAdjacent(String temp, String s) {
		int i = 0;
		boolean status = false;
		if (temp.length() != s.length())
			return false;
		while (i < temp.length()) {
			if (temp.charAt(i) != s.charAt(i)) {
				if (status)
					return false;
				status = true;
			}
			i++;
		}
		return true;
	}
}
