package com.dhiva.problems_a;

import java.util.Stack;

public class KSmallestElement {
	public int findKthSmallest(TreeNode root, int k) {
		
		int i = 0;
		Stack<TreeNode> s = new Stack<>();
		TreeNode node = root;

		while (!s.isEmpty() || node != null) {
			
			if (node != null) {
				s.push(node);
				node = node.left;
			} else {
				node = s.pop();
				if (++i == k)
					return node.data;
				node = node.right;
			}
			
		}
		return 0;
	}
}
