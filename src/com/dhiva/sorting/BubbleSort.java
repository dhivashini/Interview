package com.dhiva.sorting;

public class BubbleSort {
	public int[] sort(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[i] > elements[j]) {
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		return elements;
	}
}
