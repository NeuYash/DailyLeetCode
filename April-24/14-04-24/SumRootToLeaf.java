package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/description?
//O(n) O(h)
public class SumRootToLeaf {
	class Solution {
		// int ans;
		public int sumNumbers(TreeNode root) {
			if (root == null)
				return 0;
			return dfs(root, 0);
			// return ans;
		}

		private int dfs(TreeNode root, int curVal) {
			if (root == null)
				return 0;
			curVal = curVal * 10 + root.val;
			if (root.left == null && root.right == null) {
				return curVal;
			}
			return dfs(root.left, curVal) + dfs(root.right, curVal);
		}
	}
}
