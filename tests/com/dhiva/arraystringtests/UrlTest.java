package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.URLify;;

public class UrlTest {
	@Test
	public void test() {
		String url = URLify.convertToUrl("hello world this is dhiva");
		String expected = "hello%20world%20this%20is%20dhiva";
		assertEquals(expected, url);
	}
}
