package com.dhiva.graphs;

public class Prims {
	public void findMinSpt(int[][] graph) {
		int V = graph.length;
		Boolean[] visited = new Boolean[V];
		int[] key = new int[V];
		int[] parent = new int[V];

		for (int i = 0; i < V; i++) {
			visited[i] = false;
			key[i] = Integer.MAX_VALUE;
		}

		key[0] = 0;
		parent[0] = -1;

		for (int i = 0; i < V - 1; i++) {
			int u = findMin(key, visited);

			visited[u] = true;
			for (int v = 0; v < V; v++) {
				if (visited[v] == false && graph[u][v] != 0 && graph[u][v] < key[v]) {
					key[v] = graph[u][v];
					parent[v] = u;
				}
			}

		}

		printMST(parent, graph);

	}

	void printMST(int parent[], int graph[][]) {
		System.out.println("Edge   Weight");
		for (int i = 1; i < graph.length; i++)
			System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
	}

	private int findMin(int[] key, Boolean[] set) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < key.length; i++) {
			if (set[i] == false && key[i] < min) {
				min = key[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
