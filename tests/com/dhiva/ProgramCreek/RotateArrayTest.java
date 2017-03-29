package com.dhiva.ProgramCreek;

import java.util.Arrays;

import org.junit.Test;

public class RotateArrayTest {
	@Test
	public void test(){
		int[] input = {1,2,3,4,5,6};
		RotateArray obj = new RotateArray();
		int[] output = obj.rotateArray(input, 2);
		System.out.println(Arrays.toString(output));
	}
}
