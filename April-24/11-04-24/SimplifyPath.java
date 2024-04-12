package com.leetcode.April;
//Problem: https://leetcode.com/problems/simplify-path/description/
//O(n) O(n)
public class SimplifyPath {
	class Solution {
	    public String simplifyPath(String path) {
	        Stack<String> st=new Stack<>();
	        

	        for(int i=0;i<path.length();i++){
	            if(path.charAt(i)=='/')
	                continue;
	            String temp="";
	            while(i<path.length() && path.charAt(i)!='/'){
	                temp=temp+path.charAt(i);
	                i++;
	            }
	            if(temp.equals(".")) continue;
	            else if(temp.equals("..")){
	                if(st.size()>0)
	                    st.pop();
	            }else
	                st.push(temp);
	        }
	        if(st.isEmpty())
	            return "/";
	        String result="";
	        while(!st.isEmpty()){
	            result="/"+st.pop()+result;
	        }
	        return result;
	    }
	}
}
