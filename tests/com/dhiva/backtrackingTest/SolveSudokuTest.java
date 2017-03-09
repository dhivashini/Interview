package com.dhiva.backtrackingTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.BackTracking.SolveSudoku;

public class SolveSudokuTest {
	@Test
	public void test(){
		int[][] input = {{0,0,9,7,4,8,0,0,0},
						 {7,0,0,0,0,0,0,0,0},
						 {0,2,0,1,0,9,0,0,0},
						 {0,0,7,0,0,0,2,4,0},
						 {0,6,4,0,1,0,5,9,0},
						 {0,9,8,0,0,0,3,0,0},
						 {0,0,0,8,0,3,0,2,0},
						 {0,0,0,0,0,0,0,0,6},
						 {0,0,0,2,7,5,9,0,0}};
		SolveSudoku obj = new SolveSudoku();
		boolean output = obj.solve(input);
		assertEquals(true,output);
	}

}
