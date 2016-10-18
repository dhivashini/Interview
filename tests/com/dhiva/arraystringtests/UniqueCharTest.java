package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.*;


public class UniqueCharTest {
	@Test
	public void test() {
		boolean isUnique = UniqueCharInString.hasUniqueChar("hello");
		boolean expected = false;
		assertEquals(expected, isUnique);
	}
	
	@Test
	public void test1() {
		boolean isUnique = UniqueCharInString.hasUniqueChar("hey");
		boolean expected = true;
		assertEquals(expected, isUnique);
	}

}
