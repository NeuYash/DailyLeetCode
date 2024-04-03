package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/balanced-binary-tree/
//O(n) O(h)
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return dfs(root) != -1;
	}

	public int dfs(TreeNode root) {
		// base
		if (root == null)
			return 0;
		// logic
		int case1 = dfs(root.left);
		int case2 = dfs(root.right);
		if (case1 == -1 || case2 == -1 || Math.abs(case1 - case2) > 1)
			return -1;
		else
			return 1 + Math.max(case1, case2);
	}
}
