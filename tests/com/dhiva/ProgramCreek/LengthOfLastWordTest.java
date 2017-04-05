package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfLastWordTest {
	@Test
	public void test() {
		LengthOfLastWord obj = new LengthOfLastWord();
		int result = obj.findLength("this is a good day");
		assertEquals(result, 3);
	}
}
