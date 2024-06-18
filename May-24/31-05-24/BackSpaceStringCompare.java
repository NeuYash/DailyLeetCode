package com.leetcode;

//Problem Link: https://leetcode.com/problems/backspace-string-compare/
//O(m+n) O(m+n)
public class BackSpaceStringCompare {
	class Solution {
		public boolean backspaceCompare(String s, String t) {
			// StringBuilder sb = new StringBuilder();
			// for(char c: s.toCharArray()){
			// if(c=='#'){
			// if(sb.length()>0)
			// sb.setLength(sb.length()-1);
			// } else{
			// sb.append(c);
			// }
			// }

			// StringBuilder sb2 = new StringBuilder();
			// for(char c: t.toCharArray()){
			// if(c=='#'){
			// if(sb2.length()>0)
			// sb2.setLength(sb2.length()-1);
			// } else{
			// sb2.append(c);
			// }
			// }
			// return sb.toString().equals(sb2.toString());

			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != '#') {
					stack.push(s.charAt(i));
				} else {
					if (!stack.isEmpty()) {
						stack.pop();
					}
				}
			}

			Stack<Character> stack1 = new Stack<>();
			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) != '#') {
					stack1.push(t.charAt(i));
				} else {
					if (!stack1.isEmpty()) {
						stack1.pop();
					}
				}
			}

			return stack.equals(stack1);
		}
	}
}
