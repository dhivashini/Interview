package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinSizeSubarraySumTest {
	@Test
	public void test(){
		MinSizeSubarraySum obj = new MinSizeSubarraySum();
		int[] input = {2, 3,1,2,4,3};
		int result = obj.findLength(input,7);
		assertEquals(result,2);
	}
}
