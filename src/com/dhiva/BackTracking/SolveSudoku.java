package com.dhiva.BackTracking;

public class SolveSudoku {
	public boolean solve(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0) {
					for (int num = 1; num <= 9; num++) {
						if (NoConflicts(grid, i, j, num)) {
							grid[i][j] = num;
							if (solve(grid))
								return true;
							grid[i][j] = 0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private boolean NoConflicts(int[][] grid, int row, int col, int num) {
		return !UsedInRow(grid, row, num) && !UsedInCol(grid, col, num)
				&& !UsedInBox(grid, row - row % 3, col - col % 3, num);
	}

	private boolean UsedInBox(int[][] grid, int boxStartRow, int boxStartCol, int num) {
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (grid[row][col] != 0 && grid[row + boxStartRow][col + boxStartCol] == num)
					return false;
		return true;
	}

	private boolean UsedInCol(int[][] grid, int row, int num) {
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] != 0 && grid[row][i] == num)
				return false;
		}
		return true;
	}

	private boolean UsedInRow(int[][] grid, int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (grid[i][col] != 0 && grid[i][col] == num)
				return false;
		}
		return true;
	}

}
