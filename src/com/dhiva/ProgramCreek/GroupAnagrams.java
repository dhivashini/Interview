package com.dhiva.ProgramCreek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<String> groupAnagrams(String[] input) {
		ArrayList<String> result = new ArrayList<String>();
		if (input == null || input.length == 0)
			return null;
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < input.length; i++) {
			char[] currentString = input[i].toCharArray();
			Arrays.sort(currentString);
			String temp = String.valueOf(currentString);
			if (map.get(temp) == null) {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(temp, list);
			} else
				map.get(temp).add(i);
		}

		for (ArrayList<Integer> l : map.values()) {
			if (l.size() > 1) {
				for (Integer i : l) {
					result.add(input[i]);
				}
			}
		}
		return result;
	}
}
