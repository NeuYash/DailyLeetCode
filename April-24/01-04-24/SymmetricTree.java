package com.leetcode.April;

//Problem link: https://leetcode.com/problems/symmetric-tree/
//O(n) O(n)
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		// Queue<TreeNode> q=new LinkedList<>();
		// q.add(root.left);
		// q.add(root.right);
		// while(!q.isEmpty()){
		// TreeNode left=q.poll();
		// TreeNode right=q.poll();
		// if(left==null && right==null)
		// continue;
		// if(left==null || right==null)
		// return false;
		// if(left.val!=right.val)
		// return false;
		// q.add(left.left);
		// q.add(right.right);
		// q.add(left.right);
		// q.add(right.left);
		// }
		// return true;

		return dfs(root.left, root.right);
	}

	public boolean dfs(TreeNode left, TreeNode right) {
		// base
		if (left == null && right == null)
			return true;
		if (left == null || right == null || left.val != right.val)
			return false;
		// logic
		return dfs(left.left, right.right) && dfs(left.right, right.left);
	}
}
