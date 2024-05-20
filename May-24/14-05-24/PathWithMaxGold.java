package com.leetcode.May;
//Problem: https://leetcode.com/problems/path-with-maximum-gold/
//O((mn)^2) O(m+n)
public class PathWithMaxGold {
	class Solution {
	    int max;
	    int[][] dirs;
	    int m, n;
	    public int getMaximumGold(int[][] grid) {
	        this.m=grid.length;
	        this.n=grid[0].length;
	        this.dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]!=0){
	                    max = Math.max(max, helper(i, j, grid, 0));
	                }
	            }
	        }
	        return max;
	    }

	    public int helper(int r, int c, int[][] grid, int ans){
	        ans+=grid[r][c];
	        grid[r][c]*=-1;
	        int curMax=ans;
	        for(int[] dir: dirs){
	            int nr = dir[0]+r;
	            int nc = dir[1]+c;

	            if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]>0){
	                curMax=Math.max(curMax, helper(nr, nc, grid, ans));
	            }
	        }
	        grid[r][c]*=-1;
	        return curMax;
	    }
	}
}
