package com.dhiva.trees;

import org.junit.Test;

public class PathToNodeTest {
	@Test
	public void test(){
	TreeNode node15 = new TreeNode(15, null, null);
    TreeNode node14 = new TreeNode(14, null, null);
    TreeNode node13 = new TreeNode(13, null, null);
    TreeNode node12 = new TreeNode(12, null, null);
    TreeNode node11 = new TreeNode(11, null, null);
    TreeNode node10 = new TreeNode(10, null, null);
    TreeNode node9 = new TreeNode(9, null, null);
    TreeNode node8 = new TreeNode(8, null, null);
    TreeNode node7 = new TreeNode(7, node14, node15);
    TreeNode node6 = new TreeNode(6, node12, node13);
    TreeNode node5 = new TreeNode(5, node10, node11);
    TreeNode node4 = new TreeNode(4, node8, node9);
    TreeNode node3 = new TreeNode(3, node6, node7);
    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode node1 = new TreeNode(1, node2, node3);
    TreeNode root = node1;
    ListNode head = PathToNode.constructListFromTree(root, node9);

    ListNode temp = head;
    while(temp != null) {
        System.out.print("->");
        System.out.print(temp.data);
        temp = temp.next;
    }
	}
}
