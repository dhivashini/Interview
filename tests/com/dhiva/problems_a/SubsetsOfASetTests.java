package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SubsetsOfASetTests {
	@Test
	public void test() {
		Set<Set<Object>> expected1 = new HashSet<Set<Object>>();
		Set<Object> expected = new HashSet<Object>();
		expected.add("[]");
		expected.add("[a]");
		expected.add("[b]");
		expected.add("[a, b]");
		expected.add("[c]");
		expected.add("[a, c]");
		expected.add("[b, c]");
		expected.add("[a, b, c]");
		expected1.add(expected);
		Set<Object> input = new HashSet<Object>();
		input.add("a");
		input.add("b");
		input.add("c");
		Set<Set<Object>> output = SubsetsOfASet.findSubsets(input);
		assertEquals(expected, output);
		
	}
}
