package com.leetcode.April;
//O(2n) O(1)
//Problem: https://leetcode.com/problems/missing-number/

public class MissingNumber {
	class Solution {
	    public int missingNumber(int[] nums) {
	        int sum=0;
	        for(int i=1;i<=nums.length;i++)
	            sum+=i;
	        for(int i: nums)
	            sum-=i;
	        return sum;
	    }
	}
}
