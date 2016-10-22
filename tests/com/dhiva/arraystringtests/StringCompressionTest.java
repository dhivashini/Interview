package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.StringCompression;;

public class StringCompressionTest {
	@Test
	public void test() {
		String output = StringCompression.compressString("aaabbcccdaa");
		String expected = "a3b2c3d1a2";
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		String output = StringCompression.compressString("a");
		String expected = "a1";
		assertEquals(expected, output);
	}

}
