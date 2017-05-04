package com.dhiva.memory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MaxWordCountTest {
	@Test
	public void test() throws IOException {
		MaxWordCountFromFile obj = new MaxWordCountFromFile();
		String input = "C://Users//DHIVA//Desktop//hi.txt";
		List<Map.Entry<String, Integer>> list = obj.countWords(input);
		for (Map.Entry<String, Integer> curr : list) {
			System.out.println(curr.getKey() + "-" + curr.getValue());
		}
	}
}
