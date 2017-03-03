package com.dhiva.trees;

import java.util.LinkedList;
import com.dhiva.problems_a.*;
import java.util.Queue;

import com.dhiva.problems_a.TreeNode;

public class TraverseTree {
	// inoder traversal
	public static void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	// bfs
	public static void bfs(Node node) {
		Queue<Node> list = new LinkedList<>();
		list.add(node);
		while (!list.isEmpty()) {
			Node temp = list.poll();
			System.out.println(temp.data);
			if (temp.left != null)
				list.add(temp.left);
			if (temp.right != null)
				list.add(temp.right);
		}
	}

	// pre-order traversal
	public static void preOrder(Node node) {
		if (node == null)
			return;
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	// post-order traversal
	public static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	public static void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}

}
