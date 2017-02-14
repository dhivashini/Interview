package com.dhiva.StackAndQueue;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ShortestWordTransitionTest {
	@Test
	public void test() {
		Set<String> D = new HashSet<>();
		D.add("poon");
		D.add("plee");
		D.add("same");
		D.add("poie");
		D.add("plie");
		D.add("poin");
		D.add("plea");
		String start = "toon";
		String target = "plea";
		int output = ShortestWordTransition.findLength(start, target, D);
		int expected = 7;
		assertEquals(output, expected);

	}
}
