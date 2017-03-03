package com.dhiva.implementation;

import org.junit.Test;

public class HashTableImplementationTest {
	@Test
	public void test(){
		HashTableImplementation hashTableEntry = new HashTableImplementation(31);
		hashTableEntry.put(2, 3);
		hashTableEntry.put(3, 4);
		hashTableEntry.put(5, 6);
		hashTableEntry.put(4, 7);
		System.out.println(hashTableEntry.get(2));
		System.out.println(hashTableEntry.size());
		hashTableEntry.put(2, 10);
		System.out.println(hashTableEntry.get(2));
	}
}
