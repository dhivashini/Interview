package com.dhiva.trees;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class ListNode {
	int data;
	ListNode prev;
	ListNode next;

	ListNode(int data, ListNode prev, ListNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}

public class PathToNode {
	public static ListNode constructListFromTree(TreeNode root, TreeNode node9) {
		ListNode node;
		// root is null
		if (root == null)
			return null;
		// root is goal
		if (root.data == node9.data) {
			node = new ListNode(root.data, null, null);
			return node;
		}

		ListNode leftTemp = constructListFromTree(root.left, node9);
		ListNode rightTemp = constructListFromTree(root.right, node9);

		if (leftTemp != null) {
			node = new ListNode(root.data, null, null);
			node.next = leftTemp;
			leftTemp.prev = node;
			return node;
		}

		if (rightTemp != null) {
			node = new ListNode(root.data, null, null);
			node.next = rightTemp;
			rightTemp.prev = node;
			return node;
		}
		return null;
	}

}
