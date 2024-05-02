package com.leetcode.April;

//Problem Link:https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative
//O(n) O(1001)
public class LargestPositiveIntegerWithNegative {
	class Solution {
		public int findMaxK(int[] nums) {
			// Set<Integer> set= new HashSet<>();
			// int max=Integer.MIN_VALUE;
			// for(int num: nums){
			// if(num<0){
			// if(set.contains(Math.abs(num))){
			// max=Math.max(Math.abs(num), max);
			// }
			// }else{
			// if(set.contains(num*-1)){
			// max=Math.max(Math.abs(num), max);
			// }
			// }
			// set.add(num);
			// }
			// return max == Integer.MIN_VALUE ? -1: max;

			int[] freq = new int[1001];

			for (int num : nums) {
				if (num < 0)
					freq[num * -1]++;
			}
			;

			int max = -1;

			for (int num : nums) {
				if (num > 0) {
					if (freq[num] != 0) {
						if (num > max)
							max = num;
					}
				}
			}

			return max;
		}
	}
}
