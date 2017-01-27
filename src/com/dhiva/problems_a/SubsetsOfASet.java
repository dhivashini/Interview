package com.dhiva.problems_a;

import java.util.HashSet;
import java.util.Set;

public class SubsetsOfASet {
	public static Set<Set<Object>> findSubsets(Set<Object> input) {
		Set<Set<Object>> subsets = new HashSet<Set<Object>>();
		subsets.add(new HashSet<Object>());
		for (Object o : input) {
			Set<Set<Object>> temp = new HashSet<Set<Object>>();
			for (Set<Object> s : subsets) {
				temp.add(new HashSet<Object>(s));
			}
			for (Set<Object> s : temp) {
				s.add(o);
			}
			subsets.addAll(temp);

		}
		return subsets;
	}
}
