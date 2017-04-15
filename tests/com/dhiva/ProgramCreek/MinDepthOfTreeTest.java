package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.problems_a.TreeNode;

public class MinDepthOfTreeTest {
	@Test
	public void test() {
		// boolean expected = true;
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(5);
		root1.left.left = new TreeNode(3);
		root1.right.right = new TreeNode(7);
		root1.left.right = new TreeNode(4);
		root1.right.left = new TreeNode(6);
		MinDepthOfTree obj = new MinDepthOfTree();
		int result = obj.minDepth(root1);
		assertEquals(result, 3);

	}
}
