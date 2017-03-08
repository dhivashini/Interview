package com.dhiva.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
	public boolean checkIfBipartitie(int[][] graph, int start, int V) {
		int[] color = new int[V];
		for (int i = 0; i < V; i++)
			color[i] = -1;
		color[start] = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		while (!queue.isEmpty()) {
			int u = queue.poll();
			for (int v = 0; v < V; v++) {
				if (graph[u][v] == 1 && color[v] == -1) {
					color[v] = 1 - color[v];
					queue.add(v);
				} else if (graph[u][v] == 1 && color[v] == color[u])
					return false;
			}
		}
		return true;
	}
}
