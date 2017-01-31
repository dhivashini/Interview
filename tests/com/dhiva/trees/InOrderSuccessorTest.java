package com.dhiva.trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class InOrderSuccessorTest {
	@Test
	public void test() {

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */

		Node root1 = new Node(50);
		root1.right = new Node(70);
		root1.right.right = new Node(80);
		root1.left = new Node(30);
		root1.left.left = new Node(20);
		root1.left.right = new Node(40);
		root1.right.left = new Node(60);
		Node output = InOrderSuccessor.findSuccessor(root1, root1);
		int expected = 60;
		assertEquals(expected, output.data);

	}
	@Test
	public void test1() {

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */

		Node root1 = new Node(50);
//		root1.right = new Node(70);
//		root1.right.right = new Node(80);
		root1.left = new Node(30);
		root1.left.left = new Node(20);
		root1.left.right = new Node(40);
//		root1.right.left = new Node(60);
		Node output = InOrderSuccessor.findSuccessor(root1, root1);
		int expected = 40;
		assertEquals(expected, output.data);

	}
}
