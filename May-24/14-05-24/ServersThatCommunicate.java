package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/count-servers-that-communicate/description/
//	O(2mn) O(m+n)
public class ServersThatCommunicate {
	class Solution {
	    public int countServers(int[][] grid) {
	        int m = grid.length, n = grid[0].length;
	        Map<Integer, Integer> rMap = new HashMap<>();
	        Map<Integer, Integer> cMap = new HashMap<>();
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1){
	                    rMap.put(i, rMap.getOrDefault(i,0)+1);
	                    cMap.put(j, cMap.getOrDefault(j,0)+1);
	                }
	            }
	        }

	        int ans=0;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1){
	                    boolean rowFind=false;
	                    if(rMap.get(i)>1){
	                        ans++;
	                        rowFind = true;
	                    }

	                    if(!rowFind && cMap.get(j)>1)
	                        ans++;
	                }
	            }
	        }
	        return ans;
	    }
	}
}
