package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
//O(m+n) O(1)
public class Search2DMatrix2 {
	class Solution {
		public boolean searchMatrix(int[][] matrix, int target) {
			int m = 0, n = matrix[0].length - 1;
			while (m < matrix.length && n >= 0) {
				if (matrix[m][n] == target)
					return true;
				if (matrix[m][n] > target)
					n--;
				else
					m++;
			}
			return false;
		}
	}
}
