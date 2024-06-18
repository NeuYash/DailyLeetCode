package com.leetcode;

//Problem Link: https://leetcode.com/problems/reorganize-string/
//O(2n *26) O(26)
public class ReorganizeString {
	class Solution {
		public String reorganizeString(String s) {
			int[] ab = new int[26];
			int maxFreq = 0, letter = 0;
			for (int i = 0; i < s.length(); i++) {
				ab[s.charAt(i) - 'a']++;
				if (ab[s.charAt(i) - 'a'] > maxFreq) {
					maxFreq = ab[s.charAt(i) - 'a'];
					letter = (int) (s.charAt(i) - 'a');
				}
			}
			if (maxFreq > (s.length() + 1) / 2)
				return "";
			char[] res = new char[s.length()];
			int idx = 0;
			while (ab[letter]-- > 0) {
				res[idx] = (char) (letter + 'a');
				idx += 2;
			}
			for (int i = 0; i < 26; i++) {
				while (ab[i]-- > 0) {
					if (idx >= s.length())
						idx = 1;
					res[idx] = (char) (i + 'a');
					idx += 2;
				}
			}
			return String.valueOf(res);
		}
	}
}
