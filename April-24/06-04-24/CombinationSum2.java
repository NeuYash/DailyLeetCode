package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/combination-sum-ii/
//
public class CombinationSum2 {
	class Solution {
	    List<List<Integer>> res;
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        this.res=new ArrayList<>();
	        Arrays.sort(candidates);
	        dfs(candidates, 0, target, new ArrayList<>());
	        return res;
	    }
	    private void dfs(int[] arr, int idx, int target, List<Integer> path){
	        //base
	        if(target==0){
	            res.add(new ArrayList<>(path));
	            return;
	        }

	        // path.add(arr[idx]);
	        // dfs(arr, idx, target-arr[idx], path);
	        // path.remove(path.size()-1);
	        // dfs(arr, idx+1, target, path);

	        for(int i=idx;i<arr.length;i++){
	            if(i>idx && arr[i]==arr[i-1]) continue;
	            if(arr[i]>target) break;
	            path.add(arr[i]);
	            dfs(arr, i+1, target-arr[i], path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
