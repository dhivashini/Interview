package com.dhiva.graphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class BipartiteGraphTest {
	@Test
	public void test() {
		int[][] graph = { { 0, 1, 0, 1 }, { 1, 0, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 0 } };
		BipartiteGraph obj = new BipartiteGraph();
		boolean output = obj.checkIfBipartitie(graph, 0, 4);
		assertEquals(false, output);
	}
}
