package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/relative-ranks/description
O(nlogn)O(n)
public class RelativeRanks {
	class Solution {
		public String[] findRelativeRanks(int[] score) {
			String[] str = new String[score.length];
			PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
			for (int i = 0; i < score.length; i++)
				q.add(new int[] { score[i], i });
			str[q.poll()[1]] = "Gold Medal";
			if (!q.isEmpty())
				str[q.poll()[1]] = "Silver Medal";
			if (!q.isEmpty())
				str[q.poll()[1]] = "Bronze Medal";
			int i = 4;
			while (!q.isEmpty()) {
				str[q.poll()[1]] = i++ + "";
			}

			return str;
		}
	}
}
