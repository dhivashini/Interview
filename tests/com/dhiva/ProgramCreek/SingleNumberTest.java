package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleNumberTest {
	@Test
	public void test() {
		SingleNumber obj = new SingleNumber();
		int[] A = { 1, 3, 3, 1, 4 };
		int result = obj.singleNumber(A);
		assertEquals(result, 4);
	}
}
