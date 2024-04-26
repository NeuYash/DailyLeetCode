package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/minimum-falling-path-sum-ii
//O(m*2n) O(1)
public class MinFallingPathSum2 {
	class Solution {
		public int minFallingPathSum(int[][] grid) {
			// int n=grid.length;
			// for(int i=n-2;i>=0;i--){
			// for(int j=0;j<n;j++){
			// int min=Integer.MAX_VALUE;
			// for(int k=0;k<n;k++){
			// if(k!=j)
			// min=Math.min(min,grid[i+1][k]);
			// }
			// grid[i][j]+=min;
			// }
			// }
			// int minimum=Integer.MAX_VALUE;
			// for(int i=0;i<n;i++){
			// minimum=Math.min(minimum,grid[0][i]);
			// }
			// return minimum;

			int n = grid.length;
			for (int i = 1; i < n; i++) {
				int min = Integer.MAX_VALUE, secMin = min;
				for (int j = 0; j < n; j++) {
					if (grid[i - 1][j] <= min) {
						secMin = min;
						min = grid[i - 1][j];
					}
					if (grid[i - 1][j] < secMin && grid[i - 1][j] > min) {
						secMin = grid[i - 1][j];
					}
				}
				for (int j = 0; j < n; j++) {
					if (grid[i - 1][j] == min)
						grid[i][j] += secMin;
					else
						grid[i][j] += min;
				}
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++)
				min = Math.min(min, grid[n - 1][i]);
			return min;
		}
	}
}
