package com.dhiva.problems_a;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class PasswordSuggestionTest {
	@Test
	public void test(){
		PasswordSuggestion obj = new PasswordSuggestion();
		HashMap<Character,Character> map = new HashMap<>();
		map.put('i','!');
		map.put('a','@');
		map.put('s','$');
		map.put('o','0');
		map.put('E','3');
		List<String> output = obj.findPasswords("password", map);
		System.out.println(output.toString());
	}
}
