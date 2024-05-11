package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/minimum-cost-to-hire-k-workers/description/
public class MinCostToHireKWorkers {
	class Solution {
		// O(nlogn) O(n)
		public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			int n = quality.length;
			int[][] workers = new int[n][2];
			for (int i = 0; i < n; i++) {
				workers[i] = new int[] { quality[i], wage[i] };
			}
			Arrays.sort(workers, (a, b) -> {
				return Double.compare((double) a[1] / a[0], (double) b[1] / b[0]);
			});
			double ans = Double.MAX_VALUE;
			int totalWorkUnits = 0;
			for (int[] worker : workers) {
				totalWorkUnits += worker[0];
				pq.add(worker[0]);
				if (pq.size() > k) {
					totalWorkUnits -= pq.poll();
				}
				if (pq.size() == k) {
					ans = Math.min(ans, totalWorkUnits * (double) worker[1] / worker[0]);
				}
			}
			return ans;
		}
	}
}
