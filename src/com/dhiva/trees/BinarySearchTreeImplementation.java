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
