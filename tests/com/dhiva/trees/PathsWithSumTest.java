package com.dhiva.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PathsWithSumTest {
	@Test
	public void test1() {
		Node root1 = new Node(26);
		root1.right = new Node(3);
		root1.right.right = new Node(8);
		root1.left = new Node(10);
		root1.left.left = new Node(4);
		root1.left.left.right = new Node(30);
		root1.left.right = new Node(6);
		int output = PathsWithSum.findTotalPaths(root1, 14);
		assertEquals(1, output);
	}
}
