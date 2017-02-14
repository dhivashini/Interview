package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.ShortestWordDistance;

public class ShortestWordDistanceTest {
	@Test
	public void test() {
		int expected = 1;
		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		int output = ShortestWordDistance.findShortestDistance("makes", "coding", words);
		assertEquals(output, expected);
	}
}
