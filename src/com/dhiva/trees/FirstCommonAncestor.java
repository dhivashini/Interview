package com.dhiva.trees;

public class FirstCommonAncestor {
	static boolean v1 = false;
	static boolean v2 = false;

	public static Node findAncestor(Node root, Node n1, Node n2) {
		Node lca = findAncestorUtil(root, n1, n2);
		if (v1 && v2)
			return lca;
		return null;

	}

	public static Node findAncestorUtil(Node root, Node n1, Node n2) {
		if (root == null)
			return root;
		if (root.data == n1.data) {
			v1 = true;
			return root;
		}
		if (root.data == n2.data) {
			v2 = true;
			return root;
		}

		Node left = findAncestorUtil(root.left, n1, n2);
		Node right = findAncestorUtil(root.right, n1, n2);

		if (left != null && right != null)
			return root;
		
		return (left != null) ? left : right;

	}
}
