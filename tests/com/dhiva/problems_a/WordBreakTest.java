package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class WordBreakTest {
	@Test
	public void test(){
		String input = "theskyisblue";
		Set<String> dict = new HashSet<String>();
		dict.add("the");
		dict.add("sky");
		dict.add("is");
		dict.add("blue");
		WordBreak obj = new WordBreak();
		String expected = "the sky is blue";
		String output = obj.fillSpaces(input, dict);
		assertEquals(output, expected);
	}
}
