package com.leetcode.April;
//ProblemLink: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description

//O(n) O(1)
public class MaxDepthLenParenthesis {
	    public int maxDepth(String s) {
	        int maxDepth=0;
	        int curdepth=0;
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch=='(')
	                curdepth++;
	            else if(ch==')')
	                curdepth--;
	            maxDepth=Math.max(maxDepth, curdepth);
	        }
	        return maxDepth;
	    }
}
