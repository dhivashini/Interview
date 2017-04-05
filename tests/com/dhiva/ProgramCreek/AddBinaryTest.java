package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {
	@Test
	public void test() {
		AddBinary obj = new AddBinary();
		String output = obj.binaryAddition("11", "1");
		assertEquals(output, "100");
	}
}
