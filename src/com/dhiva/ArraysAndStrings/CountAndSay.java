package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;

public class CountAndSay {
	public String lookAndSay(int n) {
		int count;
		char say;
		ArrayList<String> list = new ArrayList<>();
		list.add("1");

		for (int i = 1; i < n; i++) {
			StringBuilder res = new StringBuilder();
			count = 1;
			String prev = list.get(i - 1);
			say = prev.charAt(0);
			for (int j = 1; j < prev.length(); j++) {
				if (prev.charAt(j) != say) {
					res.append(count).append(say);
					count = 1;
					say = prev.charAt(j);
				} else {
					count++;
				}
			}
			res.append(count).append(say);
			list.add(res.toString());
		}
		return list.get(n - 1);
	}
}
