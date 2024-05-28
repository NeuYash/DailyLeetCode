package com.leetcode;

//O(n) O(n)
public class MaxScoreWordsFormedByLetters {
	class Solution {
		public int maxScoreWords(String[] words, char[] letters, int[] score) {
			int[] map = new int[26];
			for (char c : letters)
				map[c - 'a']++;
			return backtrack(words, map, score, 0);
		}

		int backtrack(String[] words, int[] map, int[] score, int i) {
			if (i == words.length)
				return 0;

			int temp[] = map.clone(), isValid = 0, curScore = 0;
			for (char c : words[i].toCharArray()) {
				if (temp[c - 'a']-- == 0) {
					isValid = -1;
					break;
				}
				isValid += score[c - 'a'];
			}
			if (isValid > 0)
				curScore = backtrack(words, temp, score, i + 1) + isValid;
			return Math.max(curScore, backtrack(words, map, score, i + 1));
		}
	}
}
