package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZagConversionTest {
	@Test
	public void test() {
		ZigZagConversion obj = new ZigZagConversion();
		String output = obj.convert("PAYPALISHIRING", 3);
		assertEquals("PAHNAPLSIIGYIR", output);
	}
}
