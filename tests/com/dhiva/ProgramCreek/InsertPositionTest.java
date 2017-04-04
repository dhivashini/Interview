package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertPositionTest {
	@Test
	public void test(){
		InsertPosition obj = new InsertPosition();
		int[] input = {1,3,5,6};
		int result = obj.findPosition(input, 5);
		assertEquals(2,result);
	}
	@Test
	public void test1(){
		InsertPosition obj = new InsertPosition();
		int[] input = {1,3,5,6};
		int result = obj.findPosition(input, 2);
		assertEquals(1,result);
	}
}
