package com.dhiva.sorting;

import java.io.DataInputStream;
import java.io.IOException;

public class SelectionSort {
	public static void main(String[] args) throws IOException {
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("enter the number of elements to be sorted");
		int size = Integer.parseInt(ds.readLine());
		int[] elements = new int[size];
		System.out.println("enter the elements to be sorted");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = Integer.parseInt(ds.readLine());
		}
		sort(elements);
	}

	private static int[] sort(int[] elements) {	
		for (int i = 0; i < elements.length; i++) {
			int min = elements[i];
			for (int j = i+1; j < elements.length ; j++) {
				if (elements[j] < elements[min]) {
					min = j;
				}
				if(min != i){
				int temp = elements[i];
				elements[i] = elements[min];
				elements[min] = temp;
				}
			}
		}
		System.out.println("the elements in the sorted array is");
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		return elements;
	}
}
