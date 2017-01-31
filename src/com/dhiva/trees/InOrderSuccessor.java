package com.dhiva.trees;

public class InOrderSuccessor {
	public static Node findSuccessor(Node root, Node find) {
		if (root == null || find == null)
			return null;
		if (find.right != null) {
			Node n = findNextHighest(find.right);
			return n;
		} else {
			Node succ = null;
			if (root.data == find.data) {
				Node n = findNext(root.left);
				return n;
			} else {
				while (root != null) {
					if (find.data < root.data) {
						succ = root;
						root = root.left;
					} else if (find.data > root.data)
						root = root.right;
					else
						break;
				}

				return succ;
			}
		}

	}

	private static Node findNext(Node left) {
		while (left.right != null) {
			left = left.right;
		}
		return left;
	}

	private static Node findNextHighest(Node right) {
		while (right.left != null) {
			right = right.left;
		}
		return right;
	}
}
