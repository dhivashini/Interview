package com.dhiva.linkedlistetsts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.linkedlist.*;


public class LoopDetectionTest {

	@Test
	public void test() {

		LoopDetectionInLL obj = new LoopDetectionInLL();
		int[] sortedElements =sortObj.sort(elements);
		int[] actual = new int[]{1,2,3,4,5};
		assertArrayEquals(actual, sortedElements);
	}

}
