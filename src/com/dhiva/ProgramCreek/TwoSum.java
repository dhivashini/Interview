package com.dhiva.ProgramCreek;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (obj.containsKey(target - nums[i])) {
				a[1] = i;
				a[0] = obj.get(target - nums[i]);
				return a;
			}
			obj.put(nums[i], i);
		}
		return a;
	}
}
