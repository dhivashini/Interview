package com.dhiva.ArraysAndStrings;

import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPoints {
	public Point[] getKClosestPoints(int k, Point[] points) {
		PriorityQueue<Point> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
		
		for (int i = 0; i < points.length; i++) {
			if (maxHeap.size() < k) {
				maxHeap.add(points[i]);
			} else if (points[i].getDistance() < maxHeap.peek().getDistance()) {
				maxHeap.remove();
				maxHeap.add(points[i]);
			}
		}

		return maxHeap.toArray(new Point[k]);
	}
}
