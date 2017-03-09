package com.dhiva.ArraysAndStrings;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValid(char[][] board){	
        for(int i=0;i<9;i++){
        	HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
        	for(int j=0;j<9;j++){
        	if(!(board[i][j]=='.')&& !(rows.add(board[i][j])))
        		return false;
        	if(!(board[i][j]=='.')&& !(columns.add(board[i][j])))
        		return false;
       	
        	}
        }
        for(int block = 0 ;block<9;block++){
            HashSet<Character> cube = new HashSet<Character>();
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
    			for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
    				if(!(board[i][j]=='.') && !(cube.add(board[i][j])))
    						return false;
    			}
        }
	}
	
    return true;

	}
}
