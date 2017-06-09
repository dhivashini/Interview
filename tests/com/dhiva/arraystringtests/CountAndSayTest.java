package com.dhiva.arraystringtests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.CountAndSay;
import com.dhiva.ArraysAndStrings.EditDistance;

public class CountAndSayTest {
	@Test
	public void test() {
		CountAndSay obj = new CountAndSay();
		String output = obj.lookAndSay(5);
		System.out.println(output);
	}
}
