package com.dhiva.arraystringtests;

import java.util.ArrayList;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.TextJustification;

public class TextJustificationTest {
	@Test
	public void test() {
		String[] input = { "This", "is", "an", "example", "of", "text", "justification."};
		TextJustification obj = new TextJustification();
		ArrayList<String> output = obj.justifyText(input, 16);
		System.out.println(output.toString());
		
	}
}
