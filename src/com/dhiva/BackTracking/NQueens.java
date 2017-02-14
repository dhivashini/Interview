package com.dhiva.BackTracking;

public class NQueens {
	public static boolean nQueen(int n) {
		int[][] board = new int[n][n];
		if (solveNQueen(board, 0) == true)
			return true;
		return false;
	}

	private static boolean solveNQueen(int[][] board, int col) {
		if (col >= board.length) {
			for (int i = 0; i <= board.length - 1; i++) {
				for (int j = 0; j <= board.length - 1; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			return true;
		}
		for (int row = 0; row < board.length; row++) {
			if (isSafe(board, row, col)) {
				placeQueen(board, row, col);
				if (solveNQueen(board, col + 1))
					return true;
				removeQueen(board, row, col);
			}
		}
		return false;
	}

	private static void placeQueen(int[][] board, int row, int col) {
		board[row][col] = 1;
	}

	private static void removeQueen(int[][] board, int row, int col) {
		board[row][col] = 0;
	}

	private static boolean isSafe(int[][] board, int row, int col) {
		return (LowerDiagIsClear(board, row, col) && RowIsClear(board, row, col) && UpperDiagIsClear(board, row, col));
	}

	private static boolean LowerDiagIsClear(int[][] board, int row, int col) {

		for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}

	private static boolean RowIsClear(int[][] board, int row, int col) {
		for (int i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		return true;
	}

	private static boolean UpperDiagIsClear(int[][] board, int row, int col) {
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}
}
