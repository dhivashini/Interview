package com.dhiva.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsOfDepths {
	public static ArrayList<List<Node>> createList(Node root) {
		ArrayList<List<Node>> lists = new ArrayList<List<Node>>();
		levelLists(lists, root, 0);
		return lists;
	}

	private static void levelLists(ArrayList<List<Node>> lists, Node root, int level) {
		if (root == null)
			return;
		List<Node> list = null;
		if (lists.size() == level) {
			list = new LinkedList<>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		levelLists(lists, root.left, level + 1);
		levelLists(lists, root.right, level + 1);
	}
}
