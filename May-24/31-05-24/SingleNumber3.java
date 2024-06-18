package com.leetcode;

//O(2n) O(1)
public class SingleNumber3 {
	class Solution {
		public int[] singleNumber(int[] nums) {
			int bm1 = 0;
			for (int num : nums) {
				bm1 = bm1 ^ num;
			}
			int lsb = bm1 & (-bm1);
			int bm2 = 0;
			for (int num : nums) {
				if ((lsb & num) != 0)
					bm2 ^= num;
			}
			return new int[] { bm2, bm2 ^ bm1 };
		}
	}
}
