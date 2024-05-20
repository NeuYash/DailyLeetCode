package com.leetcode.May;

//Problem Link: https://leetcode.com/problems/evaluate-boolean-binary-tree/description/
//O(n) O(h)
public class EvaluateBooleanBinaryTree {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public boolean evaluateTree(TreeNode root) {
			if (root.left == null && root.right == null)
				return root.val == 1;
			boolean left = evaluateTree(root.left);
			boolean right = evaluateTree(root.right);
			if (root.val == 2)
				return left || right;
			else if (root.val == 3)
				return left && right;
			return false;
		}
	}
}
