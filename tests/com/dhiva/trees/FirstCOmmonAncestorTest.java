package com.dhiva.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstCOmmonAncestorTest {
	@Test
	public void test1() {
		Node root1 = new Node(26);
		root1.right = new Node(3);
		root1.right.right = new Node(8);
		root1.left = new Node(10);
		root1.left.left = new Node(4);
		root1.left.left.right = new Node(30);
		root1.left.right = new Node(6);
		Node n1 = new Node(3);
		Node n2 = new Node(6);
		Node output = FirstCommonAncestor.findAncestor(root1, n1, n2);
		assertEquals(root1.data, output.data);
	}
}
