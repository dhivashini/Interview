package com.dhiva.problems_a;

public class ReverseATree {
	public static void reverseTree(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		reverseTree(root.left);
		reverseTree(root.right);
	}
}
