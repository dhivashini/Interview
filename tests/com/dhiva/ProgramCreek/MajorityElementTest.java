package com.dhiva.ProgramCreek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {
	@Test
	public void test(){
		MajorityElement obj = new MajorityElement();
		int[] input = { 1, 1, 2 };
		int result = obj.majorityElement(input);
		assertEquals(result, 1);
	}
}
