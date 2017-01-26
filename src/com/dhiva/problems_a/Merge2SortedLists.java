package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedLists {
	public static List<Integer> mergeList(int[] array1, int[] array2) {
		List<Integer> output = new ArrayList<Integer>();
		int index_1 = 0;
		int index_2 = 0;

		while (index_1 < array1.length && index_2 < array2.length) {
			if (array1[index_1] < array2[index_2]) {
				output.add(array1[index_1]);
				index_1++;
			} else {
				output.add(array2[index_2]);
				index_2++;
			}
		}

		while (index_1 < array1.length) {
			output.add(array1[index_1]);
			index_1++;
		}
		while (index_2 < array2.length) {
			output.add(array2[index_2]);
			index_2++;
		}
		return output;
	}
}
