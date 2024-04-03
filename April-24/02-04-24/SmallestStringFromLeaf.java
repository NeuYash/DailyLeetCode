package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/smallest-string-starting-from-leaf/
//O(n) O(h)
public class SmallestStringFromLeaf {
	String res;
    public String smallestFromLeaf(TreeNode root) {
        this.res="";
        if(root==null)
            return res;
        dfs(root, new StringBuilder());
        return res;
    }
    public void dfs(TreeNode root, StringBuilder sb){
        if(root==null)
            return;
        sb.insert(0,(char)('a'+root.val));
        if(root.left==null && root.right==null){
            if(res.isEmpty() || res.compareTo(sb.toString())>0){
                res=sb.toString();
            }
            sb.deleteCharAt(0);
            return;
        }
        //logic
        dfs(root.left, sb);
        dfs(root.right, sb);
        sb.deleteCharAt(0);
    }
}
