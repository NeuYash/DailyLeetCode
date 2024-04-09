package com.leetcode.April;
//O(n) O(n)
//Problem Link: https://leetcode.com/problems/remove-k-digits/
public class RemoveKDigits {
	class Solution {
	    public String removeKdigits(String num, int k) {
	        int size=num.length();
	        if(k==size)
	            return 0+"";
	        Stack<Character> st=new Stack<>();
	        for(char c: num.toCharArray()){
	            while(!st.isEmpty() && k>0 && st.peek()>c){
	                st.pop();
	                k--;
	            }
	            st.add(c);
	        }
	        while(k>0){
	            st.pop();
	            k--;
	        }

	        StringBuilder sb=new StringBuilder();
	        while(!st.isEmpty()){
	            char cur=st.pop();
	            sb.append(cur);
	        }
	        sb.reverse();
	        while(sb.length()>1&& sb.charAt(0)=='0')
	            sb.deleteCharAt(0);
	        
	        return sb.toString();
	    }
	}
}
