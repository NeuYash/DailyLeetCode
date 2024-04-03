package com.leetcode.April;

//Problem Link https://leetcode.com/problems/binary-tree-level-order-traversal/
//O(n) O(h)
public class BTreeLevelOrderTraversal {
	List<List<Integer>> res;

	public List<List<Integer>> levelOrder(TreeNode root) {
		this.res = new ArrayList<>();
		if (root == null)
			return res;
		dfs(root, 0);
		return res;
	}

	public void dfs(TreeNode root, int lvl) {
		// base
		if (root == null)
			return;

		if (lvl == res.size())
			res.add(new ArrayList<>());
		res.get(lvl).add(root.val);

		dfs(root.left, lvl + 1);
		dfs(root.right, lvl + 1);
	}
}
