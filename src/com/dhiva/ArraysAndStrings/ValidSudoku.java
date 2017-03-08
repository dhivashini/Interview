package com.dhiva.ArraysAndStrings;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValid(char[][] board){
		
		HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        	if(!(board[i][j]=='.')&& !(rows.add(board[i][j])))
        		return false;
        	if(!(board[i][j]=='.')&& !(columns.add(board[i][j])))
        		return false;
        	if( !UsedInBox(board, i - i%3 , j - j%3,cube))
        		return false;
        	}
        }
		return true;
	}

	private boolean UsedInBox(char[][] board, int boxStartRow, int boxStartCol,HashSet<Character> cube) {
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (!cube.add(board[row+boxStartRow] [col+boxStartCol]))
					return false;
		return true;	
	}
}
