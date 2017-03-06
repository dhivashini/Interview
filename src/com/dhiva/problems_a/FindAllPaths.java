package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.List;

public class FindAllPaths {
	public void findAllPaths(TreeNode root)
	{
		int[] path = new int[1000];
		findPath(root, path, 0);
			
	}
	private void findPath(TreeNode root,  int[] path,int pathlen) {
		if (root == null)
			return;
		path[pathlen] = root.data;
		pathlen++;
		if (root.left == null && root.right == null)
			printArray(path,pathlen);

		else {
			findPath(root.right, path, pathlen);
			findPath(root.left, path, pathlen);
		}

	}
	private void printArray(int[] ints, int len) {
		 int i;
		 for (i=0; i<len; i++) {
		 System.out.print(ints[i] + " ");
		 }
		 System.out.println();
		}

}
