package com.leetcode.April;

import java.util.Stack;

//Problem Link: https://leetcode.com/problems/make-the-string-great/description
//O(n) //O(n)
public class MakeStringGreat {
	public String makeGood(String s) {
		int n = s.length();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			if (!st.isEmpty() && Math.abs(st.peek() - s.charAt(i)) == 32) {
				st.pop();
			} else
				st.push(s.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty())
			sb.insert(0, st.pop());

		return sb.toString();
	}
}
