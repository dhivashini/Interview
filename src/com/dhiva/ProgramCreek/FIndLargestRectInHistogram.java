package com.dhiva.ProgramCreek;

import java.util.Stack;

public class FIndLargestRectInHistogram {
	public int findMaxArea(int[] histogram) {
		if (histogram == null || histogram.length == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0, i = 0;

		while (i < histogram.length) {
			if (stack.isEmpty() || i > stack.peek()) {
				stack.push(i);
				i++;
			} else {
				int p = stack.pop();
				int h = histogram[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
		}

		while (!stack.isEmpty()) {
			int p = stack.pop();
			int h = histogram[p];
			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * w, max);
		}
		return max;
	}
}
