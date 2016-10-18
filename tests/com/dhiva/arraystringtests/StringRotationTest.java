package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.StringRotation;

public class StringRotationTest {
	@Test
	public void test() {
		boolean output = StringRotation.isRotation("waterbottle", "erbottlewat");
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		boolean output = StringRotation.isRotation("waterbottle", "erbottle");
		boolean expected = false;
		assertEquals(expected, output);
	}
}
