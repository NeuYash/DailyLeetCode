package com.leetcode;

//Problem Link: https://leetcode.com/problems/find-a-peak-element-ii/description/
//O(mlogn or nlogm) O(1)
public class FindPeakElement2 {
	class Solution {
		public int[] findPeakGrid(int[][] mat) {
			int m = mat.length, n = mat[0].length;
			int low = 0, high = 0;
			while (low < m && high < n) {
				if (low > 0 && mat[low - 1][high] > mat[low][high])// smaller than top
					low = low - 1;
				else if (high > 0 && mat[low][high - 1] > mat[low][high])// smaller than left
					high = high - 1;
				else if (low < m - 1 && mat[low + 1][high] > mat[low][high])// smaller than down
					low = low + 1;
				else if (high < n - 1 && mat[low][high + 1] > mat[low][high])// smaller than right
					high = high + 1;
				else { // current element is higher than neighbors
					return new int[] { low, high };
				}
			}
			return new int[] { -1, -1 };
		}
	}
}
