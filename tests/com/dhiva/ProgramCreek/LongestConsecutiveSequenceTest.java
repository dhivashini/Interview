package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {
	@Test
	public void test(){
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		int[] input = {100, 4, 200, 1, 3, 2};
		int result = obj.findLongestSequence(input);
		assertEquals(4,result);
	}
}
