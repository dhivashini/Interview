package com.dhiva.sorttests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.sorting.*;

public class SortTest {

	@Test
	public void test() {
		int[] elements = new int[] { 3, 4, 5, 1, 2 };
		BubbleSort sortObj = new BubbleSort();
		int[] sortedElements = sortObj.sort(elements);
		int[] actual = new int[] { 1, 2, 3, 4, 5 };
		assertArrayEquals(actual, sortedElements);
	}

	@Test
	public void test1() {
		int[] elements = new int[] { 3, 4, 5, 1, 2 };
		SelectionSort sortObj = new SelectionSort();
		int[] sortedElements = sortObj.sort(elements);
		int[] actual = new int[] { 1, 2, 3, 4, 5 };
		assertArrayEquals(actual, sortedElements);
	}

	@Test
	public void test2() {
		int[] elements = new int[] { 12, 11, 13, 5, 6 };
		InsertionSort sortObj = new InsertionSort();
		int[] sortedElements = sortObj.sort(elements);
		int[] actual = new int[] { 5, 6, 11, 12, 13 };
		assertArrayEquals(actual, sortedElements);
	}

	@Test
	public void test3() {
		int[] elements = new int[] { 12, 11, 13, 5, 6 };
		int[] sortedElements = Merge.mergeSort(elements);
		int[] actual = new int[] { 5, 6, 11, 12, 13 };
		assertArrayEquals(actual, sortedElements);
	}

	@Test
	public void test4() {
		int[] elements = new int[] { 3, 1, 12, 11, 13, 5, 6 };
		int[] sortedElements = QuickSort.quickSort(elements);
		int[] actual = new int[] { 1, 3, 5, 6, 11, 12, 13 };
		assertArrayEquals(actual, sortedElements);
	}
}
