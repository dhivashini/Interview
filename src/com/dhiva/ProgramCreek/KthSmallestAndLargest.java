package com.dhiva.ProgramCreek;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestAndLargest {
	public int findKthLargeEle(int[] input, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : input) {
			q.offer(i);
			if (q.size() > k)
				q.poll();
		}
		return q.peek();
	}
}
