package com.dhiva.ArraysAndStrings;

public class Point implements Comparable<Point> {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance() {
		return x * x + y * y;
	}

	@Override
	public int compareTo(Point o) {
		int c = Double.compare(getDistance(), o.getDistance());
		if (c == 0) {
			c = Double.compare(x, o.x);
			if (c == 0) {
				c = Double.compare(y, o.y);
			}
		}
		return c;
	}

}
