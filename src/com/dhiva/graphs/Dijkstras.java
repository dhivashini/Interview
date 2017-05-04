package com.dhiva.graphs;

public class Dijkstras {
	public int findShortestPath(int[][] graph, int source) {
		int[] dist = new int[graph.length];
		Boolean[] set = new Boolean[graph.length];

		for (int i = 0; i < graph.length; i++) {
			dist[i] = Integer.MAX_VALUE;
			set[i] = false;
		}

		dist[source] = 0;

		for (int c = 0; c < graph.length; c++) {
			int u = findMin(dist, set);
			set[u] = true;

			for (int v = 0; v < graph.length; v++) {
				if (set[v] == false && dist[u] + graph[u][v] < dist[v] && graph[u][v]!=0)
					dist[v] = dist[u] + graph[u][v];
			}
		}
		
		return dist[graph.length-1];

	}

	private int findMin(int[] dist, Boolean[] set) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < dist.length; i++) {
			if (set[i] == false && dist[i] < min) {
				min = dist[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
