package com.dhiva.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseTree {
	// inoder traversal
	public static void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	// pre-order traversal
	public static void preOrder(Node node) {
		if (node == null)
			return;
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	// post-order traversal
	public static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	// level-order traversal
	public static void levelOrder(Node node) {
		Queue<Node> levelQueue = new LinkedList<>();
		levelQueue.add(node);
		while (!levelQueue.isEmpty()) {
			Node temp = levelQueue.poll();
			System.out.println(temp.data);
			if (temp.left != null)
				levelQueue.add(temp.left);
			if (temp.right != null)
				levelQueue.add(temp.right);
		}
	}

}
