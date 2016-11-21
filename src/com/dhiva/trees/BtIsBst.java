package com.dhiva.trees;

public class BtIsBst {
	// public static boolean checkIfBst(Node node) {
	// return btIsBST(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
	// }
	//
	// private static boolean btIsBST(Node node, int minValue, int maxValue) {
	// if (node == null)
	// return true;
	// if (node.data <= minValue || node.data >= maxValue)
	// return false;
	// return (btIsBST(node.left, minValue, node.data) && btIsBST(node.right,
	// node.data, maxValue));
	// }

	// alternate way
	public static boolean checkIfBst(Node node) {
		if (node == null)
			return true;
		if (node.left == null && node.right == null)
			return true;
		boolean left = node.data > node.left.data && checkIfBst(node.left);
		boolean right = node.data < node.right.data && checkIfBst(node.right);
		return left && right;
	}

	// inoder traversal of binary tree to check if its a bst
	public static void inOrder(Node node){
		if (node == null)
			System.out.println("no node");;
		if (node.left == null && node.right == null)
			System.out.println(node.data);
		System.out.println(node.data);
		inOrder(node.left);
		inOrder(node.right);

	}
	
}
