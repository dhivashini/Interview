package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.CheckPermutation;


	public class CheckPermutationTest {
		@Test
		public void test() {
			boolean isPerm = CheckPermutation.isPermutation("hello","llohes");
			boolean expected = true;
			assertEquals(expected, isPerm);
		}
		
		@Test
		public void test1() {
			boolean isPerm = CheckPermutation.isPermutation("hello","lloh");
			boolean expected = true;
			assertEquals(expected, isPerm);
		}

	}


