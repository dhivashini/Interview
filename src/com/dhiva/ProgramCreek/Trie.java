package com.dhiva.ProgramCreek;

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
		root.value = ' ';
	}

	public void insert(String word) {
		TrieNode curr = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (curr.child[c - 'a'] == null)
				curr.child[c - 'a'] = new TrieNode(c);
			curr = curr.child[c - 'a'];
		}
		curr.isWord = true;
	}

	public boolean search(String word) {
		TrieNode ws = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (ws.child[c - 'a'] == null)
				return false;
			ws = ws.child[c - 'a'];
		}
		return ws.isWord;
	}

	public boolean startsWith(String prefix) {
		TrieNode ws = root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			if (ws.child[c - 'a'] == null)
				return false;
			ws = ws.child[c - 'a'];
		}
		return true;
	}
}
