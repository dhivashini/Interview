package com.dhiva.problems_a;

import org.junit.Test;

import com.dhiva.trees.TraverseTree;

public class ArrayToBstTest {
	@Test
	public void test(){
		ArrayToBst obj = new ArrayToBst();
		int[] input = {1,2,3,4,5,6,7};
		TreeNode root = obj.arrayToBst(input, 0, 6);
		TraverseTree.inOrder(root);
	}
}
