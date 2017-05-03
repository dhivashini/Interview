package com.dhiva.ProgramCreek;

import org.junit.Test;

import com.dhiva.problems_a.TreeNode;
import com.dhiva.trees.TraverseTree;

public class RecoverBstTest {
	@Test
	public void test() {
		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(5);
		root1.right.left = new TreeNode(2);
		root1.left.left = new TreeNode(6);
		RecoverBinarySearchTree obj = new RecoverBinarySearchTree();
		TreeNode s = obj.recoverTree(root1);

		TraverseTree.inOrder(s);

	}
}
