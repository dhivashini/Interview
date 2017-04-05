package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicatesWithinKIndicesTest {
	@Test
	public void test() {
		ContainsDuplicatesWithinKIndices obj = new ContainsDuplicatesWithinKIndices();
		int[] input = { 1, 2, 3, 4, 5, 6 };
		boolean result = obj.containsDuplicates(input, 3);
		assertEquals(false, result);
	}
	
	@Test
	public void test1() {
		ContainsDuplicatesWithinKIndices obj = new ContainsDuplicatesWithinKIndices();
		int[] input = { 1, 2, 3, 3, 5, 6 };
		boolean result = obj.containsDuplicates(input, 3);
		assertEquals(true, result);
	}
}
