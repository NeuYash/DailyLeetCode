package com.leetcode;

//O(n) O(1)
public class MinimumDepthOfBinaryTree {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public int minDepth(TreeNode root) {
			if (root == null)
				return 0;
			else if (root.left == null && root.right == null) {
				return 1;
			} else if (root.left == null)
				return 1 + minDepth(root.right);
			else if (root.right == null)
				return 1 + minDepth(root.left);
			else
				return 1 + Math.min(minDepth(root.right), minDepth(root.left));
		}
	}
}
