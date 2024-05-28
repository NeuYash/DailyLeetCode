package com.leetcode;

//O(n) O(n)
public class BinaryTreePreAndIn {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int idx;
		Map<Integer, Integer> map;

		public TreeNode buildTree(int[] preorder, int[] inorder) {
			this.map = new HashMap<>();
			int n = preorder.length;
			for (int i = 0; i < n; i++) {
				map.put(inorder[i], i);
			}
			return helper(preorder, 0, n - 1, 0);
		}

		private TreeNode helper(int[] preorder, int st, int en, int rootIdx) {
			if (st > en)
				return null;
			int rootVal = preorder[idx];
			idx++;
			rootIdx = map.get(rootVal);
			TreeNode root = new TreeNode(rootVal);
			root.left = helper(preorder, st, rootIdx - 1, rootIdx);
			root.right = helper(preorder, rootIdx + 1, en, rootIdx);
			return root;
		}
	}
}
