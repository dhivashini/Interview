package com.dhiva.ProgramCreek;

import com.dhiva.problems_a.TreeNode;

public class RecoverBinarySearchTree {
	TreeNode f = null;
	TreeNode s = null;
	TreeNode prev = new TreeNode(Integer.MIN_VALUE);

	public TreeNode recoverTree(TreeNode root) {
		traverse(root);
		int temp = f.data;
		f.data = s.data;
		s.data = temp;
		return root;

	}

	private void traverse(TreeNode root) {
		if(root==null)
			return;
		
		traverse(root.left);

		if (f == null && prev.data > root.data)
			f = prev;
		if (f != null && prev.data > root.data)
			s = root;
		prev = root;

		traverse(root.right);
	}
}
