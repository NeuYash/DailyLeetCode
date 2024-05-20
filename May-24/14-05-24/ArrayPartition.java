package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/array-partition/
//O(n) O(1)
public class ArrayPartition {
	class Solution {
	    public int arrayPairSum(int[] nums) {
	        // Arrays.sort(nums);
	        // int res=0;
	        // for(int i=0;i<nums.length;i=i+2){
	        //     res+=nums[i];
	        // }
	        // return res;

	        Map<Integer, Integer> map = new HashMap<>();
	        int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	            min=Math.min(min, nums[i]);
	            max=Math.max(max, nums[i]);
	        }

	        int res=0;
	        boolean flag = false;
	        for(int i=min;i<=max;i++){
	            if(map.containsKey(i)){
	                if(flag){
	                    map.put(i, map.get(i)-1);
	                }
	                int cnt = map.get(i);
	                int pairs = cnt/2;
	                res+=pairs*i;
	                if(cnt%2 == 0)
	                    flag = false;
	                else{
	                    flag = true;
	                    res+=i;
	                }
	            }
	        }
	        return res;
	    }
	}
}
