package com.dhiva.ProgramCreek;

import java.util.HashMap;

public class TwoSumImplementation {
	HashMap<Integer, Integer> map = new HashMap<>();

	public void add(int number) {
		if (map.containsKey(number)) {
			map.put(number, map.get(number) + 1);
		} else {
			map.put(number, 1);
		}
	}

	public boolean find(int value) {
		for (Integer i : map.keySet()) {
			int target = value - i;
			if (map.containsKey(target)) {
				if (i == target && map.get(target) < 2) {
					continue;
				}
				return true;
			}
		}
		return false;
	}
}
