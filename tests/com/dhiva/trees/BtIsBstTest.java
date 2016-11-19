package com.dhiva.trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BtIsBstTest {
	@Test
	public void test() {
		Node n1 = new Node(4);
		n1.left = new Node(2);
		n1.right = new Node(5);
		n1.left.left = new Node(1);
		n1.left.right = new Node(3);
		boolean output = BtIsBst.checkIfBst(n1);
		boolean expected = false;
		assertEquals(expected, output);
	}
}
