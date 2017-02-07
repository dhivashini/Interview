package com.dhiva.problems_a;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfASetRecursion {
	static List<String> list = new ArrayList<String>();

	public static List<String> findSubset(String input) {
		return findSubsetUtil("", input);
	}

	private static List<String> findSubsetUtil(String seen, String input) {
		if (input.isEmpty()){
			list.add(seen);
			return list;
		}	
		findSubsetUtil(seen + input.charAt(0), input.substring(1));
		findSubsetUtil(seen, input.substring(1));
		return list;
	}
}