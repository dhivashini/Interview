package com.dhiva.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int V;
	LinkedList<Integer> adj[];

	public BFS(int v) {
		V = v;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++)
			adj[i] = new LinkedList<>();
	}

	public void addEdge(int v, int u) {
		adj[v].add(u);
	}

	public void searchBFS(int src) {
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();

		queue.add(src);
		visited[src] = true;

		while (!queue.isEmpty()) {
			src = queue.poll();
			System.out.println(src+ " ");
			Iterator<Integer> i = adj[src].listIterator();

			while (i.hasNext()) {
				int temp = i.next();
				if (visited[temp] == false) {
					queue.add(temp);
					visited[temp] = true;
				}
			}

		}
	}

}
