package com.dhiva.trees;

import org.junit.Test;

public class DuplicateNodesInTreeTest {
	@Test
	public void test() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(30);
		DuplicateNodesInTree.createDuplicates(n1);
		TraverseTree.bfs(n1);
	}
}
