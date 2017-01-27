package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import com.dhiva.problems_a.AnagramStrings;
import org.junit.Test;

public class AnagramStringsTest {
	@Test
	public void test() {
		boolean expected = true;
	    boolean output = AnagramStrings.checkAnagram("dog","god");
		assertEquals(expected, output);
	}
}
