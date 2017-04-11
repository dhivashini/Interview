package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindLargestRectInHistogramTest {
	@Test
	public void test(){
		FIndLargestRectInHistogram obj = new FIndLargestRectInHistogram();
		int[] histogram = {2,1,5,6,2,3};
		int result = obj.findMaxArea(histogram);
		assertEquals(result,10);
	}
}
