package com.dhiva.ProgramCreek;

import java.util.ArrayList;

public class MinPathSumInTriangle {
	public int findMinSumPath(ArrayList<ArrayList<Integer>> input) {
		int[] total = new int[input.size()];
		int length = input.size() - 1;

		for (int i = 0; i < input.get(length).size(); i++)
			total[i] = input.get(length).get(i);

		for (int i = input.size() - 2; i >= 0; i--) {
			for (int j = 0; j < input.get(i + 1).size() - 1; j++) {
				total[j] = input.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
		return total[0];
	}
}
