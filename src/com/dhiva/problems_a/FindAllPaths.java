package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.List;

public class FindAllPaths {
	public ArrayList<ArrayList<TreeNode>> findAllPaths(TreeNode root)
	{
		ArrayList<ArrayList<TreeNode>> allPaths = new ArrayList<ArrayList<TreeNode>>();
		ArrayList<TreeNode> path = new ArrayList<>();
		findPath(root, path, allPaths);
		return allPaths;
		
	}
	private void findPath(TreeNode root, ArrayList<TreeNode> path, ArrayList<ArrayList<TreeNode>> allPaths) {
		if (root == null)
			return;
		path.add(root);
		if (root.left == null && root.right == null)
			allPaths.add(path);

		else {
			findPath(root.right, path, allPaths);
			findPath(root.left, path, allPaths);
		}

	}
}
