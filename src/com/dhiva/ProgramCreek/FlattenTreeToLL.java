package com.dhiva.ProgramCreek;

import java.util.Stack;

import com.dhiva.problems_a.TreeNode;

public class FlattenTreeToLL {
	public TreeNode flattenTree(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (temp != null || !stack.isEmpty()) {
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				temp.right = temp.left;
				temp.left = null;
			} else if (!stack.isEmpty()) {
				temp.right = stack.pop();
			}
			temp = temp.right;
		}
		return root;
	}
}
