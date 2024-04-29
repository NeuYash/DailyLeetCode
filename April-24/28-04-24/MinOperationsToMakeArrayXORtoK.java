package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/description

public class MinOperationsToMakeArrayXORtoK {
	class Solution {
		public int minOperations(int[] nums, int k) {
			int value = nums[0];

			for (int i = 1; i < nums.length; ++i) {
				value ^= nums[i];
			}

			int ans = 0;
			while (k != 0 || value != 0) {
				int a = k & 1;
				int b = value & 1;

				if (a != b) {
					ans += 1;
				}
				k = k >> 1;
				value = value >> 1;
			}
			return ans;
		}

	}
}
