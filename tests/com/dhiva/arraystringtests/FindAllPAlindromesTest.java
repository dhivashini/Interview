package com.dhiva.arraystringtests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.FindAllPalindromesInString;

public class FindAllPAlindromesTest {
	@Test
	public void test() {
		List<String> output = FindAllPalindromesInString.findPalindromes("fsmomsg");
		System.out.println(output);
	}
}
