package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/max-area-of-island/
//O(mn) O(mn)
public class MaxAreaOfIsland {
	class Solution {
	    int[][] dirs;
	    int m,n;
	    int res;
	    public int maxAreaOfIsland(int[][] grid) {
	        this.dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	        m=grid.length;
	        n=grid[0].length;
	        int res=0;
	        Queue<Integer> q=new LinkedList<>();
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1){
	                    grid[i][j]=0;
	                    // res=Math.max(res,bfs(grid, q, i, j, 1));
	                    res=Math.max(res, dfs(grid, i, j));
	                }
	            }
	        }
	        return res;
	    }
	    private int dfs(int[][] grid, int r, int c){
	        int cnt=1;
	        for(int[] dir:dirs){
	                int x=r+dir[0];
	                int y=c+dir[1];
	                if(x<m && x>=0 && y<n && y>=0 && grid[x][y]==1){
	                    grid[x][y]=0;
	                    cnt+=dfs(grid, x, y);
	                }
	        }
	        return cnt;
	    }
	    private int bfs(int[][] grid, Queue<Integer> q, int i, int j, int cnt){
	        q.add(i);
	        q.add(j);
	        while(!q.isEmpty()){
	            int nx=q.poll();
	            int ny=q.poll();
	            for(int[] dir:dirs){
	                int x=nx+dir[0];
	                int y=ny+dir[1];
	                if(x<m && x>=0 && y<n && y>=0 && grid[x][y]==1){
	                    cnt++;
	                    grid[x][y]=0;
	                    q.add(x);
	                    q.add(y);
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
