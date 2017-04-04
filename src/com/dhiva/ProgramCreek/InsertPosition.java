package com.dhiva.ProgramCreek;

public class InsertPosition {
	public int findPosition(int[] input, int target){
		int i=0;
		if(input == null || input.length==0)
			return 0;
		while(i<input.length){
			if(target==input[i])
				return i;
			else
				if(input[i]<target && input[i+1]>target)
					return i+1;
			i++;
		}
		return input.length;
	}
}
