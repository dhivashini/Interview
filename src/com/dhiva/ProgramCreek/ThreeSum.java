package com.dhiva.ProgramCreek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//o(n^2) time
public class ThreeSum {
	public List<List<Integer>> findTriplet(int[] input) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (input == null || input.length < 3)
			return result;
		Arrays.sort(input);
		for (int i = 0; i < input.length - 2; i++) {
			if (i == 0 || input[i] > input[i - 1]) {
				int j = i + 1;
				int k = input.length - 1;
				while (j < k) {
					if (input[i] + input[j] + input[k] == 0) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(input[i]);
						l.add(input[j]);
						l.add(input[k]);
						result.add(l);

						j++;
						k--;
//						while (j < k && input[j] == input[j - 1])
//							j++;
//						while (j < k && input[k] == input[k + 1])
//							k--;

					} else if (input[i] + input[j] + input[k] < 0) {
						j++;
					} else {
						k--;
					}

				}
			}
		}
		return result;
	}
}
