package com.dhiva.trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BtIsBstTest {
	@Test
	public void test() {
		Node n1 = new Node(100);
		n1.left = new Node(20);
		n1.right = new Node(500);
		n1.left.left = new Node(10);
		n1.left.right = new Node(110);
		boolean output = BtIsBst.checkIfBst(n1);
		boolean expected = false;
		assertEquals(expected, output);
	}
}
