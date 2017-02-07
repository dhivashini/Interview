package com.dhiva.problems_a;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SubsetRecursionTest {
	@Test
	public void test(){
		List<String> output = SubsetOfASetRecursion.findSubset("abc");
		System.out.println(output);
	}
}
