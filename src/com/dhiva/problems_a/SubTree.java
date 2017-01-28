package com.dhiva.problems_a;

public class SubTree {
	public static boolean isSubTree(TreeNode n1, TreeNode n2) {
		if (n2 == null)
			return true;
		if (n1 == null)
			return false;
		if (n1.data == n2.data)
			checkTree(n1, n2);
		return checkTree(n1.left, n2) || checkTree(n1.right, n2);
	}

	public static boolean checkTree(TreeNode n1, TreeNode n2) {
		if (n1 == null && n2 == null)
			return true;
		if (n1 == null || n2 == null)
			return false;
		if (n1.data != n2.data)
			return false;
		return checkTree(n1.left, n2.left) && checkTree(n1.right, n2.right);
	}
}
