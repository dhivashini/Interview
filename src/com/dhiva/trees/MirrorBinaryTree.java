package com.dhiva.trees;

public class MirrorBinaryTree {
	public static void mirror(Node node) {
		if (node == null)
			return;
		if (node.left == null && node.right == null)
			return;
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
		mirror(node.left);
		mirror(node.right);
	}
}
