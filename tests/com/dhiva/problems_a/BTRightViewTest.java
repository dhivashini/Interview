package com.dhiva.problems_a;

import java.util.ArrayList;

import org.junit.Test;

import com.dhiva.ProgramCreek.BTRightView;

public class BTRightViewTest {
	@Test
	public void test() {
		BTRightView obj = new BTRightView();
		TreeNode root1 = new TreeNode(26);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(7);
		root1.left = new TreeNode(10);
		root1.left.left = new TreeNode(4);
		root1.left.left.right = new TreeNode(30);
		root1.left.right = new TreeNode(6);
		ArrayList<Integer> output = obj.rightView(root1);
		System.out.println(output.toString());
	}
}
