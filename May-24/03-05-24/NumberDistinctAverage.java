package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/number-of-distinct-averages/description/
//O(2n) O(201)
public class NumberDistinctAverage {
	class Solution {
		public int distinctAverages(int[] nums) {
			boolean[] count = new boolean[201];
			int[] arr = new int[101];
			for (int i : nums) {
				arr[i]++;
			}
			int idx = 0;
			for (int i = 0; i < arr.length && idx != nums.length; i++) {
				if (arr[i] > 0) {
					while (arr[i]-- != 0) {
						nums[idx++] = i;
					}
				}
			}

			idx = 0;
			int high = nums.length - 1;
			int res = 0;
			while (idx < high) {
				if (!count[nums[idx] + nums[high]]) {
					res++;
					count[nums[idx] + nums[high]] = true;
				}
				idx++;
				high--;
			}
			return res;
		}
	}
}
