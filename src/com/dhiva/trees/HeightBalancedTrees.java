package com.dhiva.trees;

/*https://www.youtube.com/watch?v=TWDigbwxuB4*/

public class HeightBalancedTrees {
	public static boolean checkHeight(Node root) {
		if (isBalanced(root) > -1)
			return true;
		return false;
	}

	public static int isBalanced(Node root) {
		if (root == null)
			return 0; 
		int leftHeight = isBalanced(root.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = isBalanced(root.right);
		if (rightHeight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return 1 + Math.max(leftHeight, rightHeight);

	}
}
