package com.dhiva.ProgramCreek;

import org.junit.Test;

import com.dhiva.problems_a.TreeNode;

public class FlattenTreeToLLTest {
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
		FlattenTreeToLL obj = new FlattenTreeToLL();
		TreeNode head = obj.flattenTree(root1);
		while (head.right != null) {
			System.out.println(head.data);
			head = head.right;
		}
	}
}
