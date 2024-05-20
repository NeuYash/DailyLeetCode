//Problem Link: https://leetcode.com/problems/minimum-path-sum/description/
//O(mn) O(1)
public class MinPathSum {
	class Solution {
	    public int minPathSum(int[][] grid) {
	        int m = grid.length, n = grid[0].length;
	        // return helper(grid, m-1, n-1);
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(i==0 && j==0)
	                    continue;
	                if(i==0)
	                    grid[i][j]+=grid[i][j-1];
	                else if(j==0)
	                    grid[i][j]+=grid[i-1][j];
	                else
	                    grid[i][j]+= Math.min(grid[i-1][j],grid[i][j-1]);
	            }
	        }
	        return grid[m-1][n-1];
	    }
	    public int helper(int[][] grid, int r, int c){

	        if(r==0 && c == 0){
	            return grid[r][c];
	        }
	        int down = Integer.MAX_VALUE;
	        int right = Integer.MAX_VALUE;
	        if(r>0)
	            down = grid[r][c]+helper(grid, r-1, c);
	        if(c>0)
	            right = grid[r][c]+helper(grid, r, c-1);
	        
	        return Math.min(down, right);
	    }
	}
}
