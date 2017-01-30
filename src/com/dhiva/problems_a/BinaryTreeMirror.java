package com.dhiva.problems_a;

public class BinaryTreeMirror {
	public static boolean isMirror(TreeNode root) {
		return checkTree(root, root);
	}

	static boolean checkTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return root1.data == root2.data && checkTree(root1.right, root2.left) && checkTree(root1.left, root2.right);
	}
}
