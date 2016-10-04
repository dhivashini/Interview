package com.dhiva.sorting;

public class MergeSort {
	public int[] sort(int[] elements) {
		int length = elements.length;
		msort(elements, 0, length - 1);
		return elements;
	}

	private void msort(int[] elements, int i, int j) {
		int mid = i + j / 2;
		while (i < j) {
			msort(elements, i, mid);
			msort(elements, mid + 1, j);
			merge(elements, i, j, mid);
		}
	}

	private void merge(int[] elements, int l, int r, int mid) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = elements[l + i];
		for (int j = 0; j < n2; j++)
			R[j] = elements[mid + 1 + j];

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				elements[k] = L[i];
				i++;
			} else {
				elements[k] = R[j];
				j++;
			}
			k++;
		}
			while (i < n1) {
				elements[k] = L[i];
				i++;
				k++;
			}
			while (j < n2) {
				elements[k] = R[j];
				j++;
				k++;
			}	
	}
}
