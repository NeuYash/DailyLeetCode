package com.leetcode;

//Problem Link: https://leetcode.com/problems/magical-string/description/
//O(n) O(1)
public class MagicalString {
	class Solution {
		public int magicalString(int n) {
			int cnt = 0;
			StringBuilder sb = new StringBuilder("122");
			for (int i = 2; i <= n; i++) {
				int len = sb.length();
				if (sb.charAt(i) == '1') {
					if (sb.charAt(len - 1) == '1')
						sb.append(2);
					else
						sb.append(1);
				} else {
					if (sb.charAt(len - 1) == '1')
						sb.append(22);
					else
						sb.append(11);
				}
				if (i < n && sb.charAt(i) == '1')
					cnt += 1;
				else
					cnt += 0;
			}
			return cnt + 1;
		}
	}
}
