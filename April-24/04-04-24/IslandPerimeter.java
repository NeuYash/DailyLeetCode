package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {
	class Solution {
	    int[][] dirs;
	    int m,n;
	    int res;
	    public int islandPerimeter(int[][] grid) {
	        this.dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	        m=grid.length;
	        n=grid[0].length;
	        // Queue<Integer> q=new LinkedList<>();
	        // boolean flag=false;
	        // for(int i=0;i<m && !flag;i++){
	        //     for(int j=0;j<n&& !flag;j++){
	        //         if(grid[i][j]==1){
	        //             grid[i][j]=-1;
	        //             q.add(i);
	        //             q.add(j);
	        //             flag=true;
	        //         }
	        //     }
	        // }

	        // while(!q.isEmpty()){
	        //     int cnt=0;
	        //     int x=q.poll();
	        //     int y=q.poll();
	            
	        //     for(int[] dir: dirs){
	        //         int nr=x+dir[0];
	        //         int nc=y+dir[1];
	        //         if(nr<m && nc<n && nr>=0 && nc>=0 && (grid[nr][nc]==1 || grid[nr][nc]==-1)){
	        //             cnt++;
	        //         }
	        //         if(nr<m && nc<n && nr>=0 && nc>=0 && grid[nr][nc]==1){
	        //             grid[nr][nc]=-1;
	        //             q.add(nr);
	        //             q.add(nc);
	        //         }
	        //     }
	        //     res+=4-cnt;
	        // }
	        // return res;

	        int count=0;
	        for(int i=0;i<m;i++)
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1){
	                    int neighborCount=4;
	                    for(int[] dir: dirs){
	                        int nr=dir[0]+i;
	                        int nc=dir[1]+j;
	                        if(nr<m&&nc<n && nr>=0 && nc>=0 && grid[nr][nc]==1)
	                            neighborCount--;
	                    }
	                    count+=neighborCount;
	                }
	            }
	        return count;
	    }
	}
}
