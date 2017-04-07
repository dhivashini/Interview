package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeakElementTest {
	@Test
	public void test() {
		PeakElement obj = new PeakElement();
		int[] input = { 1, 2, 3, 1 };
		int result = obj.findPeak(input);
		assertEquals(result, 2);
	}
}
