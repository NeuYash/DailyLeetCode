package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/combination-sum-iii/description/
public class CombinationSum3 {
	class Solution {
	    List<List<Integer>> res;
	    public List<List<Integer>> combinationSum3(int k, int n) {
	        this.res=new ArrayList<>();
	        dfs(1, k, n, new ArrayList<>());
	        return res;
	    }
	    public void dfs(int cur, int k, int target, List<Integer> path){
	        //base
	        if(target==0 && k==0){
	            res.add(new ArrayList<>(path));
	            return;
	        }
	        // if(k<0){
	        //     return;
	        // }
	        for(int i=cur;i<10;i++){
	            if(k<0)
	                break;
	            if(i>target)
	                break;
	            path.add(i);
	            dfs(i+1, k-1, target-i, path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
