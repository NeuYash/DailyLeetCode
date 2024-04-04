package com.leetcode.April;

//Problem link: https://leetcode.com/problems/rotting-oranges/description/
//O(mn) O(mn)
public class RottingOranges {
	int[][] dirs;
    public int orangesRotting(int[][] grid) {
        this.dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int numFreshOranges=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    q.add(new int[]{i,j});
                else if(grid[i][j]==1)
                    numFreshOranges++;
            }
        }
        int time=0;
        if(numFreshOranges==0)
            return time;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                if(numFreshOranges==0)
                    return time+1;
                int[] cur=q.poll();
                for(int[] dir: dirs){
                    int nr=cur[0]+dir[0];
                    int nc=cur[1]+dir[1];
                    if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        numFreshOranges--;
                        if(numFreshOranges==0)
                            return time+1;
                    }
                }
            }
            time++;
        }
        return -1;
    }
}
