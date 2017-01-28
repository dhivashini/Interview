package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenLists {
	public static List<List<Integer>> createEvenLists(int[] list) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int sum1 = 0;
		int sum2 = 0;
		Arrays.sort(list);
		for (int i = list.length; i > 0; i--) {
			if (sum1 < sum2 && list1.size() < list.length / 2) {
				sum1 += list[i];
				list1.add(list[i]);
			} else {
				sum2 += list[i];
				list2.add(list[i]);
			}
			lists.add(list1);
			lists.add(list2);
		}
		return lists;
	}
}
