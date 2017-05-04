package com.dhiva.arraystringtests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.SeggArrayWithMinSwaps;

public class SeggArrayWithMinSwapTest {
	@Test
	public void test(){
		int[] input = {0, 1, 0, 1, 1, 1};
		SeggArrayWithMinSwaps obj = new SeggArrayWithMinSwaps();
		//int[] expected = {0,0,1,1,1,1};
		int[] output = obj.swap(input);
		System.out.println(Arrays.toString(output));
	}
}
