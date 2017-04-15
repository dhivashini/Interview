package com.dhiva.ProgramCreek;

import java.util.Stack;

import com.dhiva.problems_a.TreeNode;

public class BstIterator {
	Stack<TreeNode> stack;

	public BstIterator(TreeNode root) {
		stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}

	public int next() {
		TreeNode result = stack.pop();
		if (result.right != null) {
			TreeNode curr = result.right;
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
		}
		return result.data;
	}
}
