package com.dhiva.trees;

public class DuplicateNodesInTree {
	public static void createDuplicates(Node node) {
		if (node == null)
			return;
		Node temp = new Node(node.data);
		temp.left = node.left;
		node.left = temp;
		createDuplicates(node.left.left);
		createDuplicates(node.right);
	}
}
