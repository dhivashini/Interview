package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;

public class IntersectionAndUnion {

	public static ArrayList<Integer> findIntersection(int[] inputArray1, int[] inputArray2) {
		ArrayList<Integer> outputArray = new ArrayList<>();
		if (inputArray1.length == 0 || inputArray2.length == 0)
			return null;
		int i = 0, j = 0;
		while (i < inputArray1.length && j < inputArray2.length) {
			if (inputArray1[i] == inputArray2[j]) {
				outputArray.add(inputArray1[i]);
				i++;
				j++;
			} else if (inputArray1[i] < inputArray2[j])
				i++;
			else
				j++;
		}
		return outputArray;
	}

	public static ArrayList<Integer> findUnion(int[] inputArray1, int[] inputArray2) {

		ArrayList<Integer> outputArray = new ArrayList<>();

		int i = 0, j = 0;
		while (i < inputArray1.length && j < inputArray2.length) {
			if (inputArray1[i] == inputArray2[j]) {
				outputArray.add(inputArray1[i]);
				i++;
				j++;
			} else if (inputArray1[i] < inputArray2[j]) {
				outputArray.add(inputArray1[i]);
				i++;
			} else {
				outputArray.add(inputArray2[j]);
				j++;
			}
		}

		if (i == inputArray1.length) {
			while (j < inputArray2.length) {
				outputArray.add(inputArray2[j]);
				j++;
			}
		} else {
			while (i < inputArray1.length) {
				outputArray.add(inputArray1[i]);
				i++;
			}
		}
		return outputArray;
	}
}
