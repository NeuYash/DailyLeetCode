package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/shuffle-string/description/

O(n)O(n);
public class ShuffleString {
	class Solution {
		public String restoreString(String s, int[] ind) {
			// char[] str = new char[s.length()];
			// for(int i=0; i<s.length() ; i++){
			// str[ind[i]] = s.charAt(i);
			// }
			// return new String(str);

			char[] result = new char[ind.length];
			for (int i = 0; i < ind.length; i++) {
				result[ind[i]] = s.charAt(i);
			}
			return new String(result);
		}
	}
}
