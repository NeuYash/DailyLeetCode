package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/flood-fill/
//O(mn) O(mn)
public class FloodFill {
	class Solution {
	    int[][] dirs;
	    int m,n;
	    int newC;
	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        this.dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	        m=image.length;
	        n=image[0].length;
	        this.newC=color;
	        int oldC=image[sr][sc];
	        if(oldC==color)
	            return image;
	        image[sr][sc]=color;
	        // Queue<Integer> q=new LinkedList<>();
	        // q.add(sr);
	        // q.add(sc);
	        // while(!q.isEmpty()){
	        //     int x=q.poll();
	        //     int y=q.poll();
	        //     for(int[] dir: dirs){
	        //         int nr=x+dir[0];
	        //         int nc=y+dir[1];
	        //         if(nr>=0&&nc>=0&& nr<m && nc<n && image[nr][nc]==oldC){
	        //             image[nr][nc]=color;
	        //             q.add(nr);
	        //             q.add(nc);
	        //         }
	        //     }
	        // }
	        // return image;

	        dfs(image, sr, sc, oldC);
	        return image;
	    }
	    private void dfs(int[][] image, int curR, int curC, int oldC){
	        for(int[] dir: dirs){
	            int nr=curR+dir[0];
	            int nc=curC+dir[1];
	            if(nr<m && nc<n && nr>=0 && nc>=0 && image[nr][nc]==oldC){
	                image[nr][nc]=newC;
	                dfs(image, nr, nc, oldC);
	            }
	        }
	    }
	}
}
