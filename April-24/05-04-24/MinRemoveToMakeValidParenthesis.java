package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses
//O(3n) O(n)
public class MinRemoveToMakeValidParenthesis {
	class Solution {
	    public String minRemoveToMakeValid(String s) {
	        String res="";
	        char[] str=s.toCharArray();
	        int open=0, idx=0;
	        for(int i=0;i<s.length();i++){
	            if(str[i]=='(')
	                open++;
	            else if(str[i]==')')
	                if(open==0)
	                    str[i]='!';
	                else
	                    open--;
	        }

	        for(int i=s.length()-1;i>=0;i--){
	            if(open>0 && str[i]=='('){
	                str[i]='!';
	                open--;
	            }
	        }

	        for(int i=0;i<str.length;i++){
	            if(str[i]!='!')
	                str[idx++]=str[i];
	        }
	        return new String(str).substring(0,idx);
	    }
	}
}
