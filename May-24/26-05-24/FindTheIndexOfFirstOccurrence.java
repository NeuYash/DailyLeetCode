package com.leetcode;
//O(n) O(1)
public class FindTheIndexOfFirstOccurrence {
	class Solution {
		public int strStr(String haystack, String needle) {
			return haystack.indexOf(needle);
			// int m=haystack.length(), n =needle.length();
			// //find hash of pattern string
			// long hash=0l;
			// for(int i=0;i<n;i++){
			// char c = needle.charAt(i);
			// hash = hash*26 + (c-'a' +1);
			// }

			// long curHash = 0l;
			// long nl = (long)Math.pow(26, n);
			// for(int i=0;i<m;i++){
			// char in = haystack.charAt(i);
			// curHash = curHash*26 + (in -'a' +1);
			// if(i>=n){
			// char out = haystack.charAt(i-n);
			// curHash = curHash - (out - 'a' +1)*nl;
			// }
			// if(curHash == hash){
			// return i-n+1;
			// }
			// }
			// return -1;
		}
	}
}
