package com.leetcode;

//O(n) O(h)
public class CountCompleteTreeNodes {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public int countNodes(TreeNode root) {
			if (root == null)
				return 0;
			int lh = leftH(root);
			int rh = rightH(root);
			if (lh == rh)
				return (int) Math.pow(2, lh) - 1;

			return countNodes(root.left) + countNodes(root.right) + 1;
		}

		public int leftH(TreeNode root) {
			if (root == null)
				return 0;
			return 1 + leftH(root.left);
		}

		public int rightH(TreeNode root) {
			if (root == null)
				return 0;
			return 1 + rightH(root.right);
		}
	}
}
