package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/rotate-string/

//O(n) O(n);
public class RotateString {
	class Solution {
	    public boolean rotateString(String s, String goal) {
	        // String rev = s;
	        // for(int i=0;i<s.length();i++){
	        //     if(rev.equals(goal))
	        //         return true;
	        //     rev = rotate(rev); 
	        // }
	        // return false;

	        if(s.length() != goal.length()) return false;
	         return (s+s).contains(goal);
	    }

	    public String rotate(String s){
	        char[] ab = s.toCharArray();
	        char fir = s.charAt(0);
	        for(int i=1;i<ab.length;i++){
	            ab[i-1]=ab[i];
	        }
	        ab[ab.length-1] = fir;

	        return new String(ab);
	    }
	}
}
