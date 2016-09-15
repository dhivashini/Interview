package com.dhiva.sorting;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BubbleSort {
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

	private static void sort(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i+1; j < elements.length ; j++) {
				if (elements[i] > elements[j]) {
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		System.out.println("the sorted array is");
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}
