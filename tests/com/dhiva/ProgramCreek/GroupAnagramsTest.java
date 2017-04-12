package com.dhiva.ProgramCreek;

import java.util.List;

import org.junit.Test;

public class GroupAnagramsTest {
	@Test
	public void test(){
		GroupAnagrams obj = new GroupAnagrams();
		String[] input = {"dog", "abc", "god", "bac"};
		List<String> output = obj.groupAnagrams(input);
		System.out.println(output);
	}
}
