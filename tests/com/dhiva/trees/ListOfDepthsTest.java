package com.dhiva.trees;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.dhiva.problems_a.*;

public class ListOfDepthsTest {
	@Test
	public void test() {
		Node root1 = new Node(26);
		root1.right = new Node(3);
		root1.right.right = new Node(3);
		root1.left = new Node(10);
		root1.left.left = new Node(4);
		root1.left.left.right = new Node(30);
		root1.left.right = new Node(6);
		ArrayList<List<Node>> lists = ListsOfDepths.createList(root1);
	}
}
