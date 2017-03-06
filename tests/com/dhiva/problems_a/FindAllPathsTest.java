package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FindAllPathsTest {
	@Test
	public void test() {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.right.right = new TreeNode(5);
		root1.left.right = new TreeNode(6);
		root1.right.left = new TreeNode(7);
		FindAllPaths obj = new FindAllPaths();
		obj.findAllPaths(root1);
		

		
	}
	
}
