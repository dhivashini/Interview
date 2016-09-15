package com.dhiva.sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements to be sorted");
		int size = s.nextInt();
		int[] elements = new int[size];
		System.out.println("enter the elements to be sorted");
		for (int i = 0; i < size; i++) {
			elements[i] = s.nextInt();
		}
		sort(elements);

	}

	private static void sort(int[] elements) {
		for (int i = 0; i< elements.length;i++){
			if(elements[i]>elements[i+1]){
				int temp = elements[i];
				elements[i] = elements[i+1];
				elements[i+1] = temp;
			}
		}
		System.out.println("the sorted array is");
		for (int i = 0; i<elements.length;i++){
			System.out.println(elements[i]);
		}
	}
}
