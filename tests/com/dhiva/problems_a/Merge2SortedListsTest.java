package com.dhiva.problems_a;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dhiva.problems_a.Merge2SortedLists;

public class Merge2SortedListsTest {
	@Test
	public void test() {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		List<Integer> expected = new ArrayList<Integer>();
	    expected.add(1);
	    expected.add(2);
	    expected.add(3);
	    expected.add(4);
	    expected.add(5);
	    expected.add(6);
	    List<Integer> output = Merge2SortedLists.mergeList(a,b);
		assertEquals(expected, output);
	}
}
