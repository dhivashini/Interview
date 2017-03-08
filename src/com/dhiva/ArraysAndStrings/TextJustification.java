package com.dhiva.ArraysAndStrings;

import java.util.ArrayList;

public class TextJustification {
	public ArrayList<String> justifyText(String[] words, int L) {
		int index = 0;
		ArrayList<String> lines = new ArrayList<String>();
		while (index < words.length) {
			int count = words[0].length();
			int last = index + 1;

			while (last < words.length) {
				if (count + words[last].length() + 1 > L)
					break;
				count = count + words[last].length() + 1;
				last++;
			}

			StringBuilder s = new StringBuilder();
			int diff = last - index - 1;
			if (last == words.length || diff == 0) {
				for (int i = index; i < last; i++) {
					s.append(words[i] + " ");
				}
				s.deleteCharAt(s.length() - 1);
				for (int i = s.length(); i < L; i++) {
					s.append(" ");
				}
			} else {
				int actualSpace = (L - count) / diff;
				int moreSpace = (L - count) % diff;
				for (int i = index; i < last; i++) {
					s.append(words[i]);
					if (i == last - 1) {
						break;
					}
					for (int j = 0; j < actualSpace; j++) {
						s.append(" ");
					}

					if (moreSpace > 0) {
						s.append(" ");
						moreSpace--;
					}
				}
			}
			lines.add(s.toString());
			index = last;
		}

		return lines;
	}
}
