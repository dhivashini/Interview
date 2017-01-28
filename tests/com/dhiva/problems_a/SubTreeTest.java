package com.dhiva.problems_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTreeTest {
	@Test
	public void test() {
		boolean expected = true;
		TreeNode root1 = new TreeNode(26);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(3);
		root1.left = new TreeNode(10);
		root1.left.left = new TreeNode(4);
		root1.left.left.right = new TreeNode(30);
		root1.left.right = new TreeNode(6);
		TreeNode root2 = new TreeNode(10);
		root2.right = new TreeNode(6);
		root2.left = new TreeNode(4);
		root2.left.right = new TreeNode(30);
		boolean output = SubTree.isSubTree(root1, root2);
		assertEquals(expected, output);
	}
}
