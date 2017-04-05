package com.dhiva.ProgramCreek;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MinPathSumInTriangleTest {
	@Test
	public void test() {
		MinPathSumInTriangle obj = new MinPathSumInTriangle();
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		ArrayList<Integer> l3 = new ArrayList<>();
		ArrayList<Integer> l4 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		l1.add(2);
		l2.add(3);
		l2.add(4);
		l3.add(6);
		l3.add(5);
		l3.add(7);
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);
		lists.add(l4);
		int result = obj.findMinSumPath(lists);
		assertEquals(result, 11);

	}
}
