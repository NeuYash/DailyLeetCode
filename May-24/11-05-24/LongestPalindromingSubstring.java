package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/longest-palindromic-substring/
//O(n^2) O(1)
public class LongestPalindromingSubstring {
	class Solution {
	    public String longestPalindrome(String s) {
	        if(s==null || s.length()<1)
	            return "";
	        int n = s.length();
	        int st = 0;
	        int end = 0;
	        // for(int i=0;i<s.length();i++){
	        //     int len1 = expand(s, i, i);
	        //     int len2 = expand(s, i, i+1);
	        //     int len = Math.max(len1, len2);
	        //     if(len > end-st){
	        //         st = i-((len-1)/2);
	        //         end = i + (len/2);
	        //     }
	        // }
	        // return s.substring(st, end+1);

	        boolean[] dp = new boolean[n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<=i;j++){
	                if(s.charAt(i)==s.charAt(j)){
	                    if(i-j<2 || dp[j+1]){
	                        dp[j]=true;
	                        if(end-st<i-j){
	                            st = j;
	                            end = i;
	                        }
	                    }else
	                        dp[j]=false;
	                }else{
	                    dp[j] = false;
	                }
	            }
	        }
	        return s.substring(st, end+1);
	    }

	    public int expand(String s, int left, int right){
	        if(s==null || s.length()<1)
	            return 0;
	        
	        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
	            left--;
	            right++;
	        }
	        return right-left-1;
	    }
	}
}
