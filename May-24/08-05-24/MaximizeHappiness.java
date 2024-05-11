package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/maximize-happiness-of-selected-children/description/
//O(nlogn) O(1);
public class MaximizeHappiness {
	class Solution {
	    public long maximumHappinessSum(int[] arr, int k) {
	        int n = arr.length;
	        long ans = 0;
	        int idx = n-1;
	        Arrays.sort(arr);
	        int dec = 0;
	        while(k>0){
	            arr[idx] = arr[idx]-dec;
	            if(arr[idx]>=0){
	                ans = ans+(long)arr[idx];
	            }   
	            dec++;
	            k--;
	            idx--;
	        }
	        return ans;
	    }
	}
}
