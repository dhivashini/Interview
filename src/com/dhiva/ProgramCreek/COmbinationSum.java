package com.dhiva.ProgramCreek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COmbinationSum {
	public List<List<Integer>> findCombinations(int[] input, int target) {
		Arrays.sort(input);
		List<List<Integer>> result = new ArrayList<>();
		findCombinationUtil(input, target, result, new ArrayList<>(),0);
		return result;
	}

	private void findCombinationUtil(int[] input, int target, List<List<Integer>> result, ArrayList<Integer> temp,int start) {
		if (target < 0)
			return;
		else if (target == 0)
			result.add(new ArrayList<>(temp));
		else {
			for (int i = start; i < input.length; i++) {
				temp.add(input[i]);
				findCombinationUtil(input, target - input[i], result, temp,i);
				temp.remove(temp.size() - 1);
			}
		}

	}
}
