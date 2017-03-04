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
		ArrayList<ArrayList<Integer>> output=obj.findAllPaths(root1);
		ArrayList<Integer> list = output.get(1);
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		} 
		
		System.out.println(output.get(1).toArray());
		System.out.println(output.get(2).toArray());
		System.out.println(output.get(3).toArray());

		
	}
	
}
