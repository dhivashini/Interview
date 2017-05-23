package com.dhiva.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaysToNStepTest {
	@Test
	public void test(){
		WaysToNStep obj = new WaysToNStep();
		int output = obj.possibleWays(5);
		assertEquals(output,5);
	}
}
