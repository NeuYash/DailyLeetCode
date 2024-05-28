package com.leetcode;

//O(4n) O(1)
public class RobotBoundedInCircle {
	class Solution {
		int[][] dirs;

		public boolean isRobotBounded(String instructions) {
			this.dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
			int idx = 0;
			int x = 0, y = 0;
			for (int k = 0; k < 4; k++) {
				for (int i = 0; i < instructions.length(); i++) {
					if (instructions.charAt(i) == 'G') {
						x += dirs[idx][0];
						y += dirs[idx][1];
					} else if (instructions.charAt(i) == 'L') {
						idx = (idx + 3) % 4;
					} else {
						idx = (idx + 1) % 4;
					}
				}
				if (x == 0 && y == 0)
					return true;
			}
			return false;
		}
	}
}
