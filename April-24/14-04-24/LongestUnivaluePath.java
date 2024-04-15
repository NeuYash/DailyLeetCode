package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/longest-univalue-path/description/
//O(n) O(h)
public class LongestUnivaluePath {
	class Solution {
		int ans;

		public int longestUnivaluePath(TreeNode root) {
			dfs(root);
			return ans;
		}

		private int dfs(TreeNode root) {
			if (root == null)
				return 0;
			int leftpath = dfs(root.left);
			int rightpath = dfs(root.right);
			int left = 0, right = 0;
			if (root.left != null && root.val == root.left.val)
				left = leftpath + 1;
			if (root.right != null && root.val == root.right.val)
				right = rightpath + 1;

			ans = Math.max(ans, left + right);
			return Math.max(left, right);
		}
	}
}
