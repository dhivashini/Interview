package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubsetSum {
	public static ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void subsets(ArrayList<Integer> array, ArrayList<Integer> toProcess, int targetSum) {
		int sum = 0;
		Iterator<Integer> i = array.iterator();
		while (i.hasNext())
			sum += i.next();
		if (sum == targetSum)
			lists.add(array);
		if (toProcess.isEmpty())
			return;
		ArrayList<Integer> newToProcessedArray = new ArrayList<Integer>(toProcess.subList(1, toProcess.size()));
		subsets(array, newToProcessedArray, targetSum);
		ArrayList<Integer> newArray =(ArrayList<Integer>) array.clone();
		newArray.add(toProcess.get(0));
		subsets(newArray, newToProcessedArray, targetSum);
	}
}
