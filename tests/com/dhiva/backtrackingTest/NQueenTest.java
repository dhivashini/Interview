package com.dhiva.backtrackingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.BackTracking.NQueens;

public class NQueenTest {
	@Test
	public void test() {
		boolean expected = true;
		boolean output = NQueens.nQueen(4);
		assertEquals(expected,output);
	}
}

