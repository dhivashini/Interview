package com.dhiva.problems_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkiingTest {
	@Test
	public void test(){
		Skiing obj = new Skiing();
		int[][] input = new int[][]
				{{0,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0,0},
				{0,1,0,0,0,1,1,1},
				{0,1,1,0,0,0,0,0},
				{0,0,0,0,1,1,0,1},
				{0,0,1,0,1,0,0,0},
				{0,0,0,0,1,0,0,0}};
		boolean ouptut = obj.findPath(input, 0, 0);
		boolean expected = true;
		assertEquals(ouptut,expected);
	}
}
