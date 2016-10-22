package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.OneAway;;

public class OneAwayTest {
	@Test
	public void test() {
		boolean output = OneAway.isOneStepAway("sale", "sble");
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean output = OneAway.isOneStepAway("apple", "aple");
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test2() {
		boolean output = OneAway.isOneStepAway("aple", "apple");
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test3() {
		boolean output = OneAway.isOneStepAway("sale", "bsle");
		boolean expected = false;
		assertEquals(expected, output);
	}

}
