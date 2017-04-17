package com.dhiva.ProgramCreek;

import java.util.ArrayList;

import com.dhiva.problems_a.TreeNode;

public class BTRightView {
	public ArrayList<Integer> rightView(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		rightViewUtil(root, result, 0);
		return result;
	}

	private void rightViewUtil(TreeNode root, ArrayList<Integer> result, int level) {
		if (root == null)
			return;
		if (level == result.size())
			result.add(root.data);
		rightViewUtil(root.right, result, level + 1);
		rightViewUtil(root.left, result, level + 1);
	}
}
