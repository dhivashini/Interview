package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsomorphicStringsTest {
	@Test
	public void test(){
		String s1 = "foo";
		String s2 = "add";
		IsomorphicStrings obj = new IsomorphicStrings();
		boolean output = obj.isIsomorphic(s1, s2);
		assertEquals(true,output);
	}
	
	@Test
	public void test1(){
		String s1 = "aab";
		String s2 = "xyz";
		IsomorphicStrings obj = new IsomorphicStrings();
		boolean output = obj.isIsomorphic(s1, s2);
		assertEquals(false,output);
	}
}
