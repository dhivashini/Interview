package com.dhiva.trees;

public class PathsWithSum2 {
	public static int findTotalPaths(Node tree, int target) {
		if (tree == null)
			return 0;

		int nodeCurr = findPaths(tree, 0, target);
		int pathLeft = findTotalPaths(tree.left, target);
		int pathRight = findTotalPaths(tree.right, target);
		
		return nodeCurr + pathLeft + pathRight;
	}

	private static int findPaths(Node tree, int currentTarget, int target) {
		if (tree == null)
			return 0;

		currentTarget = currentTarget + tree.data;
		int totalPath = 0;
		if (currentTarget == target) {
			totalPath++;
		}

		totalPath = totalPath + findPaths(tree.left, currentTarget, target);
		totalPath = totalPath + findPaths(tree.right, currentTarget, target);
		return totalPath;
	}
}
