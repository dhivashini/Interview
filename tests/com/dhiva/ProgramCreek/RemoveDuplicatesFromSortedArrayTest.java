package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
	@Test
	public void test() {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] input = { 1, 1, 2 };
		int result = obj.removeDuplicates(input);
		assertEquals(result, 2);
	}

	@Test
	public void test1() {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] input = { 1, 1, 1, 2, 3, 3, 5 };
		int result = obj.removeDuplicates(input);
		assertEquals(result, 4);
	}
}
