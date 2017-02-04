package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.IsNumber;

public class IsNumberTest {
	@Test
	public void testValidInteger() {
		assertTrue(IsNumber.isNumber("123"));
	}

	@Test
	public void testValidStartsWithDecimal() {
		assertTrue(IsNumber.isNumber(".123"));
	}

	@Test
	public void testValidNegativeStartsWithDecimal() {
		assertTrue(IsNumber.isNumber("-.123"));
	}

	@Test
	public void testValidDecimal() {
		assertTrue(IsNumber.isNumber("1.23"));
	}

	@Test
	public void testValidMinusZero() {
		assertTrue(IsNumber.isNumber("-0"));
	}
}
