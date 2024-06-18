package com.leetcode;

//Problem Link: https://leetcode.com/problems/find-peak-element/description/
//O(logn) O(1)
public class FindPeakElement {
	class Solution {
		public int findPeakElement(int[] nums) {
			int n = nums.length, l = 0;
			int h = n - 1;
			while (l < h) {
				int mid = l + (h - l) / 2;
				if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
					return mid;
				} else if (mid != 0 && nums[mid - 1] > nums[mid])
					h = mid - 1;
				else
					l = mid + 1;
			}
			return -1;
		}
	}
}
