package com.dhiva.dp;

public class RobotInGrid {
	public int possiblePaths(int i, int j, int[][] grid) {
		if (i <= grid.length || j <= grid[0].length || grid[i][j] == 0)
			return 0;
		else
			return possiblePaths(i + 1, j, grid) + possiblePaths(i, j + 1, grid);
	}
}
