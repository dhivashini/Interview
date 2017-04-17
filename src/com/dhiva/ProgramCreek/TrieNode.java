package com.dhiva.ProgramCreek;

public class TrieNode {
	char value;
	boolean isWord;
	TrieNode[] child = new TrieNode[26];

	public TrieNode() {
	}

	TrieNode(char c) {
		TrieNode curr = new TrieNode();
		curr.value = c;
	}

}
