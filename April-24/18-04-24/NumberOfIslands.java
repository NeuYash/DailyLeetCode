package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/number-of-islands/description
//O(mn) O(mn)
public class NumberOfIslands {
	class Solution {
		int[][] dirs;
		int m, n;
		int res;

		public int numIslands(char[][] grid) {
			this.dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
			m = grid.length;
			n = grid[0].length;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == '1') {
						grid[i][j] = '0';
						res++;
						// res=Math.max(res,bfs(grid, q, i, j, 1));
						dfs(grid, i, j);
					}
				}
			}
			return res;
		}

		private void dfs(char[][] grid, int r, int c) {
			for (int[] dir : dirs) {
				int x = r + dir[0];
				int y = c + dir[1];
				if (x < m && x >= 0 && y < n && y >= 0 && grid[x][y] == '1') {
					grid[x][y] = '0';
					dfs(grid, x, y);
				}
			}
		}
	}
}
