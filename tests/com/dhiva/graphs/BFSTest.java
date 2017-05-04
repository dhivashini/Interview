package com.dhiva.graphs;

import org.junit.Test;

public class BFSTest {
	@Test
	public void test() {
		BFS g = new BFS(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		g.searchBFS(2);
	}
}
