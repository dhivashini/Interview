package com.dhiva.implementation;

public class MinHeapImplementation {
	public int size;
	public int[] heap;
	public int position;

	public MinHeapImplementation(int size) {
		this.size = size;
		heap = new int[size];
		position = 0;
	}

	/*
	 * leftChild--> 2 * position rightChild--> 2 * position + 1 parent-->
	 * position / 2
	 */

	public void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	public void createHeap(int[] input) {
		if (input.length > 0) {
			for (int i = 0; i < input.length; i++) {
				insert(input[i]);
			}
		}
	}

	public void insert(int data) {
		if (position == 0) {
			heap[position + 1] = data;
			position = 2;
		}

		heap[position++] = data;
		bubbleUp();

	}

	public void sinkDown(int k) {
		//int a = heap[k];
		int smallest = k;
		if (2 * k < position && heap[smallest] > heap[2 * k]) {
			smallest = 2 * k;
		}
		if (2 * k + 1 < position && heap[smallest] > heap[2 * k + 1]) {
			smallest = 2 * k + 1;
		}
		if (smallest != k) {
			swap(k, smallest);
			sinkDown(smallest);
		}
	}

	public void bubbleUp() {
		int pos = position - 1;
		while (pos > 0 && heap[pos / 2] > heap[pos]) {
			int y = heap[pos];
			heap[pos] = heap[pos / 2];
			heap[pos / 2] = y;
			pos = pos / 2;
		}
	}

	public int extractMin() {
		int min = heap[1];
		heap[1] = heap[position - 1];
		heap[position - 1] = 0;
		position--;
		sinkDown(1);
		return min;
	}
}
