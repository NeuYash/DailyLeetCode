package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/combination-sum-iv/description/
public class CombinationSum4 {
	class Solution {
	    //O(target * n) O(target)
	    public int combinationSum4(int[] nums, int target) {
	        int[] dp=new int[target+1];
	        dp[0]=1;
	        for(int i=1;i<=target;i++){
	            for(int j=0;j<nums.length;j++){
	                if(i>=nums[j])
	                    dp[i]+=dp[i-nums[j]];
	            }
	        }
	        return dp[target];
	    }
	}
	
	//////////////////////////////////
	class Solution {
	    HashMap<Integer, Integer> map;
	    public int combinationSum4(int[] nums, int target) {
	        this.map=new HashMap<>();
	        return dfs(nums, target);
	    }
	    private int dfs(int[] arr, int target){
	        //base
	        if(target==0){
	            return 1;
	        }
	        if(map.containsKey(target))
	            return map.get(target);
	        int res=0;
	        for(int i=0;i<arr.length;i++){
	            if(target-arr[i]>=0)
	                res+=dfs(arr, target-arr[i]);
	        }
	        map.put(target, res);
	        return res;
	    }
	}
	
	////////////////////////////////////
	class Solution {
	    int res;
	    public int combinationSum4(int[] nums, int target) {
	        dfs(nums, target);
	        return res;
	    }
	    private void dfs(int[] arr, int target){
	        //base
	        if(target<0){
	            return;
	        }
	        if(target==0){
	            res++;
	            return;
	        }

	        // path.add(arr[idx]);
	        // dfs(arr, idx, target-arr[idx], path);
	        // path.remove(path.size()-1);
	        // dfs(arr, idx+1, target, path);

	        for(int i=0;i<arr.length;i++){
	            dfs(arr, target-arr[i]);
	        }
	    }
	}
}
