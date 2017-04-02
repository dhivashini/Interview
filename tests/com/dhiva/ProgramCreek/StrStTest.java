package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrStTest {
	@Test
	public void test(){
		StrStr obj = new StrStr();
		int result = obj.strSt("geeksforgeeks", "eeks");
		assertEquals(1,result);
	}
}
