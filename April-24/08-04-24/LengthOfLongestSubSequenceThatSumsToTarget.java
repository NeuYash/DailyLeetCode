package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/length-of-the-longest-subsequence-that-sums-to-target/
//O(n*target) O(target);
public class LengthOfLongestSubSequenceThatSumsToTarget {
	class Solution {
	    int res;
	    int[][] memo;
	    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
	        // this.memo=new int[nums.size()+1][target+1];
	        // for(int[] arr:memo)
	        //     Arrays.fill(arr,-1);
	        // res=helper(0, target, nums);
	        // if(res<=0)
	        //     return -1;
	        // return res;

	        int[] dp = new int[target+1];
	        Arrays.fill(dp, Integer.MIN_VALUE); // get max, never select the min
	        dp[0] = 0;
	        int sum = 0;
	        for(int i=0;i<nums.size();i++){
	            sum = Math.min(target, sum+nums.get(i));
	            for(int j = sum; j >= nums.get(i); --j){
	                dp[j] = Math.max(dp[j-nums.get(i)]+1, dp[j]);
	            }
	        }
	        return dp[target] > 0 ? dp[target] : -1;
	    }
	    private int helper(int idx, int target, List<Integer> nums){
	        //base
	        if(target==0){
	            return 0;
	        }
	        if(idx==nums.size() || target<0)
	            return Integer.MIN_VALUE+1001;
	        
	        if(memo[idx][target]!=-1)
	            return memo[idx][target];
	        //logic
	        //choose
	        int choose=1+helper(idx+1, target-nums.get(idx), nums);

	        //not choose
	        int notchoose=helper(idx+1, target, nums);
	        return memo[idx][target]=Math.max(choose,notchoose);
	    }
	}
}
