package com.dhiva.problems_a;

import java.util.Stack;

public class ZigZagTraversal {
	public void printPattern(TreeNode root) {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {

			while (!s1.isEmpty()) {
				TreeNode n = s1.pop();
				System.out.print(n.data);
				if (n.right != null)
					s2.push(n.right);
				if (n.left != null)
					s2.push(n.left);
			}

			while (!s2.isEmpty()) {
				TreeNode n = s2.pop();
				System.out.print(n.data);
				if (n.left != null)
					s1.push(n.left);
				if (n.right != null)
					s1.push(n.right);

			}
		}
	}
}
