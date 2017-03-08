package com.dhiva.arraystringtests;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.ValidSudoku;

public class ValidSudokuTest {
	@Test
	public void test(){
		char str[] = [".87654321","2........","3........","4........","5........","6........","7........","8........","9........"];
		ValidSudoku obj = new ValidSudoku();
		obj.isValid(str);
	}
}
