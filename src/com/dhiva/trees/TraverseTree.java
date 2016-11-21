package com.dhiva.trees;

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

}
