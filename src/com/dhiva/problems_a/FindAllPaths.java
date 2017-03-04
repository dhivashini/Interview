package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.List;

public class FindAllPaths {
	public ArrayList<ArrayList<Integer>> findAllPaths(TreeNode root)
	{
		ArrayList<ArrayList<Integer>> allPaths = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<>();
		findPath(root, path, allPaths);
		return allPaths;
		
	}
	private void findPath(TreeNode root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> allPaths) {
		if (root == null)
			return;
		path.add(root.data);
		if (root.left == null && root.right == null)
			allPaths.add(path);

		else {
			findPath(root.right, path, allPaths);
			findPath(root.left, path, allPaths);
		}

	}
}
