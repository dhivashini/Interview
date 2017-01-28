package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeMirrorTest {
	@Test
	public void test() {
		boolean expected = true;
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(2);
		root1.left.left = new TreeNode(3);
		root1.right.right = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.right.left = new TreeNode(4);

		boolean output = BinaryTreeMirror.isMirror(root1);
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean expected = false;
		TreeNode root1 = new TreeNode(26);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(3);
		root1.left = new TreeNode(10);
		root1.left.left = new TreeNode(4);
		root1.left.left.right = new TreeNode(30);
		root1.left.right = new TreeNode(6);
		boolean output = BinaryTreeMirror.isMirror(root1);
		assertEquals(expected, output);
	}
}
