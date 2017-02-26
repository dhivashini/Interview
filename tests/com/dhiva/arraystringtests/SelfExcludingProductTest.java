package com.dhiva.arraystringtests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.SelfExcludingProduct;

public class SelfExcludingProductTest {
	@Test
	public void test() {
		int[] input = { 2, 3, 4, 5 };
		SelfExcludingProduct obj = new SelfExcludingProduct();
		int[] expected = { 60, 40, 30, 24 };
		int[] output = obj.findProduct(input);
		//assertEquals(expected.toString(), output.toString());
	}
}
