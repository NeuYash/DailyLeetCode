package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/reverse-prefix-of-word
O(2 n)O(1)
public class ReversePrefixOfWord {
	class Solution {
		public String reversePrefix(String word, char ch) {
			// StringBuilder sb = new StringBuilder(word);
			// int idx=-1;
			// for(int i=0;i<word.length();i++)
			// if(word.charAt(i)==ch){
			// idx=i;
			// break;
			// }

			// if(idx==-1)
			// return word;
			// int low =0;
			// while(low<idx){
			// char temp=sb.charAt(low);
			// sb.setCharAt(low,sb.charAt(idx));
			// sb.setCharAt(idx, temp);
			// low++;
			// idx--;
			// }
			// return sb.toString();

			int left = 0;
			int right = word.indexOf(ch);
			if (right == -1) {
				return word;
			}
			char[] arr = word.toCharArray();

			while (left < right) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

			return new String(arr);
		}
	}
}
