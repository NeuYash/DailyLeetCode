package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/largest-local-values-in-a-matrix
//O(9*n^2) O(1)
public class LargestLocalValuesInMatrix {
	class Solution {
	    public int[][] largestLocal(int[][] grid) {
	        int n = grid.length;
	        int[][] res = new int[n-2][n-2];
	        for(int row=0; row<n-2; row++){
	            for(int col=0; col<n-2; col++){
	                int max=0;
	                //iterate through matrix
	                for(int i=row;i<row+3;i++){
	                    for(int j=col;j<col+3;j++){
	                        max=Math.max(max, grid[i][j]);
	                    }
	                }
	                res[row][col]=max;
	            }
	        }//outer for
	        return res;
	    }
	}
}
