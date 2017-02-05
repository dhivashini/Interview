package com.dhiva.arraystringtests;

import java.util.ArrayList;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.SubsetSum;

public class SubsetSumTest {
	@Test
	public void test() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(10);
		array.add(1);
		array.add(2);
		SubsetSum.subsets(array1, array, 15);
		System.out.println(SubsetSum.lists);
	}
}
