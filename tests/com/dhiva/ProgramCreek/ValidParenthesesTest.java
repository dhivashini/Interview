package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {
	@Test
	public void test(){
		ValidParentheses obj = new ValidParentheses();
		boolean result = obj.isValid("{[]}");
		assertEquals(true,result);
	}
	@Test
	public void test1(){
		ValidParentheses obj = new ValidParentheses();
		boolean result = obj.isValid("{[}");
		assertEquals(false,result);
	}
}
