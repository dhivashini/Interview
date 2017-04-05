package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicatesTest {
	@Test
	public void test() {
		ContainsDuplicates obj = new ContainsDuplicates();
		int[] input = { 2, 4, 5, 6 };
		boolean result = obj.hasDuplicates(input);
		assertEquals(result, false);
	}

	@Test
	public void test1() {
		ContainsDuplicates obj = new ContainsDuplicates();
		int[] input = { 2, 4, 2, 6 };
		boolean result = obj.hasDuplicates(input);
		assertEquals(result, true);
	}
}
