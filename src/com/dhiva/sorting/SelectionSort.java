package com.dhiva.sorting;

public class SelectionSort {
	public int[] sort(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			int min = i;
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[j] < elements[min]) {
					min = j;
				}
			}
			int temp = elements[min];
			elements[min] = elements[i];
			elements[i] = temp;
		}
		return elements;
	}
}
