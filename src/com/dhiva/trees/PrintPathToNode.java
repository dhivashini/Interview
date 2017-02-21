package com.dhiva.trees;

import java.util.ArrayList;

public class PrintPathToNode {
	static ArrayList<Integer> path = new ArrayList<Integer>();

	public static Node pathToNode(Node root, int target) {

		if (root == null) {
			return null;
		}
		if (root.data == target) {
			path.add(target);
			return root;
		}
		if (pathToNode(root.left, target) != null || pathToNode(root.right, target) != null){
			path.add(root.data);
			return root;
		}
		return null;
	}
	
}
