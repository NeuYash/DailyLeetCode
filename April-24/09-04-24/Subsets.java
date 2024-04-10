package com.leetcode.April;
//O(n) O(n)
//Problem link: https://leetcode.com/problems/subsets/description/
public class Subsets {
	class Solution {
	    List<List<Integer>> res;
	    public List<List<Integer>> subsets(int[] nums) {
	        this.res=new ArrayList<>();
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
	            path.add(nums[i]);
	            helper(nums, i+1, path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
