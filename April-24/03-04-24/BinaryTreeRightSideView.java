package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/binary-tree-right-side-view/
//O(n) O(n)
public class BinaryTreeRightSideView {
	List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        this.res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int num=0;
            while(size-->0){
                TreeNode cur=q.poll();
                num=cur.val;
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            res.add(num);
        }
        return res;
    }
}
