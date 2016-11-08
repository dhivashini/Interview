package com.dhiva.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.trees.*;

public class BSTImplementationTest {
	@Test
	public void test() {
		BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insertNode(50);
		tree.insertNode(30);
		tree.insertNode(20);
		tree.insertNode(40);
		tree.insertNode(70);
		tree.insertNode(60);
		tree.insertNode(80);

		// print inorder traversal of the BST
		tree.inorder();
	}
}
