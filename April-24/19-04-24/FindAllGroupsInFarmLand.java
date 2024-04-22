package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/find-all-groups-of-farmland/description/
//O(mn * mn) O(mn)
public class FindAllGroupsInFarmLand {
	class Solution {

	    void dfs(int[][] land, int[] coords, int i, int j) {

	        if(i < 0 || j < 0 || i >= land.length || j >= land[0].length || land[i][j] != 1) return;
	        
	        if(coords[2] < i) coords[2] = i;    // most bottom r2
	        if(coords[3] < j) coords[3] = j;    // most right c2

	        land[i][j] = -1;                    // mark visited

	        dfs(land, coords, i + 1, j);
	        dfs(land, coords, i - 1, j);
	        dfs(land, coords, i, j + 1);
	        dfs(land, coords, i, j - 1);
	    }

	    public int[][] findFarmland(int[][] land) {

	        int m = land.length, n = land[0].length;

	        List<int[]> ls = new ArrayList<>();

	        for(int i = 0; i < m; i++) 
	            for(int j = 0; j < n; j++) 
	                if(land[i][j] == 1) {
	                    int[] coord = new int[] { i, j, -1, -1}; // r1, c1, r2, c2
	                    dfs(land, coord, i, j);
	                    ls.add(coord);
	                }

	        int[][] ret = new int[ls.size()][4];
	        for(int i = 0; i < ls.size(); i++) ret[i] = ls.get(i);
	        return ret;
	        
	    }
	}
}
