package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/sort-colors/
//O(n) O(1)
public class SortColors {
	class Solution {
	    public void sortColors(int[] nums) {
	        int low = 0;
	        int mid = 0;
	        int high = nums.length-1;

	        while(mid<=high){
	            if(nums[mid]==2){
	                swap(nums, mid, high);
	                high--;
	            }else if(nums[mid]==0){
	                swap(nums, mid, low);
	                low++; mid++;
	            }else
	                mid++;
	        }
	    }
	    public void swap(int[] arr, int i, int j){
	        int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	}
}
