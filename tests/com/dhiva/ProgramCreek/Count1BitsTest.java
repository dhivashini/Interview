package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class Count1BitsTest {
	@Test
	public void test(){
		Count1Bits obj = new Count1Bits();
		int output = obj.hammingDist(11);
		assertEquals(3,output);
	}
}
