package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/compare-version-numbers
	
	O(m+n) O(m+n)
public class CompareVersionNumbers {
	class Solution {
		public int compareVersion(String version1, String version2) {
			String[] s1 = version1.split("\\.");
			String[] s2 = version2.split("\\.");

			int maxLen = Math.max(s1.length, s2.length);

			for (int i = 0; i < maxLen; i++) {
				int v1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
				int v2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;

				if (v1 > v2)
					return 1;
				if (v1 < v2)
					return -1;
			}
			return 0;
		}
	}
}
