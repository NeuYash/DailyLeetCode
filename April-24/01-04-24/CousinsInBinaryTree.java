package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/cousins-in-binary-tree/
public class CousinsInBinaryTree {
	int depthx, depthy;
	TreeNode xp, yp;

	public boolean isCousins(TreeNode root, int x, int y) {
		dfs(root, x, y, 0, null);
		return depthx == depthy & xp != yp;
		// O(n) O(2n)
		// Queue<TreeNode> nodeQ=new LinkedList<>();
		// nodeQ.add(root);
		// while(!nodeQ.isEmpty()){
		// int size=nodeQ.size();
		// boolean xfound=false;
		// boolean yfound=false;
		// while(size-->0){
		// TreeNode cur=nodeQ.poll();
		// if(cur.val==x){
		// xfound=true;
		// }
		// if(cur.val==y){
		// yfound=true;
		// }
		// if(cur.left!=null && cur.right!=null){
		// if(cur.left.val==x && cur.right.val==y)
		// return false;
		// if(cur.left.val==y && cur.right.val==x)
		// return false;
		// }
		// if(cur.left!=null){
		// nodeQ.add(cur.left);
		// }
		// if(cur.right!=null){
		// nodeQ.add(cur.right);
		// }
		// }
		// if(xfound && yfound)
		// return true;
		// if(xfound || yfound)
		// return false;
		// }
		// return false;
	}

	public void dfs(TreeNode cur, int x, int y, int depth, TreeNode par) {
		if (cur == null)
			return;
		if (cur.val == x) {
			depthx = depth;
			xp = par;
		}
		if (cur.val == y) {
			depthy = depth;
			yp = par;
		}
		if (xp == null || yp == null)
			dfs(cur.left, x, y, depth + 1, cur);
		if (xp == null || yp == null)
			dfs(cur.right, x, y, depth + 1, cur);
	}
}
