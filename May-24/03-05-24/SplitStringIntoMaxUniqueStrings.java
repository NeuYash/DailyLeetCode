package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
//O(n) O(n)
public class SplitStringIntoMaxUniqueStrings {
	class Solution {
		public int maxUniqueSplit(String s) {
			return dfs(s, new HashSet<>());
		}

		public int dfs(String s, Set<String> set) {
			int max = 0;
			for (int i = 1; i <= s.length(); i++) {
				String cand = s.substring(0, i);
				if (!set.contains(cand)) {
					set.add(cand);
					max = Math.max(max, 1 + dfs(s.substring(i), set));
					set.remove(cand);
				}
			}
			return max;
		}
	}
}
