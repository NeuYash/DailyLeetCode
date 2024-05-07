package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/repeated-string-match/
O(n) O(1)
public class RepeatedStringMatch {
	class Solution {
	    public int repeatedStringMatch(String a, String b) {
	        String A = a;
	        int s =1;
	        int repeat = b.length()/a.length();
	        for(int i=0;i<repeat+2;i++){
	            if(a.contains(b)){
	                return s;
	            }
	            else{
	                a+=A;
	                s++;
	            }
	        }
	        return -1;
	    }
	}
}
