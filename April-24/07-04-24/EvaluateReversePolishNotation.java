package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
//O(n) O(n)
public class EvaluateReversePolishNotation {
	class Solution {
	    public int evalRPN(String[] tokens) {
	        Stack<String> st=new Stack<>();
	        int n=tokens.length;
	        for(int i=0;i<n;i++){
	            if(isOperator(tokens[i])){
	                st.push(perform(st.pop(), st.pop(), tokens[i]));
	            }else
	                st.push(tokens[i]);
	        }
	        return Integer.parseInt(st.peek());
	    }
	    private boolean isOperator(String st){
	        if(st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/"))
	            return true;
	        else
	            return false;
	    }
	    private String perform(String a, String b, String token){
	        if(token.equals("+")){
	            return (Integer.parseInt(a)+Integer.parseInt(b))+"";
	        }
	        else if(token.equals("-")){
	            return (Integer.parseInt(b)-Integer.parseInt(a))+"";
	        }
	        else if(token.equals("*")){
	            return (Integer.parseInt(a)*Integer.parseInt(b))+"";
	        }
	        else
	            return (Integer.parseInt(b)/Integer.parseInt(a))+"";
	    }
	}
}
