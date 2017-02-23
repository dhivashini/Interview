package com.dhiva.StackAndQueue;

import org.junit.Test;

public class QueueViaStacksTest {
	@Test
	public void test() {
		QueueViaStacks queue = new QueueViaStacks();
		queue.add(4);
		queue.add(5);
		queue.add(6);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		queue.add(7);
		queue.add(8);
		queue.add(9);
		System.out.println(queue.remove());
		queue.add(10);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.size());
	}
}
