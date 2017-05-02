package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueBstTest {
	@Test
	public void test() {
		UniqueBst obj = new UniqueBst();
		int[] input = { 1, 2, 3 };
		int output = obj.findUniqueBst(input);
		assertEquals(5, output);
	}
}
