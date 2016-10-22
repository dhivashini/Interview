package com.dhiva.ArraysAndStrings;

public class RotateMatrix {
	public static int[][] setZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		for(int i=0;i<row.length;i++)
			if(row[i])
				nullifyRow(matrix,i);
		
		for(int i=0;i<column.length;i++)
			if(column[i])
				nullifyCol(matrix,i);
		
		return matrix;
	}

	private static void nullifyCol(int[][] matrix, int col) {
		for(int i=0;i<matrix[0].length;i++)
			matrix[i][col]=0;
	}

	private static void nullifyRow(int[][] matrix, int row) {
		for(int j=0;j<matrix[0].length;j++)
			matrix[row][j]=0;
	}
	
	
}
