package com.dhiva.problems_a;

import org.junit.Test;

import com.dhiva.problems_a.HashTableImplementation;

public class HashtableImplementationTest {

@Test
public void test(){
	HashTableImplementation hashTableEntry = new HashTableImplementation(31);
	hashTableEntry.put(2, 3);
	hashTableEntry.put(3, 4);
	hashTableEntry.put(5, 6);
	hashTableEntry.put(4, 7);
	hashTableEntry.get(2);
}
}
