package com.leetcode;

//Problem Link: https://leetcode.com/problems/string-compression/description/
//O(2n) O(n)
public class StringCompression {
	class Solution {
		public int compress(char[] chars) {
			int curCount = 0, n = chars.length;
			char curChar = ' ';
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < n; i++) {
				if (curChar == ' ') {
					curChar = chars[i];
					curCount = 1;
					res.append(curChar);
				} else {
					if (chars[i] == curChar) {
						curCount++;
					} else {
						if (curCount != 1)
							res.append(curCount);
						curChar = chars[i];
						curCount = 1;
						res.append(curChar);
					}
				}
			}
			if (curCount != 1)
				res.append(curCount);

			for (int i = 0; i < res.length(); i++) {
				chars[i] = res.charAt(i);
			}

			return res.length();
		}
	}
}
