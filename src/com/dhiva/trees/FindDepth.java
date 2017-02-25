package com.dhiva.trees;

public class FindDepth {
	public int findDepthOfTree(Node root) {
		if (root == null)
			return 0;
		int left = findDepthOfTree(root.left);
		int right = findDepthOfTree(root.right);

		if (left > right)
			return left + 1;
		else
			return 1 + right;
	}
}
