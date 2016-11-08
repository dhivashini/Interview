package com.dhiva.trees;

public class BinarySearchTreeImplementation {
	public Node root;

	public BinarySearchTreeImplementation() {
		this.root = null;
	}

	public Node searchNode(int valueToFind) {
		Node current = root;
		return find(current, valueToFind);
	}

	public Node find(Node root, int valueToFind) {
		if (root == null || root.data == valueToFind)
			return root;
		if (valueToFind > root.data)
			return find(root.right, valueToFind);
		return find(root.left, valueToFind);
	}

	public void insertNode(int valueToInsert) {
		root = insert(root, valueToInsert);
	}

	public Node insert(Node root, int valueToInsert) {
		if (root == null) {
			root = new Node(valueToInsert);
			return root;
		}
		if (valueToInsert > root.data)
			root.right = insert(root.right, valueToInsert);
		else if (valueToInsert < root.data)
			root.left = insert(root.left, valueToInsert);
		return root;
	}

	public void deleteNode(int valueToDelete) {
		root = delete(root, valueToDelete);
	}

	public Node delete(Node root, int valueToDelete) {
		if (root == null)
			return root;
		if (valueToDelete < root.data)
			root.left = delete(root.left, valueToDelete);
		else if (valueToDelete > root.data)
			root.right = delete(root.right, valueToDelete);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.data = minValue(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}

	int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

}
