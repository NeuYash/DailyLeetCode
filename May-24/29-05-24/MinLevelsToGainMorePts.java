package com.leetcode;

//O(2n) O(1)
//Problem Link: https://leetcode.com/problems/minimum-levels-to-gain-more-points/
public class MinLevelsToGainMorePts {
	class Solution {
		public int minimumLevels(int[] possible) {
			int totalScore = 0, n = possible.length;
			for (int score : possible)
				totalScore += score == 1 ? 1 : -1;

			int currentScore = 0;
			for (int i = 0; i < n - 1; i++) {
				currentScore += possible[i] == 1 ? 1 : -1;
				if (currentScore > totalScore - currentScore)
					return i + 1;
			}
			return -1;
		}
	}
}
