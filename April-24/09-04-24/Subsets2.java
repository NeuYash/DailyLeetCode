package com.leetcode.April;
//O(nlogn + 2^n) O(n)
//Problem Link: https://leetcode.com/problems/subsets-ii/
public class Subsets2 {
	class Solution {
	    List<List<Integer>> res;
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        this.res=new ArrayList<>();
	        Arrays.sort(nums);
	        helper(nums, 0, new ArrayList<>());
	        return res;
	    }
	    public void helper(int[] nums, int idx, List<Integer> path){
	        //base
	        if(idx>nums.length){
	            return;
	        }
	        res.add(new ArrayList<>(path));
	        //logic
	        for(int i=idx;i<nums.length;i++){
	            if(i!=idx && nums[i]==nums[i-1])
	                continue;
	            path.add(nums[i]);
	            helper(nums, i+1, path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
