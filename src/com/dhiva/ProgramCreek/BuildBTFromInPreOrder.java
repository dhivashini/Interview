package com.dhiva.ProgramCreek;

import com.dhiva.problems_a.TreeNode;

public class BuildBTFromInPreOrder {
	public TreeNode buildTree(int[] inorder, int[] preorder) {
		return buildTreeUtil(0, 0, inorder.length - 1, inorder, preorder);
	}

	private TreeNode buildTreeUtil(int instart, int prestart, int inend, int[] inorder, int[] preorder) {
		if (instart > inend || prestart > preorder.length - 1)
			return null;
		TreeNode root = new TreeNode(preorder[0]);
		int index = 0;
		for (int i = 0; i < inend; i++) {
			if (preorder[0] == inorder[i])
				index = i;
		}
		
		root.left = buildTreeUtil(instart, prestart + 1, index - 1, inorder, preorder);
		root.right = buildTreeUtil(index + 1, prestart + index - instart + 1, inend, inorder, preorder);
		return root;
	}
}
