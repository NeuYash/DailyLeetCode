package com.leetcode;

//Problem Link: https://leetcode.com/problems/longest-happy-string/description/
//O(a+b+c) O(1)
public class LongestHappyString {
	class Solution {
		public String longestDiverseString(int a, int b, int c) {
			int cntA = 0, cntB = 0, cntC = 0;
			StringBuilder sb = new StringBuilder();
			int total = a + b + c;
			while ((total--) > 0) {
				if ((a >= b && a >= c && cntA != 2) || (a > 0 && (cntB == 2 || cntC == 2))) {
					sb.append("a");
					a--;
					cntA++;
					cntB = 0;
					cntC = 0;
				} else if ((b >= a && b >= c && cntB != 2) || (b > 0 && (cntA == 2 || cntC == 2))) {
					sb.append("b");
					b--;
					cntB++;
					cntA = 0;
					cntC = 0;
				} else if ((c >= a && c >= b && cntC != 2) || (c > 0 && (cntA == 2 || cntB == 2))) {
					sb.append("c");
					c--;
					cntC++;
					cntB = 0;
					cntA = 0;
				}
			}
			return sb.toString();
		}
	}
}
