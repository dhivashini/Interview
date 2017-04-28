package com.dhiva.ProgramCreek;

import java.util.List;

import org.junit.Test;

public class PhoneNUmberCombinationsTest {
	@Test
	public void test(){
		PhoneNumberCombinations obj = new PhoneNumberCombinations();
		List<String> result = obj.letterCombinations("23");
		System.out.println(result.toString());
	}
}
