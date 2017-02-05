package com.dhiva.trees;

import org.junit.Test;

public class TraversalTest {
	@Test
	public void test() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(30);
		TraverseTree.inOrder(n1);
	}

	@Test
	public void testbfs() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(30);
		TraverseTree.bfs(n1);
	}
	@Test
	public void test1() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(30);
		TraverseTree.preOrder(n1);
	}

	@Test
	public void test2() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(30);
		TraverseTree.postOrder(n1);
	}
	
}
