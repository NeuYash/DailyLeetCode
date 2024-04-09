package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/decode-string/
//O(n) O(n)
public class DecodeString {
	class Solution {
	    int i;
	    public String decodeString(String s) {
	        // Stack<Integer> numSt=new Stack<>();
	        // Stack<StringBuilder> strSt=new Stack<>();
	        // StringBuilder sb=new StringBuilder();
	        // int curNum=0;
	        // for(int i=0;i<s.length();i++){
	        //     char ch=s.charAt(i);
	        //     if(Character.isDigit(ch)){
	        //         curNum=curNum*10+ch-'0';
	        //     }else if(ch=='['){
	        //         strSt.push(sb);
	        //         numSt.push(curNum);
	        //         sb=new StringBuilder();
	        //         curNum=0;
	        //     }else if(ch==']'){
	        //         int cnt=numSt.pop();
	        //         StringBuilder temp=new StringBuilder();
	        //         for(int k=0;k<cnt;k++){
	        //             temp.append(sb);
	        //         }
	        //         StringBuilder parent=strSt.pop();
	        //         sb=parent.append(temp);
	        //     }else
	        //         sb.append(ch);
	        // }
	        // return sb.toString();

	        int curNum=0; 
	        StringBuilder cur=new StringBuilder();
	        while(i<s.length()){
	            char c=s.charAt(i);
	            if(Character.isDigit(c)){
	                curNum=curNum*10+c-'0';
	                i++;
	            }else if(c=='['){
	                i++;
	                String baby=decodeString(s);
	                for(int k=0;k<curNum;k++)
	                    cur.append(baby);
	                curNum=0;
	            }else if(c==']'){
	                i++;
	                return cur.toString();
	            }else{
	                cur=cur.append(c);
	                i++;
	            }
	        }
	        return cur.toString();
	    }
	}
}
