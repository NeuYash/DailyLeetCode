package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/binary-search-tree-iterator/
//O(h) O(n)
class BSTIterator {
	Stack<TreeNode> st;

	public BSTIterator(TreeNode root) {
		this.st = new Stack<>();
		inorder(root);
	}

	public void inorder(TreeNode root) {
		while (root != null) {
			st.push(root);
			root = root.left;
		}
	}

	public int next() {
		TreeNode cur = st.pop();
		inorder(cur.right);
		return cur.val;
	}

	public boolean hasNext() {
		return !st.isEmpty();
	}
}
