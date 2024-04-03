package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/maximum-product-subarray/
//O(2n) O(1)
public class MaximumProductSubArray {
	public int maxProduct(int[] nums) {
		int n = nums.length;
		int pf1 = 1, pf2 = 1;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (pf1 == 0) {
				pf1 = nums[i];
			} else {
				pf1 = pf1 * nums[i];
			}
			max1 = Math.max(max1, pf1);
		}

		for (int i = n - 1; i >= 0; i--) {
			if (pf2 == 0) {
				pf2 = nums[i];
			} else {
				pf2 = pf2 * nums[i];
			}
			max2 = Math.max(max2, pf2);
		}

		return Math.max(max1, max2);
	}
}
