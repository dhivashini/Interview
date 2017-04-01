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
	
	@Test
	public void test1(){
		int[] input = {1,3,5,6,8};
		TwoSumSorted obj = new TwoSumSorted();
		int[] result = obj.twoSum(input, 7);
		System.out.println(Arrays.toString(result));
	}
}
