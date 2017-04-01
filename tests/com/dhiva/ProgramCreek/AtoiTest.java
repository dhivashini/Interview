package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtoiTest {
	@Test
	public void test() {
		Atoi obj = new Atoi();
		String input = "89789";
		int result = obj.atoi(input);
		assertEquals(result,89789);
	}
}
