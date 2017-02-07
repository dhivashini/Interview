package com.dhiva.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectLeavesOfTreeToDLL {
	static Node prev;
	static Node head;

	public static Node connectLeaves(Node root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null) {
			if (head == null) {
				head = root;
				prev = root;
			} else {
				prev.right = root;
				root.left = prev;
				prev = root;
			}
			return null;
		}
		root.left = connectLeaves(root.left);
		root.right = connectLeaves(root.right);
		return root;

	}
}
