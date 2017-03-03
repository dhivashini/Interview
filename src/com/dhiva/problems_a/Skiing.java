package com.dhiva.problems_a;

public class Skiing {
	public boolean findPath(int[][] input, int x, int y) {

		if (x == input.length || y == input[x].length  || input[x][y] == 1)
			return false;

		if (x == input.length - 1 && y == input[x].length - 1)
			return true;

		return findPath(input, x + 1, y) || findPath(input, x, y + 1);
	}
}
