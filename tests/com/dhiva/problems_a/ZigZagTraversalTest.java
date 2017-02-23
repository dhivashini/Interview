package com.dhiva.problems_a;

import org.junit.Test;

public class ZigZagTraversalTest {
	@Test
	public void test() {
		TreeNode root1 = new TreeNode(8);
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(10);
		root1.left.left = new TreeNode(1);
		root1.right.right = new TreeNode(14);
		root1.left.right = new TreeNode(6);
		root1.right.right.left = new TreeNode(13);
		root1.left.right.left = new TreeNode(4);
		root1.left.right.right = new TreeNode(7);
		ZigZagTraversal obj = new ZigZagTraversal();
		obj.printPattern(root1);
	
	}
}
