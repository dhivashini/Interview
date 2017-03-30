package com.dhiva.ProgramCreek;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTest {
	@Test
	public void test(){
		int[] input = {2,3,4,5,1};
		TwoSum obj = new TwoSum();
		int[] result = obj.twoSum(input, 7);
		System.out.println(Arrays.toString(result));
	}
}
