package com.dhiva.arraystringtests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.FindAllPalindromesInString;

public class FindAllPAlindromesTest {
	@Test
	public void test() {
		int output = FindAllPalindromesInString.findCount("ggeekskeeg");
		System.out.println(output);
	}
}
