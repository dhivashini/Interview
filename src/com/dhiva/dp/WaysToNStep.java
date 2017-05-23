package com.dhiva.dp;

public class WaysToNStep {
	public int possibleWays(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		int[] stair = new int[n];
		stair[0] = 0;
		stair[1] = 1;
		for (int i = 2; i < n; i++) {
			stair[i] = stair[i - 1] + stair[i - 2];
		}
		return stair[n-1]+stair[n-2];
	}
}
