package com.leetcode;

//O(2^n) O(1)
public class PalindromePartitioning {
	class Solution {
		List<List<String>> res;

		public List<List<String>> partition(String s) {
			this.res = new ArrayList<>();
			int n = s.length();
			helper(s, 0, 0, new ArrayList<>(), 0);
			return res;
		}

		private void helper(String s, int pivot, int idx, List<String> li, int sum) {
			// base
			if (idx == s.length()) {
				if (sum == s.length())
					res.add(new ArrayList<>(li));
				return;
			}

			// logic

			// not choose
			helper(s, pivot, idx + 1, li, sum);

			String sub = s.substring(pivot, idx + 1);
			if (isPalindrome(sub)) {
				li.add(sub);
				helper(s, idx + 1, idx + 1, li, sum + sub.length());
				li.remove(li.size() - 1);
			}
		}

		private boolean isPalindrome(String s) {
			int low = 0, high = s.length() - 1;
			while (low < high) {
				if (s.charAt(low) != s.charAt(high))
					return false;
				low++;
				high--;
			}
			return true;
		}
	}
}
