package com.dhiva.linkedlistetsts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.linkedlist.*;

public class LoopDetectionTest {

	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(20, null);
		n1.next = n2;
		n2.next = n1;
		boolean hasLoop = LoopDetection.detectLoop(n1);
		boolean expected = false;
		assertEquals(expected, hasLoop);
	}

	@Test
	public void test1() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(21, n1);
		LinkedListNode n3 = new LinkedListNode(22, n2);
		LinkedListNode n4 = new LinkedListNode(23, n3);
		n1.next = n4;
		boolean hasLoop = LoopDetection.detectLoop(n1);
		boolean expected = true;
		assertEquals(expected, hasLoop);
	}

}
