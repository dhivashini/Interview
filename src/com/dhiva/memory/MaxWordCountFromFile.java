package com.dhiva.memory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxWordCountFromFile {
	public List<Entry<String, Integer>> countWords(String input) throws IOException {
		File f = new File(input);
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader b = new BufferedReader(new FileReader(f));
		String s = null;
		while ((s = b.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s, " ");
			while (st.hasMoreTokens()) {
				String temp = st.nextToken().toLowerCase();
				if (map.containsKey(temp))
					map.put(temp, map.get(temp) + 1);
				else
					map.put(temp, 1);
			}
		}

		b.close();

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> sortedList = new ArrayList<>(set);
		Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

				return o2.getValue().compareTo(o1.getValue());
			}

		});

		return sortedList;
	}
}
