package com.dhiva.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindDepthTest {
	@Test
	public void test() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(110);
		FindDepth obj = new FindDepth();
		int output = obj.findDepthOfTree(n1);
		int expected = 3;
		assertEquals(expected, output);
	}
}
