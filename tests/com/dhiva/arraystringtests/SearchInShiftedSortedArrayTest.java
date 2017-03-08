package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.SearchInShiftedSortedArray;

public class SearchInShiftedSortedArrayTest {
	@Test
	public void test() {
		int expected = 6;
		int[] input = { 4, 5, 6, 7, 0, 1, 2 };
		SearchInShiftedSortedArray obj = new SearchInShiftedSortedArray();
		int output = obj.searchElement(input, 2);
		assertEquals(expected, output);
	}
}
