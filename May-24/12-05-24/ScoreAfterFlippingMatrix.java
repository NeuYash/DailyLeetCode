package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/score-after-flipping-matrix
//O(mn) O(n)
public class ScoreAfterFlippingMatrix {
	class Solution {
	    public int matrixScore(int[][] grid) {
	        int row = grid.length;
	        int col = grid[0].length;
	        int[] colcheck = new int[col];
	        for(int i=0;i<row;i++){
	            //row check
	            if(grid[i][0]==0){
	                for(int j=0;j<col;j++){
	                    if(grid[i][j]==0)
	                        grid[i][j]=1;
	                    else
	                        grid[i][j]=0;
	                }
	            }
	        }

	        //checking how many 1 are there in columns;
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                colcheck[j]+=grid[i][j];
	            }
	        }

	        for(int k=0;k<col;k++){
	            if(colcheck[k] < row - colcheck[k]){
	                colcheck[k] = row - colcheck[k];
	            }
	        }
	        int ans = 0;
	        for(int k=0;k<col;k++){
	            ans *= 2;
	            ans+=colcheck[k];
	        }

	        return ans;
	    }
	}
}
