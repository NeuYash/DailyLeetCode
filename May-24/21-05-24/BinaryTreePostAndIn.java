package com.leetcode;

//O(n) O(1)
public class BinaryTreePostAndIn {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int idx;
		Map<Integer, Integer> map;

		public TreeNode buildTree(int[] inorder, int[] postorder) {
			this.map = new HashMap<>();
			int n = postorder.length;
			this.idx = n - 1;
			for (int i = 0; i < n; i++) {
				map.put(inorder[i], i);
			}
			return helper(postorder, 0, n - 1, 0);
		}

		private TreeNode helper(int[] postorder, int st, int en, int rootIdx) {
			if (st > en)
				return null;
			int rootVal = postorder[idx];
			idx--;
			rootIdx = map.get(rootVal);
			TreeNode root = new TreeNode(rootVal);
			root.right = helper(postorder, rootIdx + 1, en, rootIdx);
			root.left = helper(postorder, st, rootIdx - 1, rootIdx);
			return root;
		}
	}
}
