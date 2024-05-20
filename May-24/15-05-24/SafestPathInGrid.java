package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/find-the-safest-path-in-a-grid/
//O(N^2 + N^2logN) O(N^2)
public class SafestPathInGrid {
	class Solution {
		int[][] dirs;
		int[][] dist;

		public int maximumSafenessFactor(List<List<Integer>> grid) {
			int n = grid.size();
			if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1)
				return 0;
			this.dirs = new int[][] { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };
			this.dist = new int[n][n];
			// bfs to find all thieves O(n^2)
			Queue<int[]> que = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (grid.get(i).get(j) == 1) { // thief cell
						que.add(new int[] { i, j });
						dist[i][j] = 0;
					} else // non theif cell
						dist[i][j] = -1;
				}
			}

			while (!que.isEmpty()) {
				int size = que.size();
				while (size-- > 0) {
					int[] cur = que.poll();
					for (int[] dir : dirs) {
						int nr = dir[0] + cur[0];
						int nc = dir[1] + cur[1];
						int curVal = dist[cur[0]][cur[1]];
						if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
							dist[nr][nc] = curVal + 1;
							que.add(new int[] { nr, nc });
						}
					}
				} // while
			} // que

			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
			pq.add(new int[] { 0, 0, dist[0][0] });
			dist[0][0] = -1;

			while (!pq.isEmpty()) {
				int[] cur = pq.poll();

				if (cur[0] == n - 1 && cur[1] == n - 1)
					return cur[2];

				for (int[] dir : dirs) {
					int nr = dir[0] + cur[0];
					int nc = dir[1] + cur[1];

					if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] != -1) {
						pq.add(new int[] { nr, nc, Math.min(dist[nr][nc], cur[2]) });
						dist[nr][nc] = -1;
					}
				}
			}
			return -1;
		}
	}
}
