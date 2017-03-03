package com.dhiva.problems_a;

public class ArrayToBst {
	public TreeNode arrayToBst(int[] input, int start, int end) {
		if (end < start)
			return null;
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(input[mid]);
		n.left = arrayToBst(input, start, mid-1);
		n.right = arrayToBst(input, mid + 1, end);
		return n;
	}
}
