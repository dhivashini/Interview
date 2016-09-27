package com.dhiva.sorting;

public class InsertionSort {
	public int[] sort(int[] elements) {
		for (int i = 1; i < elements.length; i++) {
			int key = elements[i];
			int j = i - 1;
			while (j >= 0 && key < elements[j]) {
				elements[j + 1] = elements[j];
				j = j - 1;
			}
			elements[j + 1] = key;
		}
		return elements;
	}

}
