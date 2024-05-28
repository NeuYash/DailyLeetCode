package com.leetcode;

//O(mn) O(1) 
public class SortStudentsByKthScore {
	class Solution {
		public int[][] sortTheStudents(int[][] score, int k) {
			// Arrays.sort(score, (a,b)->b[k]-a[k]);
			int n = score.length;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (score[i][k] > score[j][k]) {
						int tp[] = score[i];
						score[i] = score[j];
						score[j] = tp;
					}
				}
			}
			return score;
		}
	}
}
