package com.dhiva.ProgramCreek;

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length())
			return false;
		if (s1.length() == 0 && s2.length() == 0)
			return true;
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			Character c1 = s1.charAt(i);
			Character c2 = s2.charAt(i);
			if (map.containsKey(c1)) {
				if (c2 != map.get(c1))
					return false;
			} else {
				if (map.containsValue(c2))
					return false;
				map.put(c1, c2);
			}
		}
		return true;
	}

}
