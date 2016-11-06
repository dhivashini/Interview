package com.dhiva.linkedlistetsts;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.dhiva.linkedlist.*;

public class ReturnKfromLastTest {
	@Test
	public void test() {
		LinkedListNode n1 = new LinkedListNode(20, null);
		LinkedListNode n2 = new LinkedListNode(21, n1);
		LinkedListNode n3 = new LinkedListNode(2, n2);
		LinkedListNode n4 = new LinkedListNode(21, n3);
		LinkedListNode n5 = new LinkedListNode(24, n4);
		int output = ReturnKfromLast.returnKNode(n1, 3);
		int expected = 21;
		assertEquals(expected, output);
	}
}
