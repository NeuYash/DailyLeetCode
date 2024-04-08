package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
	class Solution {
	    //O(2^(m+n)) O(m+n)
	    List<List<Integer>> res;
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        this.res=new ArrayList<>();
	        dfs(candidates, 0, target, new ArrayList<>());
	        return res;
	    }
	    private void dfs(int[] arr, int idx, int target, List<Integer> path){
	        //base
	        if(idx==arr.length || target<0){
	            return;
	        }
	        if(target==0){
	            res.add(new ArrayList<>(path));
	            return;
	        }

	        // path.add(arr[idx]);
	        // dfs(arr, idx, target-arr[idx], path);
	        // path.remove(path.size()-1);
	        // dfs(arr, idx+1, target, path);

	        for(int i=idx;i<arr.length;i++){
	            path.add(arr[i]);
	            dfs(arr, i, target-arr[i], path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
