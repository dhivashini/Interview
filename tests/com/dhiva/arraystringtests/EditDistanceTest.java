package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.EditDistance;

public class EditDistanceTest {
	@Test
	public void test() {
		EditDistance obj = new EditDistance();
		int output = obj.findShortestEditDistance("sunday", "saturday");
		int expected = 3;
		assertEquals(output, expected);
	}
}
