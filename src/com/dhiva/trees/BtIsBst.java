package com.dhiva.trees;

public class BtIsBst {
	public static boolean checkIfBst(Node node) {
		return btIsBST(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private static boolean btIsBST(Node node, int minValue, int maxValue) {
		if (node == null)
			return true;
		if (node.data <= minValue || node.data >= maxValue)
			return false;
		return (btIsBST(node.left, minValue, node.data) && btIsBST(node.right, node.data, maxValue));
	}

}
