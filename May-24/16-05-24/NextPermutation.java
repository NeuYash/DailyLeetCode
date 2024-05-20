package com.leetcode.May;

//ProblemLink: https://leetcode.com/problems/next-permutation/
//O(n) O(1)
public class NextPermutation {
	class Solution {
		public void nextPermutation(int[] nums) {
			int n = nums.length;
			// find dip in number from back;
			int idx = n - 2;
			while (idx >= 0 && nums[idx] >= nums[idx + 1])
				idx--;

			// find the digit just greater than breaking num
			if (idx >= 0) {
				int j = n - 1;
				while (nums[j] <= nums[idx])
					j--;
				swap(nums, idx, j);
			}
			int low = idx + 1, high = n - 1;
			while (low < high) {
				swap(nums, low, high);
				low++;
				high--;
			}
		}

		public void swap(int[] nums, int i, int j) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
		}
	}
}
