package com.dhiva.ProgramCreek;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {
	@Test
	public void test(){
		int[] input ={-1, 0, 1, 2, -1, -4};
		ThreeSum obj = new ThreeSum();
		List<List<Integer>> result = obj.findTriplet(input);
		System.out.println(result.size());
		for(List i :result){
			System.out.println(i);
		}
	}
}
