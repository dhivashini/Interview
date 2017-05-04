package com.dhiva.graphs;

import org.junit.Test;

public class PrimsTest {
	@Test
	public void test() {
		Prims obj = new Prims();
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 }, };

		obj.findMinSpt(graph);
	}
}
