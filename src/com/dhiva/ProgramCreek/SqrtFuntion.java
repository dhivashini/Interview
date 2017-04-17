package com.dhiva.ProgramCreek;

public class SqrtFuntion {
	public double sqrt(double n) {
		double x = n;
		double y = 1;
		double e = 0.000001;
		while (x - y > e) {
			double mid = (x + y) / 2;
			if (mid * mid <= n)
				y = mid;
			else
				x = mid;
		}
		return y;
	}
}
