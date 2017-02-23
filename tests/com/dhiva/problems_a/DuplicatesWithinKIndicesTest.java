package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicatesWithinKIndicesTest {
	@Test
	public void test() {
		boolean expected = true;
		DuplicatesWithinKIndices obj = new DuplicatesWithinKIndices();
		boolean output = obj.hasDuplicates("dhivashini", 3);
		assertEquals(output, expected);
	}
}
