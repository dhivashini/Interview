package com.dhiva.problems_a;

public class ReverseATree {
	public static void reverseTree(TreeNode root) {
		TreeNode root1 = flipTree(root);
	}

	private static TreeNode flipTree(TreeNode root) {
		if (root == null) {
			return root;
		}
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		reverseTree(root.left);
		reverseTree(root.right);
		return root;
	}
}
