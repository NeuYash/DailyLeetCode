package com.leetcode.April;
//Problem: https://leetcode.com/problems/sum-of-left-leaves
//O(n) O(h)
public class SumOfLeftLeaves {
	class Solution {
		public int sumOfLeftLeaves(TreeNode root) {
			if (root == null)
				return 0;
			return dfs(root.left, true) + dfs(root.right, false);
		}

		private int dfs(TreeNode root, boolean flag) {
			// base
			if (root == null)
				return 0;
			if (root.left == null && root.right == null && flag) {
				return root.val;
			}
			return dfs(root.left, true) + dfs(root.right, false);
		}
	}
}
