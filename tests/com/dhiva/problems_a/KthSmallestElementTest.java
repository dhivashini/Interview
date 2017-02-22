package com.dhiva.problems_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class KthSmallestElementTest {
	@Test
	public void test() {
		int expected = 9;
		TreeNode root1 = new TreeNode(10);
		root1.left = new TreeNode(8);
		root1.right = new TreeNode(12);
		root1.left.left = new TreeNode(5);
		root1.right.right = new TreeNode(13);
		root1.left.right = new TreeNode(9);
		root1.right.left = new TreeNode(11);
		KSmallestElement obj = new KSmallestElement();
		int output = obj.findKthSmallest(root1, 3);
		assertEquals(expected, output);
	}
}
